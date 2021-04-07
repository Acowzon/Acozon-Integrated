package com.example.demo.ctrl.user;


import com.example.demo.ctrl.DefaultWebResponse;
import com.example.demo.ctrl.user.request.CheckUserInfoRequest;
import com.example.demo.ctrl.user.request.GetUserInfoRequest;
import com.example.demo.ctrl.user.request.UpdateUserInfoRequest;
import com.example.demo.dto.user.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.service.user.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



@CrossOrigin
@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/myAccount")
    public DefaultWebResponse showUserAccount(@RequestBody GetUserInfoRequest request){
        if (request.getUserID().equals("")){
            return DefaultWebResponse.Builder.fail("user ID null");
        }
        User user = this.userService.getUserInfo(request.getUserID());
        return  DefaultWebResponse.Builder.success(user);
    }

    @PostMapping("/register")
    public DefaultWebResponse register(@RequestBody UpdateUserInfoRequest request) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate = sf.parse("1900-01-01");
        User user = new User(request.getUserName(),
                request.getUserPwd()," ",
                " "," ",
                request.getPhone()," ",
                " ", birthDate,
                0," "
        );
        int res = this.userService.register(user);
        if (res>0){
            return DefaultWebResponse.Builder.fail("user registration failed");
        }
        return DefaultWebResponse.Builder.success("registration success");
    }

    @PostMapping (value = "/doLogin")
    public DefaultWebResponse doLogin(@RequestBody CheckUserInfoRequest request){
        UserDTO res = this.userService.login(request.getUserID(),request.getPassword());
        if (res == null){
            return DefaultWebResponse.Builder.fail("login failed");
        }else {
            return DefaultWebResponse.Builder.success(res); //返回成功登录的用户信息
        }
    }

    /**
     * 先 ：数据库向前端发送用户旧信息
     * 再 ：用户在旧的信息上改完后返回
     * @param request
     * @return
     */
    @PostMapping(value = "/UpdateMyInfo")
   public DefaultWebResponse updateUserInfo(@RequestBody UpdateUserInfoRequest request){
        User user = new User();
        BeanUtils.copyProperties(request,user);
        user.setUserRealname("   ");
        user.setUserAddressId("      ");
        int res = this.userService.updateUserInfo(user);
        if (res==0){
            return DefaultWebResponse.Builder.fail("updateUserInfo failed");
        }
        return  DefaultWebResponse.Builder.success("updateUserInfo success");
   }
}
