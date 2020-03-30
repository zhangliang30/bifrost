package com.zl.bifrost.controllers;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zl.bifrost.common.request.OrderVO;
import com.zl.bifrost.common.response.OrderAddResponse;
import com.zl.bifrost.common.response.OrderQueryResponse;
import com.zl.bifrost.services.OrderService;

@Slf4j
//@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/order/add", method = RequestMethod.POST)
    public OrderAddResponse addOrder(HttpServletRequest request, @RequestBody OrderVO requestBody){
        log.info("{} requestParam:{}, resquestBody:{}", request.getRequestURI(), requestBody);
        orderService.saveOrder(requestBody);
        OrderAddResponse rs = new OrderAddResponse();
        return rs;
    }

    @RequestMapping(value = "/order/query", method = RequestMethod.POST)
    public OrderQueryResponse queryOrder(HttpServletRequest request, @RequestBody OrderVO requestBody){
        log.info("{} requestParam:{}, resquestBody:{}", request.getRequestURI(), requestBody);
        OrderQueryResponse rs = new OrderQueryResponse();
        return rs;
    }

    @RequestMapping(value = "/order/query_by_id", method = RequestMethod.POST)
    public OrderQueryResponse queryOrderById(HttpServletRequest request, @RequestBody OrderVO requestBody){
        log.info("{} requestParam:{}, resquestBody:{}", request.getRequestURI(), requestBody);
        OrderQueryResponse rs = new OrderQueryResponse();
        orderService.queryById(requestBody);
        rs.setOrderList(Arrays.asList(requestBody));
        return rs;
    }

}
