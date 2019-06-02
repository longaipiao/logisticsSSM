package com.zking.ssm.controller;

import com.zking.ssm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/addOrder")
    public String addPrice(HttpServletRequest request, Model model){

        HttpSession session = request.getSession();
//        line

        return "/pages/05_railway_class/4_finish_quo.jsp";
    }

}
