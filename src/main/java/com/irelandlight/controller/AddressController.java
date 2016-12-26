package com.irelandlight.controller;

import com.irelandlight.model.Address;
import com.irelandlight.model.vo.AddressShow;
import com.irelandlight.model.vo.SaveAddress;
import com.irelandlight.service.AddressService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        consumerId.set(1001L);
    }

    @Resource
    private AddressService addressService;

    @RequestMapping(value ="selectConsumer", method= RequestMethod.POST)
    public void findConsumerNameById( HttpServletRequest request, HttpServletResponse response)throws Exception{

       String consumerName = addressService.findConsumerNameById(1001L);
        request.setAttribute("consumerName",consumerName);
    }

    //管理地址
    @RequestMapping(value ="addressManager", method= RequestMethod.POST)
    public void findAddressListByConsumerId( HttpServletRequest request, HttpServletResponse response)throws Exception{

        List<AddressShow> addressShowList = addressService.findAddressListByConsumerId(consumerId.get());
        request.setAttribute("addressShowList",addressShowList);
    }

    //添加地址
    @RequestMapping("addAddress")
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
        request.getRequestDispatcher("/address/deleteAddress.action").forward(request,response);
    }

}
