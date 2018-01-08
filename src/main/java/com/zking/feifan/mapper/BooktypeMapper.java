package com.zking.feifan.mapper;

import com.zking.feifan.model.Booktype;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BooktypeMapper {
    int deleteByPrimaryKey(Integer booktypeid);

    int insert(Booktype record);

    int insertSelective(Booktype record);

    Booktype selectByPrimaryKey(Integer booktypeid);

    int updateByPrimaryKeySelective(Booktype record);

    int updateByPrimaryKey(Booktype record);

    List<Booktype> list(Booktype record);
}