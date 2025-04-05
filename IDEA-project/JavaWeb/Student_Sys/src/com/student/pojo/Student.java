package com.student.pojo;

import java.util.Date;

/**
 * @author: IT_Koma
 * @name:Student_Sys
 * @description: Student实体类
 * @create: 2021-04-23 00:04
 **/
public class Student {

    private int id;
    private String name;
    private String sex;
    private String level;
    private String phone;
    private String tjr;
    private Date startTime;

    public Student() {
    }

    public Student(int id, String name, String sex, String level, String phone, String tjr, Date startTime) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.level = level;
        this.phone = phone;
        this.tjr = tjr;
        this.startTime = startTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTjr() {
        return tjr;
    }

    public void setTjr(String tjr) {
        this.tjr = tjr;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", level='" + level + '\'' +
                ", phone='" + phone + '\'' +
                ", tjr='" + tjr + '\'' +
                ", startTime=" + startTime +
                '}';
    }
}
