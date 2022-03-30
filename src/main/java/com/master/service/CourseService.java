package com.master.service;

import com.master.domain.Course;

import java.util.List;

/**
 * @author artmaster
 */
public interface CourseService {
    List<Course> getCourseList(Integer id);
    Course getCourseByCourseName(String courseName);
}
