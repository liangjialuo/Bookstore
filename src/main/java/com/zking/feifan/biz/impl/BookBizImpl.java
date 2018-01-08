package com.zking.feifan.biz.impl;

import com.zking.feifan.biz.IBookBiz;
import com.zking.feifan.mapper.BookMapper;
import com.zking.feifan.model.Book;
import com.zking.feifan.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookBizImpl implements IBookBiz {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public void insert(Book book) {
        bookMapper.insertSelective(book);
    }

    @Override
    public void delete(Book book) {

    }

    @Override
    public void update(Book book) {
        bookMapper.updateByPrimaryKeySelective(book);
    }

    @Override
    public List<Book> list(Book book, PageBean pageBean) {
        return bookMapper.list(book);
    }

    @Override
    public Book load(Book book) {
        return null;
    }
}
