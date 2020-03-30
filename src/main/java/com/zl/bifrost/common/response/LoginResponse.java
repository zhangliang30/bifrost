package com.zl.bifrost.common.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse<T> {
    private StatusMeta meta = new StatusMeta();
    private T data;
}
