package com.irelandlight.dao;

import com.irelandlight.model.Goods;

import java.util.List;

/**
 * Created by Administrator on 2016/12/12.
 */
public interface GoodsMapper {
    //查询商品数量
    Integer selectGoodsCount()throws Exception;
    //已上架商品数量
    Integer unUpGoodsCount()throws Exception;
    //为上架商品数量
    Integer upedGoodsCount()throws Exception;
    //查询评论总数
    Integer selectCommentCount()throws Exception;

    //查已上架的商品
    List<Goods> selectUpedGoods()throws Exception;
    //查询为上架的商品
    List<Goods> selectUnUpGoods()throws Exception;



}
