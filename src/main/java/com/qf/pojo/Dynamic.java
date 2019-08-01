package com.qf.pojo;

import java.util.Date;

public class Dynamic {
    private Integer uid;
    private String head;
    private String username;
    private Integer sex;
    private String address;
    private String professional;
    private String dynamicText;
    private String dynamicImg;
    private Date createtime;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public String getDynamicText() {
        return dynamicText;
    }

    public void setDynamicText(String dynamicText) {
        this.dynamicText = dynamicText;
    }

    public String getDynamicImg() {
        return dynamicImg;
    }

    public void setDynamicImg(String dynamicImg) {
        this.dynamicImg = dynamicImg;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
