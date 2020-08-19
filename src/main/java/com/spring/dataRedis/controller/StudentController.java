package com.spring.dataRedis.controller;

import com.spring.dataRedis.model.Student;
import com.spring.dataRedis.service.StudentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class StudentController {

    public static final Logger logger = LogManager.getLogger();

    @Autowired
    StudentService studentService;

    public StudentController() {
    }

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping(value= "/newStudents", produces = "application/json")
    public ResponseEntity<?> studentNew() {
        return ResponseEntity.ok(studentService.newStudent());
    }

    @GetMapping(value = "/students")
    //@RequestMapping(value = "/students", method = RequestMethod.GET)
    public ResponseEntity<?> StudentAll() {
        Student eng2015001 = studentService.findByStudent("Eng2015001");
        return ResponseEntity.ok(eng2015001);
    }

    @RequestMapping(value = "/deleteStudents", method = RequestMethod.DELETE)
    public ResponseEntity<?> StudentDelete() {
        studentService.deleteStudent("Eng2015001");
        return ResponseEntity.ok().build();
    }



}

