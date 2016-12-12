package com.irelandlight.service.inter;

import com.irelandlight.vo.GoodsWeight;

import java.util.List;

/**
 * Created by lalala on 2016/12/11.
 */
public interface SetWeight {

    public List<GoodsWeight> findGoodsWeightAll()throws Exception;

}
