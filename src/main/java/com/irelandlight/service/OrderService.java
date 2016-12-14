package com.irelandlight.service;

import com.irelandlight.model.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by as on 2016/12/9.
 */


public interface OrderService {
    //根据consumerId查询订单信息
    public List<Order> findOrderListByConsumerId(@Param("consumerId")Long consumerId) throws Exception;

}
