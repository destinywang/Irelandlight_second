package com.irelandlight.service;

import com.irelandlight.manager.ProductorLoginManager;
import com.irelandlight.vo.Manager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by mr.w on 2016/12/24.
 */
@Service
public class ProductorLoginService {
    @Resource
    private ProductorLoginManager productorLoginManager;

    public boolean productorLogin(Manager manager){
        return productorLoginManager.productorLogin(manager);
    }
}
