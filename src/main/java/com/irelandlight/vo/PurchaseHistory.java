package com.irelandlight.vo;

import java.util.Date;

/**
 * Created by lalala on 2016/12/8.
 */
public class PurchaseHistory {
    private Date buydate;   //购买时间
    private String buyGoods;    //蛋糕名称
    private Long goodsId;//物品ID

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Date getBuydate() {
        return buydate;
    }

    public void setBuydate(Date buydate) {
        this.buydate = buydate;
    }

    public String getBuyGoods() {
        return buyGoods;
    }

    public void setBuyGoods(String buyGoods) {
        this.buyGoods = buyGoods;
    }
}
