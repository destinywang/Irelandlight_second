package com.irelandlight.dao;


import com.irelandlight.model.vo.CollectionShow;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by as on 2016/12/9.
 */
public interface CollectionMapper {

    //查询收藏商品信息
    public List<CollectionShow> findCollectionListByConsumerId(Long consumerId)throws Exception;

    //删除收藏商品
    public int deleteCollection(@Param("collectionId")Long collectionId);

}
