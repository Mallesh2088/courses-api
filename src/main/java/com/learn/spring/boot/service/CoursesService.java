package com.learn.spring.boot.service;

import com.learn.spring.boot.mapper.CourseMapper;
import com.learn.spring.boot.jpa.entity.Courses;
import com.learn.spring.boot.jpa.entity.repository.CoursesRepository;
import com.learn.spring.boot.model.CourseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CoursesService {

    private CoursesRepository coursesRepository;

    private CourseMapper courseMapper;

    @Autowired
    public CoursesService(CoursesRepository coursesRepository, CourseMapper courseMapper) {
        this.coursesRepository = coursesRepository;
        this.courseMapper = courseMapper;
    }

    public List<CourseDTO> getAllCourses() {
        List<Courses> coursesList = coursesRepository.findAll();
        return courseMapper.toCourseDTOs(coursesList);
    }

    public CourseDTO addCourse(CourseDTO courseDTO) {
        Courses course = coursesRepository.save(courseMapper.toCourses(courseDTO));
        return courseMapper.toCourseDTO(course);
    }
}
