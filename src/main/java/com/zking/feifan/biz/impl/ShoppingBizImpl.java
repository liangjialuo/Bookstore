package com.zking.feifan.biz.impl;

import com.zking.feifan.biz.IShoppingBiz;
import com.zking.feifan.mapper.ShoppingMapper;
import com.zking.feifan.model.Shopping;
import com.zking.feifan.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingBizImpl implements IShoppingBiz {
    @Autowired
    private ShoppingMapper shoppingMapper;

    @Override
    public void insert(Shopping shopping) {
        shoppingMapper.insertSelective(shopping);
    }

    @Override
    public void delete(Shopping shopping) {
        shoppingMapper.deleteByPrimaryKey(shopping.getShoppingid());
    }

    @Override
    public void update(Shopping shopping) {
        shoppingMapper.updateByPrimaryKey(shopping);
    }

    @Override
    public List<Shopping> list(Shopping shopping, PageBean pageBean) {
        return shoppingMapper.list(shopping);
    }

    @Override
    public Shopping load(Shopping shopping) {
        return shoppingMapper.selectByPrimaryKey(shopping.getShoppingid());
    }
}
