package com.irelandlight.model;

import java.util.Date;

/**
 * Created by Administrator on 2016/12/12.
 */
public class GoodsCustom extends Goods{
    private long id;
    private Date creatTime;
    private Date lastUpdate;
    private int visibility;
    private Integer goodsId;
    private Integer isPutaway;
    private String size;
    private double price;

    @Override
    public Long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    @Override
    public Date getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    @Override
    public Integer getIsPutaway() {
        return isPutaway;
    }

    @Override
    public void setIsPutaway(Integer isPutaway) {
        this.isPutaway = isPutaway;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
