package com.irelandlight.controller;

import com.alibaba.fastjson.JSONObject;
import com.irelandlight.model.vo.User;
import com.irelandlight.service.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by as on 2016/12/24.
 */
@Controller
public class RegisterController {

    @Resource
    private RegisterService registerService;

    //注册
    @RequestMapping(value = "register")
    public String addUser(@RequestBody User user) throws Exception{
        Map<String, Object> statusMap = registerService.addUser(user);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg",statusMap.get("msg").toString());
        return jsonObject.toJSONString();
    }
}
