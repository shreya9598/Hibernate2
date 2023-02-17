package com.example.Hibernate2.repos;

import com.example.Hibernate2.associations.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
