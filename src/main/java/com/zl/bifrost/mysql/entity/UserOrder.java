package com.zl.bifrost.mysql.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class UserOrder implements Serializable {
    /**
     *
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    private Long id;

    /**
     *
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    private String openId;

    /**
     *
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    private String username;

    /**
     *
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    private Date createTime;

    /**
     *
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    private Date updateTime;

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column bifrost..user_order.id
     *
     * @return the value of bifrost..user_order.id
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    public UserOrder withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column bifrost..user_order.id
     *
     * @param id the value for bifrost..user_order.id
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column bifrost..user_order.open_id
     *
     * @return the value of bifrost..user_order.open_id
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    public String getOpenId() {
        return openId;
    }

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    public UserOrder withOpenId(String openId) {
        this.setOpenId(openId);
        return this;
    }

    /**
     * This method sets the value of the database column bifrost..user_order.open_id
     *
     * @param openId the value for bifrost..user_order.open_id
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * This method returns the value of the database column bifrost..user_order.username
     *
     * @return the value of bifrost..user_order.username
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    public UserOrder withUsername(String username) {
        this.setUsername(username);
        return this;
    }

    /**
     * This method sets the value of the database column bifrost..user_order.username
     *
     * @param username the value for bifrost..user_order.username
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method returns the value of the database column bifrost..user_order.create_time
     *
     * @return the value of bifrost..user_order.create_time
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    public UserOrder withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    /**
     * This method sets the value of the database column bifrost..user_order.create_time
     *
     * @param createTime the value for bifrost..user_order.create_time
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method returns the value of the database column bifrost..user_order.update_time
     *
     * @return the value of bifrost..user_order.update_time
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    public UserOrder withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    /**
     * This method sets the value of the database column bifrost..user_order.update_time
     *
     * @param updateTime the value for bifrost..user_order.update_time
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", openId=").append(openId);
        sb.append(", username=").append(username);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
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
        UserOrder other = (UserOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     *
     * @mbg.generated Sun Mar 03 21:05:42 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}