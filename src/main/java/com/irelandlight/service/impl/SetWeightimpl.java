package com.irelandlight.service.impl;

import com.mapper.SetWeightMapper;
import com.service.inter.SetWeight;
import com.vo.GoodsWeight;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by lalala on 2016/12/11.
 */
public class SetWeightimpl implements SetWeight {
    @Autowired
    private SetWeightMapper setWeightMapper;


    @Override
    public List<GoodsWeight> findGoodsWeightAll() throws Exception {
        List<GoodsWeight> list = setWeightMapper.findGoodsWeightAll();
        return list;
    }
}
