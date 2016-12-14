package com.irelandlight.model.vo;

/**
 * Created by as on 2016/12/11.
 */
public class HistoryShow {
    private String goodsName;
    private Long goodsId;
    private Double goodsPrice;
    private String goodsImgUrl;
    private String size;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsImgUrl() {
        return goodsImgUrl;
    }

    public void setGoodsImgUrl(String goodsImgUrl) {
        this.goodsImgUrl = goodsImgUrl;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "HistoryShow{" +
                "goodsName='" + goodsName + '\'' +
                ", goodsId=" + goodsId +
                ", goodsPrice=" + goodsPrice +
                ", goodsImgUrl='" + goodsImgUrl + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
