package com.zking.ssm.controller;

import com.zking.ssm.model.User;
import com.zking.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @email 2417902780@qq.com
 * @author:阿飘
 * @company 飘飘公司
 * @create 2019-06-02 19:03
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    private User user1 = new User();


    @RequestMapping(value = "/UserLogin")
    public String userlogin(User user){
        System.out.println("进入登录方法了=====");
        user1.setUname(user.getUname());
        user1.setUpassword(user.getUpassword());
        System.out.println("用户："+user1.getUname()+"  ===  "+user1.getUpassword());
        boolean b = userService.UserLogin(user1);
        if(b){
            return "redirect:index.jsp";
        }else{
            return "redirect:pages/01_register/register_1.jsp";
        }
    }
}
