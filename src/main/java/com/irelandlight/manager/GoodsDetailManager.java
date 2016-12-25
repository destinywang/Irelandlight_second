package com.irelandlight.manager;

import com.irelandlight.mapper.GoodsDetailMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by mr.w on 2016/12/21.
 */
@Component
public class GoodsDetailManager {
    @Resource
    private GoodsDetailMapper goodsDetailMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(HomePageManager.class);
    /*
    * 对返回的商品轮播图进行判断
    * 1.返回图片集合为空
    * 2.返回图片数量不够
    * 3.返回结果正常
    * */
    public void queryGoodsDetailImage() {
    }
}
