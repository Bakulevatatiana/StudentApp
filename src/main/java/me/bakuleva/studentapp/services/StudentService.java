package me.bakuleva.studentapp.services;

import me.bakuleva.studentapp.entity.Group;
import me.bakuleva.studentapp.entity.Student;

import java.util.List;

public interface StudentService {

    Student findStudentById(long id);

    List<Student> findAllStudents();

    List<Student> findAllByGroup(Group groupName);

    List<Student>findByLastnameOrFirstname(long id, String surName, String name, String patronymic, int dateOfBirth, String gender, String studentStatus, int courseNumber);
}
