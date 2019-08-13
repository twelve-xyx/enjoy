package com.qf.pojo;

import java.util.Date;

public class Comments {
    private Integer commid;

    private String comments;

    private Date commtime;

    public Integer getCommid() {
        return commid;
    }

    public void setCommid(Integer commid) {
        this.commid = commid;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public Date getCommtime() {
        return commtime;
    }

    public void setCommtime(Date commtime) {
        this.commtime = commtime;
    }
}