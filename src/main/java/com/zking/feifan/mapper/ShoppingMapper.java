package com.zking.feifan.mapper;

import com.zking.feifan.model.Shopping;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingMapper {
    int deleteByPrimaryKey(Integer shoppingid);

    int insert(Shopping record);

    int insertSelective(Shopping record);

    Shopping selectByPrimaryKey(Integer shoppingid);

    int updateByPrimaryKeySelective(Shopping record);

    int updateByPrimaryKey(Shopping record);

    List<Shopping> list(Shopping shopping);
}