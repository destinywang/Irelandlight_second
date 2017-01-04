package com.irelandlight.vo;

/**
 * Created by Administrator on 2016/12/15.
 * 用来表示商品对应的尺寸和价格
 */
public class GoodsSizePrice {
    private Integer id;
    private String goodsSize;
    private double goodsPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsSize() {
        return goodsSize;
    }

    public void setGoodsSize(String goodsSize) {
        this.goodsSize = goodsSize;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
}
