package com.irelandlight.service;

import com.irelandlight.model.vo.AccountShow;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by as on 2016/12/18.
 */
public interface AccountManagerService {

    //查询账户信息
    public List<AccountShow> findAccountInfoByConsumerId(@Param("consumerId") Long consumerId)throws Exception;

    //修改密码
    public Map<String, Object> changePassword(Long consumerId, String oldPass, String newPass)throws Exception;

    //修改手机
    public Map<String, Object> changeTelephone(Long consumerId, String telephone)throws Exception;



}
