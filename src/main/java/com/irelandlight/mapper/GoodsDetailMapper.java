package com.irelandlight.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import com.irelandlight.vo.GoodsDetail;
/**
 * Created by mr.w on 2016/12/10.
 */
@Repository
public interface GoodsDetailMapper {
    //查询商品id,商品价格min_price,商品名称name,商品描述description，商品库存quanlity,商品规格size
    List<GoodsDetail> selectGoodsDetail(@Param("id") double id)throws Exception;
}
