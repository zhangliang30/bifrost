package com.zl.bifrost.services;

import com.zl.bifrost.common.response.user.UserAuthenticateData;
import com.zl.bifrost.common.request.UserInfoVO;
import com.zl.bifrost.common.response.user.UserListVO;
import com.zl.bifrost.db.dal.UserInfoDal;
import com.zl.bifrost.db.entity.UserInfo;
import com.zl.bifrost.proxy.wechat.WechatAuthProxy;
import com.zl.bifrost.utils.PasswordUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Slf4j
@Service
public class UserService {
    private static final int DEFAULT_PAGE_SIZE = 20;
    private static final int DEFAULT_PAGE_NUM = 1;
    @Resource
    private UserInfoDal userInfoDal;
    @Resource
    private WechatAuthProxy wechatAuthProxy;

    public UserAuthenticateData loginByWechatCode(String code, String nickName, String avatar) {
        String openId = wechatAuthProxy.code2Session(code);
        if (openId == null) {
            return null;
        }
        UserInfo user = userInfoDal.getUserByOpenId(openId);
        if (user == null) {
            user = registerByWechatOpenId(openId, nickName, avatar);
        }
        return transUser(user);
    }

    public UserListVO queryUserList(String userName, int pageSize, int pageNum) {
        if (pageNum <= 0) {
            pageNum = DEFAULT_PAGE_NUM;
        }
        if (pageSize <= 0) {
            pageSize = DEFAULT_PAGE_SIZE;
        }
        List<UserInfo> users = userInfoDal.queryUser(userName, pageSize, pageNum);
        UserListVO vo = new UserListVO();
        if (CollectionUtils.isEmpty(users)) {
            return vo;
        }
        for (UserInfo info: users) {
            vo.getUsers().add(transUser(info));
        }
        vo.setTotal(userInfoDal.count(userName));
        vo.setPageSize(pageSize);
        vo.setPageNum(pageNum);
        return vo;
    }

    /**
     * 用户登录
     *
     * @param userInfoVO
     * @return
     */
    public UserAuthenticateData login(UserInfoVO userInfoVO) {
        UserInfo user = userInfoDal.getByUsername(userInfoVO.getUsername());
        if (!StringUtils.equals(user.getPassword() , userInfoVO.getPassword())) {
            return null;
        }
        return transUser(user);
    }

    private UserInfo registerByWechatOpenId(String openId, String nickName, String avatar) {
        if (StringUtils.isEmpty(openId)) {
            return null;
        }
        String password = DigestUtils.md5DigestAsHex(PasswordUtil.password().getBytes());
        UserInfo userinfo = new UserInfo();
        userinfo.setUsername(nickName);
        userinfo.setPassword(password);
        userinfo.setAvatar(avatar);
        userinfo.setOpenId(openId);
        return userInfoDal.save(userinfo);
    }

    private UserAuthenticateData transUser(UserInfo userInfo) {
        if (userInfo == null) {
            return null;
        }
        try {
            UserAuthenticateData rs = new UserAuthenticateData();
            BeanUtils.copyProperties(rs, userInfo);
            return rs;
        } catch (IllegalAccessException | InvocationTargetException e) {
            log.error("copy properties error ", e);
            return null;
        }
    }
}
