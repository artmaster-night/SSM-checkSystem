package com.master.service.impl;

import com.master.dao.*;
import com.master.domain.*;
import com.master.service.CheckStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author artmaster
 */
@Service
public class CheckStudentServiceImpl implements CheckStudentService {

    @Resource
    private CheckStudentDao checkStudentDao;
    @Resource
    private CheckTeacherDao checkTeacherDao;
    @Resource
    private CourseStudentDao courseStudentDao;
    @Resource
    private CourseDao courseDao;
    @Resource
    private TeacherDao teacherDao;

    @Override
    public boolean addCheckStudent(CheckStudent checkStudent) {
        if (checkStudent == null) {
            return false;
        }
        Integer rs = checkStudentDao.insertCheckStudent(checkStudent);
        return rs!=null && rs!=0;
    }

    @Override
    public String searchPassword(Integer checkId) {
        if (checkId==null){
            return null;
        }
        CheckTeacher checkTeacher = checkTeacherDao.selectCidById(checkId);

        return checkTeacher==null?null:checkTeacher.getPassword();
    }

    @Override
    public List<StudentCheckList> searchStudentCheckList(Integer sId) {
        List<CourseStudent> courseStudents = courseStudentDao.selectCourseBysId(sId);
        if (courseStudents==null){
            return null;
        }
        List<StudentCheckList> studentCheckLists = checkStudentDao.selectStudentCheckListBycId(courseStudents);
        if (studentCheckLists==null){
            return null;
        }
        for (StudentCheckList studentCheckList:studentCheckLists){
            studentCheckList.setsId(sId);
        }
        for (StudentCheckList studentCheckList:studentCheckLists){
            studentCheckList.setTeacherName(teacherDao.selectOneTeacherByTid(studentCheckList.getTeacherId()).getName());
        }
        for (StudentCheckList studentCheckList:studentCheckLists){
            studentCheckList.setCourseName(courseDao.selectOneCourseById(checkTeacherDao.selectCidById(studentCheckList.getCheckId()).getcId()).getName());
        }
        for (StudentCheckList studentCheckList:studentCheckLists){
            CheckStudent checkStudent = checkStudentDao.selectOneCheck(studentCheckList.getsId(), studentCheckList.getCheckId());
            if (checkStudent==null){
                studentCheckList.setIfCheck(false);
                studentCheckList.setEndTime(null);
            }else {
                studentCheckList.setIfCheck(true);
                studentCheckList.setEndTime(checkStudent.getCheckTime());
            }
        }
        return studentCheckLists;
    }

}
