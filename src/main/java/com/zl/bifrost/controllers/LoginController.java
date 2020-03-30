package com.zl.bifrost.controllers;


import com.alibaba.fastjson.JSON;
import com.zl.bifrost.common.dto.UserAuthenticateData;
import com.zl.bifrost.common.request.UserInfoVO;
import com.zl.bifrost.common.response.LoginResponse;
import com.zl.bifrost.common.response.StatusMeta;
import com.zl.bifrost.services.UserService;
import com.zl.bifrost.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户登录controller
 *
 */
@Slf4j
@RestController
public class LoginController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public LoginResponse<UserAuthenticateData> login(@RequestBody String params) {
        UserInfoVO loginData = JsonUtils.json2Obj(params, UserInfoVO.class);
        if (loginData == null) {
            return fail(400, String.format("请求错误", params));
        }
        UserAuthenticateData data = userService.login(loginData);
        if (data == null || !StringUtils.equals(data.getUsername(), loginData.getUsername())) {
            return fail(400, String.format("帐号/密码错误", params));
        }
        LoginResponse<UserAuthenticateData> rs = success(data);
        log.info("login log: {}", rs);
        return rs;
    }

    private LoginResponse fail(int status, String msg) {
        return new LoginResponse<>(new StatusMeta(status, msg), null);
    }

    private <T> LoginResponse<T> success(T data) {
        return new LoginResponse<>(new StatusMeta(), data);
    }
}
