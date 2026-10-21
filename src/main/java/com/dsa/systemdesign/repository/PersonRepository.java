package com.dsa.systemdesign.repository;

import com.dsa.systemdesign.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
