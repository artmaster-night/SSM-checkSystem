package com.master.dao;

import com.master.domain.CheckList;
import com.master.domain.CheckStudent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author artmaster
 */
public interface CheckStudentDao {
    Integer countStudent(@Param("checkId") Integer checkId);
    List<CheckStudent> selectChecks(@Param("stuId") Integer stuId);

    /**
     * 获取某一条签到记录对应的所有签到的学生数据
     * @return 用CheckList来装学生
     */
    List<CheckList> selectStudentList(@Param("checkId") Integer checkId);
}
