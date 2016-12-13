package com.irelandlight.mapper;

import com.irelandlight.controller.BaseJunitTest;
import com.irelandlight.vo.GoodsDetail;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by mr.w on 2016/12/11.
 */
public class GoodsDetailMapperTest extends BaseJunitTest{
    @Resource
    private GoodsDetailMapper goodsDetailMapper;
    @Test
    public void selectGoodsDetail() throws Exception {
        List<GoodsDetail> list=goodsDetailMapper.selectGoodsDetail(1L);
        System.out.print(list);

    }

}