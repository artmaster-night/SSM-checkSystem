package com.master.service;

import com.master.domain.CheckStudent;
import com.master.domain.StudentCheckList;

import java.util.List;

/**
 * @author artmaster
 */
public interface CheckStudentService {
    boolean addCheckStudent(CheckStudent checkStudent);
    String searchPassword(Integer checkId);
    List<StudentCheckList> searchStudentCheckList(Integer sId);
}
