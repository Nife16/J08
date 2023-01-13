package com.coffeecoding.entity;

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
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;


    
    @Column(name = "age")
    private Integer age;

    @Column(name = "gender")
    private String gender;

    @Column(name = "password")
    private String password;

    @Column(name = "coffee_image")
    private String coffeeImage;
    
    @Column(name = "student_email")
    private String studentEmail;

    @ManyToMany
    @JoinTable(
        name="student_courses",
        joinColumns={
        @JoinColumn(name="student_id", referencedColumnName = "id")
        },
        inverseJoinColumns = {
        @JoinColumn(name="courses_id", referencedColumnName = "id")
        }
    )
    List<Course> classes;
    
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Course> getClasses() {
        return classes;
    }

    public void setClasses(List<Course> classes) {
        this.classes = classes;
    }

    public String getCoffeeImage() {
        return coffeeImage;
    }

    public void setCoffeeImage(String coffeeImage) {
        this.coffeeImage = coffeeImage;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
                + ", gender=" + gender + ", password=" + password + ", coffeeImage=" + coffeeImage + ", studentEmail="
                + studentEmail + "]";
    }
    
}
