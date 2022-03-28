package com.master.service;

import com.master.domain.Student;

/**
 * @author artmaster
 */
public interface StudentService {
    Boolean register(Student student);
    Student query(String account);
    Boolean loginCheck(Student student);
}
