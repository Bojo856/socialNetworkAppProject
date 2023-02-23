package com.example.socialnetworkappproject.web.mvc;


import com.example.socialnetworkappproject.model.Role;
import com.example.socialnetworkappproject.model.User;

public class UserMapper {
    public static User toEntity(UserForm form){
        return new User(form.getEmail(), form.getPassword(), form.getName(), form.getLastName(), Role.USER);
    }
}
