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

    @PostMapping(path = "")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student createdStudent = studentService.createStudent(student);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdStudent);
    }
    @GetMapping("/admin")
    public ResponseEntity<List<Student>> adminGetAllStudent(){
        List<Student>  students = studentService.adminGetAllStudents();

        if (students.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(students);
    }

    @GetMapping(path = "")
    public ResponseEntity<Student> getStudent(@RequestParam Long id){
        Student studentResp = studentService.getStudent(id);

        if(studentResp == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(studentResp);
    }
    @GetMapping(path = "/all")
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student>  students = studentService.getAllStudents();

        if (students.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(students);
    }
    @PutMapping(path = "")
    public ResponseEntity<Student> updateStudent(@RequestParam Long id ,@RequestBody Student studentReq){
        Student updatedStudent = studentService.updateStudent(id, studentReq);
        if (updatedStudent == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(studentReq);
    }
    @DeleteMapping(path = "")
    public ResponseEntity<String> deleteStudent(@RequestParam Long id){
        Boolean isDeleted = studentService.deleteStudent(id);

        if(! isDeleted){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok("Record Deleted");
    }
    @PatchMapping(path = "")
    public ResponseEntity<String> deleteStudentSoftly(@RequestParam Long id){
        Boolean isDeleted = studentService.softDeleteStudent(id);
        if (! isDeleted){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body("Record Deleted Softly");
    }


}
