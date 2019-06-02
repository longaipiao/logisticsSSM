package com.zking.ssm.mapper;

import com.zking.ssm.model.Emp;
import org.springframework.stereotype.Service;

@Service
public interface EmpMapper {
    int deleteByPrimaryKey(String eid);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(String eid);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);




}