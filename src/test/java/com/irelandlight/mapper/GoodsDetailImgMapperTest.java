package com.irelandlight.mapper;

import com.irelandlight.controller.BaseJunitTest;
import com.irelandlight.vo.GoodsDetailImage;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by mr.w on 2016/12/11.
 */
public class GoodsDetailImgMapperTest extends BaseJunitTest{

    @Resource
    private GoodsDetailImgMapper goodsDetailImgMapper;
    @Test
    public void selectGoodsDetailImg() throws Exception {

        List<GoodsDetailImage> list=goodsDetailImgMapper.selectGoodsDetailImg(1l);
        System.out.print("111");

    }

}