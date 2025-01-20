package me.bakuleva.studentapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Group {

    @Id
    @GeneratedValue
    private long id;

    @Column(name ="group_name")
    private String groupName;
    @Column(name ="departments")
    private String departments;
    @Column(name ="enrollment")
    private  int enrollment;


}
