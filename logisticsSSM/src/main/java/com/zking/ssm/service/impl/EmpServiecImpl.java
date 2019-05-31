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
        return 0;
    }

    @Override
    public int insert(Emp record) {
        return 0;
    }

    @Override
    public int insertSelective(Emp record) {
        return 0;
    }

    @Override
    public Emp selectByPrimaryKey(String eid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Emp record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Emp record) {
        return 0;
    }

    @Override
    public Emp loginEmp(Emp emp) {
        return empMapper.loginEmp(emp);
    }

    @Override
    public List<Menu> getMens(Emp emp) {
        return null;
    }
}
