package com.irelandlight.service.Impl;

import com.irelandlight.dao.OrderMapper;
import com.irelandlight.service.OrderInfoService;
import com.irelandlight.vo.OrderCountInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/12/14.
 */
@Service
@Repository
public class OrderInfoServiceImpl implements OrderInfoService{
    @Resource
    private OrderMapper orderMapper;

    public OrderCountInfoVo selectOrderInfo() throws Exception {
        OrderCountInfoVo orderCountInfoVo= new OrderCountInfoVo();
        orderCountInfoVo.setCanceledOrderCount(orderMapper.selectCanceledOrder());
        orderCountInfoVo.setSucceedOrderCount(orderMapper.selectSucceedOrder());
        orderCountInfoVo.setUnDispatchOrderCount(orderMapper.selectUndispatchOrder());
        orderCountInfoVo.setUnHandleOrderCount(orderMapper.selectUnhandleOrder());
        orderCountInfoVo.setUnPayOrderCount(orderMapper.selectUnpayOrder());

        return orderCountInfoVo;
    }
}
