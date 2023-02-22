package com.example.socialnetworkappproject.repository;

import com.example.socialnetworkappproject.SocialNetworkAppProjectApplicationTests;
import com.example.socialnetworkappproject.model.Role;
import com.example.socialnetworkappproject.model.User;
import org.junit.jupiter.api.Test;

public class UserRepositoryTest extends SocialNetworkAppProjectApplicationTests {
    @Test
    void shouldCreateUser() {
        User user = new User("test1", "test1", "test1", "test1", Role.USER);

        User saved = userRep.save(user);
    }
}
