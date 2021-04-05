package com.example.demo.ctrl.user.request;

import java.util.Date;

public class UpdateUserInfoRequest {
    private String userID;
    private String userName;    // 登录用户名
    private String userPwd;     // 登录密码
    private String userRealname;    // 用户真实姓名
    private String userNickname;    // 用户昵称
    private String userImage;   // 用户头像的路径
    private String Phone;   // 用户电话
    private String userEmail;   // 用户邮箱
    private String sex; // 用户性别 男 女
    private String userBirth; // 用户生日
    private int userType;   // 用户类型，0买家，1卖家
    private String userAddressId;   // 用户地址

    public String getUserID() {
        return userID;
    }

    public void setUserIDd(String userIDd) {
        this.userID = userIDd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(String userBirth) {
        this.userBirth = userBirth;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getUserAddressId() {
        return userAddressId;
    }

    public void setUserAddressId(String userAddressId) {
        this.userAddressId = userAddressId;
    }
}
