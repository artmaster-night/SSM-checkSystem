package com.master.controller;

import com.master.domain.Course;
import com.master.service.CourseService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author artmaster
 */
@Controller
@RequestMapping("/tcheck")
public class TeacherCheckController {

    private final CourseService courseService;

    public CourseService getCourseService() {
        return courseService;
    }

    public TeacherCheckController(@Qualifier("courseServiceImpl") CourseService courseService) {
        this.courseService = courseService;
    }

    @RequestMapping("/updateCourseList")
    @ResponseBody
    public List<Course> getCourseList(Integer tId) {
        System.out.println("响应课程列表...");
        List<Course> courseList =courseService.getCourseList(tId);
        for (Course course:courseList){
            System.out.println(course);
        }
        return courseList;
    }

}
