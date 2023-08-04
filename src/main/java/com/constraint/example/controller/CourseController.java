package com.constraint.example.controller;

import com.constraint.example.request.Course;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {
    @PostMapping("/")
    public ResponseEntity<String> saveCourse(@RequestBody @Valid Course course){

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
