package com.qf.pojo;

import java.util.Date;

public class Dynamic {
    private Integer uid;

    private String dynamictext;

    private String dynamicimg;

    private Date createtime;

    private Integer upcount;

    private Integer commentcount;

    private String username;
    private Integer sex;
    private String profession;
    private String address;
    private String userpicture;

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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserpicture() {
        return userpicture;
    }

    public void setUserpicture(String userpicture) {
        this.userpicture = userpicture;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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

    public Integer getUpcount() {
        return upcount;
    }

    public void setUpcount(Integer upcount) {
        this.upcount = upcount;
    }

    public Integer getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(Integer commentcount) {
        this.commentcount = commentcount;
    }
}