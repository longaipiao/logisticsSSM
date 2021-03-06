package com.zking.ssm.controller;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.zking.ssm.model.*;
import com.zking.ssm.service.LineService;
import com.zking.ssm.service.OrderService;
import com.zking.ssm.util.IdGeneratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.beans.Transient;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private LineService lineService;
    @Autowired
    private IdGeneratorUtils idGeneratorUtils;

    @Transient
    @RequestMapping("/addOrder")
    public String addOrder(HttpServletRequest request, Model model){

        HttpSession session = request.getSession();
        String sname = request.getParameter("sname");
        String stel = request.getParameter("stel");
        String saddress = request.getParameter("saddress");
        String goodname = request.getParameter("goodname");
        String quantity = request.getParameter("quantity");
        String snote = request.getParameter("snote");
        String rname = request.getParameter("rname");
        String rtel = request.getParameter("rtel");
        String raddress = request.getParameter("raddress");
        String remail = request.getParameter("remail");
        //设置日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // new Date()为获取当前系统时间
        String time = df.format(new Date());
        //获取session对象
        Line line = (Line) session.getAttribute("line");
        Price price = (Price) session.getAttribute("price");
        User user = (User) session.getAttribute("user");
        //收货方id
        String rid = idGeneratorUtils.nextId();
        //发货方id
        String sid = idGeneratorUtils.nextId();

        Shipper shipper = new Shipper(sid,sname,stel,Integer.parseInt(quantity),saddress,goodname,snote);
//        shipper.setSdate(line.getStartdate());
        shipper.setRid(rid);
//        shipper.setPickdate(line.getEnddate());
        Receiving receiving = new Receiving(rid,rname,rtel,remail,raddress);

        //订单id
        String id = idGeneratorUtils.nextId();
        //取货id
        String blno = idGeneratorUtils.nextId();

        Order order = new Order(id,2,blno,time,0,price,"9599ad40-8504-11e9-be43-00163e084abe",sid,1);

        orderService.insertSelective(order);
        session.setAttribute("order",order);
        return "/pages/05_railway_class/4_finish_quo.jsp";
    }

    @RequestMapping("/selectOrders")
    public String selectOrders(HttpServletRequest request, Model model) {

        User user = (User)request.getSession().getAttribute("user");
        List<Order> orders = orderService.selectByUid(2);


        model.addAttribute("orders",orders);

        return"pages/08_user_center/my_booking.jsp";
    };

    @RequestMapping("/selectOrder")
    public String selectOrder(HttpServletRequest request, Model model) {

        String oid = request.getParameter("oid");
        String lid = request.getParameter("lid");
        System.out.println("oid = " + oid);
        Order order = orderService.selectByPrimaryKey(oid);

        Line line = lineService.selectByPrimaryKey(lid);

        model.addAttribute("line",line);
        model.addAttribute("order",order);

        return"pages/08_user_center/details_booking.jsp";
    };
    @RequestMapping("/selectOrder2")
    public String selectOrder2(HttpServletRequest request, Model model) {

        String ddh = request.getParameter("ddh");
        String tdh = request.getParameter("tdh");
        String qyz = request.getParameter("qyz");
        String mdz = request.getParameter("mdz");
        User user = (User) request.getSession().getAttribute("user");

        List<Order> orders = orderService.selectByCX(2, ddh, tdh, qyz, mdz);

        System.out.println(orders.size());
        for (Order order : orders) {
            System.out.println("order = " + order);
        }

        model.addAttribute("orders",orders);

        return"pages/08_user_center/my_booking.jsp";
    };
}
