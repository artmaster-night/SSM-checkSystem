package com.master.service.impl;

import com.master.dao.TeacherDao;
import com.master.domain.Teacher;
import com.master.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author artmaster
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherDao teacherDao;

    @Override
    public Boolean register(Teacher teacher) {
        Teacher teacherResult = teacherDao.selectOneTeacher(teacher.getAccount());
        Boolean flag=false;
        if (teacherResult==null){
            Integer integer = teacherDao.insertTeacher(teacher);
            flag=integer!=null && integer!=0;
        }
        return flag;
    }


    @Override
    public Boolean loginCheck(Teacher teacher) {
        Teacher teacherResult = teacherDao.selectOneTeacher(teacher.getAccount());
        Boolean flag=false;
        if (teacherResult!=null){
            flag=teacherResult.getPassword().equals(teacher.getPassword());
        }
        return flag;
    }

    @Override
    public Teacher query(String account) {
        return teacherDao.selectOneTeacher(account);
    }

}
