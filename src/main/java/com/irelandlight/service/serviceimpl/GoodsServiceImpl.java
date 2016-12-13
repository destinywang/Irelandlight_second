package com.irelandlight.service.serviceimpl;

import com.irelandlight.mapper.GoodsMapper;
import com.irelandlight.model.Goods;
import com.irelandlight.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by mr.w on 2016/12/7.
 */
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    private GoodsMapper goodsMapper;

    public List<Goods> findItemsList() throws Exception {
        return goodsMapper.selectGoodInfo();
    }
}
