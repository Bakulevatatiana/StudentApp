package me.bakuleva.studentapp.controller;

import me.bakuleva.studentapp.entity.Group;
import me.bakuleva.studentapp.entity.Student;
import me.bakuleva.studentapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("{/id}")
    public Student findByName(@PathVariable long id) {
        return studentService.findStudentById(id);
    }

    @GetMapping("/all")
    public List<Student> findAll() {
        return studentService.findAllStudents();
    }

    @GetMapping("/all/{groupName}")
    public List<Student> findAllStudentsGroup(@PathVariable Group groupName) {
        return studentService.findAllByGroup(groupName);
    }

    @GetMapping("/all/byFullName")
    public List<Student> findAllyFullName(@RequestParam long id, @RequestParam String surName, @RequestParam String name, @RequestParam String patronymic,  @RequestParam int dateOfBirth, @RequestParam String gender, @RequestParam String studentStatus, @RequestParam int courseNumber) {
        return studentService.findByLastnameOrFirstname(id, surName, name, patronymic,  dateOfBirth, gender, studentStatus, courseNumber);

    }
}

