package com.irelandlight.service;

import com.irelandlight.manager.GoodsListManager;
import com.irelandlight.vo.FilterGoodsVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by mr.w on 2016/12/21.
 */
@Service
public class GoodsListService {
    @Resource
    private GoodsListManager goodsListManager;
    /*
    * 商品名录的全部商品
    * */
    public Map<String,Object> queryAllGoods(){
        return goodsListManager.queryAllGoods();
    }
    /*
    * 搜索框搜索商品
    * */
    public Map<String,Object> querySearchGoods(String searchBox){
        return goodsListManager.querySearchGoods(searchBox);
    }
    /*
    * 按照类型搜索商品
    * */
    public Map<String,Object> queryFilterGoods(FilterGoodsVO filterGoodsVO){
        return goodsListManager.queryFilterGoods(filterGoodsVO);
    }
}
