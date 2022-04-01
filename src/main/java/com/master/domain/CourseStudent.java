package com.master.domain;

/**
 * @author artmaster
 */
public class CourseStudent {
    Integer id;
    Integer cId;
    Integer sId;

    @Override
    public String toString() {
        return "CourseStudent{" +
                "id=" + id +
                ", cId=" + cId +
                ", sId=" + sId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }
}
