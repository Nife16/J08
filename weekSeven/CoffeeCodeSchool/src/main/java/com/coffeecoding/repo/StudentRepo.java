package com.coffeecoding.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.coffeecoding.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    @Query(value="select * from students where student_email = ?1 and password = ?2", nativeQuery = true)
    public Student getByStudentEmailAndPassword(String email, String password);
    
}
