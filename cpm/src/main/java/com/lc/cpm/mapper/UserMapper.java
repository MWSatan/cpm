package com.lc.cpm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lc.cpm.entity.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}