package com.irelandlight.service;

import com.irelandlight.vo.GoodsCountInfoVo;
import com.irelandlight.vo.GoodsInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 货柜管理
 * Created by Administrator on 2016/12/13.
 */
@Service
public interface GoodsService {
    /*
    * 商品信息各种数量的页面
    * */
  GoodsCountInfoVo selectGoodsCountInfo()throws Exception;

    /*
    * 商品上下架页面查询到的数据
    * */
    List<GoodsInfo> selectGoodsInfo()throws Exception;

    /*
    * 商品按id上架
    * */
    int updateGoodsToPutawayById(Integer id)throws Exception;

    /*
    * 商品按id下架
    * */
    int updateGoodsToUnPutawayById(Integer id)throws Exception;

    /*
    * 商品按ids批量上下架
    * */
    int updateGoodsToPutawayByids(List<Long> ids,int isput)throws Exception;
}
