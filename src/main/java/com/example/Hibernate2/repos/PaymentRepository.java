package com.example.Hibernate2.repos;

import com.example.Hibernate2.entities.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {
}
