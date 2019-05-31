package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.EmpMapper;
import com.zking.ssm.model.Emp;
import com.zking.ssm.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("empService")
public class EmpServiecImpl implements EmpService {

    @Autowired
    private  EmpMapper empMapper;

    @Override
    public Emp loginEmp(Emp emp) {
        return empMapper.loginEmp(emp);
    }
}
