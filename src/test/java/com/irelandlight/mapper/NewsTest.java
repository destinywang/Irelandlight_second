package com.irelandlight.mapper;

import com.irelandlight.controller.BaseJunitTest;
import com.irelandlight.vo.NewsContent;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by mr.w on 2016/12/11.
 */
public class NewsTest extends BaseJunitTest{
    @Resource
    private News news;
    @Test
    public void selectNewsContent() throws Exception {
        List<NewsContent> list=news.selectNewsContent();
        System.out.print(list);
    }

}