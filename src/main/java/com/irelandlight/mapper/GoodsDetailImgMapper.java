package com.irelandlight.mapper;

import com.irelandlight.vo.GoodsDetailImage;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mr.w on 2016/12/11.
 */
@Repository
public interface GoodsDetailImgMapper {
    //查询商品详情的图片url
    List<GoodsDetailImage> selectGoodsDetailImg(@Param("id")Long id)throws Exception;
}
