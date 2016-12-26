package com.irelandlight.model.vo;

import java.util.Date;
import java.util.List;

/**
 * Created by as on 2016/12/18.
 */
public class AccountShow {
    private String userName;
    private String nickName;
    private String gender;
    private Date birthday;
    private String telephone;
    private String email;
    private List<MoreAddress> moreAddressList;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
                "userName='" + userName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", moreAddressList=" + moreAddressList +
                '}';
    }
}
