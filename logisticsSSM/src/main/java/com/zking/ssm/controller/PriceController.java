package com.zking.ssm.controller;

import com.zking.ssm.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class PriceController {

    @Autowired
    private PriceService priceService;

    @RequestMapping("/addPrice")
    public String addPrice(){
        System.out.println("aaa");
        return "2_quotation.jsp";
    }

}
