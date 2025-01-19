package com.Bakuleva.StudentsApp.entity;

import lombok.Data;

@Data
public class Group {
    private long id;
    private String groupName;
    private String departments;
    private  int enrollment;
}
