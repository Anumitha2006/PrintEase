package com.example.PrintEaseBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private Long id;

    private String rollNo;

    private java.time.LocalDate dob;

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public java.time.LocalDate getDob() {
        return dob;
    }

    public void setDob(java.time.LocalDate dob) {
        this.dob = dob;
    }
}