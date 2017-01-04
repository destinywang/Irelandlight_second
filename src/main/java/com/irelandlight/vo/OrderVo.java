package com.irelandlight.vo;

import com.irelandlight.model.Consumer;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/12/14.
 * 订单列表需要的数据
 */
public class OrderVo {
    private int OrderId;
    private String orderNumber;             //订单编号
   // private String nickName;                //用户昵称
    private Date createTime;                //下单时间
    private Integer status;                //订单状态
    private double price;                 //订单费用
    private Consumer consumer;              //yonghu
    private  List<OrderGoods> orderGoodsList;        //商品名称列表

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public List<OrderGoods> getOrderGoodsList() {
        return orderGoodsList;
    }

    public void setOrderGoodsesList(List<OrderGoods> orderGoodsesList) {
        this.orderGoodsList = orderGoodsesList;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public void setOrderGoodsList(List<OrderGoods> orderGoodsList) {
        this.orderGoodsList = orderGoodsList;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
