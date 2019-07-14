package com.learn.spring.boot.mapper;

import com.learn.spring.boot.jpa.entity.Courses;
import com.learn.spring.boot.model.CourseDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {
    List<CourseDTO> toCourseDTOs(List<Courses> courses);
}
