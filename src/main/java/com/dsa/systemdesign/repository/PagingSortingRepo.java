package com.dsa.systemdesign.repository;

import com.dsa.systemdesign.entity.Applicant;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PagingSortingRepo extends PagingAndSortingRepository<Applicant,Long> {
}
