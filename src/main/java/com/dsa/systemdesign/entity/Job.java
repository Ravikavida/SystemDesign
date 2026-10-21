package com.dsa.systemdesign.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String jobId;

    @ManyToMany(mappedBy = "jobs")
    private List<Applicant> applicantList = new ArrayList<>();
}
