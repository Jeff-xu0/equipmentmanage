package com.paki.equip.pojo;

import java.util.Date;

public class Repair {
    private Integer repairid;

    private String reason;

    private Date repairtime;

    private Integer repairmanid;

    private Boolean result;

    private Integer equid;

    public Repair(Integer repairid, String reason, Date repairtime, Integer repairmanid, Boolean result, Integer equid) {
        this.repairid = repairid;
        this.reason = reason;
        this.repairtime = repairtime;
        this.repairmanid = repairmanid;
        this.result = result;
        this.equid = equid;
    }

    public Repair() {
        super();
    }

    public Integer getRepairid() {
        return repairid;
    }

    public void setRepairid(Integer repairid) {
        this.repairid = repairid;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getRepairtime() {
        return repairtime;
    }

    public void setRepairtime(Date repairtime) {
        this.repairtime = repairtime;
    }

    public Integer getRepairmanid() {
        return repairmanid;
    }

    public void setRepairmanid(Integer repairmanid) {
        this.repairmanid = repairmanid;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public Integer getEquid() {
        return equid;
    }

    public void setEquid(Integer equid) {
        this.equid = equid;
    }
}