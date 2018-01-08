package com.zking.feifan.model;

public class Shopping {
    private Integer shoppingid;

    private Integer bookid;

    private Integer userid;

    private Integer number;

    public Shopping(Integer shoppingid, Integer bookid, Integer userid, Integer number) {
        this.shoppingid = shoppingid;
        this.bookid = bookid;
        this.userid = userid;
        this.number = number;
    }

    public Shopping() {
        super();
    }

    public Integer getShoppingid() {
        return shoppingid;
    }

    public void setShoppingid(Integer shoppingid) {
        this.shoppingid = shoppingid;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "shoppingid=" + shoppingid +
                ", bookid=" + bookid +
                ", userid=" + userid +
                ", number=" + number +
                '}';
    }
}