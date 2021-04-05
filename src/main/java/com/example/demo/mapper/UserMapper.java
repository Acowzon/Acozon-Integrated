package com.example.demo.mapper;

import com.example.demo.entity.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    // 查询所有的用户信息
    List<User> queryAllUser();

    // 根据d查询一个用户信息
    User queryUserById(@Param("id") String id);

    // 查询用户名和密码是否正确,返回查找到的个数
    int login(@Param("username") String username, @Param("pwd") String pwd);

    // 查询用户名是否已存在,返回用户名的个数,为1表示已存在，0表示未存在
    int queryUsernameCount(@Param("username") String username);

    // 插入一个新的用户的信息
    int addUser(User user);

    // 修改用户名
    int updateUsername(@Param("id") String id, @Param("username") String username);

    // 修改密码
    int updatePwd(@Param("id") String id, @Param("pwd") String pwd);

    // 修改一个用户的信息
    int updateUser(User user);

    // 修改一个用户的类型
    int updateUserType(@Param("id") String id, @Param("userType")String userType);
}
