package com.zl.bifrost.interrceptor;
import com.zl.bifrost.db.dal.UserInfoDal;
import com.zl.bifrost.db.dao.UserInfoMapper;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticationInterceptor implements HandlerInterceptor {
    @Resource
    private UserInfoDal userInfoDal;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object) throws Exception {
        String token = httpServletRequest.getHeader("Authorization");// 从 http 请求头中取出 token
        // 如果不是映射到方法直接通过
//        if(!(object instanceof HandlerMethod)){
//            return true;
//        }
//        if (StringUtils.isEmpty(token)) {
//            throw new RuntimeException("未登录");
//        }
//        Long userId = userInfoDal.getUserIdByToken(token);
//        if (userId == null) {
//            throw new RuntimeException("Invalid Token");
//        }
        return true;
    }
}
