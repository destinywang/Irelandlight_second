package com.irelandlight.mapper;

import com.irelandlight.model.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mr.w on 2016/12/6.
 */
@Repository
public interface GoodsMapper {
    //查询商品信息
    public List<Goods> selectGoodInfo() throws Exception;
}
