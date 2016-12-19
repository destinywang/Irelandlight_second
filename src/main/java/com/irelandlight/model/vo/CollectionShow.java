package com.irelandlight.model.vo;

/**
 * Created by as on 2016/12/10.
 */
public class CollectionShow {
    private String goodsName;
    private Long collectionId;
    private Double goodsPrice;
    private String goodsImgUrl;
    private String size;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Long getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Long collectionId) {
        this.collectionId = collectionId;
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
        return "CollectionShow{" +
                "goodsName='" + goodsName + '\'' +
                ", collectionId=" + collectionId +
                ", goodsPrice=" + goodsPrice +
                ", goodsImgUrl='" + goodsImgUrl + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
