package com.irelandlight.dao;

import com.irelandlight.BaseJunitTest;
import com.irelandlight.model.vo.CollectionShow;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

import java.util.ArrayList;
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
        List<CollectionShow> collectionShowList = collectionMapper.findCollectionListByConsumerId(1001L);
        System.out.println(collectionShowList);

    }

    @Test
    public void testDeleteCollection()throws Exception{
        List<Long> collectionList = new ArrayList<Long>();
        collectionList.add(0,1001L);
        collectionList.add(1,2L);
        for (int i=0;i<collectionList.size();i++){
            collectionMapper.deleteCollection(collectionList.get(i));
            System.out.println(collectionList.get(i));
        }
    }
}