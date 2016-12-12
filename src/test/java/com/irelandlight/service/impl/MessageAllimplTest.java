package com.irelandlight.service.impl;

import com.irelandlight.BaseJunitTest;
import com.irelandlight.mapper.MessageAllMapper;
import com.irelandlight.vo.CustomMessageAll;
import com.irelandlight.vo.MessageAll;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by lalala on 2016/12/10.
 */
public class MessageAllimplTest extends BaseJunitTest {
    @Autowired
    private MessageAllMapper messageAllMapper;

    @Test
    public void findCustomMessageAllTest()throws Exception
    {
        List<CustomMessageAll> list = messageAllMapper.findUserList();
        System.out.println(list.size());
        System.out.println(list.get(0).getUserRecord());
        System.out.println(list.get(1).getUserRecord());
        System.out.println(list.get(2).getUserRecord());
    }

    @Test
    public void insertMessageAllTest()throws Exception
    {
        List<Long> list = messageAllMapper.findUserAll();
        for (Long l:list) {
            messageAllMapper.insertMessageAll(1l,l,"testSendAll",3);
        }
    }

    @Test
    public void findHistoryMessageTest()throws Exception
    {
        List<MessageAll> list = messageAllMapper.findHistoryMessageAll();

        for (MessageAll m:list) {
            System.out.println(m.getContent());
        }
    }


}
