package com.dsa.systemdesign.controller;

import com.dsa.systemdesign.entity.Applicant;
import com.dsa.systemdesign.service.ApplicantService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class ApplicantController {

    private final ApplicantService applicantService;

    public ApplicantController(ApplicantService applicantService){
        this.applicantService = applicantService;
    }

    @GetMapping
    public ResponseEntity<?> getAllApplicants(){
        List<Applicant> applicantList = applicantService.getAllApplicantList();
        return ResponseEntity.ok(applicantList);
    }

    @PostMapping("/saveapplicant")
    public ResponseEntity<?> saveApplicant(@Validated @RequestBody Applicant applicant){
       Applicant applicantList = applicantService.saveApplicant(applicant);
        return ResponseEntity.ok(applicantList);
    }

    @GetMapping
    public ResponseEntity<?> getPage(@RequestParam int page, @RequestParam int size){
        List<Applicant> applicantList = applicantService.pagingSortingRepoDemo(page,size);
        return ResponseEntity.ok(applicantList);
    }
}
