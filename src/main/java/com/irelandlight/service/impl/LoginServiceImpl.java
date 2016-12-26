package com.irelandlight.service.impl;

import com.irelandlight.dao.LoginMapper;
import com.irelandlight.model.vo.User;
import com.irelandlight.service.LoginService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.enterprise.inject.New;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by as on 2016/12/18.
 */
@Service
@Transactional
public class LoginServiceImpl implements LoginService{
    @Resource
    private LoginMapper loginMapper;

    public int findOneByUserName(@Param("userName") String userName,String password) throws Exception {
        User user = loginMapper.findOneByUserName(userName);

        //密码错误
        if(user.getPassword().equals(password)){
            return 1;
        }
        else return 0;

    }
}
