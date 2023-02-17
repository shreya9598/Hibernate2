package com.example.Hibernate2.repos;

import com.example.Hibernate2.onetoone.License;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface LicenseRepository extends CrudRepository<License, UUID> {
}
