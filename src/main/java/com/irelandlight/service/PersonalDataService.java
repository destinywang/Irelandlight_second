package com.irelandlight.service;

import com.irelandlight.model.vo.PersonalData;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by as on 2016/12/13.
 */
public interface PersonalDataService {

    //查询展示个人信息
    public List<PersonalData> findPersonalDataByConsumerId(@Param("consumerId")Long consumerId) throws Exception;

    //修改昵称
    public Map<String,Object> updateNickName(@Param("personalData")PersonalData personalData, @Param("consumerId")Long consumerId)throws Exception;

}
