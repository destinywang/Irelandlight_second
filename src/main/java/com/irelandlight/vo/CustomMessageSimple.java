package com.irelandlight.vo;

/**
 * Created by lalala on 2016/12/8.
 */
public class CustomMessageSimple {
    private Long userID;    //用户id
    private String userNickname;    //昵称
    private String userPhone;   //联系方式
    private String userHeader;  //头像

    public Long getUserId() {
        return userID;
    }

    public void setUserId(Long userID) {
        this.userID = userID;
    }

    public String getUsernickname() {
        return userNickname;
    }

    public void setUsernickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserHeader() {
        return userHeader;
    }

    public void setUserHeader(String userHeader) {
        this.userHeader = userHeader;
    }
}
