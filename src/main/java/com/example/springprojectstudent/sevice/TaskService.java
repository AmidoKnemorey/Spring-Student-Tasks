package com.example.springprojectstudent.sevice;

import com.example.springprojectstudent.model.Student;
import com.example.springprojectstudent.model.Task;
import com.example.springprojectstudent.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    private final StudentService studentService;

    @Autowired
    public TaskService(TaskRepository taskRepository, StudentService studentService) {
        this.taskRepository = taskRepository;
        this.studentService = studentService;
    }

    public Iterable<Task> getAllTasks() {
        List<Long> listOfIDs = this.studentService.getAllStudents()
                .stream()
                .map(Student::getId)
                .collect(Collectors.toList());
        return this.taskRepository.findAllById(listOfIDs);
    }

    public void addNewTask(Task task) {
       this.taskRepository.save(task);
    }
}
