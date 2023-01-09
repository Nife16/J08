package com.coffeecoding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeecoding.entity.Course;
import com.coffeecoding.repo.CourseRepo;

@Service
public class CourseService {
    

    @Autowired
    CourseRepo courseRepo;


    public Course save(Course course) {
        return courseRepo.save(course);
    }

    public Course updateCourse(Course course) throws Exception  {
        if(course.getId() == null) {
            throw new Exception("Course not found.");
        }

        return courseRepo.save(course);
    }

    public List<Course> getAll() {
        return courseRepo.findAll();
    }

    public Course getByCourseId(Integer courseId) {
        return courseRepo.findById(courseId).get();
    }

    public void deleteByCourseId(Integer courseId) {
        courseRepo.deleteById(courseId);
    }

}
