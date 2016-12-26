package com.irelandlight.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.irelandlight.model.vo.CollectionShow;
import com.irelandlight.service.CollectionService;
import org.apache.ibatis.annotations.Param;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by as on 2016/12/12.
 */
@Controller
@RequestMapping("/collection")
public class CollectionController {

    @Resource
    private CollectionService collectionService;

    //查询收藏的商品
    @RequestMapping("/findCollection")
        public String findCollectionListByConsumerId(HttpServletRequest request, HttpServletResponse response)throws Exception{
        List<CollectionShow> collectionList = collectionService.findCollectionListByConsumerId(1001L);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("collectionList",collectionList);
        return jsonObject.toJSONString();
    }
    //删除收藏商品
    @RequestMapping(value = "deleteCollection")
    public String deleteCollection(@RequestBody Long collectionId) throws Exception{
        Map<String, Object> statusMap = collectionService.deleteCollection(collectionId);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg",statusMap.get("msg").toString());
        return jsonObject.toJSONString();
    }

}
