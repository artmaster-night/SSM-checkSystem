package com.master.controller;

import com.master.domain.CheckTeacher;
import com.master.domain.Course;
import com.master.service.CheckTeacherService;
import com.master.service.CourseService;
import com.master.util.OneResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @author artmaster
 */
@Controller
@RequestMapping("/tcheck")
public class TeacherCheckController {

    private final CourseService courseService;
    private final CheckTeacherService checkTeacherService;

    public CourseService getCourseService() {
        return courseService;
    }

    public TeacherCheckController(@Qualifier("courseServiceImpl") CourseService courseService, @Qualifier("checkTeacherServiceImpl") CheckTeacherService checkTeacherService) {
        this.courseService = courseService;
        this.checkTeacherService = checkTeacherService;
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


    /**
     * 发布签到
     * @param tId 老师id
     * @param password 签到密码
     * @param cId 课程id
     * @return 响应数据
     */
    @RequestMapping("/addCheck")
    @ResponseBody
    public OneResponse addCheck(Integer tId,String password,Integer cId) {

        CheckTeacher checkTeacher = new CheckTeacher();
        checkTeacher.settId(tId);
        checkTeacher.setPassword(password);
        checkTeacher.setTime(new Date());
        checkTeacher.setcId(cId);
        System.out.println("发布签到：");
        System.out.println(checkTeacher);

        boolean isSucceed = checkTeacherService.addCheck(checkTeacher);

        OneResponse oneResponse = new OneResponse();
        oneResponse.setMessage(isSucceed?"发布成功！":"发布失败！");
        oneResponse.setFlag(isSucceed);
        return oneResponse;
    }

    @RequestMapping("/logout")
    public ModelAndView logout(HttpSession session) {
        Object attribute = session.getAttribute("teacher");
        if (attribute!=null){
            System.out.println("session删除teacher...");
            session.removeAttribute("teacher");
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
