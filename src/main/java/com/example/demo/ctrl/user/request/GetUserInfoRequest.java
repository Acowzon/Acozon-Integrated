package com.example.demo.ctrl.user.request;

public class GetUserInfoRequest {
    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "GetUserInfoRequest{" +
                "userID='" + userID + '\'' +
                '}';
    }
}
