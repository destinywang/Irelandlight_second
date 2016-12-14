package com.irelandlight.service.Impl;

import com.irelandlight.dao.GoodsMapper;
import com.irelandlight.service.ContaineService;
import com.irelandlight.vo.GoodsCountInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/12/13.
 * 货柜管理  查询各个状态商品的数量
 */
@Service
@Repository
public class ContaineServiceImpl implements ContaineService {

    @Resource
    private GoodsMapper goodsMapper;

    public GoodsCountInfoVo selectGoodsCount() throws Exception {
        GoodsCountInfoVo goodsCountInfoVo = new GoodsCountInfoVo();
        goodsCountInfoVo.setGoodsTotal(goodsMapper.selectGoodsCount());
        goodsCountInfoVo.setUpedGoods(goodsMapper.upedGoodsCount());
        goodsCountInfoVo.setUnUpGoods(goodsMapper.unUpGoodsCount());
        goodsCountInfoVo.setGoodsComment(goodsMapper.selectCommentCount());
        return goodsCountInfoVo;
    }
}
