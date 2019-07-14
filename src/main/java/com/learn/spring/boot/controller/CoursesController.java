package com.learn.spring.boot.controller;

import com.learn.spring.boot.model.CourseDTO;
import com.learn.spring.boot.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CoursesController {

    private CoursesService coursesService;

    @Autowired
    public CoursesController(CoursesService coursesService) {
        this.coursesService = coursesService;
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<CourseDTO>> getAllCourses() {
        return ResponseEntity.ok(coursesService.getAllCourses());
    }
}
