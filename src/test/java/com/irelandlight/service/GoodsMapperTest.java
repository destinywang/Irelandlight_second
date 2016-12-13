package com.irelandlight.service;

import com.irelandlight.controller.BaseJunitTest;
import com.irelandlight.mapper.GoodsMapper;
import com.irelandlight.model.Goods;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by mr.w on 2016/12/10.
 */

public class GoodsMapperTest extends BaseJunitTest{
    @Autowired
    private GoodsMapper goodsMapper;

    @Test
     public void selectGoodTest()throws Exception{
        List<Goods> list=goodsMapper.selectGoodInfo();
        System.out.println();

    }
}
