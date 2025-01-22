package me.bakuleva.studentapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "groupp")
public class Group {

    @Id
    @GeneratedValue
    private long id;
   @OneToMany(mappedBy = "group", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   private List<Student> students=new ArrayList<>();
    @Column(name ="group_name")
    private String groupName;
    @Column(name ="departments")
    private String departments;
    @Column(name ="enrollment")
    private  int enrollment;


}
