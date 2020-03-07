package com.dean.todolist.controller;

import com.dean.todolist.service.UserService;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Key;

@Controller
public class LoginController {

    /*@Autowired
    private UserService userService;*/

    @RequestMapping("/")
    public String welcome(){
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password){

        System.out.println(username+"-"+password);
        return "index";
    }
}
