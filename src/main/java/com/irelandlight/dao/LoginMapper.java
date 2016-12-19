package com.irelandlight.dao;

import com.irelandlight.model.vo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Created by as on 2016/12/18.
 */
public interface LoginMapper {

    //查询用户密码
   public User findOneByUserName(@Param("userName")String userName)throws Exception;

}
