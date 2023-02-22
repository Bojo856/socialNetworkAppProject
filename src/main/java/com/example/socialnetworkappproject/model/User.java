package com.example.socialnetworkappproject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {

    public User(String email, String password, String name, String lastName, Role role) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.role = role;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String lastName;
    private Role role;

    @OneToOne
    private Localization localization;
}
