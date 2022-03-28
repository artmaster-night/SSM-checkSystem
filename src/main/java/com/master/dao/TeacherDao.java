package com.master.dao;

import com.master.domain.Teacher;
import org.apache.ibatis.annotations.Param;

/**
 * @author artmaster
 */
public interface TeacherDao {
    Integer insertTeacher(Teacher teacher);
    Teacher selectOneTeacher(@Param("account") String account);
}
