package com.example.demo.ctrl.user;


import com.example.demo.ctrl.order.request.UpdateOrderStatusRequest;
import com.example.demo.ctrl.response.DefaultWebResponse;
import com.example.demo.ctrl.user.request.CheckUserInfoRequest;
import com.example.demo.ctrl.user.request.GetUserInfoRequest;
import com.example.demo.ctrl.user.request.UpdateUserInfoRequest;


import com.example.demo.dto.user.UserDTO;
import com.example.demo.entity.po.User;
import com.example.demo.entity.user.UserBean;
import com.example.demo.service.user.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


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
        User user = this.userService.getUserInfo(request.getUserID());
        return  DefaultWebResponse.Builder.success(user);
    }

    @RequestMapping("/register")
    public DefaultWebResponse register(@RequestBody UpdateUserInfoRequest request) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate = sf.parse(request.getUserBirth());
        User user = new User(request.getUserName(),
                request.getUserPwd(),request.getUserRealname(),
                request.getUserNickname(),request.getUserImage(),
                request.getPhone(),request.getUserEmail(),
                request.getSex(), birthDate,
                request.getUserType(),request.getUserAddressId()
        );
        int res = this.userService.register(user);
        if (res>0){
            return DefaultWebResponse.Builder.fail("user registration failed");
        }
        return DefaultWebResponse.Builder.success("registration success");
    }

    @RequestMapping (value = "/doLogin",method = RequestMethod.POST)
    public DefaultWebResponse doLogin(@RequestBody CheckUserInfoRequest request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        UserDTO res = this.userService.login(request.getUserID(),request.getPassword(),httpServletRequest,httpServletResponse);
        if (res == null){
            return DefaultWebResponse.Builder.fail("login failed");
        }else {
            return DefaultWebResponse.Builder.success(res); //返回成功登录的用户信息
        }
    }

    @RequestMapping(value = "/UpdateMyInfo",method = RequestMethod.POST)
   public DefaultWebResponse updateUserInfo(@RequestBody UpdateOrderStatusRequest request){
        User user = new User();
        BeanUtils.copyProperties(request,user);
        int res = this.userService.updateUserInfo(user);
        if (res==0){
            return DefaultWebResponse.Builder.fail("updateUserInfo failed");
        }
        return  DefaultWebResponse.Builder.success("updateUserInfo success");
   }
}
