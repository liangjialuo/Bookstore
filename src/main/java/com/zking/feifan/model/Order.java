package com.zking.feifan.model;

import java.util.Date;

public class Order {
    private Integer orderid;

    private Integer userid;

    private String name;

    private String phone;

    private String mailbox;

    private String address;

    private Float sumprice;

    private Integer delivery;

    private Integer state;

    private Date orderdate;

    public Order(Integer orderid, Integer userid, String name, String phone, String mailbox, String address, Float sumprice, Integer delivery, Integer state, Date orderdate) {
        this.orderid = orderid;
        this.userid = userid;
        this.name = name;
        this.phone = phone;
        this.mailbox = mailbox;
        this.address = address;
        this.sumprice = sumprice;
        this.delivery = delivery;
        this.state = state;
        this.orderdate = orderdate;
    }

    public Order() {
        super();
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getSumprice() {
        return sumprice;
    }

    public void setSumprice(Float sumprice) {
        this.sumprice = sumprice;
    }

    public Integer getDelivery() {
        return delivery;
    }

    public void setDelivery(Integer delivery) {
        this.delivery = delivery;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }
}