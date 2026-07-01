package com.college.cms.service.impl;

import com.college.cms.entity.Course;
import com.college.cms.repository.CourseRepository;
import com.college.cms.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course getCourseById(Integer courseId) {
        return courseRepository.findById(courseId).orElse(null);
    }

}