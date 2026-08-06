package com.example.CRUDproject.repository;

import com.example.CRUDproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

//    findBy + field name + condition

    Optional<Student> findByIdAndDeletedIsFalse(Long id);

    List<Student> findAllByDeletedIsFalse();

    List<Student> findByDeletedIsFalse();

//        when repo was a class
//    public Student saveStudent(Student studentReq) {
//        System.out.println("Inside repo");
//        return null;
//    }
}
