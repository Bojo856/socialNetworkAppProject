package com.example.socialnetworkappproject.repository;

import com.example.socialnetworkappproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
