package com.example.socialnetworkappproject.web.mvc;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.UniqueElements;

@Getter
@Setter
@ToString
@UniqueElements(message = "This email has been used")
public class UserForm {

    @Email(message = "Wrong email")
    @NotBlank(message = "You have write email")
    private String email;
    @Size(min = 6, message = "You password must have min 6 characters")
    private String password;
    @NotBlank(message = "You have write name")
    private String name;
    @NotBlank(message = "You have write last name")
    private String lastName;
}
