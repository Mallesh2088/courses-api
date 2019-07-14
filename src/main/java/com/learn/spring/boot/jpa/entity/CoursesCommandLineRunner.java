package com.learn.spring.boot.jpa.entity;

import com.learn.spring.boot.jpa.entity.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CoursesCommandLineRunner implements CommandLineRunner {

    private CoursesRepository coursesRepository;

    @Autowired
    public CoursesCommandLineRunner(CoursesRepository coursesRepository) {
        this.coursesRepository = coursesRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Courses course1 = new Courses("Spring Boot", "Spring Boot Deep Dive");
        Courses course2 = new Courses("Spring Cloud", "Spring Cloud Deep Dive");
        Courses course3 = new Courses("JAVA 8", "JAVA 8 Deep Dive");
        Courses course4 = new Courses("Hibernate", "Hibernate Deep Dive");
        Courses course5 = new Courses("Docker", "Docker Deep Dive");
        Courses course6 = new Courses("Kubernetes", "Kubernetes Deep Dive");
        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(course1);
        coursesList.add(course2);
        coursesList.add(course3);
        coursesList.add(course4);
        coursesList.add(course5);
        coursesList.add(course6);
        coursesRepository.saveAll(coursesList);

    }
}
