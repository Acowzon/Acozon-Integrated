package com.example.demo.service.user;

import com.example.demo.dto.user.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserInfo(String userID) {
        return this.userMapper.queryUserById(userID);
    }


    @Override
    public int updateUserInfo(User user) {
        return this.userMapper.updateUser(user);
    }

    @Override
    public UserDTO login(String userID, String password) {
        //System.out.println("service login "+customerBeans.get(0).toString());
        //设置cookie,应答给客户
        int res = this.userMapper.login(userID,password);
        if (res>0){
            User user =  this.userMapper.queryUserById(userID);
            //System.out.println(" sevice "+user.toString());
            UserDTO userDTO = new UserDTO(userID,user.getUserNickname());
            return userDTO;
        }
        return null;
    }

    public int register(User user){
        return  this.userMapper.addUser(user);
    }
}
