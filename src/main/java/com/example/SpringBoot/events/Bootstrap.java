package com.example.SpringBoot.events;

import com.example.SpringBoot.entity.Student;
import com.example.SpringBoot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Iterator;

//Question 7.
@Component
public class Bootstrap {

    @Autowired
    StudentRepository studentRepository;

    @EventListener(ContextRefreshedEvent.class)
    public void init() {
        Iterator<Student> studentIterator = studentRepository.findAll().iterator();
        if (!studentIterator.hasNext()) {
            for (int i = 1; i <= 10; i++) {
                Student student = new Student(i, "student" + i);
                studentRepository.save(student);
                System.out.println("student " + i + " created");
            }
        }
        System.out.println("Your Application is up and running");
    }
}
