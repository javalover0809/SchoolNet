package com.zjgsu.backend.controller;


import com.zjgsu.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: backend_csdn
 * User: quent
 * Date: 2018/11/29
 * Time: 10:08
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/profile")
    public String profile(){
        return "profile";
    }
//

    @RequestMapping("/logins")
    public String logins(){
        return "logins";
    }

    @RequestMapping("/login")
    public String getLogin(@RequestParam("username") String username,@RequestParam("password") String password){
        System.out.println("getlogin");
        boolean b;
        b=userService.find(username,password);
        System.out.println(username);
        System.out.println(password);
        b = true;
        if (b == true){
            System.out.println("dashboard2");
            return "dashboard2";
        }else{
            System.out.println("login");
            return "login";
        }
    }

    @GetMapping("/registration.html")
    public String registration(){
        System.out.println("registration");
        return "registration";
    }

    @GetMapping("/reset-password.html")
    public String resetPassword(){
        System.out.println("resetPassword");
        return "reset-password";
    }

}
