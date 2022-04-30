package com.example.springprojectstudent.controller;

import com.example.springprojectstudent.model.Student;
import com.example.springprojectstudent.model.Task;
import com.example.springprojectstudent.sevice.StudentService;
import com.example.springprojectstudent.sevice.TaskService;
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
public class TasksController {

    private final StudentService studentService;
    private final TaskService taskService;


    @Autowired
    public TasksController(StudentService studentService, TaskService taskService) {
        this.studentService = studentService;
        this.taskService = taskService;
    }


    //GETTING A VIEW OF TASKS ON THE SIDEBAR
    @GetMapping("/tasks")
    public String getStudentsList() {
        return "tasks/tasks";
    }


    // GETTING A VIEW OF ADDING A TASK
    @GetMapping("/addTask")
    public String getAddTask(Model model) {
        List<Student> studentList = this.studentService.getAllStudents();
        model.addAttribute("student", studentList);
        return "tasks/addTask";
    }


    //ADDING A NEW TASK
    @PostMapping("/addTask")
    public RedirectView addTaskToDatabase(@ModelAttribute Task task) {
//        task.setId(id);
        this.taskService.addNewTask(task);
        return new RedirectView("tasks/tasks");
    }
}