package com.dsa.systemdesign.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    private String content;

    @JoinColumn(name = "applicantId", nullable = false)
    @OneToOne
    @JsonIgnore
    private Applicant applicant;
}
