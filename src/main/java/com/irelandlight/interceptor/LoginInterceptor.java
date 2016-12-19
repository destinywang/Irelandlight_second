package com.irelandlight.interceptor;

import com.irelandlight.model.vo.User;
import com.irelandlight.service.LoginService;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by as on 2016/12/18.
 */
public class LoginInterceptor implements HandlerInterceptor{
    @Resource
    private User user;

    //进入handler方法前执行
    public boolean preHandle(HttpServletRequest httpServletRequest,
                             HttpServletResponse httpServletResponse, Object o) throws Exception {
    //密码为空返回
        if (user.getUserName()==null){
            httpServletResponse.sendRedirect("");
            return false;
        }
        return true;
    }
    //进入handler方法后，返回modelAndView之前执行
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }
    //执行handler方法前执行
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
