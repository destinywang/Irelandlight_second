package com.irelandlight.controller;

import com.irelandlight.model.vo.OrderShow;
import com.irelandlight.service.OrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by as on 2016/12/9.
 */
@Controller
@RequestMapping("/personOrder")
public class OrderController {
    private static ThreadLocal<Long> consumerId = new ThreadLocal<Long>();


    @Resource
    private OrderService orderService;

    //查询全部订单
    //返回string 逻辑是图名
    @ResponseBody
    @RequestMapping(value = "/findAllOrderList" , method= RequestMethod.POST)
    public String findOrderListByConsumerId(@Param("orderShow") OrderShow orderShow,
                                            HttpServletRequest request, HttpServletResponse response) throws Exception{
        List<OrderShow> orderList = orderService.findOrderListByConsumerId(1002L);
        //将查询到的订单保存在request作用域中，转发后可以获取到
        request.setAttribute("orderList",orderList);
        return "findAllOrderList";
    }
    //查找某用户的某种状态的订单
    @ResponseBody
    @RequestMapping(value = "/findOneStatusOrder" , method= RequestMethod.POST)
    public String findOneStatusOrderByConsumerId(@Param("orderShow") OrderShow orderShow,
                                                 HttpServletRequest request, HttpServletResponse response) throws Exception{
        List<OrderShow> orderList = orderService.findOneStatusOrderByConsumerId(1002L,1);
        //将查询到的订单保存在request作用域中，转发后可以获取到
        request.setAttribute("orderList",orderList);
        return "findOneStatusOrder";
    }

    //查找待评价订单信息
    @ResponseBody
    @RequestMapping(value = "/findNotCommentGoods" , method= RequestMethod.POST)
    public String findNotCommentGoodsByConsumerId(@Param("orderShow") OrderShow orderShow,
                                                  HttpServletRequest request, HttpServletResponse response) throws Exception{
        //查询用户1002的商品状态为0，待评价的goodsList
        List<OrderShow> orderList = orderService.findOneStatusOrderByConsumerId(1002L,0);
        //将查询到的订单保存在request作用域中，转发后可以获取到
        request.setAttribute("orderList",orderList);
        return "findNotCommentGoods";
    }
}
