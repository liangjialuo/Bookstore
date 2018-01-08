package com.zking.feifan.biz.impl;

import com.zking.feifan.biz.IBookTypeBiz;
import com.zking.feifan.mapper.BooktypeMapper;
import com.zking.feifan.model.Booktype;
import com.zking.feifan.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookTypeBizImpl implements IBookTypeBiz {

    @Autowired
    private BooktypeMapper booktypeMapper;

    @Override
    public void insert(Booktype bookType) {
        booktypeMapper.insertSelective(bookType);
    }

    @Override
    public void delete(Booktype bookType) {
        booktypeMapper.deleteByPrimaryKey(bookType.getBooktypeid());
    }

    @Override
    public void update(Booktype bookType) {
        booktypeMapper.updateByPrimaryKey(bookType);
    }

    @Override
    public List<Booktype> list(Booktype bookType, PageBean pageBean) {
        return booktypeMapper.list(bookType);
    }

    @Override
    public Booktype load(Booktype bookType) {
        return booktypeMapper.selectByPrimaryKey(bookType.getBooktypeid());
    }


}
