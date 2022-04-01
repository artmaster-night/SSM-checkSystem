package com.master.domain;

import java.util.Date;

/**
 * @author artmaster
 */
public class Check {
    String courseName;
    Date checkOpenTime;
    Integer checkNumber;
    Integer allNumber;
    Integer checkId;

    @Override
    public String toString() {
        return "Check{" +
                "courseName='" + courseName + '\'' +
                ", checkOpenTime=" + checkOpenTime +
                ", checkNumber=" + checkNumber +
                ", allNumber=" + allNumber +
                ", checkId=" + checkId +
                '}';
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

    public Date getCheckOpenTime() {
        return checkOpenTime;
    }

    public void setCheckOpenTime(Date checkOpenTime) {
        this.checkOpenTime = checkOpenTime;
    }

    public Integer getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(Integer checkNumber) {
        this.checkNumber = checkNumber;
    }

    public Integer getAllNumber() {
        return allNumber;
    }

    public void setAllNumber(Integer allNumber) {
        this.allNumber = allNumber;
    }
}
