package com.irelandlight.mapper;

import com.irelandlight.model.HomeRotation;
import com.irelandlight.vo.GoodsVO;
import com.irelandlight.vo.NewsVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mr.w on 2016/12/19.
 */
@Repository
public interface HomePageMapper {
    /**
     * 查询首页轮播图
     * @return 返回轮播图信息
     */
    List<HomeRotation> queryHomePageImage();

    /**
     * 查询公告
     * @return 返回表中的未被删除的所有公告
     */
    List<NewsVO> queryNews();

    /**
     * 查询热门商品信息
     * @return 返回商品信息包装类：GoodsImage和Goods
     */
    List<GoodsVO> queryHotGoods();
}
