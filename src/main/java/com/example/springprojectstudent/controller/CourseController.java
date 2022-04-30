package com.example.springprojectstudent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CourseController {

    @GetMapping("/courseController")
    public String getCourseController() {
        return "index";
    }
}