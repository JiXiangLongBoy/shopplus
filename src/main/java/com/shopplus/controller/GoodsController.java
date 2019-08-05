package com.shopplus.controller;

import com.shopplus.pojo.Goods;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @RequestMapping("/hotgoods")
    public Goods hotGoods(){

        return null;
    }
}
