package com.zl.bifrost.db.dal;

import com.zl.bifrost.common.response.user.UserListVO;
import com.zl.bifrost.db.dao.UserInfoMapper;
import com.zl.bifrost.db.entity.UserInfo;
import com.zl.bifrost.db.entity.UserInfoExample;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserInfoDal {
    @Resource
    private UserInfoMapper mapper;

    public UserInfo save(UserInfo userInfo) {
        int count =  mapper.insert(userInfo);
        return getByUsername(userInfo.getUsername());
    }

    public List<UserInfo> queryUser(String query, int pageSize, int pageNum) {
        UserInfoExample example = new UserInfoExample();
        if (StringUtils.isNotBlank(query)) {
            example.createCriteria().andUsernameLike("%" + query + "%");
        }
        long count = mapper.countByExample(example);
        example.setLimit(pageSize);
        example.setOffset((pageNum - 1) * pageSize);
        UserListVO vo = new UserListVO();
        vo.setPageNum(pageNum);
        vo.setPageSize(pageSize);
        return mapper.selectByExample(example);
    }

    public long count(String query) {
        UserInfoExample example = new UserInfoExample();
        if (StringUtils.isNotBlank(query)) {
            example.createCriteria().andUsernameLike("%" + query + "%");
        }
        return mapper.countByExample(example);
    }

    public Long getUserIdByToken(String token) {
        UserInfo user = getUserByToken(token);
        return user.getId();
    }


    public UserInfo getUserByOpenId(String openId) {
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andOpenIdEqualTo(openId);
        List<UserInfo> users = mapper.selectByExample(example);
        if (CollectionUtils.isEmpty(users)) {
            return null;
        }
        return users.get(0);
    }

    public UserInfo getUserByToken(String token) {
        if (StringUtils.isEmpty(token)) {
            return null;
        }
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andTokenEqualTo(token);
        List<UserInfo> users = mapper.selectByExample(example);
        if (CollectionUtils.isEmpty(users)) {
            return null;
        }
        return users.get(0);
    }

    public UserInfo getByUsername(String username) {
        if (StringUtils.isEmpty(username)) {
            return null;
        }
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<UserInfo> users = mapper.selectByExample(example);
        if (CollectionUtils.isEmpty(users)) {
            return null;
        }
        return users.get(0);
    }
}
