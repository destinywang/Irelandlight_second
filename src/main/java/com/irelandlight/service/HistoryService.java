package com.irelandlight.service;

import com.irelandlight.model.vo.HistoryShow;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by as on 2016/12/9.
 */
public interface HistoryService {
    //查询浏览记录
    public List<HistoryShow> findHistoryListByConsumerId(Long consumerId)throws Exception;

    //删除浏览记录
    public void deleteHistory(@Param("historyId")Long historyId)throws Exception;


}
