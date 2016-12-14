package com.irelandlight.model.vo;

/**
 * Created by as on 2016/12/8.
 */

public class SaveAddress {
    private Long consumerId;       //顾客id
    private String consumerName;     //收货人姓名
    private String consumerPhone;    //收货人电话
    private String province;        //省
    private String city;            //市
    private String district;        //区县
    private String street;          //街道
    private String detail;           //详细地址
    private String post;             //邮编

    public Long getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Long consumerId) {
        this.consumerId = consumerId;
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "SaveAddress{" +
                "consumerId=" + consumerId +
                ", consumerName='" + consumerName + '\'' +
                ", consumerPhone='" + consumerPhone + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                ", detail='" + detail + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}
