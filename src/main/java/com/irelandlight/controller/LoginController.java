package com.irelandlight.controller;

import com.irelandlight.model.vo.User;
import com.irelandlight.service.LoginService;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by as on 2016/12/18.
 */
@Controller

public class LoginController {
    @Resource
    private LoginService loginService;

    //登录校验
    @RequestMapping(value="/login",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String login(HttpSession session, @RequestParam("username")String userName, String password)throws  Exception{
        //在session中保存用户身份信息
        session.setAttribute("userName",userName);
        //校验用户名，密码,正确返回true
        boolean s = loginService.findOneByUserName(userName,password);
        if (s){
            return "success";
        }
        else return "redirect:login.action";
    }

    //退出
}
