package com.irelandlight.mapper;

import com.irelandlight.controller.BaseJunitTest;
import com.irelandlight.vo.GoodsComment;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by mr.w on 2016/12/12.
 */
public class GoodsCommentMapperTest extends BaseJunitTest{

    @Resource
    private GoodsCommentMapper goodsCommentMapper;
    @Test
    public void selectGoodsComment() throws Exception {

        //此处传入的参数是商品的goodsId
        List<GoodsComment> list=goodsCommentMapper.selectGoodsComment(1L);
        System.out.print("123");

    }

}