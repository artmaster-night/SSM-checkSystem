package com.master.dao;

import com.master.domain.CheckTeacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author artmaster
 */
public interface CheckTeacherDao {
    Integer insertCheckTeacher(CheckTeacher checkTeacher);
    List<CheckTeacher> selectCheckTeachersById(@Param("tId") Integer id);
    Integer deleteCheck(@Param("checkId") Integer checkId);
    CheckTeacher selectCidById(@Param("id") Integer id);
}
