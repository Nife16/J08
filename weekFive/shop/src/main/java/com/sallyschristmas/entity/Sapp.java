package com.sallyschristmas.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sapp")
public class Sapp {

    // ID lets you know its an id, PRIMARY KEY
    @Id
    // This will configure your id to be auto generated, now you don't need a setter for your id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Column maps to the same name as the column name in the database, it is case sensitive
    @Column(name = "id")
	private Integer id;

    // Column maps to the same name as the column name in the database, it is case sensitive
    @Column(name = "username", unique = true, nullable = false)
    private String username;

    // Column maps to the same name as the column name in the database, it is case sensitive
    @Column(name = "password", nullable = false)
    private String password;

    /* One to One, One Parent / One Child
     * You annotate the One to One mapping on the Parent object, not the child
     * The Join Column is where you tell the code what the name of the foreign key will be
     * 
     */
    @OneToOne
    @JoinColumn(name="cart_id")
    Cart cart;

    @OneToMany
    @JoinColumn(name="sapp_id")
    List<CreditCard> daBank;

    
    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Sapp() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Sapp [id=" + id + ", username=" + username + ", password=" + password + ", cart=" + cart + "]";
    }

    public List<CreditCard> getDaBank() {
        return daBank;
    }

    public void setDaBank(List<CreditCard> daBank) {
        this.daBank = daBank;
    }

    
    
}
