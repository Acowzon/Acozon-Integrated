package com.example.demo.mapper.user;


import com.example.demo.entity.user.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserMapper {

    //查
    UserBean getUserInfo(@Param(value = "userID") String userId);
    //查
    UserBean login(@Param("userID")String userId, @Param("password")String password);
    //增
    int insertInfo(String userId,String userAccountName, String password, String userRealName, String userNickName, String userPhone, String userEmail, String userSex, String userBirth, int userType,String userAddressID);
    //改
    int userInfoModify(String userId, String userAccountName, String password, String userRealName, String userNickName, String userPhone, String userEmail, String userSex, String userBirth, int userType,String userAddressID);

    //int uploadSellerItem();
}
