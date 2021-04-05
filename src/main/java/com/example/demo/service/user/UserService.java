package com.example.demo.service.user;




import com.example.demo.ctrl.user.request.UpdateUserInfoRequest;
import com.example.demo.dto.user.UserDTO;
import com.example.demo.entity.po.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserService {

    User getUserInfo(String userID);
     int updateUserInfo(User user);
    UserDTO login(String userID, String password, HttpServletRequest request, HttpServletResponse response);
    int register(User user);
}
