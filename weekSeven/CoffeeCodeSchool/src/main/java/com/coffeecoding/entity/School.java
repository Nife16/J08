package com.coffeecoding.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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

    // STUDENTS, STAFF, CLASSES, CONTACT

    @OneToMany
    @JoinColumn(name="school_id", referencedColumnName = "id")
    private List<Student> students;

    @OneToMany
    @JoinColumn(name="school_id", referencedColumnName = "id")
    private List<Course> classes;
    

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

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "School [id=" + id + ", schoolName=" + schoolName + ", type=" + type + "]";
    }
    
}
