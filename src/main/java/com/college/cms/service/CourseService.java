package com.college.cms.service;

import com.college.cms.entity.Course;

public interface CourseService {

    // Save Course
    Course saveCourse(Course course);

    // Get Course By ID
    Course getCourseById(Integer courseId);

}