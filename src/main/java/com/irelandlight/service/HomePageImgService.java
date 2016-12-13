package com.irelandlight.service;

import com.irelandlight.vo.HomePageImage;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mr.w on 2016/12/10.
 */
@Repository
public interface HomePageImgService {
    public List<HomePageImage> findHomePageImg()throws  Exception;
}
