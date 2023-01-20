package com.coffeecoding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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

        // This is a class from the spring security library (must have spring security dependency in pom.xml)
        // we use the password encoder to encode our password
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        // We take the users password that they typed in, and hash it up so that we store it safely (cant be seen in plain text)
		String hashedPassword = passwordEncoder.encode(student.getPassword());
        System.out.println(hashedPassword);
        // Set the hashed password on the user, so we have a safely stored password
		student.setPassword(hashedPassword);

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

        if(findByEmail(studentEmail) == null) {
            throw new Exception("ERROR!!! ERROR!!! ERROR!!! STUDENT NOT FOUND!!!!");
        }

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		Student student = findByEmail(studentEmail);
		
		Boolean doesItMatch = passwordEncoder.matches(password, student.getPassword());

        if(doesItMatch) {
            return student;
        } else {
            throw new Exception("ERROR!!! ERROR!!! ERROR!!! PASSWORD DOESNT MATCH!!!!");
        }

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
