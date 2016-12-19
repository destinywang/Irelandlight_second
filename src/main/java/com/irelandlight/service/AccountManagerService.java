package com.irelandlight.service;

import com.irelandlight.model.vo.AccountShow;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by as on 2016/12/18.
 */
public interface AccountManagerService {

    //查询账户信息
    public List<AccountShow> findAccountInfoByConsumerId(@Param("consumerId") Long consumerId)throws Exception;


    //修改密码


    //修改手机


    //管理收货地址
}
