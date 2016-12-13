package com.irelandlight.vo;

import java.util.Date;

/**
 * Created by mr.w on 2016/12/12.
 */
public class GoodsComment {
    private Integer id;         //评论id
    private Integer goodsId;    //商品Id
    private Integer consumerId; //评论顾客ID
    private Date createTime;    //评论时间
    private String content;     //评论内容

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Integer consumerId) {
        this.consumerId = consumerId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
