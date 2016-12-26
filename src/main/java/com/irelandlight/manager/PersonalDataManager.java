package com.irelandlight.manager;

import com.irelandlight.dao.PersonalDataMapper;
import com.irelandlight.model.vo.PersonalData;
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
public class PersonalDataManager {
    @Resource
    private PersonalDataMapper personalDataMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonalDataManager.class);

    public Map<String,Object> updateNickName(@Param("personalData")PersonalData personalData, @Param("consumerId")Long consumerId){
        Map<String, Object> statusMap = new HashMap<String,Object>();
        Integer update = personalDataMapper.updateNickName(personalData,consumerId);

         if(update==1){
            statusMap.put("status",0);
            statusMap.put("msg","修改信息成功");
        }
        else{
            statusMap.put("status",1);
            statusMap.put("msg","修改信息失败");
        }
        return statusMap;
    }
}
