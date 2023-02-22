package com.example.socialnetworkappproject;

import com.example.socialnetworkappproject.model.Role;
import com.example.socialnetworkappproject.model.User;
import com.example.socialnetworkappproject.repository.UserRepository;
import com.example.socialnetworkappproject.service.UserSerivce;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource("/application-test.properties")
public class SocialNetworkAppProjectApplicationTests {
    @Autowired
    protected UserRepository userRep;
    @Autowired
    protected UserSerivce userSerivce;


}
