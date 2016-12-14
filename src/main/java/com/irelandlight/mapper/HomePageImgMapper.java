package com.irelandlight.mapper;

import com.irelandlight.vo.HomePageImage;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mr.w on 2016/12/9.
 */
@Repository
public interface HomePageImgMapper {
    //查询首页轮播图的homePageImageId,和homePageImageUrl
    List<HomePageImage> selectHomePageImage() throws Exception;




}
