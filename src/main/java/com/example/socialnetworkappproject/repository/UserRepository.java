package com.example.socialnetworkappproject.repository;

import com.example.socialnetworkappproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findAllByLastName(String lastName);

    Optional<User> findAllByName(String name);


}
