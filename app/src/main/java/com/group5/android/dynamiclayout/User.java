package com.group5.android.dynamiclayout;

import android.util.Log;

public class User {
    private String firstName;
    private String lastName;
    private Long studentId;
    private String avatar;
    private String department;

    public User(String firstName, String lastName, Long studentId, String avatar, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.avatar = avatar;
        this.department = department;
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

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
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
                ", studentId=" + studentId +
                ", avatar='" + avatar + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
