package com.example.springprojectstudent.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "students")
public class Student {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (length = 30)
    private String firstName;
    @Column (length = 30)
    private String lastName;
    @Column (length = 30)
    private String gitHub;
    @Column (length = 500)
    private String start;

    @Column (length = 3)
    private Integer java;
    @Column (length = 3)
    private Integer bestPractice;
    @Column (length = 3)
    private Integer tdd;
    @Column (length = 3)
    private Integer question;
    @Column (length = 3)
    private Integer hibernate;
    @Column (length = 3)
    private Integer html;
    @Column (length = 3)
    private Integer jsp;
    @Column (length = 3)
    private Integer thymeleaf;
    @Column (length = 3)
    private Integer git;
    @Column (length = 3)
    private Integer checkBox;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private Set<Task> allTheTasks = new HashSet<>();
}