package com.irelandlight.manager;

import com.irelandlight.mapper.HomePageMapper;

import com.irelandlight.model.HomeRotation;
import com.irelandlight.vo.GoodsVO;
import com.irelandlight.vo.NewsVO;
import org.apache.commons.collections.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mr.w on 2016/12/20.
 */
@Component
public class HomePageManager {
    @Resource
    private HomePageMapper homePageMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(HomePageManager.class);
    /*
    * 对首页轮播图返回的数据进行判断
    * 1.首页轮播图返回数据为空
    * 2.首页轮播图返回数据元组不够
    * 3.首页轮播图返回数据正常
    * */
    public Map<String,Object> queryHomePageImage(){
        List<HomeRotation> homeRotations;
        homeRotations=homePageMapper.queryHomePageImage();
        Map<String,Object> homePage=new HashMap<String,Object>();
        if(homeRotations==null){
            homePage.put("code",1);
            homePage.put("msg","未查询到图片");

        }else if(homeRotations.size()!=3){
            homePage.put("code",2);
            homePage.put("msg","图片数量为："+homeRotations.size());
        }else{
            homePage.put("code",0);
            homePage.put("homeRotations",homeRotations);
        }
        return homePage;
    }
    /*
    *处理公告的返回数据
    * 1.返回值为空
    * 2.返回记录条数不够
    * 3.返回结果正常
    * */

    public Map<String,Object> queryNews(){
        Map<String,Object> news=new HashMap<String, Object>();
        List<NewsVO> newsVOs=homePageMapper.queryNews();
        if(newsVOs==null){
            news.put("code",1);
            news.put("msg","未找到公告");
        }else{
            news.put("code",0);
            news.put("news",news);
        }
        return news;
    }

    /*
    * 返回热门商品数据
    * 1.返回数据是否为空
    * 2.返回数据记录是否够
    * 3.返回数据正确
    * */
    public Map<String,Object> queryHotGoods(){
        Map<String,Object> hotGoods=new HashMap<String,Object>();
        List<GoodsVO> goodsVOs=homePageMapper.queryHotGoods();
        if(goodsVOs==null){
            hotGoods.put("code",1);
            hotGoods.put("msg","未查询到热门商品");
        }else if(goodsVOs.size()!=6){
            hotGoods.put("code",2);
            hotGoods.put("msg","查询到商品种类不够");
        }else{
            hotGoods.put("code",0);
            hotGoods.put("hotGoods",hotGoods);
        }
        return hotGoods;
    }

}
