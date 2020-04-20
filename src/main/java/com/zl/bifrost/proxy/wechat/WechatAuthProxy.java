package com.zl.bifrost.proxy.wechat;

import com.zl.bifrost.common.dto.Code2SessionResponse;
import com.zl.bifrost.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class WechatAuthProxy {
    private static final String JS_CODE_2_SESSION_TYPE = "authorization_code";
    private static final String BASE_URL = "https://api.weixin.qq.com";
    private static final String JS_CODE_2_SESSION_URL_TEMPLATE = "%s/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=%s";
    @Value("${wechat.appid}")
    private String appId;
    @Value("${wechat.secretid}")
    private String secretId;


    public String code2Session(String code) {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(buildCode2SessionUrl(code), String.class);
        Code2SessionResponse session = JsonUtils.json2Obj(response, Code2SessionResponse.class);
        log.info("code2Session code: {}, rs: {}: ", code, response);
        return session.getOpenid();
    }

    private String buildCode2SessionUrl(String code) {
        return String.format(JS_CODE_2_SESSION_URL_TEMPLATE, BASE_URL, appId, secretId, code, JS_CODE_2_SESSION_TYPE);
    }
}
