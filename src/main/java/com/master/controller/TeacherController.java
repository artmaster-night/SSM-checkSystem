package com.master.controller;

import com.master.domain.Teacher;
import com.master.service.TeacherService;
import com.master.util.OneResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author artmaster
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Resource
    private TeacherService teacherService;

    @RequestMapping("/register")
    @ResponseBody
    public OneResponse register(Teacher teacher) {
        Boolean isSucceed = teacherService.register(teacher);
        OneResponse oneResponse = new OneResponse();
        oneResponse.setFlag(isSucceed);
        oneResponse.setMessage(isSucceed?"注册成功！":"注册失败！");
        System.out.println(teacher.getAccount() + oneResponse.getMessage());
        return oneResponse;
    }

    @RequestMapping("/login")
    @ResponseBody
    public OneResponse login(Teacher teacher, HttpSession httpSession) {
        Boolean isSucceed = teacherService.loginCheck(teacher);
        OneResponse oneResponse = new OneResponse();
        oneResponse.setFlag(isSucceed);
        oneResponse.setMessage(isSucceed?"登录成功":"密码错误或用户不存在");
        System.out.println(teacher.getAccount() + oneResponse.getMessage());
        if(isSucceed){
            Teacher teacherQuery = teacherService.query(teacher.getAccount());
            System.out.println("session注入老师:" + teacherQuery);
            httpSession.setAttribute("teacher",teacherQuery);
        }
        return oneResponse;
    }
}
