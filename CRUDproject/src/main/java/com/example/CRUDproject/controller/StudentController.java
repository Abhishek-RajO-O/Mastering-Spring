package com.example.CRUDproject.controller;

import com.example.CRUDproject.entity.Student;
import com.example.CRUDproject.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(path = "/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student createdStudent = studentService.createStudent(student);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdStudent);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
        Student studentResp = studentService.getStudent(id);

        if(studentResp == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(studentResp);
    }
    @GetMapping(path = "")
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student>  students = studentService.getAllStudents();

        if (students.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(students);
    }
    @PutMapping(path = "/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id ,@RequestBody Student studentReq){
        Student updatedStudent = studentService.updateStudent(id, studentReq);
        if (updatedStudent == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(studentReq);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        Boolean isDeleted = studentService.deleteStudent(id);

        if(! isDeleted){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok("Record Deleted");
    }


}
