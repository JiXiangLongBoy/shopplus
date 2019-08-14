package com.shopplus.controller;



import com.shopplus.pojo.Address;
import com.shopplus.pojo.Goods;
import com.shopplus.pojo.User;
import com.shopplus.service.ShoppingService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shopping")
public class ShoppingController {

        @Autowired
        ShoppingService shoppingService;


        @ApiOperation("购物车数据")
        @RequestMapping("/showgoods")
        public List<Goods> showShopping(Integer[] ids, Model model){

            System.out.println("++++++++++++++++++");
            List<Goods> goodslist = shoppingService.selectAllShoppings(ids);

            model.addAttribute("goodslist",goodslist);
            System.out.println(goodslist);
            return goodslist;
        }


        @ApiOperation("获取订单地址")
        @RequestMapping("/showaddress")
        public List<Address> showaddress(int userId){

           List<Address> addressList = shoppingService.selectAddressByUser(userId);

           return addressList;
        }


        @ApiOperation("修改订单地址")
        @RequestMapping("/updateaddress")
        public String updateaddress(Address address){

            int result = shoppingService.updateAddress(address);

            return result>0?"success":"false";

        }






}
