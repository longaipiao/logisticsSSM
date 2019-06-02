package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.EmpMapper;
import com.zking.ssm.model.Emp;
import com.zking.ssm.model.Menu;
import com.zking.ssm.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("empService")
public class EmpServiecImpl implements EmpService {

    @Autowired
    private  EmpMapper empMapper;

    @Override
    public int deleteByPrimaryKey(String eid) {
        return empMapper.deleteByPrimaryKey(eid);
    }

    @Override
    public int insert(Emp record) {
        return empMapper.insert(record);
    }

    @Override
    public int insertSelective(Emp record) {
        return empMapper.insertSelective(record);
    }

    @Override
    public Emp selectByPrimaryKey(String eid) {
        return empMapper.selectByPrimaryKey(eid);
    }

    @Override
    public int updateByPrimaryKeySelective(Emp record) {
        return empMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Emp record) {
        return empMapper.updateByPrimaryKey(record);
    }


}
