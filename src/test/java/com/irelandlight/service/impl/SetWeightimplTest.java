package com.irelandlight.service.impl;


import com.irelandlight.BaseJunitTest;
import com.irelandlight.mapper.SetWeightMapper;
import com.irelandlight.vo.GoodsWeight;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by lalala on 2016/12/11.
 */
public class SetWeightimplTest extends BaseJunitTest {
    @Autowired
    private SetWeightMapper setWeightMapper;

    @Test
    public void findGoodsWeightAllTest()throws Exception
    {
        List<GoodsWeight> list = setWeightMapper.findGoodsWeightAll();
        for (GoodsWeight g:list) {
            System.out.println(g.getGoodsName());
        }
    }
}
