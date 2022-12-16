package com.sallyschristmas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="credit_card")
public class CreditCard {

    // ID lets you know its an id, PRIMARY KEY
    @Id
    // This will configure your id to be auto generated, now you don't need a setter for your id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Column maps to the same name as the column name in the database, it is case sensitive
    @Column(name = "id")
	private Integer id;

    // Column maps to the same name as the column name in the database, it is case sensitive
    @Column(name = "card_name")
	private String cardName;


    // Column maps to the same name as the column name in the database, it is case sensitive
    @Column(name = "balance")
    private Double balance;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getCardName() {
        return cardName;
    }


    public void setCardName(String cardName) {
        this.cardName = cardName;
    }


    public Double getBalance() {
        return balance;
    }


    public void setBalance(Double balance) {
        this.balance = balance;
    }

    
}
