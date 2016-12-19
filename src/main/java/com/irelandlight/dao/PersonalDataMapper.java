package com.irelandlight.dao;

import com.irelandlight.model.vo.PersonalData;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by as on 2016/12/13.
 */
@Repository
public interface PersonalDataMapper {

    //查询展示个人信息
    public List<PersonalData> findPersonalDataByConsumerId(@Param("consumerId")Long consumerId) throws Exception;

    //修改资料
    public boolean updateNickName(@Param("personalData") PersonalData personalData,@Param("consumerId")Long consumerId)throws Exception;


}
