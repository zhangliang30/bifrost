package com.zl.bifrost.services;

import com.zl.bifrost.common.response.user.UserAuthenticateData;
import com.zl.bifrost.common.request.UserInfoVO;
import com.zl.bifrost.common.response.user.UserListVO;
import com.zl.bifrost.db.dal.UserInfoDal;
import com.zl.bifrost.db.dao.UserInfoMapper;
import com.zl.bifrost.db.entity.UserInfo;
import com.zl.bifrost.db.entity.UserInfoExample;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

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
        try {
            for (UserInfo info: users) {
                UserAuthenticateData data = new UserAuthenticateData();
                BeanUtils.copyProperties(data, info);
                vo.getUsers().add(data);
            }
            vo.setTotal(userInfoDal.count(userName));
            vo.setPageSize(pageSize);
            vo.setPageNum(pageNum);
        } catch (Exception e) {

        }
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
        UserAuthenticateData rs = new UserAuthenticateData();
        try {
            BeanUtils.copyProperties(rs, user);
        } catch (IllegalAccessException | InvocationTargetException e) {
            log.error("copy properties error ", e);
            return null;
        }
        return rs;
    }
}
