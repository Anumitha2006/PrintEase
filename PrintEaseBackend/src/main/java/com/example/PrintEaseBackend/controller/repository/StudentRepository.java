package com.example.PrintEaseBackend.repository;

import com.example.PrintEaseBackend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByRollNoAndDob(String rollNo, LocalDate dob);
}