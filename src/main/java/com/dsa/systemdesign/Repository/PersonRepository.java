package com.dsa.systemdesign.Repository;

import com.dsa.systemdesign.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
