package com.coffeecoding.service;

import java.util.List;

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
    
    public School updateSchool(School school) throws Exception {

        if(school.getId() == null) {
            throw new Exception("Id is not present, billy.");
        }
        return schoolrepo.save(school);
        
    }

    public List<School> getAll() {
        return schoolrepo.findAll();
    }

    public School getSchoolById(Integer id) {

        return schoolrepo.findById(id).get();
    }

    public void deleteSchoolById(Integer id) {

        schoolrepo.deleteById(id);
        
    }

}
