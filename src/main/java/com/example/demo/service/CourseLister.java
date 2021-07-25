package com.example.demo.service;

import com.example.demo.dao.CourseRepository;
import com.example.demo.domain.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CourseLister {
    private final CourseRepository repository;

    @Autowired
    public CourseLister(CourseRepository repository) {
        this.repository = repository;
    }

    public List<Course> coursesByAuthor(String name) {
        List<Course> allCourses = repository.findAll();
        return Collections.emptyList();//allCourses.stream().filter(course -> course.get().equals(name)).collect(Collectors.toList());
    }
}
