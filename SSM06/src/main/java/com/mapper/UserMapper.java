package com.mapper;

import com.pojo.User;
import com.pojo.Useruname;

public interface UserMapper {
    int deleteByExample(Useruname example);

    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}