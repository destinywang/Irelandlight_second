package com.irelandlight.service.impl;

import com.irelandlight.dao.AddressMapper;
import com.irelandlight.model.Address;
import com.irelandlight.model.vo.AddressShow;
import com.irelandlight.model.vo.SaveAddress;
import com.irelandlight.service.AddressService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by as on 2016/12/7.
 */

@Service
@Transactional
//不用再进行创建sqlSession和提交事务，都交由spring去管理了
public class AddressServiceImpl implements AddressService{

    @Resource
    private AddressMapper addressMapper;


    public String findConsumerNameById(Long consumerId) throws Exception {
       return addressMapper.findConsumerNameById(consumerId);
    }

    public int countAddress() throws Exception{
        int count = addressMapper.countAddress();
        System.out.println(count);
        return count;
    }

    //添加地址
    public void addNewAddress(Address address) throws Exception {
       //调用mapper保存地址信息
        addressMapper.addNewAddress(address);

    }

    public List<AddressShow> findAddressListByConsumerId(Long consumerId) throws Exception {

        return addressMapper.findAddressListByConsumerId(consumerId);
    }

    public void deleteAddress(@Param("addressId")Long addressId) throws Exception {

        addressMapper.deleteAddress(addressId);
    }
}
