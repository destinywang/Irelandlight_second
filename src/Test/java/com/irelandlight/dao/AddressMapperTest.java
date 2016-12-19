package com.irelandlight.dao;

import com.irelandlight.BaseJunitTest;
import com.irelandlight.model.Address;
import com.irelandlight.model.vo.AddressShow;
import com.irelandlight.model.vo.SaveAddress;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by as on 2016/12/8.
 */
public class AddressMapperTest extends BaseJunitTest{


    @Resource
    private AddressMapper addressMapper;


    @Test
    //测试根据consumerId查询收货人姓名
    public void testFindConsumerNameById() throws Exception {
        String consumerName = addressMapper.findConsumerNameById(1001l);
        System.out.println(consumerName);
    }
    //添加新地址信息
    @Test
    public void testAddNewAddress() {
        Address address = new Address();
        address.setVisibility(0);
        address.setConsumerId(1003L);
        address.setConsumerName("this");
        address.setConsumerPhone("110");
        address.setProvince("陕西省");
        address.setCity("西安市");
        address.setDistrict("长安区");
        address.setStreet("子午大道");
        address.setDetail("西安邮电大学");
        address.setPost("710300");
        System.out.println(address);
        try {
            addressMapper.addNewAddress(address);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testFindAddressListByConsumerId() throws Exception {

        List<AddressShow> addressShowList ;
        addressShowList = addressMapper.findAddressListByConsumerId(1001L);
        System.out.println(addressShowList);
    }

    @Test
    public void testDeleteAddress()throws Exception{
        addressMapper.deleteAddress(7L);
    }
}
