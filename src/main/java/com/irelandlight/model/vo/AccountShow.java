package com.irelandlight.model.vo;

import java.util.List;

/**
 * Created by as on 2016/12/18.
 */
public class AccountShow {
    private String nickName;
    private String telephone;
    private Long addressId;
    private String consumerName;
    private List<MoreAddress> moreAddressList;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

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

    public List<MoreAddress> getMoreAddressList() {
        return moreAddressList;
    }

    public void setMoreAddressList(List<MoreAddress> moreAddressList) {
        this.moreAddressList = moreAddressList;
    }

    @Override
    public String toString() {
        return "AccountShow{" +
                "nickName='" + nickName + '\'' +
                ", telephone='" + telephone + '\'' +
                ", addressId=" + addressId +
                ", consumerName='" + consumerName + '\'' +
                ", moreAddressList=" + moreAddressList +
                '}';
    }
}
