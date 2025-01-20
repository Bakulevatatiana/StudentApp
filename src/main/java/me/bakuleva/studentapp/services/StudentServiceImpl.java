package me.bakuleva.studentapp.services;

import me.bakuleva.studentapp.entity.Group;
import me.bakuleva.studentapp.entity.Student;
import me.bakuleva.studentapp.repository.StudentRepository;

import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student findStudentById(long id) {
        return studentRepository.findStudentById( id);
    }

@Override
public List<Student> findAllStudents() {
        return studentRepository.findAllStudents();
    }
@Override
public List<Student> findAllByGroup(Group groupName) {
        return studentRepository.findAllByGroup(groupName);

    }

    @Override
    public List<Student> findAllStudentByIdAndSurNameAndNameAndPatronymicAndCroup_groupNameAndStudentStatus(long id, String surName, String name, String patronymic, Group group, int dateOfBirth, String gender, String studentStatus, int courseNumber) {

        return studentRepository.findAllStudentByIdAndSurNameAndNameAndPatronymicAndCroupAndNameAndStudentStatusAndCourseNumber( id, surName ,  name,  patronymic, group, dateOfBirth,  gender, studentStatus,  courseNumber);
 }

    }




