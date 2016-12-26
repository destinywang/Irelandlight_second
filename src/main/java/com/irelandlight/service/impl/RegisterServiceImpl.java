package com.irelandlight.service.impl;

import com.irelandlight.dao.RegisterMapper;
import com.irelandlight.manager.RegisterManager;
import com.irelandlight.model.vo.User;
import com.irelandlight.service.RegisterService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by as on 2016/12/24.
 */
@Service
@Transactional
public class RegisterServiceImpl implements RegisterService {
    @Resource
    private RegisterMapper registerMapper;

    private RegisterManager registerManager;


    //注册添加用户
    public Map<String, Object> addUser(User user) throws Exception {

        return registerManager.addUser(user);
    }
}
