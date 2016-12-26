package com.irelandlight.service.impl;

import com.irelandlight.dao.AccountManagerMapper;
import com.irelandlight.manager.AccountManagerManager;
import com.irelandlight.model.vo.AccountShow;
import com.irelandlight.service.AccountManagerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by as on 2016/12/18.
 */

@Service
@Transactional
public class AccountManagerServiceImpl implements AccountManagerService {
    @Resource
    @Lazy(true)
    private AccountManagerMapper accountManagerMapper;

    private AccountManagerManager accountManagerManager;

    //展示个人信息
    public List<AccountShow> findAccountInfoByConsumerId(@Param("consumerId") Long consumerId) throws Exception {

        return accountManagerMapper.findAccountInfoByConsumerId(consumerId);

    }

    //修改密码
    public Map<String, Object> changePassword(Long consumerId, String oldPass, String newPass) throws Exception {

       return  accountManagerManager.changePassword(consumerId,oldPass,newPass);
    }

    //修改电话号码
    public Map<String, Object> changeTelephone(Long consumerId, String telephone) throws Exception {

        return accountManagerManager.changeTelephone(consumerId, telephone);
    }

}
