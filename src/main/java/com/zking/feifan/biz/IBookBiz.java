package com.zking.feifan.biz;

import com.zking.feifan.model.Book;
import com.zking.feifan.util.PageBean;

import java.util.List;

public interface IBookBiz {

    public void insert(Book book);

    public void delete(Book book);

    public void update(Book book);

    public List<Book> list(Book book, PageBean pageBean);

    public Book load(Book book);
}
