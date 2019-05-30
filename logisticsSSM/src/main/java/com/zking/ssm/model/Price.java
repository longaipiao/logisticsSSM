package com.zking.ssm.model;

import java.io.Serializable;

public class Price implements Serializable {
    private String pid;

    private Integer uid;

    private String pweight;

    private String landfreight;

    private Integer servicefee;

    private Integer totalmoney;

    private String payment;

    private Integer pstate;

    private static final long serialVersionUID = 1L;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getPweight() {
        return pweight;
    }

    public void setPweight(String pweight) {
        this.pweight = pweight == null ? null : pweight.trim();
    }

    public String getLandfreight() {
        return landfreight;
    }

    public void setLandfreight(String landfreight) {
        this.landfreight = landfreight == null ? null : landfreight.trim();
    }

    public Integer getServicefee() {
        return servicefee;
    }

    public void setServicefee(Integer servicefee) {
        this.servicefee = servicefee;
    }

    public Integer getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Integer totalmoney) {
        this.totalmoney = totalmoney;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public Integer getPstate() {
        return pstate;
    }

    public void setPstate(Integer pstate) {
        this.pstate = pstate;
    }
}