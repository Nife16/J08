package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.User;

// Annotate to create a spring bean of the repo
@Repository         // Between the <,> first put the type of object, next the type of the primary key
public interface UserRepo extends JpaRepository<User, Integer>{
    
}
