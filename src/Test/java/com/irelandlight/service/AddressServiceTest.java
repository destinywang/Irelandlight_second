package com.irelandlight.service;


import com.irelandlight.BaseJunitTest;
import com.irelandlight.dao.AddressMapper;
import com.irelandlight.model.vo.AddressShow;
import com.irelandlight.model.vo.SaveAddress;
import org.junit.Test;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by as on 2016/12/10.
 */
@Repository
public class AddressServiceTest extends BaseJunitTest{


    @Resource
    private AddressService addressService;

    @Test
    public void testFindConsumerNameById() throws Exception {
        String consumerName = addressService.findConsumerNameById(1004L);
        System.out.println(consumerName);
    }

    @Test
    public void testCountAddress() throws Exception{
        int count = addressService.countAddress();
        System.out.println(count);
    }

    @Test
    public void testAddNewAddress() throws Exception{
        SaveAddress saveAddress = new SaveAddress();
        saveAddress.setConsumerId(1002L);
        saveAddress.setConsumerName("this");
        saveAddress.setConsumerPhone("110");
        saveAddress.setProvince("陕西省");
        saveAddress.setCity("西安市");
        saveAddress.setDistrict("长安区");
        saveAddress.setStreet("子午大道");
        saveAddress.setDetail("西安邮电大学");
        saveAddress.setPost("710300");
        System.out.println(saveAddress);
        addressService.addNewAddress(saveAddress);
    }

    @Test
    public void findAddressListByConsumerId() throws Exception {
        List<AddressShow> addressShowList;
        addressShowList = addressService.findAddressListByConsumerId(1001L);
        System.out.println(addressShowList);
    }
}