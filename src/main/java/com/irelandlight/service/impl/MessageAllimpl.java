package com.irelandlight.service.impl;

import com.irelandlight.mapper.MessageAllMapper;

import com.irelandlight.service.inter.MessageAll;
import com.irelandlight.vo.CustomMessageAll;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by lalala on 2016/12/10.
 */
public class MessageAllimpl implements MessageAll {

    @Autowired
    private MessageAllMapper messageAllMapper;


    public List<CustomMessageAll> findCustomMessageAll() throws Exception {
       List<CustomMessageAll> list =  messageAllMapper.findUserList();
        return list;
    }


    public void insertMessageAll(String content, int type, Long rootId) throws Exception {
        List<Long> list = messageAllMapper.findUserAll();
        for (Long l:list) {
            messageAllMapper.insertMessageAll(rootId,l,content,type);
        }
    }
}
