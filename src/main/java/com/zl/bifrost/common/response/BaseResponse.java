package com.zl.bifrost.common.response;

import lombok.Data;

/**
 * Created by Vongola on 2019/3/3.
 */
@Data
public class BaseResponse {
    private boolean success;
    private String code;
    private String msg;
}
