package com.zking.feifan.biz.impl;

import com.zking.feifan.biz.IBookTypeBiz;
import com.zking.feifan.model.Booktype;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class BookTypeBizImplTest {

    @Autowired
    private IBookTypeBiz iBookTypeBiz;

    @Test
    public void insert() throws Exception {
        String[] str = new String[]{"文艺", "小说", "青春", "童书", "励志/成功", "生活", "人文社科", "经管", "科技", "教育", "工具书", "期刊"};
        Booktype booktype;
        for (int i = 0; i < str.length; i++) {
            booktype = new Booktype();
            booktype.setBooktypename(str[i]);
            iBookTypeBiz.insert(booktype);
        }
    }

    @Test
    public void delete() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void list() throws Exception {
    }

    @Test
    public void load() throws Exception {
    }

}