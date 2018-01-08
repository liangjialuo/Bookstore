package com.zking.feifan.model;

public class OrderItem {
    private Integer orderitemid;

    private Integer orderid;

    private Integer bookid;

    private Integer number;

    public OrderItem(Integer orderitemid, Integer orderid, Integer bookid, Integer number) {
        this.orderitemid = orderitemid;
        this.orderid = orderid;
        this.bookid = bookid;
        this.number = number;
    }

    public OrderItem() {
        super();
    }

    public Integer getOrderitemid() {
        return orderitemid;
    }

    public void setOrderitemid(Integer orderitemid) {
        this.orderitemid = orderitemid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}