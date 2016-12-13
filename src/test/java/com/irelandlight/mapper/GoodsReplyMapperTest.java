package com.irelandlight.mapper;

import com.irelandlight.controller.BaseJunitTest;
import com.irelandlight.vo.GoodsReply;

import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by mr.w on 2016/12/12.
 */
public class GoodsReplyMapperTest extends BaseJunitTest{
    @Resource
    private GoodsReplyMapper goodsReplyMapper;
    @Test
    public void selectGoodsReply() throws Exception {
        List<GoodsReply> list=goodsReplyMapper.selectGoodsReply(1);
        System.out.print("123");
    }

}