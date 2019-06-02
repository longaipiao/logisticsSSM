package com.zking.ssm.service;

import com.zking.ssm.model.Emp;
import com.zking.ssm.model.Menu;

import java.util.List;


public interface EmpService {

    int deleteByPrimaryKey(String eid);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(String eid);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);



}
