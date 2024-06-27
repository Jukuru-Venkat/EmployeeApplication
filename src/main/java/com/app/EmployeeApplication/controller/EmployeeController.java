package com.app.EmployeeApplication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employee")

public class EmployeeController {
    @GetMapping
    public ResponseEntity<String> employeeApp(){
        System.out.println("Welcome to the Git Bash");
        return  new ResponseEntity<>("EmployeeApplication", HttpStatus.OK);
    }


}