package com.spring.dataRedis.service;

import com.spring.dataRedis.model.Student;
import com.spring.dataRedis.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.spring.dataRedis.model.Student.Gender.*;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student newStudent(){
        Student student = new Student("Eng2015001", "John Doe", MALE, 1);
        return studentRepository.save(student);
    }

    public Student findByStudent(String id){
        Student retrievedStudent =
                studentRepository.findById(id).get();
        return retrievedStudent;
    }

    public Student updateStudent(String id){
        Student retrievedStudent = studentRepository.findById(id).get();
        retrievedStudent.setName("Richard Watson");
        return studentRepository.save(retrievedStudent);
    }

    public void deleteStudent(String id){
        studentRepository.deleteById(id);
    }
}
