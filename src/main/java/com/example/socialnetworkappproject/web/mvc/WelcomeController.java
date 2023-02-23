package com.example.socialnetworkappproject.web.mvc;

import com.example.socialnetworkappproject.model.User;
import com.example.socialnetworkappproject.service.UserSerivce;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/mvc")
public class WelcomeController {
    private final UserSerivce serivce;

    @GetMapping
    public String welcomePage(ModelMap map){
        User user = serivce.findById(2L);
        map.addAttribute("user", user);

        return "welcome";
    }
}
