package com.master.domain;

/**
 * @author artmaster
 */
public class Teacher {
    Integer id;
    String name;
    String account;
    String password;

    @Override
    public boolean equals(Object o) {
        if(o==null){
            return false;
        }
        Teacher teacher = (Teacher) o;
        return teacher.getAccount().equals(this.account) && teacher.getPassword().equals(this.password);
    }

    @Override
    public String toString() {
        return "Teacher{" +
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
