package com.example.CRUDproject.service;

import com.example.CRUDproject.entity.Student;
import com.example.CRUDproject.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq) {
        return studentRepository.save(studentReq);
    }

    public Student getStudent(Long id) {
        Optional<Student> studentResp = studentRepository.findById(id);

        return studentResp.orElse(null);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateStudent(Long id, Student studentReq) {
        Optional<Student>  existingStudent = studentRepository.findById(id);
        if (existingStudent.isEmpty()){
            return null;
        }
        Student studentToSave  = existingStudent.get();
        studentToSave.setName(studentReq.getName());
        studentToSave.setAge(studentReq.getAge());
        studentToSave.setEmail(studentReq.getEmail());
        studentToSave.setRollNo(studentReq.getRollNo());
        studentToSave.setSubject(studentReq.getSubject());

        return studentRepository.save(studentToSave);
    }

    public Boolean deleteStudent(Long id) {
        boolean isStudent = studentRepository.existsById(id);

        if (! isStudent){
            return false ;
        }
        studentRepository.deleteById(id);
        return true;
    }
}
