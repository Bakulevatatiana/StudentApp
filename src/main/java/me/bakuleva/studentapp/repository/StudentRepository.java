package me.bakuleva.studentapp.repository;

import me.bakuleva.studentapp.entity.Group;
import me.bakuleva.studentapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findStudentById(long id);

List<Student> findAllStudents();

List<Student> findAllByGroup(Group group );



List<Student> findAllStudentByIdAndSurNameAndNameAndPatronymicAndCroupAndNameAndStudentStatusAndCourseNumber(long id, String surName, String name, String patronymic, Group group,int dateOfBirth, String gender,String studentStatus,int CourseNumber
);
}



