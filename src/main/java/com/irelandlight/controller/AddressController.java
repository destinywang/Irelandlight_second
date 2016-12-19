package com.irelandlight.controller;

import com.irelandlight.model.Address;
import com.irelandlight.model.vo.AddressShow;
import com.irelandlight.model.vo.SaveAddress;
import com.irelandlight.service.AddressService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by as on 2016/12/8.
 */
@Controller
@RequestMapping("/address")
public class AddressController {

    private static ThreadLocal<Long> consumerId = new ThreadLocal<Long>();


    static {
        consumerId.set(1002L);
    }

    @Resource
    private AddressService addressService;

    @RequestMapping("/selectConsumer")
    public void findConsumerNameById(Long consumerId, HttpServletRequest request, HttpServletResponse response)throws Exception{

       addressService.findConsumerNameById(1001L);

    }

    //管理地址
    @RequestMapping("/Address")
    public void findAddressListByConsumerId( HttpServletRequest request, HttpServletResponse response)throws Exception{

        List<AddressShow> addressShowList = addressService.findAddressListByConsumerId(consumerId.get());
        request.getRequestDispatcher("/address.action").forward(request,response);

    }

    //添加地址
    @RequestMapping("/addAddress")
    public void addNewAddress(@Param(value = "address")Address address, HttpServletRequest request, HttpServletResponse response)throws Exception{
        address.setConsumerId(consumerId.get());
        addressService.addNewAddress(address);
        //重定向
        request.getRequestDispatcher("/address/addAddress.action").forward(request,response);
    }

    //删除地址
    @RequestMapping("/deleteAddress")
    //前端传来页面选中的地址信息addressId列表
    public void deleteAddress(List<Long> addressIdList, HttpServletRequest request, HttpServletResponse response)throws Exception{

        for (int i=0;i<addressIdList.size();i++){
            addressService.deleteAddress(addressIdList.get(i));
        }
        //转发
        request.getRequestDispatcher("/address/deleteAddress.action").forward(request,response);
    }

}
