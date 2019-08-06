package com.shopplus.controller;


import com.shopplus.pojo.OrderFail;
import com.shopplus.pojo.User;
import com.shopplus.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("showPrice")//选择是否确认订单页面，显示商品总价
    public int showPrice(int userId, Integer[] goodsId,Integer[] goodsNum){
        int sum = orderService.getPriceSum(userId,goodsId,goodsNum);
        return sum;
    }
    @RequestMapping("addOrder")//提交订单
    public void addOrder(int userId, Integer[] goodsId,Integer[] goodsNum){
        orderService.addOrder(userId,goodsId,goodsNum);
    }
    @RequestMapping("showOrder")//展示订单信息
    public List<OrderFail> showOrderById(int userId){
        List<OrderFail> orderFailList = orderService.showOrderById(userId);
        return orderFailList;
    }
    @RequestMapping("delOrderByOrderId")
    public void delOrderByOrderNum(int orderId) {
        orderService.delOrderByOrderNum(orderId);
    }
}
