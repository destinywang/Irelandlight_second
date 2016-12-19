package com.irelandlight.service.impl;

import com.irelandlight.dao.OrderMapper;
import com.irelandlight.model.Order;
import com.irelandlight.model.vo.OrderShow;
import com.irelandlight.service.OrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by as on 2016/12/9.
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService{
    @Resource
    private OrderMapper orderMapper;

    //查询全部订单
    public List<OrderShow> findOrderListByConsumerId(@Param("consumerId") Long consumerId) throws Exception {
        return orderMapper.findOrderListByConsumerId(consumerId);
    }

    //查询某种状态订单
    public List<OrderShow> findOneStatusOrderByConsumerId(Long consumerId, Integer orderStatus) throws Exception {
        return orderMapper.findOneStatusOrderByConsumerId(consumerId,orderStatus);
    }

    public List<OrderShow> findNotCommentGoodsByConsumerId(@Param("consumerId") Long consumerId, @Param("goodsStatus") Integer goodsStatus) throws Exception {
        return orderMapper.findNotCommentGoodsByConsumerId(consumerId,goodsStatus);
    }

}
