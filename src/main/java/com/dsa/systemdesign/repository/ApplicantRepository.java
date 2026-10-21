package com.dsa.systemdesign.repository;

import com.dsa.systemdesign.entity.Applicant;
import org.springframework.data.repository.CrudRepository;

public interface ApplicantRepository extends CrudRepository<Applicant,Long> {
}
