package com.zl.bifrost.common.dto;

import lombok.Data;

/**
 * 用户权限校验数据
 */
@Data
public class UserAuthenticateData {
    private Long id;
    private Long rid;
    private String username;
    private String mobile;
    private String email;
    private String token;
}
