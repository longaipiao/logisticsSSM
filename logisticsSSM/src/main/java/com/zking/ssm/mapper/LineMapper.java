package com.zking.ssm.mapper;

import com.zking.ssm.model.Line;
import org.springframework.stereotype.Service;

@Service
public interface LineMapper {
    int deleteByPrimaryKey(String lid);

    int insert(Line record);

    int insertSelective(Line record);

    Line selectByPrimaryKey(String lid);

    int updateByPrimaryKeySelective(Line record);

    int updateByPrimaryKey(Line record);
}