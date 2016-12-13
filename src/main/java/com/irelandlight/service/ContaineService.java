package com.irelandlight.service;

import com.irelandlight.vo.GoodsCountInfo;

/**
 * 货柜管理
 * Created by Administrator on 2016/12/13.
 */
public interface ContaineService {
    //返回商品数量，上架数量，评论数量等
     GoodsCountInfo selectgoodsCount()throws Exception;

}
