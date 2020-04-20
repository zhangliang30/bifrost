package com.zl.bifrost.controllers;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zl.bifrost.common.response.StandardResponse;
import com.zl.bifrost.common.response.menu.AdminMenuData;
import com.zl.bifrost.db.dal.UserInfoDal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.IOUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@CrossOrigin
//@RestController("/menus")
public class AsideBarController {
    @Resource
    private UserInfoDal userInfoDal;
    @Value("classpath:data/menudata.json")
    private org.springframework.core.io.Resource demo;

    @GetMapping
    public StandardResponse<List<AdminMenuData>> getMenu(HttpServletRequest request) {
        StandardResponse<List<AdminMenuData>> rs = new StandardResponse<>();
        rs.setData(Collections.emptyList());
        return rs;
    }

}
