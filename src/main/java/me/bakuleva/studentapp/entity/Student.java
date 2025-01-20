package me.bakuleva.studentapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name ="Student")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
  @Column(name ="sur_name")
    private String surName;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "patronymic", nullable = false)
    private String patronymic;
    @ManyToOne
    @JoinColumn(name = "group")
    private Group group;
    @Column(name = "date_of_birth", nullable = false)
    private int dateOfBirth;
    @Column(name = "gender", nullable = false)
    private String gender;
    @Column(name = "studentstatus", nullable = false)
    private String studentStatus;
  @Column(name = "cors_numbr")
    private int courseNumber;


}
