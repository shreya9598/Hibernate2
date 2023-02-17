package com.example.Hibernate2.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;


//@Table(name ="bankcheck")

//@Table(name ="card")
//@PrimaryKeyJoinColumn(name="id")
@Entity
@DiscriminatorValue("cc")
public class CreditCard extends Payment{
    private String cardnumber;

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }
}
