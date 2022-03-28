package com.master.domain;

import java.util.Objects;

/**
 * @author artmaster
 */
public class Student {
    Integer id;
    String name;
    String account;
    String password;

    @Override
    public boolean equals(Object o) {
        if(o==null){
            return false;
        }
        Student student = (Student) o;
        return student.getAccount().equals(this.account) && student.getPassword().equals(this.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, account, password);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
