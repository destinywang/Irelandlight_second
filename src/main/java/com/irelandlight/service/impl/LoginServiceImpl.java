package com.irelandlight.service.impl;

import com.irelandlight.dao.LoginMapper;
import com.irelandlight.model.vo.User;
import com.irelandlight.service.LoginService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by as on 2016/12/18.
 */
@Service
@Transactional
public class LoginServiceImpl implements LoginService{
    @Resource
    private LoginMapper loginMapper;

    public boolean findOneByUserName(@Param("userName") String userName,String passWord) throws Exception {
        User user = loginMapper.findOneByUserName(userName);
        if(user.getPassWord().equals(passWord)){
            return true;
        }

        else return false;

    }
}
