package com.dsa.systemdesign.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Applications {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    private String status;

    private String postion;

    @ManyToOne
    @JoinColumn(name = "applicantId",nullable = false)
    @JsonIgnore
    private Applicant applicant;
}
