package com.zl.bifrost.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController("/wechat")
public class WechatController {

    @RequestMapping
    public String test(HttpServletRequest request){
        log.info("{} requestParam:{}, resquestBody:{}", request.getRequestURI(), request.getQueryString());
        return request.getParameter("echostr") + "";
    }
}
