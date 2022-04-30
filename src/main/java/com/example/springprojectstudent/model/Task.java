package com.example.springprojectstudent.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tasks")
public class Task {

    @Id
    private Long id;
    private LocalDate deadline;
    private String description;
    private String color;

    @ManyToOne
    private Student student;

}
