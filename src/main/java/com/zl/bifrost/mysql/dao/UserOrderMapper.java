package com.zl.bifrost.mysql.dao;

import com.zl.bifrost.mysql.entity.UserOrder;
import com.zl.bifrost.mysql.entity.UserOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserOrderMapper {
    /**
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    long countByExample(UserOrderExample example);

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    int deleteByExample(UserOrderExample example);

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    int insert(UserOrder record);

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    int insertSelective(UserOrder record);

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    List<UserOrder> selectByExample(UserOrderExample example);

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    UserOrder selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserOrder record, @Param("example") UserOrderExample example);

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    int updateByExample(@Param("record") UserOrder record, @Param("example") UserOrderExample example);

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    int updateByPrimaryKeySelective(UserOrder record);

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    int updateByPrimaryKey(UserOrder record);
}