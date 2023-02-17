package com.example.Hibernate2.associations;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)       // thet means primary key si in cutomer ,it owns the mapping
    private Set<PhoneNumber> numbers;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<PhoneNumber> getNumbers() {
        return numbers;
    }

    public void setNumbers(Set<PhoneNumber> numbers) {
        this.numbers = numbers;
    }

    public void addPhoneNumber(PhoneNumber number){
        if(number !=null){
            if(numbers == null){
                numbers= new HashSet<>();
            }
            number.setCustomer(this);      //FK
            numbers.add(number);

        }
    }
}
