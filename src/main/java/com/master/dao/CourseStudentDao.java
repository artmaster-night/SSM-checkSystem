package com.master.dao;

import com.master.domain.CheckList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author artmaster
 */
public interface CourseStudentDao {
    Integer countStudent(@Param("cId") Integer cId);
    List<CheckList> selectStudentByCid(@Param("cId") Integer cId);
}
