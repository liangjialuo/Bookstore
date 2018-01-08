package com.zking.feifan.mapper;

import com.zking.feifan.model.OrderItem;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemMapper {
    int deleteByPrimaryKey(Integer orderitemid);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Integer orderitemid);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}