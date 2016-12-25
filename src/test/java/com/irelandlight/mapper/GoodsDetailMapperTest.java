package com.irelandlight.mapper;

import com.irelandlight.model.GoodsImage;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

/**
 * Created by mr.w on 2016/12/20.
 */
public class GoodsDetailMapperTest {
    @Resource
    private GoodsDetailMapper goodsDetailMapper;
    @Resource

    @Test
    public void queryGoodsImage() throws Exception {
        List<GoodsImage> list=goodsDetailMapper.queryGoodsImage(2);
        for (GoodsImage goodsImage:list) {
            System.out.print(list);
        }

    }

    @Test
    public void queryGoodsDetail() throws Exception {

    }

    @Test
    public void qureySizePrice() throws Exception {

    }

    @Test
    public void queryCommentGoods() throws Exception {

    }

    @Test
    public void queryComments() throws Exception {

    }

    @Test
    public void addComment() throws Exception {
    }

}