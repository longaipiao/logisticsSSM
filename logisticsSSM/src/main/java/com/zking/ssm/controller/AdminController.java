package com.zking.ssm.controller;

import com.zking.ssm.model.Emp;
import com.zking.ssm.model.Menu;
import com.zking.ssm.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AdminController {

    @Autowired
    private EmpService empService;

   //用户登录
    @RequestMapping("/admin/login")
    public String login(Emp emp,HttpSession session){
        System.out.println("====================");
        System.out.println(emp.getEname());
        Emp emp1 = empService.loginEmp(emp);
        session.setAttribute("emp",emp1);
        System.out.println(emp1);
        return "redirect:/admin/index.jsp";
    }


    /*@RequestMapping(value = "/admin/login")
    public String login(Emp emp) throws Exception{
        System.out.println("哈哈哈哈");
        //获得主体
        Subject subject = SecurityUtils.getSubject();
        //将用户信息进行用户名/密码认证机制
        UsernamePasswordToken token = new UsernamePasswordToken(emp.getEname(),emp.getEpassword());
        //开始进行认证
        try {
            subject.login(token);
            Emp principal=(Emp)subject.getPrincipal();
            System.out.println("授权对象========="+principal);//拿到的是认证和授权的对象
        }catch (UnknownAccountException e){
            System.out.println("账户异常");
            return "/admin/login.jsp";
        }
        return "/admin/index.jsp";
    }*/



    @RequestMapping(value = "/admin/getMenus")
    @ResponseBody
    public List<Menu> getMenus(HttpSession session) {
        Emp emp =(Emp) session.getAttribute("emp");
        List<Menu> mens = empService.getMenus2(emp);
        return mens;
    }

    /**
     * 获取所有的员工
     * @return
     */
    @RequestMapping("/admin/getEmps")
    @ResponseBody
    public Map<String,Object> getEmps(HttpSession session,Emp emp){
        System.out.println("接收的参数:======"+emp);
        Emp emp1 =(Emp) session.getAttribute("emp");
        List<Emp> emps = empService.getEmps(emp1.getEaddress());
        Map<String,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("msg", "");
        map.put("count",emps.size());
        map.put("data",emps);
        return  map;
    }

    @RequestMapping("/admin/addemp")
    @ResponseBody
    public int addEmp(Emp emp,HttpServletRequest request){
        String role = request.getParameter("role");
        //开始找到最大的eid
        int maxeid = empService.getMaxeid();
        //开始调用增加方法
        if(maxeid>0) {
//            emp.setElevel();
            int i = empService.addEmp(emp);
            if(i>0){
                //开始增加角色
                int i1 = empService.addER(Integer.parseInt(emp.getEid()),Integer.parseInt(role));
                return i1;
            }
        }
        return maxeid;
    }


}
