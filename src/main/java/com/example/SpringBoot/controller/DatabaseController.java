package com.example.SpringBoot.controller;

import com.example.SpringBoot.entity.Database;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {
    @Autowired
    Database database;
//    Logger logger = LoggerFactory.getLogger(DatabaseController.class);

    // Question 4.
    @GetMapping("/database")
    public Database getDatabase() {
//        logger.info("INFO : getDatabase Method");
        return database;
    }
}
