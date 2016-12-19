package com.irelandlight.model.vo;

import com.irelandlight.model.Goods;

import java.util.List;

/**
 * Created by as on 2016/12/12.
 */
public class OrderShow {
    private Long orderId;
    private Integer orderStatus;         //订单状态
    private List<GoodsShow> goodsList;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<GoodsShow> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<GoodsShow> goodsList) {
        this.goodsList = goodsList;
    }
}
