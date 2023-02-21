package com.example.socialnetworkappproject.service;

import com.example.socialnetworkappproject.model.User;
import com.example.socialnetworkappproject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class UserSerivce {

    private final UserRepository rep;

    public User save(User user) {
        return rep.save(user);
    }

    @DeleteMapping
    public void delete(@RequestBody Long id){
        rep.deleteById(id);
    }
}
