package com.master.service;

import com.master.domain.CheckList;
import com.master.domain.CheckTeacher;

import java.util.List;

/**
 * @author artmaster
 */


public interface CheckTeacherService {
    boolean addCheck(CheckTeacher checkTeacher);
    List<CheckTeacher> searchCheckByTid(Integer tId);
    Integer getCheckNumber(Integer checkId);
    Integer getAllNumber(Integer cId);
    boolean deleteCheck(Integer checkId);
    List<CheckList> getCheckList(Integer cId);
}
