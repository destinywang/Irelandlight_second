package com.irelandlight.model.vo;

/**
 * Created by as on 2016/12/11.
 */
public class HistoryShow {
    private String goodsName;
    private Long historyId;
    private Double goodsPrice;
    private String goodsImgUrl;
    private String size;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
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

    public Long getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Long historyId) {
        this.historyId = historyId;
    }

    @Override
    public String toString() {
        return "HistoryShow{" +
                "goodsName='" + goodsName + '\'' +
                ", historyId=" + historyId +
                ", goodsPrice=" + goodsPrice +
                ", goodsImgUrl='" + goodsImgUrl + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
