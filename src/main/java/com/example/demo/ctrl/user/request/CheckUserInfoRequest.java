package com.example.demo.ctrl.user.request;

public class CheckUserInfoRequest {

    private String userID;
    private String password;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "CheckUserInfoRequest{" +
                "userID='" + userID + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
