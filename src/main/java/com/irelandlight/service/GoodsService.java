package com.irelandlight.service;

import com.irelandlight.model.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mr.w on 2016/12/7.
 */
@Repository
public interface GoodsService {
    public List<Goods> findItemsList() throws Exception;

}
