package com.example.SpringBoot.repository;


import com.example.SpringBoot.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Question 7.
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
}