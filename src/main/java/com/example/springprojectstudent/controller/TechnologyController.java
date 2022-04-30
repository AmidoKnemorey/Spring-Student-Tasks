package com.example.springprojectstudent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TechnologyController {

    @GetMapping("/technology")
    public String getIndex() {
        return "index";
    }

}
