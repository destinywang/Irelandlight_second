package com.irelandlight.dao;

import com.irelandlight.model.vo.AccountShow;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by as on 2016/12/18.
 */
@Repository
public interface AccountManagerMapper {

    //查询账户信息
    List<AccountShow> findAccountInfoByConsumerId(@Param("consumerId")Long consumerId)throws Exception;

    //查找密码
    String findPassword(Long consumerId);

    //修改密码
    int changePassword(Long consumerId,String newPass);

    //修改手机
    int changeTelephone(Long consumerId, String telephone);

}
