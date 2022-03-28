package com.master.controller;

import com.master.domain.Teacher;
import com.master.service.TeacherService;
import com.master.util.OneResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

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
    public OneResponse register(String account,String password) {
        Teacher teacher = new Teacher();
        teacher.setAccount(account);
        teacher.setPassword(password);
        Boolean isSucceed = teacherService.register(teacher);
        OneResponse oneResponse = new OneResponse();
        oneResponse.setFlag(isSucceed);
        oneResponse.setMessage(isSucceed?"注册成功！":"注册失败！");
        return oneResponse;
    }

    @RequestMapping("/login")
    @ResponseBody
    public OneResponse login(String account,String password) {
        Teacher teacher = new Teacher();
        teacher.setAccount(account);
        teacher.setPassword(password);
        Boolean isSucceed = teacherService.loginCheck(teacher);
        OneResponse oneResponse = new OneResponse();
        oneResponse.setFlag(isSucceed);
        oneResponse.setMessage(isSucceed?"登录成功":"密码错误或用户不存在");
        return oneResponse;
    }
}
