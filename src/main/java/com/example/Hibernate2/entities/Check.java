package com.example.Hibernate2.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

//@Table(name ="card")
//@PrimaryKeyJoinColumn(name="id")

//@Table(name ="bankcheck")

@Entity
@DiscriminatorValue("ch")
public class Check extends Payment{
    private String checknumber;

    public String getChecknumber() {
        return checknumber;
    }

    public void setChecknumber(String checknumber) {
        this.checknumber = checknumber;
    }
}
