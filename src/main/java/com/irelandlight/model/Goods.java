package com.irelandlight.model;

import com.sun.javafx.css.FontUnits;

import java.util.Date;

/**
 * Created by destiny on 2016/12/2.
 */
public class Goods {
    private Long id;
    private Date createTime;
    private Date lastUpdate;
    private Integer visibility;
    private Integer isPutaway;
    private String name;
    private String description;
    private String perference;
    private String use;
    private String taste;
    private Integer quantity;
    private Integer saleCount;
    private Integer weight;
    private String status;
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Integer getIsPutaway() {
        return isPutaway;
    }

    public void setIsPutaway(Integer isPutaway) {
        this.isPutaway = isPutaway;
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

    public String getPerference() {
        return perference;
    }

    public void setPerference(String perference) {
        this.perference = perference;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", lastUpdate=" + lastUpdate +
                ", visibility=" + visibility +
                ", isPutaway=" + isPutaway +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", perference='" + perference + '\'' +
                ", use='" + use + '\'' +
                ", taste='" + taste + '\'' +
                ", quantity=" + quantity +
                ", saleCount=" + saleCount +
                ", weight=" + weight +
                ", status='" + status + '\'' +
                ", price=" + price +
                '}';
    }
}
