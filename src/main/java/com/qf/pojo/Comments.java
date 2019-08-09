package com.qf.pojo;

import java.util.Date;

public class Comments {
    private Integer commid;

    private String name;

    private String head;

    private String comments;

    private Date commtime;

    public Integer getCommid() {
        return commid;
    }

    public void setCommid(Integer commid) {
        this.commid = commid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head == null ? null : head.trim();
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