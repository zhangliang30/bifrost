package com.zl.bifrost.common.request;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * Created by Vongola on 2019/3/3.
 */
@Data
public class OrderVO {
    /**
     * 订单id
     */
    public Long id;
    /**
     * 用户姓名
     */
    public String userName;
    /**
     * 客户的微信openId
     */
    public String openId;
    /**
     * 商品列表
     */
    public List<OrderItemVO> goods = new ArrayList<>();
}
