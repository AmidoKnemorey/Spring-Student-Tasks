package com.example.springprojectstudent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginRegisterController {

    @GetMapping("/login")
    public String getTechnology() {
        return "loginPages/login";
    }

    @GetMapping("/register")
    public String getRegister() {
        return "loginPages/register";
    }

}
