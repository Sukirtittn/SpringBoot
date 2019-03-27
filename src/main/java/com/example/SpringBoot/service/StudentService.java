package com.example.SpringBoot.service;
//Question1.

import com.example.SpringBoot.entity.Student;
import com.example.SpringBoot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudentList() {
        return Arrays.asList(new Student(101, "Aakash"),
                new Student(102, "yashu"));
    }

}
