package com.zl.bifrost.controllers;

import com.zl.bifrost.common.response.StandardResponse;
import com.zl.bifrost.common.response.menu.AdminMenuData;
import com.zl.bifrost.common.response.user.UserListVO;
import com.zl.bifrost.db.dal.UserInfoDal;
import com.zl.bifrost.services.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.List;

@CrossOrigin
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/users")
    public StandardResponse<UserListVO> getMenu(HttpServletRequest request) {
        String query = request.getParameter("query");
        Integer pageNum = Integer.parseInt(request.getParameter("pagenum"));
        Integer pageSize = Integer.parseInt(request.getParameter("pagesize"));
        StandardResponse<UserListVO> rs = new StandardResponse<>();
        UserListVO users = userService.queryUserList(query, pageSize, pageNum);
        rs.setData(users);
        return rs;
    }

}
