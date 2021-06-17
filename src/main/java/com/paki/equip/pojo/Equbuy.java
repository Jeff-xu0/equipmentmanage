package com.paki.equip.pojo;

import java.util.Date;

public class Equbuy {
    private Integer equid;

    private String euqname;

    private String equkind;

    private String type;

    private Date buytime;

    private Integer departmentid;

    private String position;

    private Integer amount;

    public Equbuy(Integer equid, String euqname, String equkind, String type, Date buytime, Integer departmentid, String position, Integer amount) {
        this.equid = equid;
        this.euqname = euqname;
        this.equkind = equkind;
        this.type = type;
        this.buytime = buytime;
        this.departmentid = departmentid;
        this.position = position;
        this.amount = amount;
    }

    public Equbuy() {
        super();
    }

    public Integer getEquid() {
        return equid;
    }

    public void setEquid(Integer equid) {
        this.equid = equid;
    }

    public String getEuqname() {
        return euqname;
    }

    public void setEuqname(String euqname) {
        this.euqname = euqname == null ? null : euqname.trim();
    }

    public String getEqukind() {
        return equkind;
    }

    public void setEqukind(String equkind) {
        this.equkind = equkind == null ? null : equkind.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getBuytime() {
        return buytime;
    }

    public void setBuytime(Date buytime) {
        this.buytime = buytime;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}