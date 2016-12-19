package com.irelandlight.service.impl;

import com.irelandlight.dao.AddressMapper;
import com.irelandlight.dao.HistoryMapper;
import com.irelandlight.service.HistoryService;
import com.irelandlight.model.vo.HistoryShow;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by as on 2016/12/9.
 */
@Service
@Transactional
public class HistoryServiceImpl implements HistoryService{

    @Resource
    private HistoryMapper historyMapper;

    public List<HistoryShow> findHistoryListByConsumerId(Long consumerId) throws Exception {

        return historyMapper.findHistoryListByConsumerId(consumerId);
    }

    public void deleteHistory(@Param("historyId") Long historyId) throws Exception {

        historyMapper.deleteHistory(historyId);
    }
}
