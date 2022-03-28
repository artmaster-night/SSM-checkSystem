package com.master.controller;

import com.master.domain.Student;
import com.master.service.StudentService;
import com.master.util.OneResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author artmaster
 */

@Controller
@RequestMapping("/stu")
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping("/register")
    @ResponseBody
    public OneResponse register(Student student) {
        Boolean isSucceed = studentService.register(student);
        OneResponse oneResponse = new OneResponse();
        oneResponse.setMessage(isSucceed?"注册成功！":"注册失败！");
        oneResponse.setFlag(isSucceed);
        return oneResponse;
    }

    @RequestMapping("/login")
    @ResponseBody
    public OneResponse login(Student student) {
        Boolean isSucceed = studentService.loginCheck(student);
        OneResponse oneResponse = new OneResponse();
        oneResponse.setMessage(isSucceed?"登录成功！":"用户不存在或密码错误！");
        oneResponse.setFlag(isSucceed);
        return oneResponse;
    }
}
