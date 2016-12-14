package com.irelandlight.controller;

import com.irelandlight.service.CollectionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by as on 2016/12/12.
 */
@Controller
@RequestMapping("/collection")
public class CollectionController {

    @Resource
    private CollectionService collectionService;

    //查询收藏的商品
    @RequestMapping("/")
    public String findCollectionListByConsumerId(Long consumerId)throws Exception{

        return null;
    }
}
