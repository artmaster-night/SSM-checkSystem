package com.master.service.impl;

import com.master.dao.CheckStudentDao;
import com.master.dao.CheckTeacherDao;
import com.master.dao.CourseStudentDao;
import com.master.dao.StudentDao;
import com.master.domain.CheckList;
import com.master.domain.CheckTeacher;
import com.master.service.CheckTeacherService;
import com.master.util.Compare;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author artmaster
 */
@Service
public class CheckTeacherServiceImpl implements CheckTeacherService {

    @Resource
    private CheckTeacherDao checkTeacherDao;
    @Resource
    private CourseStudentDao courseStudentDao;
    @Resource
    private CheckStudentDao checkStudentDao;
    @Resource
    private StudentDao studentDao;
    @Resource
    private Compare compare;

    @Override
    public boolean addCheck(CheckTeacher checkTeacher) {
        Integer integer = checkTeacherDao.insertCheckTeacher(checkTeacher);
        return integer!=null && integer!=0;
    }

    @Override
    public List<CheckTeacher> searchCheckByTid(Integer tId) {
        if (tId==null){
            return null;
        }
        return checkTeacherDao.selectCheckTeachersById(tId);
    }

    @Override
    public Integer getCheckNumber(Integer checkId) {
        if (checkId==null){
            return null;
        }
        return checkStudentDao.countStudent(checkId);
    }

    @Override
    public Integer getAllNumber(Integer cId) {
        if (cId==null){
            return null;
        }
        return courseStudentDao.countStudent(cId);
    }

    @Override
    public boolean deleteCheck(Integer checkId) {
        if (checkId==null){
            return false;
        }
        Integer integer = checkTeacherDao.deleteCheck(checkId);
        return integer!=null && integer!=0;
    }

    @Override
    public List<CheckList> getCheckList(Integer cId) {
        if (cId==null){
            return null;
        }
        List<CheckList> checkLists = checkStudentDao.selectStudentList(cId);
        CheckTeacher checkTeacher = checkTeacherDao.selectCidById(cId);
        if (checkTeacher==null){
            return null;
        }
        List<CheckList> allCheckLists = courseStudentDao.selectStudentByCid(checkTeacher.getcId());
        if (allCheckLists!=null){
            for (CheckList checkList:allCheckLists){
                checkList.setName(studentDao.selectOneStudentById(checkList.getId()).getName());
                if(compare.isIn(checkList.getId(),checkLists)){
                    checkList.setIfCheck("已签到");
                }else {
                    checkList.setIfCheck("未签到");
                }
            }
        }
        return allCheckLists;
    }

}
