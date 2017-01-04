package com.irelandlight.vo;

import java.util.List;

/**
 * Created by Administrator on 2016/12/15.
 * 商品详情  一个商品对应四个尺寸和价格
 */
public class GoodsInfo {
    private int goodsId;
    private String goodsName;
    private String goodsDescription;     //蛋糕描述
    private Integer goodsWeight;         //权重值
    private List<GoodsSizePrice> goodsSizePrices;
    private String goodsUrl;         //图片链接
    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public List<GoodsSizePrice> getGoodsSizePrices() {
        return goodsSizePrices;
    }

    public void setGoodsSizePrices(List<GoodsSizePrice> goodsSizePrices) {
        this.goodsSizePrices = goodsSizePrices;
    }




}
