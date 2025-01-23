package me.bakuleva.studentapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(schema = "student", name = "studentt")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "sur_name", nullable = false)
    private String surName;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "patronymic", nullable = false)
    private String patronymic;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "group_student")
    private Group group;
    @Column(name = "date_of_birth", nullable = false)
    private int dateOfBirth;
    @Column(name = "gender", nullable = false)
    private String gender;
    @Column(name = "student_status", nullable = false)
    private String studentStatus;
    @Column(name = "course_number")
    private int courseNumber;
}
