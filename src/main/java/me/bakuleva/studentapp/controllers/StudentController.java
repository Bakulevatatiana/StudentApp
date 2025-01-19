package com.Bakuleva.StudentsApp.controllers;


import com.Bakuleva.StudentsApp.entity.Student;
import com.Bakuleva.StudentsApp.services.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
}
