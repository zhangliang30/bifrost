package com.zl.bifrost.services;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zl.bifrost.common.request.OrderItemVO;
import com.zl.bifrost.common.request.OrderVO;
import com.zl.bifrost.mysql.dao.OrderItemMapper;
import com.zl.bifrost.mysql.dao.UserOrderMapper;
import com.zl.bifrost.mysql.entity.OrderItem;
import com.zl.bifrost.mysql.entity.OrderItemExample;
import com.zl.bifrost.mysql.entity.UserOrder;

/**
 * Created by Vongola on 2019/3/3.
 */
@Service
public class OrderService {
    @Autowired
    private UserOrderMapper userOrderMapper;
    @Autowired
    private OrderItemMapper orderItemMapper;

    @Transactional
    public void saveOrder(OrderVO orderVO) {
        UserOrder userOrder = new UserOrder();
        userOrder.setUpdateTime(new Date());
        userOrder.setCreateTime(userOrder.getUpdateTime());
        userOrder.setOpenId(orderVO.getOpenId());
        userOrder.setUsername(orderVO.getUserName());
        userOrderMapper.insertSelective(userOrder);
        orderVO.setId(userOrder.getId());
        for (OrderItemVO orderItemVo: orderVO.getGoods()) {
            OrderItem orderItem = new OrderItem();
            orderItem.setCount(orderItemVo.getCount());
            orderItem.setCreateTime(new Date());
            orderItem.setUpdateTime(orderItem.getCreateTime());
            orderItem.setItemId(orderItemVo.getItemId());
            orderItem.setItemName(orderItemVo.getItemName());
            orderItem.setPrice(new BigDecimal(orderItemVo.getPrice()));
            orderItem.setOrderId(userOrder.getId());
            orderItemMapper.insertSelective(orderItem);
        }
    }

    public void queryById(OrderVO orderVO) {
        UserOrder userOrder = userOrderMapper.selectByPrimaryKey(orderVO.getId());
        orderVO.setUserName(userOrder.getUsername());
        OrderItemExample example = new OrderItemExample();
        example.createCriteria().andOrderIdEqualTo(orderVO.getId());
        List<OrderItem> orderItems = orderItemMapper.selectByExample(example);
        for (OrderItem orderItem : orderItems) {
            orderVO.getGoods().add(transItem2Vo(orderItem));
        }
    }

    public OrderVO query(OrderVO orderVO) {
        return null;
    }
    
    private OrderItemVO transItem2Vo(OrderItem orderItem){
        OrderItemVO vo = new OrderItemVO();
        vo.setCount(orderItem.getCount());
        vo.setItemId(orderItem.getItemId());
        vo.setItemName(orderItem.getItemName());
        String price = orderItem.getPrice().toString() != null ? orderItem.getPrice().toString() : "0.0";
        vo.setPrice(price);
        return vo ;
    }
}
