package com.irelandlight.dao;

import com.irelandlight.model.Goods;
import com.irelandlight.model.GoodsSize;
import com.irelandlight.vo.GoodsInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/12.
 */
public interface GoodsMapper {
    //查询商品数量
    Integer selectGoodsCount()throws Exception;
    //已上架商品数量
    Integer unUpGoodsCount()throws Exception;
    //为上架商品数量
    Integer upedGoodsCount()throws Exception;
    //查询评论总数
    Integer selectCommentCount()throws Exception;

    //查已上架的商品
    List<Goods> selectUpedGoods()throws Exception;
    //查询为上架的商品
    List<Goods> selectUnUpGoods()throws Exception;

    //查询商品详情(一个商品对应四个尺寸四个价格)
    List<GoodsInfo>  selectGoodsInfo()throws Exception;

    //按id商品上架  商品表和商品规格表is_putaway都要修改
    int updateGoodsToPutawayById(Integer id)throws Exception;
    int updateGoodsSizeToPutawayById(Integer id)throws Exception;
    //按id商品下架  商品表和商品规格表is_putaway都要修改
    int updateGoodsToUnPutawayById(Integer id)throws Exception;
    int updateGoodsSizeToUnPutawayById(Integer id)throws Exception;

    //批量上下架  isput代表是否上架
    int updateGoodsToPutawayByids(@Param("ids") List<Long> ids,@Param("isput") Integer isput)throws Exception;
    int updateGoodsSizeToPutaway(@Param("ids") List<Long> ids,@Param("isput") int isput)throws Exception;

    //给商品列表中添加商品
    int insertGoods(@Param("goods") Goods goods)throws Exception;
    //添加商品尺寸
    int insertGoodsSize(@Param("goodsSizeList") List<GoodsSize> goodsSizeList)throws Exception;
    //添加商品图片,传入商品id，图片url集合  key代表图的position ，value代表图片的链接
    int insertIntoGoodsImg(@Param("id")Long id,@Param("imgUrlMap") Map<String,Integer> imgUrlMap)throws Exception;

    /*
    * 修改商品信息
    * */
    int updateGoods(@Param("goods") Goods goods)throws Exception;
    /*
    * 修改商品尺寸
    * */
    int updateGoodsSize(@Param("goodsSize") GoodsSize goodsSize)throws Exception;



}
