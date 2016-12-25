package com.irelandlight.service;

import com.irelandlight.manager.HomePageManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by mr.w on 2016/12/20.
 */
@Service
public class HomePageService {
    @Resource
    private HomePageManager homePageManager;
    /*
    * 返回首页轮播图
    * */
    public Map<String,Object> queryHomePageImage(){
        return homePageManager.queryHomePageImage();
    }
    /*
    * 返回公告
    * */
    public Map<String,Object> queryNews(){
        return homePageManager.queryNews();
    }
    /*
    * 返回首页商品（6个）
    * */
    public Map<String,Object> queryHotGoods(){
        return homePageManager.queryHotGoods();
    }
}
