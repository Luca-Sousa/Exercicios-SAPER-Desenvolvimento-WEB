package com.saper.boxbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saper.boxbackend.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
