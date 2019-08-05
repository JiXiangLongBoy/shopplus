package com.shopplus.controller;


import com.shopplus.pojo.OrderFail;
import com.shopplus.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @RequestMapping("showPrice")//选择是否添加订单页面，显示商品总价
    public int showPrice(List<OrderFail> orderFailList){
        int sum = orderService.getPriceSum(orderFailList);
        return sum;
    }
    @RequestMapping("addOrder")
    public void addOrder(List<OrderFail> orderFailList){
        orderService.addOrder(orderFailList);
    }
}
