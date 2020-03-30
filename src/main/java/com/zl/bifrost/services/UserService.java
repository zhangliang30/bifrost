package com.zl.bifrost.services;

import com.zl.bifrost.common.dto.UserAuthenticateData;
import com.zl.bifrost.common.request.UserInfoVO;
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
    @Resource
    private UserInfoMapper userInfoMapper;

    public UserAuthenticateData login(UserInfoVO userInfoVO) {
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andUsernameEqualTo(userInfoVO.getUsername());
        List<UserInfo> users = userInfoMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(users)) {
            return null;
        }
        UserInfo user = users.get(0);
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
