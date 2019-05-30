package com.zking.ssm.mapper;

import com.zking.ssm.model.Paper;

public interface PaperMapper {
    int deleteByPrimaryKey(String pid);

    int insert(Paper record);

    int insertSelective(Paper record);

    Paper selectByPrimaryKey(String pid);

    int updateByPrimaryKeySelective(Paper record);

    int updateByPrimaryKey(Paper record);
}