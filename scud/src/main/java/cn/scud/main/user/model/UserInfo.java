package cn.scud.main.user.model;

/**
 * Created by Administrator on 2015/6/12.
 * 用户的基本信息表
 */
public class UserInfo {

    private int UserInfoId;

    private int User;

    private String UserRealName;
    // 身份证号码
    private String UserIdCardNum;
    //邮箱
    private String UserInfoEmail;
    // 性别
    private int UserInfoSex;

    public int getUserInfoId() {
        return UserInfoId;
    }

    public void setUserInfoId(int userInfoId) {
        UserInfoId = userInfoId;
    }

    public int getUser() {
        return User;
    }

    public void setUser(int user) {
        User = user;
    }

    public String getUserRealName() {
        return UserRealName;
    }

    public void setUserRealName(String userRealName) {
        UserRealName = userRealName;
    }

    public String getUserIdCardNum() {
        return UserIdCardNum;
    }

    public void setUserIdCardNum(String userIdCardNum) {
        UserIdCardNum = userIdCardNum;
    }

    public String getUserInfoEmail() {
        return UserInfoEmail;
    }

    public void setUserInfoEmail(String userInfoEmail) {
        UserInfoEmail = userInfoEmail;
    }

    public int getUserInfoSex() {
        return UserInfoSex;
    }

    public void setUserInfoSex(int userInfoSex) {
        UserInfoSex = userInfoSex;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "UserInfoId=" + UserInfoId +
                ", User=" + User +
                ", UserRealName='" + UserRealName + '\'' +
                ", UserIdCardNum='" + UserIdCardNum + '\'' +
                ", UserInfoEmail='" + UserInfoEmail + '\'' +
                ", UserInfoSex=" + UserInfoSex +
                '}';
    }
}
