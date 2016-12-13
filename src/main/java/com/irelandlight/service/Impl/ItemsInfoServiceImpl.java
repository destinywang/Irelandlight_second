package com.irelandlight.service.Impl;

import com.irelandlight.dao.OrderMapper;
import com.irelandlight.service.ItemsInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/12/12.
 */
@Service
public class ItemsInfoServiceImpl implements ItemsInfoService {
    @Resource
    private OrderMapper orderMapper;

    public Integer selectOrderCount() throws Exception {
       return orderMapper.selectOrderCount();
    }
}
