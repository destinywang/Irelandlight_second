package com.irelandlight.service.serviceimpl;

import com.irelandlight.mapper.HomePageImgMapper;
import com.irelandlight.vo.HomePageImage;
import com.irelandlight.service.HomePageImgService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by mr.w on 2016/12/10.
 */
public class HomePageImgServiceImpl implements HomePageImgService{
    @Autowired
    private HomePageImgMapper homePageImgMapper;

    public List<HomePageImage> findHomePageImg() throws Exception {
        return homePageImgMapper.selectHomePageImage();
    }
}
