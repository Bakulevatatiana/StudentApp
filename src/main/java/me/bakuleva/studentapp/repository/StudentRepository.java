package me.bakuleva.studentapp.repository;

import me.bakuleva.studentapp.entity.Group;
import me.bakuleva.studentapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findStudentById(long id);

    List<Student> findAllStudents();

    List<Student> findAllByGroupOrderBySurName(Group group);

    @Query("select u from Student u where u.id = :id or u.surName = :surName or u.name = :name   or u.patronymic=:patronymic  or u.dateOfBirth=:dateOfBirth or u.gender=:gender or u.studentStatus=:studentStatus or u.courseNumber=:courseNumber  ")
    List<Student> findByLastnameOrFirstname(@Param("id") long id,
                                            @Param("surName") String surName,
                                            @Param("name") String name,
                                            @Param("patronymic") String patronymic,
                                            @Param("dateOfBirth") int dateOfBirth,
                                            @Param("gender") String gender,
                                            @Param("studentStatus") String studentStatus,
                                            @Param("courseNumber") int courseNumber);


}




