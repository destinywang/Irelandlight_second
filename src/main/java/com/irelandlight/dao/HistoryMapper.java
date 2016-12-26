package com.irelandlight.dao;

import com.irelandlight.model.vo.HistoryShow;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by as on 2016/12/9.
 */
public interface HistoryMapper {
    //查询浏览记录商品信息
    public List<HistoryShow> findHistoryListByConsumerId(Long consumerId)throws Exception;

    //删除浏览记录
    public int deleteHistory(@Param("historyId")Long historyId);

}
