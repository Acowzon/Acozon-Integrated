package com.example.demo.service.user;




import com.example.demo.ctrl.user.request.UpdateUserInfoRequest;
import com.example.demo.entity.user.UserBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public interface UserService {

    UserBean getUserInfo(String userID);
     int updateUserInfo(UpdateUserInfoRequest request);
    UserBean login(String userID, String password, HttpServletRequest request, HttpServletResponse response);
    int register(UpdateUserInfoRequest request);
}
