package com.hsmy.app.mapper;

import com.hsmy.app.bean.team;

public interface teamMapper {
    int insert(team record);

    int insertSelective(team record);
}