package com.coffeecoding.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="class_name", unique = true)
    private String className;
    
    @Column(name="subject")
    private String subject;
    
    @Column(name="class_time")
    private LocalDateTime classTime;

    @Column(name="room_number")
    private Integer roomNumber;

    @ManyToMany
    @JoinTable(
        name="student_courses",
        joinColumns={
        @JoinColumn(name="courses_id", referencedColumnName = "id")
        },
        inverseJoinColumns = {
        @JoinColumn(name="student_id", referencedColumnName = "id")
        }
    )
    List<Student> students;

    public Course() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDateTime getClassTime() {
        return classTime;
    }

    public void setClassTime(LocalDateTime classTime) {
        this.classTime = classTime;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Class [id=" + id + ", className=" + className + ", subject=" + subject + ", classTime=" + classTime
                + ", roomNumber=" + roomNumber + ", students=" + students + "]";
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    
    
}
