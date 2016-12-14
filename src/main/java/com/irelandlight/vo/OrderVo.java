package com.irelandlight.vo;

import java.util.Date;

/**
 * Created by Administrator on 2016/12/14.
 * 订单列表需要的数据
 */
public class OrderVo {
    private String orderNumber;     //订单编号
    private String nickName;        //用户昵称
    private Date createTime;        //下单时间
    private Integer status;         //订单状态

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;           //订单费用

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
