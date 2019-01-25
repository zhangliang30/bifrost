package com.zl.bifrost.mysql.dao;

import com.zl.bifrost.mysql.entity.OrderItem;
import com.zl.bifrost.mysql.entity.OrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderItemMapper {
    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    long countByExample(OrderItemExample example);

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    int deleteByExample(OrderItemExample example);

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    int insert(OrderItem record);

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    int insertSelective(OrderItem record);

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    List<OrderItem> selectByExample(OrderItemExample example);

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    OrderItem selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    int updateByExampleSelective(@Param("record") OrderItem record, @Param("example") OrderItemExample example);

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    int updateByExample(@Param("record") OrderItem record, @Param("example") OrderItemExample example);

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    int updateByPrimaryKeySelective(OrderItem record);

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    int updateByPrimaryKey(OrderItem record);
}