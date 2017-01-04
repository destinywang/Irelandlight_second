package com.irelandlight.vo;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/14.
 * 统计商品数量和评论总数页面的信息
 */
public class OrderCountInfoVo {
    //未处理订单数   状态0
    private int unHandleOrderCount;
    //未支付订单数   状态1
    private int UnPayOrderCount;
    //未派送订单数  状态2
    private  int UnDispatchOrderCount;
    //交易成功订单数 状态3
    private int SucceedOrderCount;
    //被取消订单数  状态4
    private int CanceledOrderCount;
    //今年每月的订单数量
    private List<Map<Integer,Integer>> ord
    public int getUnHandleOrderCount() {
        return unHandleOrderCount;
    }

    public void setUnHandleOrderCount(int unHandleOrderCount) {
        this.unHandleOrderCount = unHandleOrderCount;
    }

    public int getUnPayOrderCount() {
        return UnPayOrderCount;
    }

    public void setUnPayOrderCount(int unPayOrderCount) {
        UnPayOrderCount = unPayOrderCount;
    }

    public int getUnDispatchOrderCount() {
        return UnDispatchOrderCount;
    }

    public void setUnDispatchOrderCount(int unDispatchOrderCount) {
        UnDispatchOrderCount = unDispatchOrderCount;
    }

    public int getSucceedOrderCount() {
        return SucceedOrderCount;
    }

    public void setSucceedOrderCount(int succeedOrderCount) {
        SucceedOrderCount = succeedOrderCount;
    }

    public int getCanceledOrderCount() {
        return CanceledOrderCount;
    }

    public void setCanceledOrderCount(int canceledOrderCount) {
        CanceledOrderCount = canceledOrderCount;
    }
}
