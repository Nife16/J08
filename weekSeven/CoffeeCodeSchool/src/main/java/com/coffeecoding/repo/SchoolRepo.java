package com.coffeecoding.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coffeecoding.entity.School;

@Repository
public interface SchoolRepo extends JpaRepository<School, Integer>{
    
}
