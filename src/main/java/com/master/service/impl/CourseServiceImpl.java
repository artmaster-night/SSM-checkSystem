package com.master.service.impl;

import com.master.dao.CourseDao;
import com.master.domain.Course;
import com.master.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author artmaster
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseDao courseDao;

    @Override
    public List<Course> getCourseList(Integer id) {
        if (id==null) {
            return null;
        }
        return courseDao.selectCourses(id);
    }

    @Override
    public Course getCourseByCourseName(String courseName) {

        if (courseName==null){
            return null;
        }
        return courseDao.selectOneCourse(courseName);
    }

    @Override
    public Course getCourseById(Integer id) {
        if (id==null){
            return null;
        }
        return courseDao.selectOneCourseById(id);
    }
}
