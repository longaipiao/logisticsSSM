package com.zking.ssm.service;

import com.zking.ssm.model.Line;

public interface LineService {
    int deleteByPrimaryKey(String lid);

    int insert(Line record);

    int insertSelective(Line record);

    Line selectByPrimaryKey(String lid);

    int updateByPrimaryKeySelective(Line record);

    int updateByPrimaryKey(Line record);
}