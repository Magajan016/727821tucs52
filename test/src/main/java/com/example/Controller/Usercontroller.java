package com.example.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.example.Service.UserService;
import com.example.model.User;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("//20.244.56.144/test")
public class Usercontroller {
    private final UserService userService;
    @PostMapping("/register")
    public User register(@RequestBody User u){
        return userService.registerUser(u);
    }

    
}
