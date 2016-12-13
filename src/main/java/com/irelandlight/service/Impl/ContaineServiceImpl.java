package com.irelandlight.service.Impl;

import com.irelandlight.dao.GoodsMapper;
import com.irelandlight.service.ContaineService;
import com.irelandlight.vo.GoodsCountInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/12/13.
 */
@Service
public class ContaineServiceImpl implements ContaineService{
    @Resource
    private GoodsCountInfo goodsCountInfo;
    private GoodsMapper goodsMapper;

    public GoodsCountInfo selectgoodsCount() throws Exception {
        goodsCountInfo.setGoodsTotal(goodsMapper.selectGoodsCount());
        goodsCountInfo.setUpedGoods(goodsMapper.upedGoodsCount());
        goodsCountInfo.setUnUpGoods(goodsMapper.unUpGoodsCount());
        goodsCountInfo.setGoodsComment(goodsMapper.commentCount());
        return goodsCountInfo;
    }
}
