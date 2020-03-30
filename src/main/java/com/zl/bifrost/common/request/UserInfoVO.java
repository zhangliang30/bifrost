package com.zl.bifrost.common.request;

import lombok.Data;

@Data
public class UserInfoVO {
    private Long userId;
    private String username;
    private String password;
}
