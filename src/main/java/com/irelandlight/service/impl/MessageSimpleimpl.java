package com.irelandlight.service.impl;

import com.irelandlight.mapper.MessageSimpleMapper;
import com.irelandlight.service.inter.MessageSimple;
import com.irelandlight.vo.CustomMessageSimple;
import com.irelandlight.vo.PurchaseHistory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by lalala on 2016/12/8.
 */
public class MessageSimpleimpl implements MessageSimple {
    @Autowired
    private MessageSimpleMapper messageSimpleMapper;


    public List<MessageSimple> findHistoryMessageSimple(Long from_id, Long to_id) throws Exception {

        List<MessageSimple> list =  messageSimpleMapper.findHistoryMessageSimple(from_id,to_id);
        return list;
    }

    public CustomMessageSimple findCustomMessage(Long id) throws Exception {
        CustomMessageSimple customMessageSimple = messageSimpleMapper.findCustomMessage(id);
        return customMessageSimple;
    }

    public List<PurchaseHistory> findPurchaseHistory(Long id) throws Exception {
        List<PurchaseHistory> list = messageSimpleMapper.findPurchaseHistory(id);
        return list;
    }

    public void insertMessageSimple(Long from_id, Long to_id, String content, int type) throws Exception {
        messageSimpleMapper.insertMessageSimple(from_id,to_id,content,type);
    }


}
