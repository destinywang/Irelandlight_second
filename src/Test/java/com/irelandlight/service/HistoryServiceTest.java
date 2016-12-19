package com.irelandlight.service;

import com.irelandlight.BaseJunitTest;
import com.irelandlight.dao.HistoryMapper;
import com.irelandlight.model.vo.HistoryShow;
import org.junit.Test;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by as on 2016/12/10.
 */
@Repository
public class HistoryServiceTest extends BaseJunitTest{
    @Resource
    private HistoryService historyService;

    @Test
    public void findHistoryListByConsumerId() throws Exception {
        List<HistoryShow> historyShowList = historyService.findHistoryListByConsumerId(1002L);
        System.out.println(historyShowList);
    }

    @Test
    public void testDeleteHistory()throws Exception{
        List<Long> historyList = new ArrayList<Long>();
        historyList.add(0,1L);
        historyList.add(1,2L);
        for (int i=0;i<historyList.size();i++){
            historyService.deleteHistory(historyList.get(i));
            System.out.println(historyList.get(i));
        }
    }

}