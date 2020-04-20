package com.zl.bifrost.common.dto;

import lombok.Data;

@Data
public class Code2SessionResponse {
    private String openid;
    private String session_id;
    private String unionid;
    private String errcode;
    private String errmsg;

}
