package com.learn.spring.boot.model;


public class Course {

    private String courseName;
    private String courseDescription;

    public String getCourseName() {
        return courseName;
    }

    public Course setCourseName(String courseName) {
        this.courseName = courseName;
        return this;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public Course setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
        return this;
    }
}
