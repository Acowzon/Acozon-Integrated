package com.example.demo.service.user;




import com.example.demo.dto.user.UserDTO;
import com.example.demo.entity.User;


public interface UserService {

    User getUserInfo(String userID);
     int updateUserInfo(User user);
    UserDTO login(String userID, String password);
    int register(User user);
}
