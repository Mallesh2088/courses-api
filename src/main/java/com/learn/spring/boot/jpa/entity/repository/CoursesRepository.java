package com.learn.spring.boot.jpa.entity.repository;

import com.learn.spring.boot.jpa.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Integer> {

}
