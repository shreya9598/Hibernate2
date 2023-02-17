package com.example.Hibernate2;

import com.example.Hibernate2.associations.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Hibernate2Application {

	public static void main(String[] args) {

		SpringApplication.run(Hibernate2Application.class, args);
		System.out.println("hi");
		Customer c = new Customer();
		c.setName("ABC");
		getData(c);
		System.out.println(c.getName());
	}

	public static void getData(Customer c) {
		for(int i : Arrays.asList(1,2,3)) {
			System.out.println(i);
		}
		c.setName("xyz");
	}

}
