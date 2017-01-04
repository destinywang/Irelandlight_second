package com.irelandlight.dao;

import com.irelandlight.vo.OrderVo;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/12.
 * 订单信息统计各个状态的数量以及每月数量
 */
public interface OrderMapper {
    //订单统计
    //查找未处理订单数   状态0
    public int selectUnhandleOrder()throws Exception;
    //查询未支付订单数   状态1
    public int selectUnpayOrder()throws Exception;
    //查询未派送订单数  状态2
    public int selectUndispatchOrder()throws Exception;
    //查询交易成功订单数 状态3
    public int selectSucceedOrder()throws Exception;
    //查询被取消订单数  状态4
    public int selectCanceledOrder()throws Exception;
    //查询每月的订单总数
    List<Map<Integer,Integer>> selectOrderMonth()throws Exception;

    //查询订单列表
    List<OrderVo> selectOrderListByResultMap()throws Exception;

    //根据id删除订单
    void deleteOrderById(Integer id)throws Exception;



}
