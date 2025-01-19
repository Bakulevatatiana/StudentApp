package com.Bakuleva.StudentsApp.entity;

import lombok.Data;

@Data
public class Student {

    private long id;
    private String surName;
    private String name;
    private String patronymic;
    private Group group;
    private int dateOfBirth;
    private String gender;
    private String studentStatus;


}
