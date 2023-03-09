package com.lc.cpm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lc.cpm.entity.Order;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper  extends BaseMapper<Order> {
    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}