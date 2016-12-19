package com.irelandlight.service;


import com.irelandlight.model.vo.CollectionShow;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by as on 2016/12/9.
 */

public interface CollectionService {

    //查询收藏商品信息
    public List<CollectionShow> findCollectionListByConsumerId(Long consumerId)throws Exception;

    //删除收藏商品
    public void deleteCollection(@Param("consumerId")Long consumerId)throws Exception;
}
