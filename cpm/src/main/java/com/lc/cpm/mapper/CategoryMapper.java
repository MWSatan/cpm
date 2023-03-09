package com.lc.cpm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lc.cpm.entity.Category;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryMapper extends BaseMapper<Category> {
    int deleteByPrimaryKey(Long categoryId);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Long categoryId);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}