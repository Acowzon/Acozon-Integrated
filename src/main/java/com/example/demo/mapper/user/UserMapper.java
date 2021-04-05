package com.example.demo.mapper.user;

import com.example.demo.entity.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    UserBean getUserInfo(@Param(value = "userID") String userID);
    UserBean login(@Param("userID")String userID, @Param("password")String password);
    int insertInfo(String userName,String password,String userPhone);
    int userInfoModify(String userID,String password,String userName,String userEmail,String userPhone);

}
