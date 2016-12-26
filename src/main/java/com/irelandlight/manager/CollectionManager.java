package com.irelandlight.manager;

import com.irelandlight.dao.CollectionMapper;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by as on 2016/12/24.
 */
@Component
public class CollectionManager {


    @Resource
    private CollectionMapper collectionMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(CollectionManager.class);

    public Map<String,Object> deleteCollection(@Param("collectionId")Long collectionId)throws Exception{
        Map<String, Object> statusMap = new HashMap<String,Object>();
        Integer delete = collectionMapper.deleteCollection(collectionId);
        //
        if(delete==1){
            statusMap.put("status",0);
            statusMap.put("msg","删除收藏商品成功");
        }
        else{
            statusMap.put("status",1);
            statusMap.put("msg","删除收藏商品失败");
        }
        return statusMap;
    }

}
