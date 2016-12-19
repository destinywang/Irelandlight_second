package com.irelandlight.service;

import com.irelandlight.model.Address;
import com.irelandlight.model.vo.AddressShow;
import com.irelandlight.model.vo.SaveAddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by as on 2016/12/7.
 */
//地址管理
public interface AddressService {

    //查询收货地址的中的收货人
    public String findConsumerNameById(Long consumerId)throws Exception;
    //统计地址
    public int countAddress() throws Exception;
    //添加新地址信息
    public void addNewAddress(Address address)throws Exception;
    //管理收货地址
    public List<AddressShow> findAddressListByConsumerId(Long consumerId)throws Exception;
    //删除收货地址
    public void deleteAddress(@Param("addressId")Long addressId)throws Exception;

}
