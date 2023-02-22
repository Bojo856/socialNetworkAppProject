package com.example.socialnetworkappproject.web;


import com.example.socialnetworkappproject.model.User;
import com.example.socialnetworkappproject.service.UserSerivce;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserRestController {

    private final UserSerivce serivce;

    @GetMapping
    public List<User> getUser(){
        return serivce.findAll();
    }
}
