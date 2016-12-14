package com.irelandlight.dao;

import com.irelandlight.BaseJunitTest;
import com.irelandlight.model.vo.CollectionShow;
import org.junit.Test;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

import java.util.List;

/**
 * Created by as on 2016/12/10.
 */
@Repository
public class CollectionMapperTest extends BaseJunitTest{
    @Resource
    private CollectionMapper collectionMapper;

    @Test
    public void testFindCouponListByConsumerId()throws Exception{
        List<CollectionShow> collectionShowList = collectionMapper.findCollectionListByConsumerId(1002L);
        System.out.println(collectionShowList);

    }
}