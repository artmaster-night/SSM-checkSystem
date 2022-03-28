package com.master.service.impl;

import com.master.dao.StudentDao;
import com.master.domain.Student;
import com.master.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author artmaster
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public Boolean register(Student student) {
        Student stu = studentDao.selectOneStudent(student.getAccount());
        Boolean flag=false;
        if (stu==null){
            Integer integer = studentDao.insertStudent(student);
            flag=integer!=null && integer!=0;
        }
        return flag;
    }

    @Override
    public Boolean loginCheck(Student student) {
        Student stu = studentDao.selectOneStudent(student.getAccount());
        Boolean flag=false;
        if (stu!=null){
            flag=stu.getPassword().equals(student.getPassword());
        }
        return flag;
    }

    @Override
    public Student query(String account) {
        return studentDao.selectOneStudent(account);
    }
}
