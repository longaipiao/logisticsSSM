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

    /**
     * 后台登录方法
     * @param emp
     * @return
     */
    Emp loginEmp(Emp emp);

    /**
     * 根据用户id获取权限以及菜单
     * @param emp
     * @return
     */
    List<Menu> getMens(Emp emp);

}
