package com.irelandlight.service.impl;

import com.irelandlight.manager.PersonalDataManager;
import com.irelandlight.model.vo.PersonalData;
import com.irelandlight.service.PersonalDataService;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by as on 2016/12/13.
 */
@Service
@Transactional
//不用再进行创建sqlSession和提交事务，都交由spring去管理了
@Repository
public class PersonalDataServiceImpl implements PersonalDataService{
    @Resource
    //service产生循环注入，导致注入失败，使其延时加载
    @Lazy(true)
    private PersonalDataService personalDataService;

    private PersonalDataManager personalDataManager;

    public List<PersonalData> findPersonalDataByConsumerId(@Param("consumerId") Long consumerId) throws Exception{

        return personalDataService.findPersonalDataByConsumerId(consumerId);
    }

    public Map<String,Object> updateNickName(@Param("personalData")PersonalData personalData, @Param("consumerId")Long consumerId) throws Exception {
        return personalDataManager.updateNickName(personalData,consumerId);
    }


}
