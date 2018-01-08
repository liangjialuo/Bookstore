package com.zking.feifan.biz;

import com.zking.feifan.model.Booktype;
import com.zking.feifan.model.Shopping;
import com.zking.feifan.util.PageBean;

import java.util.List;

public interface IShoppingBiz {

    void insert(Shopping shopping);

    void delete(Shopping shopping);

    void update(Shopping shopping);

    List<Shopping> list(Shopping shopping, PageBean pageBean);

    Shopping load(Shopping shopping);
}
