package com.irelandlight.service;

import com.irelandlight.model.Order;
import com.irelandlight.model.vo.OrderShow;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by as on 2016/12/9.
 */


public interface OrderService {
    //根据consumerId查询全部订单信息
    public List<OrderShow> findOrderListByConsumerId(@Param("consumerId")Long consumerId) throws Exception;

    //查找某用户的某种状态的订单
    public List<OrderShow> findOneStatusOrderByConsumerId(@Param("consumerId")Long consumerId ,@Param("orderStatus")Integer orderStatus) throws Exception;

    //查找待评价订单信息
    public List<OrderShow> findNotCommentGoodsByConsumerId(@Param("consumerId")Long consumerId ,@Param("goodsStatus")Integer goodsStatus) throws Exception;

}
