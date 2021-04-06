package com.example.demo.ctrl;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class TestController {

    @RequestMapping(value = "/goLogin",method = RequestMethod.GET)
    public String goLogin(){
        return "Login.html";
    }
}
