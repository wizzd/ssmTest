package com.a.domain;


import java.time.LocalDateTime;

public class User {
     private String name;
    private String password;
    private String tel;
    private String address;
    private LocalDateTime createTime;
    private LocalDateTime editTime;



    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public void setEditTime(LocalDateTime editTime) {
        this.editTime = editTime;
    }



    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getTel() {
        return tel;
    }

    public String getAddress() {
        return address;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public LocalDateTime getEditTime() {
        return editTime;
    }
}
