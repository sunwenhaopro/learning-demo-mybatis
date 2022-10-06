package com.example.swh.controller;

import com.example.swh.entity.User;
import com.example.swh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
   @Autowired
    private UserService userservice;

    @RequestMapping("/register")
    public String register(){
        System.out.println("注册");
        return "register";
    }
    @RequestMapping("/success")
    public String successs(){
        System.out.println("注册");
        return "success";
    }
    @CrossOrigin
    @PostMapping("/register")
    @ResponseBody
    public String register2(@RequestParam("username") String username,
                         @RequestParam("password") String password){
        User user = new User();
        System.out.println(username);
        System.out.println(password);

        user.setPassword(password);
        user.setUsername(username);

       userservice.insert(user.getUsername(),user.getPassword());
       return "success";
    }


}
