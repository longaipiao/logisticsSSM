package com.zking.ssm.model;

import java.io.Serializable;

public class Receiving implements Serializable {
    private String rid;

    private String rname;

    private String pingyinrname;

    private String rtel;

    private String remail;

    private String raddress;

    private Integer rstate;

    private static final long serialVersionUID = 1L;

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid == null ? null : rid.trim();
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public String getPingyinrname() {
        return pingyinrname;
    }

    public void setPingyinrname(String pingyinrname) {
        this.pingyinrname = pingyinrname == null ? null : pingyinrname.trim();
    }

    public String getRtel() {
        return rtel;
    }

    public void setRtel(String rtel) {
        this.rtel = rtel == null ? null : rtel.trim();
    }

    public String getRemail() {
        return remail;
    }

    public void setRemail(String remail) {
        this.remail = remail == null ? null : remail.trim();
    }

    public String getRaddress() {
        return raddress;
    }

    public void setRaddress(String raddress) {
        this.raddress = raddress == null ? null : raddress.trim();
    }

    public Integer getRstate() {
        return rstate;
    }

    public void setRstate(Integer rstate) {
        this.rstate = rstate;
    }
}