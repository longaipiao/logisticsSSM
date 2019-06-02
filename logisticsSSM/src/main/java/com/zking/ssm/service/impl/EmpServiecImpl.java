//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.EmpMapper;
import com.zking.ssm.model.Emp;
import com.zking.ssm.model.Menu;
import com.zking.ssm.service.EmpService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("empService")
public class EmpServiecImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    public EmpServiecImpl() {
    }

    @Override
    public int deleteByPrimaryKey(String var1) {
        return empMapper.deleteByPrimaryKey(var1);
    }

    @Override
    public int insert(Emp var1) {
        return 0;
    }

    @Override
    public int insertSelective(Emp var1) {
        return 0;
    }

    @Override
    public Emp selectByPrimaryKey(String var1) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Emp var1) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Emp var1) {
        return 0;
    }

    public Emp loginEmp(Emp emp) {
        return this.empMapper.loginEmp(emp);
    }

    public List<Menu> getMens(String eid) {
        return this.empMapper.getMens(eid);
    }

    public List<Menu> getMenus2(Emp emp) {
        List<Menu> results = new ArrayList();
        List<Menu> mens = this.empMapper.getMens(emp.getEid());
        if (mens != null && mens.size() > 0) {
            for(int i = 0; i < mens.size(); ++i) {
                if (((Menu)mens.get(i)).getPid().equals("0")) {
                    Menu menu = new Menu();
                    menu.setMid(((Menu)mens.get(i)).getMid());
                    menu.setMname(((Menu)mens.get(i)).getMname());
                    menu.setIcons(((Menu)mens.get(i)).getIcons());
                    menu.setHref(((Menu)mens.get(i)).getHref());
                    menu.setPerms(((Menu)mens.get(i)).getPerms());
                    menu.setMtype(((Menu)mens.get(i)).getMtype());
                    menu.setOrdernum(((Menu)mens.get(i)).getOrdernum());
                    menu.setSpread(((Menu)mens.get(i)).getSpread());
                    menu.setPid(((Menu)mens.get(i)).getPid());
                    List<Menu> menus2 = new ArrayList();

                    for(int j = 0; j < mens.size(); ++j) {
                        if (((Menu)mens.get(j)).getPid().equals(((Menu)mens.get(i)).getMid())) {
                            Menu menu2 = new Menu();
                            menu2.setMid(((Menu)mens.get(j)).getMid());
                            menu2.setMname(((Menu)mens.get(j)).getMname());
                            menu2.setIcons(((Menu)mens.get(j)).getIcons());
                            menu2.setHref(((Menu)mens.get(j)).getHref());
                            menu2.setPerms(((Menu)mens.get(j)).getPerms());
                            menu2.setMtype(((Menu)mens.get(j)).getMtype());
                            menu2.setOrdernum(((Menu)mens.get(j)).getOrdernum());
                            menu2.setSpread(((Menu)mens.get(j)).getSpread());
                            menu2.setPid(((Menu)mens.get(j)).getPid());
                            menus2.add(menu2);
                        }
                    }

                    menu.setMenuList(menus2);
                    results.add(menu);
                }
            }
        }

        return results;
    }

    public List<Emp> getEmps(String eaddress) {
        return this.empMapper.getEmps(eaddress);
    }

    public int addEmp(Emp emp) {
        return this.empMapper.addEmp(emp);
    }

    public int getMaxeid() {
        return this.empMapper.getMaxeid();
    }



    @Override
    public int addER(Integer eid,Integer rid) {
        return empMapper.addER(eid, rid);
    }
}
