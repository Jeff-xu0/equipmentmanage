package com.paki.equip.pojo;

public class Depart {
    private Integer depid;

    private String depname;

    public Depart(Integer depid, String depname) {
        this.depid = depid;
        this.depname = depname;
    }

    public Depart() {
        super();
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname == null ? null : depname.trim();
    }
}