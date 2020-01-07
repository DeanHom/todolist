package com.dean.todolist.controller;

import com.dean.todolist.service.UserService;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.security.Key;

@RestController
public class LoginController {

    /*@Autowired
    private UserService userService;*/

    public String login(){

        Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

        return "";
    }
}
