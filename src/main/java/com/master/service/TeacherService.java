package com.master.service;

import com.master.domain.Teacher;

/**
 * @author artmaster
 */
public interface TeacherService {
    Boolean register(Teacher teacher);
    Teacher query(String account);
    Boolean loginCheck(Teacher teacher);
}
