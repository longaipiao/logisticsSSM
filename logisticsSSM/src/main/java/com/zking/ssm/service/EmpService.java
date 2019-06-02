//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.zking.ssm.service;

import com.zking.ssm.model.Emp;
import com.zking.ssm.model.Menu;
import java.util.List;

public interface EmpService {
    int deleteByPrimaryKey(String var1);

    int insert(Emp var1);

    int insertSelective(Emp var1);

    Emp selectByPrimaryKey(String var1);

    int updateByPrimaryKeySelective(Emp var1);

    int updateByPrimaryKey(Emp var1);

    Emp loginEmp(Emp var1);

    List<Menu> getMens(String var1);

    List<Emp> getEmps(String var1);

    int addEmp(Emp var1);

    int getMaxeid();

    int addER(Integer var1);
}
