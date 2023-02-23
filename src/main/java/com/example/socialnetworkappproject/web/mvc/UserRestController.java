package com.example.socialnetworkappproject.web.mvc;


import com.example.socialnetworkappproject.model.Role;
import com.example.socialnetworkappproject.model.User;
import com.example.socialnetworkappproject.service.UserSerivce;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import static org.springframework.http.HttpStatus.FORBIDDEN;

import java.util.List;

@RestController
@RequestMapping("/mvc/user")
@RequiredArgsConstructor
@Slf4j
public class UserRestController {
    private static final String MESSAGE_KEY = "message";

    private final UserSerivce serivce;

    @GetMapping
    public String register(ModelMap map) {
        map.addAttribute("user", new UserForm());
        map.addAttribute("roles", Role.values());
        return "register";
    }

    @PostMapping
    public String handleCreate(@ModelAttribute("user") @Valid UserForm form, BindingResult userFormBindingResult, RedirectAttributes redirectAttributes, ModelMap map){
        if(userFormBindingResult.hasErrors()){
            map.addAttribute("types", Role.values());
            return "register";
        }
        serivce.save(UserMapper.toEntity(form));

        redirectAttributes.addAttribute(MESSAGE_KEY, "Create new account success");
        return "redirect:/welcome/register/userList";
    }

}
