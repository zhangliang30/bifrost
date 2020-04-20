package com.zl.bifrost.controllers;


import com.zl.bifrost.common.response.user.UserAuthenticateData;
import com.zl.bifrost.common.request.UserInfoVO;
import com.zl.bifrost.common.response.StandardResponse;
import com.zl.bifrost.common.response.StatusMeta;
import com.zl.bifrost.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户登录controller
 *
 */
@Slf4j
@RestController
@CrossOrigin
public class LoginController {
    @Resource
    private UserService userService;

    @PostMapping(value = "/login")
    public StandardResponse<UserAuthenticateData> login(@RequestBody UserInfoVO loginData) {
        UserAuthenticateData data = userService.login(loginData);
        if (data == null || !StringUtils.equals(data.getUsername(), loginData.getUsername())) {
            return fail(400, String.format("帐号/密码错误", loginData.toString()));
        }
        StandardResponse<UserAuthenticateData> rs = success(data);
        log.info("login log: {}", rs);
        return rs;
    }

    private StandardResponse fail(int status, String msg) {
        return new StandardResponse<>(new StatusMeta(status, msg), null);
    }

    private StandardResponse<UserAuthenticateData> success(Object data) {
        return new StandardResponse(new StatusMeta(), data);
    }
}
