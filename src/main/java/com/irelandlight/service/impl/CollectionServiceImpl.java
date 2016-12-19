package com.irelandlight.service.impl;

import com.irelandlight.dao.CollectionMapper;
import com.irelandlight.model.vo.CollectionShow;
import com.irelandlight.service.CollectionService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by as on 2016/12/12.
 */
@Service
@Transactional
public class CollectionServiceImpl implements CollectionService{

    @Resource
    private CollectionMapper collectionMapper;

    public List<CollectionShow> findCollectionListByConsumerId(Long consumerId) throws Exception {
        return collectionMapper.findCollectionListByConsumerId(consumerId);
    }

    public void deleteCollection(@Param("collectionId") Long collectionId) throws Exception {

        collectionMapper.deleteCollection(collectionId);
    }
}
