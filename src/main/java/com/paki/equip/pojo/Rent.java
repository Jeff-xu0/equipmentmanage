package com.paki.equip.pojo;

import java.util.Date;

public class Rent {
    private Integer rentdepid;

    private Integer rentmanid;

    private String rentuse;

    private Date returntime;

    public Rent(Integer rentdepid, Integer rentmanid, String rentuse, Date returntime) {
        this.rentdepid = rentdepid;
        this.rentmanid = rentmanid;
        this.rentuse = rentuse;
        this.returntime = returntime;
    }

    public Rent() {
        super();
    }

    public Integer getRentdepid() {
        return rentdepid;
    }

    public void setRentdepid(Integer rentdepid) {
        this.rentdepid = rentdepid;
    }

    public Integer getRentmanid() {
        return rentmanid;
    }

    public void setRentmanid(Integer rentmanid) {
        this.rentmanid = rentmanid;
    }

    public String getRentuse() {
        return rentuse;
    }

    public void setRentuse(String rentuse) {
        this.rentuse = rentuse == null ? null : rentuse.trim();
    }

    public Date getReturntime() {
        return returntime;
    }

    public void setReturntime(Date returntime) {
        this.returntime = returntime;
    }
}