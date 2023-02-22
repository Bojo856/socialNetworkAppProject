package com.example.socialnetworkappproject.service;

import com.example.socialnetworkappproject.model.Role;
import com.example.socialnetworkappproject.model.User;
import com.example.socialnetworkappproject.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class UserServiceTest {
    @Mock
    private UserRepository rep;
    @InjectMocks
    private UserSerivce userSerivce;

    @Test
    public void userService_CreateUser(){
        User user = new User("test1", "test1", "test1", "test1", Role.USER);

        User saveUser = userSerivce.save(user);
    }
}
