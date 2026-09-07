package com.example.PrintEaseBackend.controller;

import com.example.PrintEaseBackend.model.Student;
import com.example.PrintEaseBackend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class LoginController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/Login")
    public String login(
            @RequestParam String rollNo,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dob) {

        Student student = studentRepository.findByRollNoAndDob(rollNo, dob);

        if (student != null) {
            return "Login Successful";
        } else {
            return "Invalid Roll No or Date of Birth";
        }
    }
}