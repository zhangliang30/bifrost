package com.zl.bifrost.mysql.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class OrderItem implements Serializable {
    /**
     *
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    private Long id;

    /**
     *
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    private Long orderId;

    /**
     *
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    private Long itemId;

    /**
     *
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    private String itemName;

    /**
     *
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    private BigDecimal price;

    /**
     *
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    private Integer count;

    /**
     *
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    private Date createTime;

    /**
     *
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    private Date updateTime;

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column bifrost..order_item.id
     *
     * @return the value of bifrost..order_item.id
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public OrderItem withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column bifrost..order_item.id
     *
     * @param id the value for bifrost..order_item.id
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column bifrost..order_item.order_id
     *
     * @return the value of bifrost..order_item.order_id
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public OrderItem withOrderId(Long orderId) {
        this.setOrderId(orderId);
        return this;
    }

    /**
     * This method sets the value of the database column bifrost..order_item.order_id
     *
     * @param orderId the value for bifrost..order_item.order_id
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method returns the value of the database column bifrost..order_item.item_id
     *
     * @return the value of bifrost..order_item.item_id
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public OrderItem withItemId(Long itemId) {
        this.setItemId(itemId);
        return this;
    }

    /**
     * This method sets the value of the database column bifrost..order_item.item_id
     *
     * @param itemId the value for bifrost..order_item.item_id
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * This method returns the value of the database column bifrost..order_item.item_name
     *
     * @return the value of bifrost..order_item.item_name
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public String getItemName() {
        return itemName;
    }

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public OrderItem withItemName(String itemName) {
        this.setItemName(itemName);
        return this;
    }

    /**
     * This method sets the value of the database column bifrost..order_item.item_name
     *
     * @param itemName the value for bifrost..order_item.item_name
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * This method returns the value of the database column bifrost..order_item.price
     *
     * @return the value of bifrost..order_item.price
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public OrderItem withPrice(BigDecimal price) {
        this.setPrice(price);
        return this;
    }

    /**
     * This method sets the value of the database column bifrost..order_item.price
     *
     * @param price the value for bifrost..order_item.price
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method returns the value of the database column bifrost..order_item.count
     *
     * @return the value of bifrost..order_item.count
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public Integer getCount() {
        return count;
    }

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public OrderItem withCount(Integer count) {
        this.setCount(count);
        return this;
    }

    /**
     * This method sets the value of the database column bifrost..order_item.count
     *
     * @param count the value for bifrost..order_item.count
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method returns the value of the database column bifrost..order_item.create_time
     *
     * @return the value of bifrost..order_item.create_time
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public OrderItem withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    /**
     * This method sets the value of the database column bifrost..order_item.create_time
     *
     * @param createTime the value for bifrost..order_item.create_time
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method returns the value of the database column bifrost..order_item.update_time
     *
     * @return the value of bifrost..order_item.update_time
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public OrderItem withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    /**
     * This method sets the value of the database column bifrost..order_item.update_time
     *
     * @param updateTime the value for bifrost..order_item.update_time
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", itemId=").append(itemId);
        sb.append(", itemName=").append(itemName);
        sb.append(", price=").append(price);
        sb.append(", count=").append(count);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrderItem other = (OrderItem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getItemName() == null ? other.getItemName() == null : this.getItemName().equals(other.getItemName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:26 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getItemName() == null) ? 0 : getItemName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}