package com.example.CRUDproject.repository;

import com.example.CRUDproject.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {

    public Student saveStudent(Student studentReq) {
        System.out.println("Inside repo");
        return null;
    }
}
