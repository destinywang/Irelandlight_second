package com.irelandlight.controller;

import com.irelandlight.service.HomePageService;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by mr.w on 2016/12/20.
 */
@RequestMapping
@ResponseBody
@Repository
public class HomePageController {
    @Resource
    private HomePageService homePageService;
    public String homePage(Model model) {
        Map<String, Object> homePageImage = homePageService.queryHomePageImage();
        Map<String, Object> news = homePageService.queryNews();
        Map<String, Object> hotGoods = homePageService.queryHotGoods();

        /*for (Map.Entry<String,Object> entry:homePageImage.entrySet()){
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
        for (Map.Entry<String,Object> entry:news.entrySet()){
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
        for (Map.Entry<String,Object> entry:hotGoods.entrySet()){
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }*/
        model.addAttribute("homePageImage",homePageImage);
        model.addAttribute("news",news);
        model.addAttribute("hotGoods",hotGoods);
        return "";
    }
}
