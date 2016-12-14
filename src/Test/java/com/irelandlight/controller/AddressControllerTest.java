package com.irelandlight.controller;

import com.irelandlight.BaseJunitTest;
import com.irelandlight.service.AddressService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by as on 2016/12/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class AddressControllerTest extends BaseJunitTest{

    @Autowired
    private AddressService addressService;

    @Test
    @RequestMapping("/selectConsumer")
    public String testfindConsumerNameById(Long consumerId)throws Exception{
        return addressService.findConsumerNameById(1001L);

    }



}
