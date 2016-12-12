package com.irelandlight.vo;

/**
 * Created by lalala on 2016/12/10.
 */
public class CustomMessageAll {
    private Long userID;
    private String userNickName;
    private String userHeader;
    private String userRecord;
    private int type;

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUserHeader() {
        return userHeader;
    }

    public void setUserHeader(String userHeader) {
        this.userHeader = userHeader;
    }

    public String getUserRecord() {
        return userRecord;
    }

    public void setUserRecord(String userRecord) {
        this.userRecord = userRecord;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
