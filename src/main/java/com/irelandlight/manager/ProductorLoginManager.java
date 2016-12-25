package com.irelandlight.manager;

import com.irelandlight.mapper.ProductorLoginMapper;
import com.irelandlight.vo.Manager;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by mr.w on 2016/12/24.
 */
@Component
public class ProductorLoginManager {
    @Resource
    private ProductorLoginMapper productorLoginMapper;

    public boolean productorLogin(Manager manager){
        Boolean b=false;
        Manager productor = productorLoginMapper.productorLogin(manager.getUserName());
        if(manager.getPassword().equals(productor.getPassword())){
            b=true;
        }
        return b;
    }

}
