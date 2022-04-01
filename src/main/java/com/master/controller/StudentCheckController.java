package com.master.controller;

import com.master.domain.CheckStudent;
import com.master.domain.StudentCheckList;
import com.master.service.CheckStudentService;
import com.master.util.OneResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @author artmaster
 */

@Controller
@RequestMapping("/scheck")
public class StudentCheckController {

    @Resource
    private CheckStudentService checkStudentService;

    @RequestMapping("/logout")
    public ModelAndView logout(HttpSession session) {
        Object student = session.getAttribute("student");
        if (student!=null){
            System.out.println("session删除学生："+student);
            session.removeAttribute("student");
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/addCheck")
    @ResponseBody
    public OneResponse addCheck(Integer sId,Integer checkId,String password){

        String queryPassword = checkStudentService.searchPassword(checkId);
        boolean match=password.equals(queryPassword);

        CheckStudent checkStudent = new CheckStudent();
        checkStudent.setsId(sId);
        checkStudent.setCheckId(checkId);
        checkStudent.setCheckTime(new Date());
        boolean result = checkStudentService.addCheckStudent(checkStudent);
        OneResponse oneResponse = new OneResponse();
        oneResponse.setFlag(result&&match);
        oneResponse.setMessage(result&&match?"签到成功！":"签到失败！");
        return oneResponse;
    }

    @RequestMapping("/refreshCheckList")
    @ResponseBody
    public List<StudentCheckList> refreshCheckList(Integer sId) {
        List<StudentCheckList> studentCheckLists = checkStudentService.searchStudentCheckList(sId);
        for (StudentCheckList studentCheckList:studentCheckLists){
            System.out.println(studentCheckList);
        }
        return  studentCheckLists;
    }
}
