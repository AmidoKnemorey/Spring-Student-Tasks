package com.example.springprojectstudent.sevice;

import com.example.springprojectstudent.model.Student;
import com.example.springprojectstudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student) {
        this.studentRepository.save(student);
        System.out.println("adding a student to the DB has done!" + student.getId());
    }

    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    public Student getStudent(Long id) {
        return this.studentRepository.findById(id).orElse(null);
    }

    public void editStudent(Student student) {
        this.studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        this.studentRepository.deleteById(id);
        System.out.println("deleting student on ID " + id);
    }
}