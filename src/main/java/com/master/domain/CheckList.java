package com.master.domain;

/**
 * @author artmaster
 */
public class CheckList {
    Integer id;
    String name;
    String ifCheck;

    @Override
    public String toString() {
        return "CheckList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ifCheck='" + ifCheck + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIfCheck() {
        return ifCheck;
    }

    public void setIfCheck(String ifCheck) {
        this.ifCheck = ifCheck;
    }
}
