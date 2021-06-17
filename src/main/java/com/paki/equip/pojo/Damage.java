package com.paki.equip.pojo;

public class Damage {
    private Integer damageid;

    private String reason;

    private Integer agreeman;

    private Integer handleman;

    private String way;

    private Integer equid;

    public Damage(Integer damageid, String reason, Integer agreeman, Integer handleman, String way, Integer equid) {
        this.damageid = damageid;
        this.reason = reason;
        this.agreeman = agreeman;
        this.handleman = handleman;
        this.way = way;
        this.equid = equid;
    }

    public Damage() {
        super();
    }

    public Integer getDamageid() {
        return damageid;
    }

    public void setDamageid(Integer damageid) {
        this.damageid = damageid;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Integer getAgreeman() {
        return agreeman;
    }

    public void setAgreeman(Integer agreeman) {
        this.agreeman = agreeman;
    }

    public Integer getHandleman() {
        return handleman;
    }

    public void setHandleman(Integer handleman) {
        this.handleman = handleman;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way == null ? null : way.trim();
    }

    public Integer getEquid() {
        return equid;
    }

    public void setEquid(Integer equid) {
        this.equid = equid;
    }
}