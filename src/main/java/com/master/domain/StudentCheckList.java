package com.master.domain;

import java.util.Date;

/**
 * @author artmaster
 */
public class StudentCheckList {
    Integer sId;
    Integer checkId;
    String teacherName;
    Integer teacherId;
    String courseName;
    Boolean ifCheck;
    Date startTime;
    Date endTime;


    @Override
    public String toString() {
        return "StudentCheckList{" +
                "sId=" + sId +
                ", checkId=" + checkId +
                ", teacherName='" + teacherName + '\'' +
                ", teacherId=" + teacherId +
                ", courseName='" + courseName + '\'' +
                ", ifCheck=" + ifCheck +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Boolean getIfCheck() {
        return ifCheck;
    }

    public void setIfCheck(Boolean ifCheck) {
        this.ifCheck = ifCheck;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
