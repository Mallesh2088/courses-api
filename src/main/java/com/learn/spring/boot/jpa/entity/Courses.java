package com.learn.spring.boot.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "COURSES")
public class Courses {

    public Courses(String courseName, String courseDesc) {
        this.courseName = courseName;
        this.courseDesc = courseDesc;
    }

    public Courses() {
    }

    @Id
    @GeneratedValue
    @Column(name = "COURSE_ID")
    private int courseId;

    @Column(name = "COURSE_NAME")
    private String courseName;

    @Column(name = "COURSE_DESC")
    private String courseDesc;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
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
