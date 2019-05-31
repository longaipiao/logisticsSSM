package com.zking.ssm.controller;

import com.zking.ssm.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class PriceController {

    @Autowired
    private PriceService priceService;

    @RequestMapping("/addPrice")
    public String addPrice(HttpServletRequest request, Model model){
        int money = 0;
        int fuwu = 0;
        String s = request.getParameter("s");
        String z = request.getParameter("z");
        String zl = request.getParameter("zl");
        if(s.equals("true")){
            money+=50;
            fuwu+=50;
        }
        if(z.equals("true")){
            money+=50;
            fuwu+=50;
        }
        if(zl.equals("")){
            money+=250;
        }

        return "/pages/05_railway_class/2_quotation.jsp";
    }

}
