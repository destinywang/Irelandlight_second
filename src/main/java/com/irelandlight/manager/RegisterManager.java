package com.irelandlight.manager;

import com.irelandlight.dao.RegisterMapper;
import com.irelandlight.model.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by as on 2016/12/22.
 */
@Component
public class RegisterManager {

    @Resource
    private RegisterMapper registerMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(RegisterManager.class);

    public Map<String,Object> addUser(User user)throws Exception{

        Map<String,Object> statusMap = new HashMap<String,Object>();
        Integer insert = registerMapper.addUser(user);

        if (user.getUserName()==null){
            statusMap.put("status",0);
            statusMap.put("msg","用户名为空");
        }
        else if(user.getPassword()==null){
            statusMap.put("status",1);
            statusMap.put("msg","密码为空");
        }
        else if (user.getBirthday()==null){
            statusMap.put("status",2);
            statusMap.put("msg","生日为空");
        }
        else if(insert==1){
            statusMap.put("status",3);
            statusMap.put("msg","注册成功");
        }
        else if (insert==0){
            statusMap.put("status",4);
            statusMap.put("msg","用户名重复");
        }
        else{
            statusMap.put("status",5);
            statusMap.put("msg","注册失败");
        }
        return statusMap;
    }


}
