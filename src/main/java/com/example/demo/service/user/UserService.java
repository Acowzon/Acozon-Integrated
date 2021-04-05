package com.example.demo.service.user;


import com.example.demo.entity.UserBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserService {

    UserBean getUserInfo(String userID);
    public int updateUserInfo(UserBean userPOJO);
    UserBean login(String userID, String password, HttpServletRequest request, HttpServletResponse response);
    int register(String userName,String password,String userPhone);
}
