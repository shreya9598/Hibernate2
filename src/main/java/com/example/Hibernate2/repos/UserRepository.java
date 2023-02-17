package com.example.Hibernate2.repos;

import com.example.Hibernate2.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
