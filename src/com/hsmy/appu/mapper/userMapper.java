package com.hsmy.appu.mapper;

import com.hsmy.appu.bean.user;

public interface userMapper {
    int insert(user record);

    int insertSelective(user record);
}