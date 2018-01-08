package com.zking.feifan.model;

public class Booktype {
    private Integer booktypeid;

    private String booktypename;

    private Integer sort;

    public Booktype(Integer booktypeid, String booktypename, Integer sort) {
        this.booktypeid = booktypeid;
        this.booktypename = booktypename;
        this.sort = sort;
    }

    public Booktype() {
        super();
    }

    public Integer getBooktypeid() {
        return booktypeid;
    }

    public void setBooktypeid(Integer booktypeid) {
        this.booktypeid = booktypeid;
    }

    public String getBooktypename() {
        return booktypename;
    }

    public void setBooktypename(String booktypename) {
        this.booktypename = booktypename;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}