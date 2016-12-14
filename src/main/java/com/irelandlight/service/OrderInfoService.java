package com.irelandlight.service;

import com.irelandlight.vo.OrderCountInfoVo;

/**
 * Created by Administrator on 2016/12/14.
 */
public interface OrderInfoService {
    //查询各个状态的订单数量以及每月的订单数量
    OrderCountInfoVo selectOrderInfo()throws Exception;
}
