package com.irelandlight.manager;

import com.irelandlight.dao.AccountManagerMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;
import java.util.HashMap;
/**
 * Created by as on 2016/12/24.
 */
@Component
public class AccountManagerManager {

    @Resource
    private AccountManagerMapper accountManagerMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountManagerManager.class);

    public Map<String, Object> changePassword(Long consumerId, String oldPass, String newPass){
        Map<String, Object> statusMap = new HashMap<String,Object>();
        Integer update = accountManagerMapper.changePassword(consumerId, newPass);
        String pass = accountManagerMapper.findPassword(consumerId);
        //输入原密码错误
        if(!pass.equals(oldPass)){
            statusMap.put("status",0);
            statusMap.put("msg","原密码错误");
        }
        //
        else if(update==1){
            statusMap.put("status",1);
            statusMap.put("msg","修改密码成功");
        }
        else{
            statusMap.put("status",2);
            statusMap.put("msg","修改密码失败");
        }
        return statusMap;
    }

    public Map<String, Object> changeTelephone (Long consumerId, String telephone){
        Map<String, Object> statusMap = new HashMap<String,Object>();
        Integer update = accountManagerMapper.changeTelephone(consumerId,telephone);
        if (update == 1) {
            statusMap.put("status", 0);
            statusMap.put("msg", "修改电话号码成功");
        } else {
            statusMap.put("status", 1);
            statusMap.put("msg", "修改电话号码失败");
        }
        return statusMap;
    }

}
