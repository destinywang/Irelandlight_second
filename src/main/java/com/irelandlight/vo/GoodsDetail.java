package com.irelandlight.vo;

import java.util.List;

/**
 * Created by mr.w on 2016/12/10.
 */
public class GoodsDetail {
    private Integer id;        //商品Id
    private String name;       //商品名称
    private String description;//商品描述
    private double minPrice;      //商品价格
    private Integer size;      //商品规格
    private Integer quantity;  //商品库存

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
