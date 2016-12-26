package com.irelandlight.service;

import com.irelandlight.model.vo.User;

import java.util.Map;

/**
 * Created by as on 2016/12/20.
 */
public interface RegisterService {

    //注册添加用户信息
    Map<String,Object> addUser(User user)throws Exception;

}
