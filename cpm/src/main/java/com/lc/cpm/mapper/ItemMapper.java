package com.lc.cpm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lc.cpm.entity.Item;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemMapper extends BaseMapper<Item> {
    int deleteByPrimaryKey(Long orderItemId);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(Long orderItemId);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);
}