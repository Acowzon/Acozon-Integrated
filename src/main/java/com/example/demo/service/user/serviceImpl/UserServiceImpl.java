package com.example.demo.service.user.serviceImpl;

import com.example.demo.entity.UserBean;

import com.example.demo.mapper.user.UserMapper;
import com.example.demo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserBean getUserInfo(String userID) {
        return this.userMapper.getUserInfo(userID);
    }


    @Override
    public int updateUserInfo(UserBean userPOJO) {
        if (userPOJO==null){return -1;}
        return this.userMapper.userInfoModify(
               userPOJO.getUserID(),
                userPOJO.getPassWord(),
                userPOJO.getUserName(),
                userPOJO.getUserEmail(),
                userPOJO.getUserPhone()
                );
    }

    @Override
    public UserBean login(String userID, String password, HttpServletRequest request, HttpServletResponse response) {
        //从数据库获取匹配的记录
       UserBean userBean = this.userMapper.login(userID,password);
        //如果匹配的记录不为空，说明登陆成功
        if (userBean==null){
            //System.out.println("service login bean null");
            return null;
        }
        //System.out.println("service login "+customerBeans.get(0).toString());
        //设置cookie,应答给客户
        Cookie cookie_userName = new Cookie("cookie_userName",userBean.getUserName());
        Cookie cookie_userID = new Cookie("cookie_userID",String.valueOf(userBean.getUserID()));
        cookie_userName.setMaxAge(2*60); //valid in 1 minutes
        cookie_userID.setMaxAge(2*60);
        cookie_userName.setPath(request.getContextPath());
        cookie_userID.setPath(request.getContextPath());
        response.addCookie(cookie_userID);
        response.addCookie(cookie_userName);
        return userBean;

    }

    @Override
    public int register(String userName, String password,String userPhone) {
        return this.userMapper.insertInfo(userName,password,userPhone);
    }
}
