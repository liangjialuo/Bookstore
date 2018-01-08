package com.zking.feifan.model;

import java.util.Date;
public class Book {
    private Integer bookid;

    private Integer booktypeid;

    private String bookname;

    private String bookauthor;

    private Float bookprice;

    private String bookconcern;

    private String booksynopsis;

    private String bookimage;

    private Integer booksales;

    private Integer bookinventory;

    private Date bookdate;

    private Integer state;

    public Book(Integer bookid, Integer booktypeid, String bookname, String bookauthor, Float bookprice, String bookconcern, String booksynopsis, String bookimage, Integer booksales, Integer bookinventory, Date bookdate, Integer state) {
        this.bookid = bookid;
        this.booktypeid = booktypeid;
        this.bookname = bookname;
        this.bookauthor = bookauthor;
        this.bookprice = bookprice;
        this.bookconcern = bookconcern;
        this.booksynopsis = booksynopsis;
        this.bookimage = bookimage;
        this.booksales = booksales;
        this.bookinventory = bookinventory;
        this.bookdate = bookdate;
        this.state = state;
    }

    public Book() {
        super();
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public Integer getBooktypeid() {
        return booktypeid;
    }

    public void setBooktypeid(Integer booktypeid) {
        this.booktypeid = booktypeid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public Float getBookprice() {
        return bookprice;
    }

    public void setBookprice(Float bookprice) {
        this.bookprice = bookprice;
    }

    public String getBookconcern() {
        return bookconcern;
    }

    public void setBookconcern(String bookconcern) {
        this.bookconcern = bookconcern;
    }

    public String getBooksynopsis() {
        return booksynopsis;
    }

    public void setBooksynopsis(String booksynopsis) {
        this.booksynopsis = booksynopsis;
    }

    public String getBookimage() {
        return bookimage;
    }

    public void setBookimage(String bookimage) {
        this.bookimage = bookimage;
    }

    public Integer getBooksales() {
        return booksales;
    }

    public void setBooksales(Integer booksales) {
        this.booksales = booksales;
    }

    public Integer getBookinventory() {
        return bookinventory;
    }

    public void setBookinventory(Integer bookinventory) {
        this.bookinventory = bookinventory;
    }

    public Date getBookdate() {
        return bookdate;
    }

    public void setBookdate(Date bookdate) {
        this.bookdate = bookdate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", booktypeid=" + booktypeid +
                ", bookname='" + bookname + '\'' +
                ", bookauthor='" + bookauthor + '\'' +
                ", bookprice=" + bookprice +
                ", bookconcern='" + bookconcern + '\'' +
                ", booksynopsis='" + booksynopsis + '\'' +
                ", bookimage='" + bookimage + '\'' +
                ", booksales=" + booksales +
                ", bookinventory=" + bookinventory +
                ", bookdate=" + bookdate +
                ", state=" + state +
                '}';
    }
}