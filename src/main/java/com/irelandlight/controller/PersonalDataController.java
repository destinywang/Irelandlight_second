package com.irelandlight.controller;

import com.alibaba.fastjson.JSONObject;
import com.irelandlight.model.vo.PersonalData;
import com.irelandlight.service.PersonalDataService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by as on 2016/12/13.
 */
@Controller
public class PersonalDataController {

    private static ThreadLocal<Long> consumerId = new ThreadLocal<Long>();


    static {
        consumerId.set(1001L);
    }
    @Resource
    private PersonalDataService personalDataService;

    //展示个人信息
    @RequestMapping(value ="showPersonalInfo",method= RequestMethod.POST)
    public String findPersonalDataByConsumerId()throws Exception{
        List<PersonalData> personalDataList = personalDataService.findPersonalDataByConsumerId(consumerId.get());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("personalDataList",personalDataList);
        return jsonObject.toJSONString();
    }

    //修改个人信息
    @RequestMapping(value ="changePersonalData",method= RequestMethod.POST)
    //@RequestBody将json转成string
    public String changePassword(@RequestBody PersonalData personalData)throws Exception{
        Map<String, Object> statusMap = personalDataService.updateNickName(personalData,consumerId.get());
        JSONObject jsonObject = new JSONObject();
        //得到结果
        jsonObject.put("msg",statusMap.get("msg").toString());
        return jsonObject.toJSONString();
    }

}
