package com.example.Hibernate2.entities;

import jakarta.persistence.*;

//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

//@Inheritance(strategy = InheritanceType.JOINED)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name ="pmode", discriminatorType = DiscriminatorType.STRING)
@Entity
public abstract class Payment {
    @Id
    private int id;
    private double amount;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
