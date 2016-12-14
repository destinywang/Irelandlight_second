package com.irelandlight.dao;

import com.irelandlight.model.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by as on 2016/12/9.
 */
@Repository
public interface OrderMapper {
    //查询某用户的订单
    public List<Order> findOrderListByConsumerId(@Param("consumerId")Long consumerId) throws Exception;

}
