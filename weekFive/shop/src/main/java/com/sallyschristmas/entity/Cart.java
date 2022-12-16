package com.sallyschristmas.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {

    // ID lets you know its an id, PRIMARY KEY
    @Id
    // This will configure your id to be auto generated, now you don't need a setter for your id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Column maps to the same name as the column name in the database, it is case sensitive
    @Column(name = "id")
    private Integer id;

    @ManyToMany
    @JoinTable(
		name="cart_items",
	    joinColumns = {
            @JoinColumn(name = "cart_id", referencedColumnName="id")
        }, 
	    inverseJoinColumns = {
            @JoinColumn(name = "product_id", referencedColumnName="id")
        }
	)
    List<Product> products;
    

    public Cart() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
}
