package com.irelandlight.manager;

import com.irelandlight.mapper.GoodsDetailMapper;
import com.irelandlight.mapper.GoodsListMapper;
import com.irelandlight.vo.FilterGoodsVO;
import com.irelandlight.vo.GoodsVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mr.w on 2016/12/21.
 */
@Component
public class GoodsListManager {
    @Resource
    private GoodsListMapper goodsListMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(GoodsListManager.class);
    /*
    * 处理商品列表
    * */
    public Map<String,Object> queryAllGoods(){
        List<GoodsVO> goodsVOList=goodsListMapper.queryAllGoods();
        Map<String,Object> allGoods=new HashMap<String,Object>();
        if(goodsVOList==null){
            allGoods.put("code","1");
            allGoods.put("msg","商品列表为空");
        }else{
            allGoods.put("code","0");
            allGoods.put("allGoods",allGoods);
        }


        return allGoods;
    }
    /*
    * 处理搜索框返回的商品
    * */
    public Map<String,Object> querySearchGoods(String searchBox){
        Map<String,Object> goodsList = new HashMap<String, Object>();
        if(searchBox==null){
            goodsList.put("code","1");
            goodsList.put("msg","输入searchBoox为null");
            LOGGER.error("查询searchBox为null");
        }else{
            List<GoodsVO> GoodsVOs= goodsListMapper.queryBySearchGoods(searchBox);
            if(GoodsVOs==null){
                goodsList.put("code","1");
                goodsList.put("msg","商品未找到");
            }else{
                goodsList.put("code","0");
                goodsList.put("GoodsVOs",GoodsVOs);
            }
        }

        return goodsList;
    }
    /*
    * 处理按类型筛选返回的商品
    * */
    public Map<String,Object> queryFilterGoods(FilterGoodsVO filter){
        Map<String,Object> filterGoods=new HashMap<String,Object>();
        if(filter==null){
            filterGoods.put("code","1");
            filterGoods.put("msg","筛选类型数组为空");
            LOGGER.error("筛选数组为空");
        }else{
            List<GoodsVO> GoodsVOs=goodsListMapper.queryFilterGoods(filter);
            if(GoodsVOs==null){
                filterGoods.put("code","2");
                filterGoods.put("msg","查询类型的商品未找到");
            }else{
                filterGoods.put("code","0");
                filterGoods.put("filterGoods",filterGoods);
            }

        }
        return filterGoods;
    }
}
