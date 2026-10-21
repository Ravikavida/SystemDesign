package com.dsa.systemdesign.repository;

import com.dsa.systemdesign.entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRelationsResume extends JpaRepository<Applicant,Long> {
}
