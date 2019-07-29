package com.qf.pojo;

import java.util.Date;

public class Dynamic {
    private Integer uid;

    private String head;

    private String username;

    private String sex;

    private String address;

    private String professional;

    private String dynamictext;

    private String dynamicimg;

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
        this.head = head == null ? null : head.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional == null ? null : professional.trim();
    }

    public String getDynamictext() {
        return dynamictext;
    }

    public void setDynamictext(String dynamictext) {
        this.dynamictext = dynamictext == null ? null : dynamictext.trim();
    }

    public String getDynamicimg() {
        return dynamicimg;
    }

    public void setDynamicimg(String dynamicimg) {
        this.dynamicimg = dynamicimg == null ? null : dynamicimg.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}