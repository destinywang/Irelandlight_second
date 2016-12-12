package com.irelandlight.service.inter;

import com.irelandlight.vo.News;

import java.util.List;

/**
 * Created by lalala on 2016/12/3.
 */
public interface HistoryMessage {

    public List<News> findHistoryMesssage()throws Exception;

    public void insertMessage(News news)throws Exception;

    public void deleteMessage(News news) throws Exception;
}
