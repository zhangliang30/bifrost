package com.zl.bifrost.config;

import com.zl.bifrost.interrceptor.AuthenticationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class AuthenticationInterceptorConfig implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(authenticationInterceptor())
//                .addPathPatterns("/**")
//                .excludePathPatterns("/login", "/logout", "/error");    // 拦截所有请求，通过判断是否有 @LoginRequired 注解 决定是否需要登录
//    }
//
//    @Bean
//    public AuthenticationInterceptor authenticationInterceptor() {
//        return new AuthenticationInterceptor();// 自己写的拦截器
//    }
}
