package com.irelandlight.vo;

/**
 * Created by Administrator on 2016/12/15.
 * 订单中多个商品的属性
 */
public class OrderGoods {

    private String goodsName;           //商品名称
    private int goodsId;                //商品Id

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }
}
