package com.example.springprojectstudent.controller;

import com.example.springprojectstudent.model.Student;
import com.example.springprojectstudent.sevice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class StudentsController {

    private final StudentService studentService;

    @Autowired
    public StudentsController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String getStudentsList(Model model) {
        List<Student> studentList = studentService.getAllStudents();
        model.addAttribute("student", studentList);
        return "persons/personList";
    }

    // only get view for addNewStudent
    @GetMapping("/addStudents")
    public String getAddStudents() {
        return "persons/addNewPerson";
    }
    // adding new student
    @PostMapping("/addStudents")
    public RedirectView postAddStudents(@ModelAttribute Student student) {
        this.studentService.addStudent(student);
        return new RedirectView("/students");
    }

    //get student for only edit view
    @GetMapping("/editStudents/{id}")
    public String getEditingStudents(@PathVariable("id") Long id, Model model) {
        Student student = this.studentService.getStudent(id);
        model.addAttribute("student", student);
        return "persons/editPerson";
    }

    @PostMapping("/addStudent/{id}")
    public RedirectView postEditStudent(@ModelAttribute Student newStudent, @PathVariable("id") Long id) {
        this.studentService.editStudent(newStudent);
        return new RedirectView("/editStudents/{id}");
    }

    @PostMapping("/editStudent/{id}")
    public RedirectView postDeleteStudent(@PathVariable("id") Long id) {
        this.studentService.deleteStudent(id);
        return new RedirectView("/students");
    }
}