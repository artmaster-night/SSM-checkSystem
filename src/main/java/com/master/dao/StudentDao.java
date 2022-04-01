package com.master.dao;

import com.master.domain.Student;
import org.apache.ibatis.annotations.Param;

/**
 * @author artmaster
 */
public interface StudentDao {
    Integer insertStudent(Student student);
    Student selectOneStudent(@Param("account") String account);
    Student selectOneStudentById(@Param("id") Integer id);
}
