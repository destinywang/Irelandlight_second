package com.irelandlight.model.vo;

import java.util.List;

/**
 * Created by as on 2016/12/17.
 */
public class ManagerAddress {
    private Long addressId;
    private String consumerName;
    private String consumerPhone;
    private Long defaultAddressId;
    private List<MoreAddress> moreAddressList;

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public String getConsumerPhone() {
        return consumerPhone;
    }

    public void setConsumerPhone(String consumerPhone) {
        this.consumerPhone = consumerPhone;
    }

    public Long getDefaultAddressId() {
        return defaultAddressId;
    }

    public void setDefaultAddressId(Long defaultAddressId) {
        this.defaultAddressId = defaultAddressId;
    }

    public List<MoreAddress> getMoreAddressList() {
        return moreAddressList;
    }

    public void setMoreAddressList(List<MoreAddress> moreAddressList) {
        this.moreAddressList = moreAddressList;
    }
}
