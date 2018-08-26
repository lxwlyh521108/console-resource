package com.nanhaidetianzhi.model;

import java.io.Serializable;
import java.util.Date;

public class OrderInfo implements Serializable {
    private static final long serialVersionUID = -2825176244974157595L;

    private String userName;
    private Integer age;
    private Date createTime;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", createTime=" + createTime +
                '}';
    }
}
