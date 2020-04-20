package com.zl.bifrost.common.response.user;

import lombok.Data;
import org.apache.catalina.User;

import java.util.LinkedList;
import java.util.List;

/**
 * 用户权限校验数据
 */
@Data
public class UserListVO {
    private List<UserAuthenticateData> users;
    private Long total;
    private int pageSize;
    private int pageNum;

    public UserListVO() {
        this.total = 0L;
        this.users = new LinkedList<>();
    }
}
