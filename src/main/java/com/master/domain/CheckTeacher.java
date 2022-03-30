package com.master.domain;

import java.util.Date;

/**
 * @author artmaster
 */
public class CheckTeacher {
    Integer id;
    Integer tId;
    Date time;
    String password;
    Integer cId;

    @Override
    public String toString() {
        return "CheckTeacher{" +
                "id=" + id +
                ", tId=" + tId +
                ", time=" + time +
                ", password='" + password + '\'' +
                ", cId=" + cId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }
}
