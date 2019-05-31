package com.zking.ssm.service;

import com.zking.ssm.model.Emp;
import com.zking.ssm.model.Menu;

import java.util.List;

public interface EmpService {

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
