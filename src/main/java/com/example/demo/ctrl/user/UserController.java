package com.example.demo.ctrl.user;


import com.example.demo.ctrl.response.DefaultWebResponse;
import com.example.demo.ctrl.user.request.CheckUserInfoRequest;
import com.example.demo.ctrl.user.request.GetUserInfoRequest;
import com.example.demo.ctrl.user.request.UpdateUserInfoRequest;
import com.example.demo.entity.UserBean;

import com.example.demo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;



    @RequestMapping("/myAccount")
    public DefaultWebResponse showUserAccount(@RequestBody GetUserInfoRequest request){
        if (request.getUserID().equals("")){
            return DefaultWebResponse.Builder.fail("user ID null");
        }
        UserBean userBean = this.userService.getUserInfo(request.getUserID());
        return  DefaultWebResponse.Builder.success(userBean);
    }

    @RequestMapping("/register")
    public DefaultWebResponse register(@RequestBody UpdateUserInfoRequest request){
        int res = this.userService.register(request.getUserName(),request.getPassWord(),request.getUserPhone());
        if (res>0){

            return DefaultWebResponse.Builder.fail("user registration failed");
        }
        return DefaultWebResponse.Builder.success("registration success");
    }

    @RequestMapping (value = "/doLogin",method = RequestMethod.POST)
    public DefaultWebResponse doLogin(@RequestBody CheckUserInfoRequest request, HttpServletRequest httpServletRequest, HttpServletResponse response) throws IOException {
        UserBean userBean = this.userService.login(request.getUserID(),request.getPassword(),httpServletRequest,response);
        if (userBean==null){
            return DefaultWebResponse.Builder.fail("login failed");
        }else {
            return DefaultWebResponse.Builder.success(userBean);
        }
    }

    //@RequestMapping(value = "/UpdateMyInfo",method = RequestMethod.POST)
   //public int updateUserInfo(
    //       , HttpServletResponse response){

   //}
}
