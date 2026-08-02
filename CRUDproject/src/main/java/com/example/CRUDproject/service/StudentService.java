package com.example.CRUDproject.service;

import com.example.CRUDproject.entity.Student;
import com.example.CRUDproject.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq) {
        Student studentResp = studentRepository.saveStudent(studentReq);
        System.out.println("Inside service");
        return  studentResp ;
    }
}
