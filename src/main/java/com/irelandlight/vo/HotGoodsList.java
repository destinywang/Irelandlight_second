package com.irelandlight.vo;

/**
 * Created by mr.w on 2016/12/10.
 */
public class HotGoodsList {
    private Integer id;        //商品Id
    private String name;       //商品名称
    private double goodsPrice;      //商品价格
    private String url;             //商品图片Url


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
