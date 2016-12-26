package com.irelandlight.model.vo;

import java.util.Date;

/**
 * Created by as on 2016/12/18.
 */
public class User {
    private String userName;
    private String password;
    private String telephone;
    private Date birthday;

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", telephone='" + telephone + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
