package com.irelandlight.service;

import com.irelandlight.dao.LoginMapper;
import com.irelandlight.model.vo.User;
import org.apache.ibatis.annotations.Param;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by as on 2016/12/18.
 */
public interface LoginService {

    //用户身份验证
    public int findOneByUserName(@Param("userName")String userName,String password)throws Exception;
}
