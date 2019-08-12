package com.qf.pojo;

import java.util.Date;

public class Friendlist {
    private Integer fid;

    private Integer uid;

    private String username;

    private Integer sex;

    private String userpiceture;

    private Date fcreatetime;

    private Integer currentid;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getUserpiceture() {
        return userpiceture;
    }

    public void setUserpiceture(String userpiceture) {
        this.userpiceture = userpiceture == null ? null : userpiceture.trim();
    }

    public Date getFcreatetime() {
        return fcreatetime;
    }

    public void setFcreatetime(Date fcreatetime) {
        this.fcreatetime = fcreatetime;
    }

    public Integer getCurrentid() {
        return currentid;
    }

    public void setCurrentid(Integer currentid) {
        this.currentid = currentid;
    }
}