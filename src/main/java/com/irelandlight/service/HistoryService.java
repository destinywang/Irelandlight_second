package com.irelandlight.service;

import com.irelandlight.model.vo.HistoryShow;

import java.util.List;

/**
 * Created by as on 2016/12/9.
 */
public interface HistoryService {
    //查询浏览记录
    public List<HistoryShow> findHistoryListByConsumerId(Long consumerId)throws Exception;

    //

}
