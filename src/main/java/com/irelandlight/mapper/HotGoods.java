package com.irelandlight.mapper;

import com.irelandlight.vo.HotGoodsList;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mr.w on 2016/12/10.
 */
@Repository
public interface HotGoods {
    //查询首页商品的id,商品图片url,商品名goodsName,商品价格goodsPrice
    List<HotGoodsList> selectHotGoods()throws Exception;
}
