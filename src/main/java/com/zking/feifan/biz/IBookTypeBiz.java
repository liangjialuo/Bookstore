package com.zking.feifan.biz;

import com.zking.feifan.model.Booktype;
import com.zking.feifan.util.PageBean;

import java.util.List;

public interface IBookTypeBiz {

    public void insert(Booktype bookType);

    public void delete(Booktype bookType);

    public void update(Booktype bookType);

    public List<Booktype> list(Booktype bookType, PageBean pageBean);

    public Booktype load(Booktype bookType);
}
