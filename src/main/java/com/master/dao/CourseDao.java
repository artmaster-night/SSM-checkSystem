package com.master.dao;

import com.master.domain.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author artmaster
 */
public interface CourseDao {
    List<Course> selectCourses(@Param("tId") Integer tId);
}