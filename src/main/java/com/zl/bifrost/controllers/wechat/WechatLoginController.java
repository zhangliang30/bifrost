package com.zl.bifrost.controllers.wechat;

import com.zl.bifrost.common.annotation.AuthIgnore;
import com.zl.bifrost.common.response.user.UserAuthenticateData;
import com.zl.bifrost.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class WechatLoginController {
    @Resource
    private UserService userService;

    @AuthIgnore
    @GetMapping("/wechat/login")
    public UserAuthenticateData login(@RequestParam String code, @RequestParam String nickName, @RequestParam String avatar) {
        log.info("code: {}, nickName: {}", code, nickName);
        return userService.loginByWechatCode(code, nickName, avatar);
    }
}
