package com.coffeecoding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeecoding.entity.School;
import com.coffeecoding.repo.SchoolRepo;

@Service
public class SchoolService {
    
    @Autowired
    SchoolRepo schoolrepo;


    public School save(School school) {

        return schoolrepo.save(school);
        
    }

}
