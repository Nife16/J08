package com.coffeecoding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeecoding.entity.School;
import com.coffeecoding.entity.Student;
import com.coffeecoding.repo.StudentRepo;

@Service
public class StudentService {
    

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    SchoolService schoolService;

    public List<Student> getAll() {
        return studentRepo.findAll(); 
    }

    public Student updateStudentInfo(Student student) throws Exception {
        
        if(student.getId() == null) {
            throw new Exception("Student not found.");
        }

        return studentRepo.save(student);

    }

    public Student save(Student student, Integer schoolId) {
        
        School school = schoolService.getSchoolById(schoolId);

        Student savedStudent = studentRepo.save(student);
        
        savedStudent.setStudentEmail(savedStudent.getFirstName()+savedStudent.getLastName()
                                    +savedStudent.getId()+"@"+school.getSchoolName()+".caffine");

        // update student to have the email
        
        savedStudent = studentRepo.save(savedStudent);

        school.getStudents().add(savedStudent);

        schoolService.save(school);

        return savedStudent;
    }

    public Student getByStudentEmailAndPassword(String studentEmail, String password) throws Exception {

        if(studentRepo.getByStudentEmailAndPassword(studentEmail, password) == null) {
            throw new Exception("ERROR!!! ERROR!!! ERROR!!! STUDENT NOT FOUND!!!!");
        }

        return studentRepo.getByStudentEmailAndPassword(studentEmail, password);

    }

    public Student findById(Integer studentId) {

        return studentRepo.findById(studentId).get();

    }

    public Student findByEmail(String studentEmail) {

        return studentRepo.getByStudentEmail(studentEmail);

    }

    public void deleteById(Integer studentId) {

        studentRepo.deleteById(studentId);

    }

    
}
