package com.irelandlight.dao;

import com.irelandlight.BaseJunitTest;
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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
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
    public void testAddNewAddress() throws Exception{
        SaveAddress saveAddress = new SaveAddress();
        saveAddress.setConsumerId(1003L);
        saveAddress.setConsumerName("this");
        saveAddress.setConsumerPhone("110");
        saveAddress.setProvince("陕西省");
        saveAddress.setCity("西安市");
        saveAddress.setDistrict("长安区");
        saveAddress.setStreet("子午大道");
        saveAddress.setDetail("西安邮电大学");
        saveAddress.setPost("710300");
        System.out.println(saveAddress);
        addressMapper.addNewAddress(saveAddress);
    }
    @Test
    public void testFindAddressListByConsumerId() throws Exception {

        List<AddressShow> addressShowList ;
        addressShowList = addressMapper.findAddressListByConsumerId(1001L);
        System.out.println(addressShowList);
    }


}
