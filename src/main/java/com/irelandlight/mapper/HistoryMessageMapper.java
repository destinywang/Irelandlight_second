package com.irelandlight.mapper;

import com.irelandlight.vo.News;

import java.util.List;

/**
 * Created by lalala on 2016/12/3.
 */
public interface HistoryMessageMapper {

    public List<News> findHistoryMessage() throws Exception;

    public void insertMessage(News news) throws Exception;

    public void deleteMessage(News news)throws Exception;
}
