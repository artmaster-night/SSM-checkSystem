package com.master.domain;

import java.util.Date;

/**
 * @author artmaster
 */
public class CheckStudent {
        Integer id;
        Integer sId;
        Integer checkId;
        Date checkTime;

    @Override
    public String toString() {
        return "CheckStudent{" +
                "id=" + id +
                ", sId=" + sId +
                ", checkId=" + checkId +
                ", checkTime=" + checkTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }
}

