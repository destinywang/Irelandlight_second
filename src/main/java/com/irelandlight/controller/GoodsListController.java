package com.irelandlight.controller;

import com.alibaba.fastjson.JSON;
import com.irelandlight.service.GoodsListService;
import com.irelandlight.vo.FilterGoodsVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.json.Json;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mr.w on 2016/12/21.
 */
@Controller
public class GoodsListController {
    @Resource
    private GoodsListService goodsListService;

    @RequestMapping
    public String queryAllGoods(Model model){
        Map<String,Object> allGoods=goodsListService.queryAllGoods();
        model.addAttribute("allGoods",allGoods);
        return "";
    }
    @RequestMapping
    public String querySearchGoods(HttpServletRequest request, Model model){
        String searchBox=request.getParameter("searchBox");
        Map<String,Object> searchGoods=goodsListService.querySearchGoods(searchBox);
        model.addAttribute("searchGoods",searchGoods);
        return "";
    }
    @RequestMapping
    public String queryFilterGoods(String json,Model model){
        FilterGoodsVO filter= JSON.parseObject(json,FilterGoodsVO.class);
        Map<String,Object> filterGoods=goodsListService.queryFilterGoods(filter);
        model.addAttribute("filterGoods",filterGoods);
        return "";
    }
}


