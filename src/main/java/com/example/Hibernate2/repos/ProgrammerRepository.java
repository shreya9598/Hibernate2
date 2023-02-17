package com.example.Hibernate2.repos;

import com.example.Hibernate2.manytoone.Programmer;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProgrammerRepository extends CrudRepository <Programmer, UUID>{
}
