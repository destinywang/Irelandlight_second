package com.irelandlight.controller;

import com.irelandlight.service.ProductorLoginService;
import com.irelandlight.vo.Manager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by mr.w on 2016/12/24.
 */
@Controller
@SessionAttributes({"userName","password"})
public class ProductorLoginController {
    @Resource
    private ProductorLoginService productorLoginService;
    @Resource
    private Manager manager;
    @RequestMapping()
    public String productorLogin(HttpServletRequest request, Model model){
        String userName=request.getParameter("userName");
        String password=request.getParameter("password");
        manager.setUserName(userName);
        manager.setPassword(password);
        HttpSession session=request.getSession();
        session.setAttribute("userName",userName);
        session.setAttribute("password",password);
        Boolean loginState = productorLoginService.productorLogin(manager);
        model.addAttribute("loginState",loginState);

        return "";
    }
}
