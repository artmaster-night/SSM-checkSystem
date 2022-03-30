package com.master.service.impl;

import com.master.dao.CheckTeacherDao;
import com.master.domain.CheckTeacher;
import com.master.service.CheckTeacherService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author artmaster
 */
@Service
public class CheckTeacherServiceImpl implements CheckTeacherService {

    @Resource
    private CheckTeacherDao checkTeacherDao;

    @Override
    public boolean addCheck(CheckTeacher checkTeacher) {
        Integer integer = checkTeacherDao.insertCheckTeacher(checkTeacher);
        return integer!=null && integer!=0;
    }
}
