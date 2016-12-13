package com.irelandlight.service;

import com.irelandlight.controller.BaseJunitTest;
import com.irelandlight.vo.HomePageImage;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by mr.w on 2016/12/10.
 */
public class GoodsServiceTest extends BaseJunitTest{
    @Autowired
    private HomePageImgService homePageImgService;
    @Test
    public void findItemsList() throws Exception {

        List<HomePageImage> list=homePageImgService.findHomePageImg();
        System.out.print(list);

    }

}