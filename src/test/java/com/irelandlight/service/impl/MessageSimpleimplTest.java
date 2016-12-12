package com.irelandlight.service.impl;


import com.irelandlight.BaseJunitTest;
import com.irelandlight.mapper.MessageSimpleMapper;
import com.irelandlight.vo.MessageSimple;
import com.irelandlight.vo.CustomMessageSimple;

import com.irelandlight.vo.PurchaseHistory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by lalala on 2016/12/9.
 */
public class MessageSimpleimplTest extends BaseJunitTest {

    @Autowired
    private MessageSimpleMapper messageSimpleMapper;


    @Test
    public void findHistoryMessageSimpleTest() throws Exception {

       List<MessageSimple> list = messageSimpleMapper.findHistoryMessageSimple(1l,1002l);
        System.out.println(list.size());
    }

    @Test
    public void findCustomMessageTest()throws Exception
    {
        CustomMessageSimple customMessageSimple = messageSimpleMapper.findCustomMessage(1002l);
        System.out.println(customMessageSimple.getUserId());
    }

    @Test
    public void findPurchaseHistoryTest()throws Exception
    {
        List<PurchaseHistory>list = messageSimpleMapper.findPurchaseHistory(1002l);
        System.out.println(list.size());
    }

    @Test
    public void insertMessageSimple()throws Exception
    {
        messageSimpleMapper.insertMessageSimple(1l,1002l,"ncdcbiao",1);
    }
}
