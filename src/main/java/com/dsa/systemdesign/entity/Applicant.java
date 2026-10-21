package com.dsa.systemdesign.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
    private String name;
    private String email;
    private String phone;
    private String status;

    @OneToOne(mappedBy = "applicant",cascade = CascadeType.ALL)
    private Resume resume;

    @OneToMany(mappedBy = "applicant",cascade = CascadeType.ALL)
    private List<Applications> applicationsList = new ArrayList<>();


    @ManyToMany
    @JoinTable(
            name ="",
            joinColumns = @JoinColumn(name ="applicantId"),
            inverseJoinColumns = @JoinColumn(name = "jobId")
    )
    private List<Job> jobs = new ArrayList<>();

}
