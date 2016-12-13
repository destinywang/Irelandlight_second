package com.irelandlight.mapper;

import com.irelandlight.controller.BaseJunitTest;
import com.irelandlight.vo.HotGoodsList;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

/**
 * Created by mr.w on 2016/12/10.
 */
public class HotGoodsTest extends BaseJunitTest {
    @Resource
    private HotGoods hotGoods;
    @Test
    public void selectHotGoods() throws Exception {
        List<HotGoodsList> list=hotGoods.selectHotGoods();
        System.out.print(list);
    }

}