package com.irelandlight.service;


import com.irelandlight.BaseJunitTest;
import com.irelandlight.dao.AddressMapper;
import com.irelandlight.model.Address;
import com.irelandlight.model.vo.AddressShow;
import com.irelandlight.model.vo.SaveAddress;
import org.junit.Test;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
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
        Address address = new Address();
        address.setConsumerId(1002L);
        address.setConsumerName("this");
        address.setConsumerPhone("110");
        address.setProvince("陕西省");
        address.setCity("西安市");
        address.setDistrict("长安区");
        address.setStreet("子午大道");
        address.setDetail("西安邮电大学");
        address.setPost("710300");
        System.out.println(address);
        addressService.addNewAddress(address);
    }

    @Test
    public void testFindAddressListByConsumerId() throws Exception {
        List<AddressShow> addressShowList;
        addressShowList = addressService.findAddressListByConsumerId(1001L);
        System.out.println(addressShowList);
    }

    @Test
    public void testDeleteAddress()throws Exception{
        List<Long> addressIdList = new ArrayList<Long>();
        addressIdList.add(0,1L);
        addressIdList.add(1,2L);
        for (int i=0;i<addressIdList.size();i++){
            addressService.deleteAddress(addressIdList.get(i));
            System.out.println(addressIdList.get(i));
        }

    }
}