package com.irelandlight.controller;

import com.irelandlight.model.vo.SaveAddress;
import com.irelandlight.service.AddressService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by as on 2016/12/8.
 */
@Controller
@RequestMapping("/address")
public class AddressController {

    private static ThreadLocal<Long> consumerId = new ThreadLocal<Long>();


    @Resource
    private AddressService addressService;

    @RequestMapping("/selectConsumer")
    public String findConsumerNameById(Long consumerId)throws Exception{
        return addressService.findConsumerNameById(1001L);

    }


    @RequestMapping("/addAddress")
    public void addAddresss(SaveAddress saveAddress)throws Exception{
        addressService.addNewAddress(saveAddress);

    }

}
