package com.example.springprojectstudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
//public class SpringProjectStudentApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(SpringProjectStudentApplication.class, args);
//    }


    // next lines are instead of lines above:

    @SpringBootApplication
    @ComponentScan(basePackages = "com.example")
    public class SpringProjectStudentApplication extends SpringBootServletInitializer {

        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            return application.sources(SpringProjectStudentApplication.class);
        }

        public static void main(String[] args) {
            SpringApplication.run(SpringProjectStudentApplication.class, args);
        }

    }