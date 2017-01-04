package com.irelandlight.service.Impl;

import com.irelandlight.dao.GoodsMapper;
import com.irelandlight.service.GoodsService;
import com.irelandlight.vo.GoodsCountInfoVo;
import com.irelandlight.vo.GoodsInfo;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/13.
 * 货柜管理  查询各个状态商品的数量
 */
@Service
@Repository
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;
    /*
     * 商品信息各种数量的页面
     * */
    public GoodsCountInfoVo selectGoodsCountInfo() throws Exception {
        GoodsCountInfoVo goodsCountInfoVo = new GoodsCountInfoVo();
        goodsCountInfoVo.setGoodsTotal(goodsMapper.selectGoodsCount());
        goodsCountInfoVo.setUpedGoods(goodsMapper.upedGoodsCount());
        goodsCountInfoVo.setUnUpGoods(goodsMapper.unUpGoodsCount());
        goodsCountInfoVo.setGoodsComment(goodsMapper.selectCommentCount());
        return goodsCountInfoVo;
    }

    /*
    * 查询商品上下架时页面的数据
    * */
    public List<GoodsInfo> selectGoodsInfo() throws Exception {
        List<GoodsInfo> goodsInfoList=new ArrayList<GoodsInfo>();
        goodsInfoList=goodsMapper.selectGoodsInfo();
        return goodsInfoList;
    }

    /*
    * 商品按id上架
    * */
    public int updateGoodsToPutawayById(Integer id) throws Exception {
        goodsMapper.updateGoodsToPutawayById(id);
        goodsMapper.updateGoodsSizeToPutawayById(id);
        return 0;
    }

    /*
    * 商品按id下架
    * */
    public int updateGoodsToUnPutawayById(Integer id) throws Exception {
        goodsMapper.updateGoodsToUnPutawayById(id);
        goodsMapper.updateGoodsSizeToUnPutawayById(id);
        return 0;
    }

    /*
    * 商品按ids批量上下架
    * */
    public int updateGoodsToPutawayByids(List<Long> ids, int isput) throws Exception {
        goodsMapper.updateGoodsToPutawayByids(ids,isput);
        goodsMapper.updateGoodsSizeToPutaway(ids,isput);
        return 0;
    }




}
