package com.paki.equip.pojo;

import java.util.Date;

public class Useraccount {
    private Integer userid;

    private String username;

    private String password;

    private String phonenum;

    private String email;

    private Integer departid;

    private Integer equid;

    private Date prebacktime;

    public Useraccount(Integer userid, String username, String password, String phonenum, String email, Integer departid, Integer equid, Date prebacktime) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.phonenum = phonenum;
        this.email = email;
        this.departid = departid;
        this.equid = equid;
        this.prebacktime = prebacktime;
    }

    public Useraccount() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getDepartid() {
        return departid;
    }

    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    public Integer getEquid() {
        return equid;
    }

    public void setEquid(Integer equid) {
        this.equid = equid;
    }

    public Date getPrebacktime() {
        return prebacktime;
    }

    public void setPrebacktime(Date prebacktime) {
        this.prebacktime = prebacktime;
    }
}