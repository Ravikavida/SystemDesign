package com.dsa.systemdesign.service;


import com.dsa.systemdesign.repository.ApplicantRepository;
import com.dsa.systemdesign.repository.PagingSortingRepo;
import com.dsa.systemdesign.entity.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicantService {

    @Autowired
    private ApplicantRepository applicantRepository;

    @Autowired
    private PagingSortingRepo pagingSortingRepo;

    public List<Applicant> getAllApplicantList(){
        Iterable<Applicant> applicantList = applicantRepository.findAll();
        List<Applicant> applicants = new ArrayList<>();
        applicantList.forEach(applicants::add);
        return applicants;

    }

    public Applicant saveApplicant(Applicant applicant){
        return applicantRepository.save(applicant);
    }

    public List<Applicant> pagingSortingRepoDemo(int page,int size){
        Iterable<Applicant> applicantList = pagingSortingRepo.findAll(PageRequest.of(page,size));
        List<Applicant> applicants = new ArrayList<>();
        applicantList.forEach(applicants::add);
        return applicants;
    }
}
