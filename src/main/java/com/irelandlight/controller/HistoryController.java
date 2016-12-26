package com.irelandlight.controller;

import com.alibaba.fastjson.JSONObject;
import com.irelandlight.model.vo.CollectionShow;
import com.irelandlight.model.vo.HistoryShow;
import com.irelandlight.service.HistoryService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by as on 2016/12/9.
 */
@Controller
@RequestMapping("/history")
public class HistoryController {

    private static ThreadLocal<Long> consumerId = new ThreadLocal<Long>();


    static {
        consumerId.set(1001L);
    }

    @Resource
    private HistoryService historyService;


    //查找历史商品
    @RequestMapping("/findHistory")
    public String findCollectionListByConsumerId(HttpServletRequest request, HttpServletResponse response)throws Exception{
        List<HistoryShow> historyList = historyService.findHistoryListByConsumerId(1001L);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("historyList",historyList);
        return jsonObject.toJSONString();
    }

    //删除浏览记录
    @RequestMapping(value = "deleteHistory")
    public String deleteHistory(@RequestBody Long historyId) throws Exception{
        Map<String, Object> statusMap = historyService.deleteHistory(historyId);
        JSONObject jsonObject = new JSONObject();
        //得到结果
        jsonObject.put("msg",statusMap.get("msg").toString());
        return jsonObject.toJSONString();
    }


}
