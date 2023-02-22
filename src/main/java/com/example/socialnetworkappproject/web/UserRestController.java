package com.example.socialnetworkappproject.web;


import com.example.socialnetworkappproject.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestController {

    @GetMapping
    public List<User> getUser(){
        return
    }
}
