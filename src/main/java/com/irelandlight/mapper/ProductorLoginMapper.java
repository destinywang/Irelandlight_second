package com.irelandlight.mapper;

import com.irelandlight.vo.Manager;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by mr.w on 2016/12/24.
 */
@Repository
public interface ProductorLoginMapper {
    /*
    * 判断管理员用户名和密码是否一致
    * @return String
    * */
    public Manager productorLogin(@Param("userName") String userName);
}
