package com.website.controller;

import com.website.pojo.User;
import com.website.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user")
    @ResponseBody
    public User getUser(){
        return userService.getUser();
    }
}
