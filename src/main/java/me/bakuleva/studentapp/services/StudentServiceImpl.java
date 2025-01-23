package me.bakuleva.studentapp.services;

import me.bakuleva.studentapp.entity.Group;
import me.bakuleva.studentapp.entity.Student;
import me.bakuleva.studentapp.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student findStudentById(long id) {
        return studentRepository.findStudentById(id);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAllStudents();
    }

    @Override
    public List<Student> findAllByGroup(Group groupName) {
        return studentRepository.findAllByGroupOrderBySurName(groupName);

    }

    @Override
    public List<Student>findByLastnameOrFirstname(long id, String surName, String name, String patronymic, int dateOfBirth, String gender, String studentStatus, int courseNumber) {
        return studentRepository.findByLastnameOrFirstname (id, surName, name, patronymic, dateOfBirth, gender, studentStatus, courseNumber);
    }

}




