

package com.zking.ssm.mapper;

import com.zking.ssm.model.Emp;
import com.zking.ssm.model.Menu;
import java.util.List;

public interface EmpMapper {
    int deleteByPrimaryKey(String var1);

    int insert(Emp var1);

    int insertSelective(Emp var1);

    Emp selectByPrimaryKey(String var1);

    int updateByPrimaryKeySelective(Emp var1);

    int updateByPrimaryKey(Emp var1);

    /**
     * 登录
     * @param var1
     * @return
     */
    Emp loginEmp(Emp var1);

    /**
     * 获得所有菜单
     * @param var1
     * @return
     */
    List<Menu> getMens(String var1);

    /**
     * 获得所有员工，根据地域
     * @param var1
     * @return
     */

    List<Emp> getEmps(String var1);

    /**
     * 增加员工
     * @param var1
     * @return
     */
    int addEmp(Emp var1);

    /**
     * 获得最大id
     * @return
     */
    int getMaxeid();

    /**
     * 增加角色
     * @param eid，@param rid
     * @return
     */
    int addER(Integer eid,Integer rid);
}
