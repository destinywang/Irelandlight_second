package com.irelandlight.dao;

import com.irelandlight.model.vo.AddressShow;
import com.irelandlight.model.vo.SaveAddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by as on 2016/12/7.
 */
public interface AddressMapper {

    //查询收货地址的中的收货人
    public String findConsumerNameById(@Param("consumerId") Long consumerId) throws Exception;

    //查询有几条记录
    public int countAddress() throws Exception;

    //添加新地址信息
    public void addNewAddress(SaveAddress saveAddress) throws Exception;

    //管理收货地址
    public List<AddressShow> findAddressListByConsumerId(Long consumerId)throws Exception;

}
