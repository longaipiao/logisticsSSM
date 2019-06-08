package com.zking.ssm.model;

import com.zking.ssm.mapper.OrderMapper;
import com.zking.ssm.service.LineService;
import com.zking.ssm.service.OrderService;
import com.zking.ssm.service.impl.LineServiceImpl;
import com.zking.ssm.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class Order implements Serializable {

    @Autowired
    private LineService lineService;

    private String oid;

    private Integer uid;

    private String blno;

    private String credate;

    private String onumber;

    private Integer ostate;

    private Price price;

    private String lid;

    private String oaddress;

    private Integer thstate;


    private static final long serialVersionUID = 1L;

    public String getPid(){
        return price.getPid();
    };


    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getBlno() {
        return blno;
    }

    public void setBlno(String blno) {
        this.blno = blno == null ? null : blno.trim();
    }

    public String getCredate() {
        return credate;
    }

    public void setCredate(String credate) {
        this.credate = credate == null ? null : credate.trim();
    }

    public String getOnumber() {
        return onumber;
    }

    public void setOnumber(String onumber) {
        this.onumber = onumber == null ? null : onumber.trim();
    }

    public Integer getOstate() {
        return ostate;
    }

    public void setOstate(Integer ostate) {
        this.ostate = ostate;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid == null ? null : lid.trim();
    }

    public String getOaddress() {
        return oaddress;
    }

    public void setOaddress(String oaddress) {
        this.oaddress = oaddress == null ? null : oaddress.trim();
    }

    public Integer getThstate() {
        return thstate;
    }

    public void setThstate(Integer thstate) {
        this.thstate = thstate;
    }

    public Order(String oid, Integer uid, String blno, String credate, Integer ostate, Price price, String lid, String oaddress, Integer thstate) {
        this.oid = oid;
        this.uid = uid;
        this.blno = blno;
        this.credate = credate;
        this.ostate = ostate;
        this.price = price;
        this.lid = lid;
        this.oaddress = oaddress;
        this.thstate = thstate;
    }

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid='" + oid + '\'' +
                ", uid=" + uid +
                ", blno='" + blno + '\'' +
                ", credate='" + credate + '\'' +
                ", onumber='" + onumber + '\'' +
                ", ostate=" + ostate +
                ", price=" + price +
                ", lid='" + lid + '\'' +
                ", oaddress='" + oaddress + '\'' +
                ", thstate=" + thstate +
                '}';
    }
}
