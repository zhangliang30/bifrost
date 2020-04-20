package com.zl.bifrost.common.request;

import lombok.Data;

/**
 * Created by Vongola on 2019/3/3.
 */
@Data
public class OrderItemVO {
    /**
     * 商品ID
     */
    public Long itemId;
    /**
     * 商品名称
     */
    public String itemName;
    /**
     * 商品单价
     */
    public String price;
    /**
     * 购买数量
     */
    public Integer count;
}
