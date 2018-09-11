package com.group5.android.dynamiclayout;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String name;
    private Integer studentId;
    private Object avatar;
    private String department;

    public User(String firstName, String lastName, Integer studentId, Object avatar, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.avatar = avatar;
        this.department = department;
        if (firstName!=null && "".equalsIgnoreCase(firstName) && lastName!=null && "".equalsIgnoreCase(lastName)){
            this.name = firstName + " " + lastName;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Object getAvatar() {
        return avatar;
    }

    public void setAvatar(Object avatar) {
        this.avatar = avatar;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", studentId=" + studentId +
                ", avatar='" + avatar + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
