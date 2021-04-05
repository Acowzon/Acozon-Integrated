package com.example.demo.dto.user;

public class UserDTO {
    private String userID;
    private String userNickName;

    public UserDTO(String userID, String userNickName) {
        this.userID = userID;
        this.userNickName = userNickName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }
}
