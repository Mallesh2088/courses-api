package com.learn.spring.boot.controller;

import com.learn.spring.boot.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CoursesController {

    @GetMapping(value = "/all")
    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();
        Course courses1 = new Course();
        courses1.setCourseName("Spring Boot")
                .setCourseDescription("Spring Boot Deep Dive");
        courses.add(courses1);
        return courses;
    }
}
