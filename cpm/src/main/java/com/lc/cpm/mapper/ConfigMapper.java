package com.lc.cpm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lc.cpm.entity.Config;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigMapper extends BaseMapper<Config> {
    int deleteByPrimaryKey(Long configId);

    int insert(Config record);

    int insertSelective(Config record);

    Config selectByPrimaryKey(Long configId);

    int updateByPrimaryKeySelective(Config record);

    int updateByPrimaryKey(Config record);
}