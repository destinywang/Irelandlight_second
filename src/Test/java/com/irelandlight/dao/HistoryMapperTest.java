package com.irelandlight.dao;

import com.irelandlight.BaseJunitTest;
import com.irelandlight.model.vo.HistoryShow;
import org.junit.Test;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by as on 2016/12/10.
 */
@Repository
public class HistoryMapperTest extends BaseJunitTest{
    @Resource
    private HistoryMapper historyMapper;

    @Test
    public void testFindHistoryListByConsumerId() throws Exception {
        List<HistoryShow> historyShowList = historyMapper.findHistoryListByConsumerId(1001l);

        System.out.println(historyShowList);
    }

}