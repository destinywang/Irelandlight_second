package com.irelandlight.controller;

import com.alibaba.fastjson.JSONObject;
import com.irelandlight.model.vo.AccountShow;
import com.irelandlight.service.AccountManagerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by as on 2016/12/24.
 */
@Controller
public class AccountManagerController {
    @Resource
    private AccountManagerService accountManagerService ;

    //账户管理
    @RequestMapping(value ="accountManager",method= RequestMethod.POST)
    public String findAccountInfoByConsumerId()throws Exception{
        List<AccountShow> accountShows = accountManagerService.findAccountInfoByConsumerId(1001L);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("accountShows",accountShows);
        return jsonObject.toJSONString();
    }

    //修改密码
    @RequestMapping(value ="changePassword",method= RequestMethod.POST)
    //@RequestBody将json转成string
    public String changePassword(@RequestBody String oldPass, @RequestBody String newPass)throws Exception{
        Map<String, Object> statusMap = accountManagerService.changePassword(1002L,oldPass,newPass);
        JSONObject jsonObject = new JSONObject();
        //得到结果
        jsonObject.put("msg",statusMap.get("msg").toString());
        return jsonObject.toJSONString();
    }

    //修改电话号码
    @RequestMapping(value = "changeTelephone")
    public String changeTelephone(@RequestBody String telephone) throws Exception{
        Map<String, Object> statusMap = accountManagerService.changeTelephone(1002L, telephone);
        JSONObject jsonObject = new JSONObject();
        //得到结果
        jsonObject.put("msg",statusMap.get("msg").toString());
        return jsonObject.toJSONString();
    }
}
