package com.sallyschristmas.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    @Override
    public String toString() {
        return "Sapp [id=" + id + ", username=" + username + ", password=" + password + "]";
    }
    
}
