package com.irelandlight.service;

import com.irelandlight.BaseJunitTest;
import com.irelandlight.dao.HistoryMapper;
import com.irelandlight.model.vo.HistoryShow;
import org.junit.Test;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

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



}