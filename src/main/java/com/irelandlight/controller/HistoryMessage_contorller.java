package com.irelandlight.controller;

import com.irelandlight.service.inter.HistoryMessage;
import com.irelandlight.vo.News;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by lalala on 2016/12/3.
 */
@Controller
public class HistoryMessage_contorller {

    @Autowired
    private HistoryMessage historyMessage;



    //查询历史公告
    @RequestMapping("/lookHistory")
    public String findHistoryMessage(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception
    {
        List<News> list = null;
        list = historyMessage.findHistoryMesssage();

        httpServletRequest.setAttribute("historyList",list);

        return "/history";

    }

    @RequestMapping("/insertMessage")
    public void insertMessage(@Param(value = "news") News news, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)throws Exception
    {
        //news 的标题和内容都不能为空
        //System.out.println(news.getTitle());
        historyMessage.insertMessage(news);
        httpServletRequest.getRequestDispatcher("/lookHistory.action").forward(httpServletRequest,httpServletResponse);
    }

    @RequestMapping("delete")
    public void delete(@Param(value = "news") News news, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception
    {
        historyMessage.deleteMessage(news);
        httpServletRequest.getRequestDispatcher("/lookHistory.action").forward(httpServletRequest,httpServletResponse);
    }
}
