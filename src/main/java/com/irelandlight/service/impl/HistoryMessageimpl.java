package com.irelandlight.service.impl;

import com.irelandlight.mapper.HistoryMessageMapper;
import com.irelandlight.service.inter.HistoryMessage;
import com.irelandlight.vo.News;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by lalala on 2016/12/3.
 */
public class HistoryMessageimpl implements HistoryMessage {
    @Autowired
    private HistoryMessageMapper historyMessageMapper;


    public List<News> findHistoryMesssage() throws Exception {
        List<News> list = null;
        list = historyMessageMapper.findHistoryMessage();
        return list;
    }


    public void insertMessage(News news) throws Exception {
        historyMessageMapper.insertMessage(news);
    }


    public void deleteMessage(News news) throws Exception {
        historyMessageMapper.deleteMessage(news);
    }
}
