package com.example.socialnetworkappproject.service;

import com.example.socialnetworkappproject.model.User;
import com.example.socialnetworkappproject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class UserSerivce {

    private final UserRepository rep;

    public List<User> findAll(){
        return StreamSupport.stream(rep.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public User save(User user) {
        return rep.save(user);
    }

    @DeleteMapping
    public void delete(@RequestBody Long id) {
        rep.deleteById(id);
    }
}
