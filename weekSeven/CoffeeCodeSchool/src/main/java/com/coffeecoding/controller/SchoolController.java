package com.coffeecoding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coffeecoding.entity.School;
import com.coffeecoding.service.SchoolService;

// MAKE SURE YOU PUT A "REST"CONTROLLER, FOR REST
@RestController
public class SchoolController {

    @Autowired
    SchoolService schoolService;


    // RequestMapping for your endpoints to configure them
    @RequestMapping(
        // Value is the path of the endpoint, MUST BE UNIQUE
        value="/createSchool",
        // Consumes JSON means it will be accepting data in JSON format, like how we send the body in Postman
        consumes = MediaType.APPLICATION_JSON_VALUE,
        // Produces means it will be sending out JSON formatted Data
        produces = MediaType.APPLICATION_JSON_VALUE,
        // method is the type HTTP rest call you need to access this endpoint
        method = RequestMethod.POST
    )                                 // Data from post and put requets come in the request body
    public ResponseEntity<Object> createSchool(@RequestBody School school) {

        try {

            // send data to service for processing
            School savedSchool = schoolService.save(school);

            // return the data on success
            return new ResponseEntity<>(savedSchool, HttpStatus.CREATED);

            //  Catches will catch any error that happens in the process and return the message
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }

    /* Get All Schools */
    @RequestMapping(
        value="/getAllSchools",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.GET
    )
    public ResponseEntity<Object> getAllSchools() {

        try {

            List<School> schools = schoolService.getAll();

            return new ResponseEntity<>(schools, HttpStatus.OK);

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    } 


    /* Get School */
    @RequestMapping(
        value="/getSchoolById/{schoolId}",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.GET
    )
    public ResponseEntity<Object> getSchoolById(@PathVariable Integer schoolId) {

        try {

            School school = schoolService.getSchoolById(schoolId);

            return new ResponseEntity<>(school, HttpStatus.OK);

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /* Update School */
    @RequestMapping(
        value="/updateSchool",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.POST
    )
    public ResponseEntity<Object> updateSchool(@RequestBody School school) {

        try {

            School updatedSchool = schoolService.updateSchool(school);
            return new ResponseEntity<>(updatedSchool, HttpStatus.OK);
        
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

     /* Delete School */
     @RequestMapping(
        value="/deleteSchoolById/{schoolId}",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.DELETE
    )
    public ResponseEntity<Object> deleteById(@PathVariable Integer schoolId) {

        try {

            schoolService.deleteSchoolById(schoolId);

            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    
}
