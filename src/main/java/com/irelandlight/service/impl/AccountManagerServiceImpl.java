package com.irelandlight.service.impl;

import com.irelandlight.dao.AccountManagerMapper;
import com.irelandlight.model.vo.AccountShow;
import com.irelandlight.service.AccountManagerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by as on 2016/12/18.
 */

@Service
@Transactional
@Repository
public class AccountManagerServiceImpl implements AccountManagerService {
    @Resource
    private AccountManagerMapper accountManagerMapper;


    public List<AccountShow> findAccountInfoByConsumerId(@Param("consumerId") Long consumerId) throws Exception {

        return accountManagerMapper.findAccountInfoByConsumerId(consumerId);
    }
}
