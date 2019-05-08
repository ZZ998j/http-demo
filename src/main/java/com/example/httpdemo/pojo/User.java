package com.example.httpdemo.pojo;

//import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

//@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userId;

    private Integer deptId;

    private String userName;

    private String password;

    private String realName;

    private String phone;

    private String mobile;

    private String email;

    private Date createTime;

    private Integer userStatus;

    private String note;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId.equals(user.userId) &&
                deptId.equals(user.deptId) &&
                userName.equals(user.userName) &&
                password.equals(user.password) &&
                realName.equals(user.realName) &&
                phone.equals(user.phone) &&
                mobile.equals(user.mobile) &&
                email.equals(user.email) &&
                createTime.equals(user.createTime) &&
                userStatus.equals(user.userStatus) &&
                note.equals(user.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, deptId, userName, password, realName, phone, mobile, email, createTime, userStatus, note);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
