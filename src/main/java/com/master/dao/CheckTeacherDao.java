package com.master.dao;

import com.master.domain.CheckTeacher;
import org.apache.ibatis.annotations.Param;

/**
 * @author artmaster
 */
public interface CheckTeacherDao {
    Integer insertCheckTeacher(CheckTeacher checkTeacher);
}
