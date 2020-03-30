package com.zl.bifrost.common.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class StatusMeta {
    private int status;
    private String msg;
    public StatusMeta() {
        this.status = 200;
    }
}
