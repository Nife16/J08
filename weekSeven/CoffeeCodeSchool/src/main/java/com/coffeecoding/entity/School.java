package com.coffeecoding.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="school")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="school_name", unique = true)
    private String schoolName;

    @Column(name="type")
    private String type;

    // STUDENTS, STAFF, CLASSES, ADDRESS

    public School() {
    }

    public Integer getId() {
        return id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "School [id=" + id + ", schoolName=" + schoolName + ", type=" + type + "]";
    }
    
}
