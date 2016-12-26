package com.irelandlight.manager;

import com.irelandlight.dao.HistoryMapper;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by as on 2016/12/24.
 */
@Component
public class HistoryManager {
    @Resource
    private HistoryMapper historyMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(HistoryManager.class);

    public Map<String,Object> deleteHistory(@Param("historyId")Long historyId)throws Exception{

        Map<String, Object> statusMap = new HashMap<String,Object>();
        Integer delete = historyMapper.deleteHistory(historyId);

        //
        if(delete==1){
            statusMap.put("status",0);
            statusMap.put("msg","删除历史记录成功");
        }
        else{
            statusMap.put("status",1);
            statusMap.put("msg","删除历史记录失败");
        }
        return statusMap;
    }



}
