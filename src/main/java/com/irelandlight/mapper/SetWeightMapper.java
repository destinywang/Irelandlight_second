package com.irelandlight.mapper;

import com.irelandlight.vo.GoodsWeight;

import java.util.List;

/**
 * Created by lalala on 2016/12/11.
 */
public interface SetWeightMapper {

    //展示所有商品权重
    public List<GoodsWeight> findGoodsWeightAll()throws Exception;

    public void setGoodsWeight()throws Exception;

}
