package com.irelandlight.vo;

import java.util.List;

/**
 * Created by mr.w on 2016/12/18.
 */
public class GoodsAll {
    private GoodsInfo goodsInfo;
    private List<SizePrice> sizePrices;

    public GoodsInfo getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(GoodsInfo goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public List<SizePrice> getSizePrices() {
        return sizePrices;
    }

    public void setSizePrices(List<SizePrice> sizePrices) {
        this.sizePrices = sizePrices;
    }
}
