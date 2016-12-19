package com.irelandlight.controller;

import com.irelandlight.service.HistoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by as on 2016/12/9.
 */
@Controller
@RequestMapping("/history")
public class HistoryController {
    @Resource
    private HistoryService historyService;

    @ResponseBody
    @RequestMapping("/history")
    public void findHistoryList()throws Exception{

    }

}
