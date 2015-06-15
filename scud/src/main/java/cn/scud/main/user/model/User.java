package cn.scud.main.user.model;

import java.io.Serializable;

/**
 * Created by cmc on 14-12-9.
 * 用户信息表
 */
public class User implements Serializable {

    private int id;

    private String phoneNumber;

    private String Password;
    // 唯一标识
    private String userToken;
    // 注册渠道，android或者ios
    private String RegChannel;
    //注册时间
    private String RegDate;
    // 最后一次登录时间
    private String LastLoginDate;
    // 最后一次登录Ip
    private String LastLoginIp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getRegChannel() {
        return RegChannel;
    }

    public void setRegChannel(String regChannel) {
        RegChannel = regChannel;
    }

    public String getRegDate() {
        return RegDate;
    }

    public void setRegDate(String regDate) {
        RegDate = regDate;
    }

    public String getLastLoginDate() {
        return LastLoginDate;
    }

    public void setLastLoginDate(String lastLoginDate) {
        LastLoginDate = lastLoginDate;
    }

    public String getLastLoginIp() {
        return LastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        LastLoginIp = lastLoginIp;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", Password='" + Password + '\'' +
                ", userToken='" + userToken + '\'' +
                ", RegChannel='" + RegChannel + '\'' +
                ", RegDate='" + RegDate + '\'' +
                ", LastLoginDate='" + LastLoginDate + '\'' +
                ", LastLoginIp='" + LastLoginIp + '\'' +
                '}';
    }
}
