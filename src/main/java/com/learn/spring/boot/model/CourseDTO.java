package com.learn.spring.boot.model;


public class CourseDTO {

    private String courseName;
    private String courseDesc;

    public CourseDTO() {

    }

    public CourseDTO(String courseName, String courseDesc) {
        this.courseName = courseName;
        this.courseDesc = courseDesc;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }
}
