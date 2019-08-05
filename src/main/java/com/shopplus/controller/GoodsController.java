package com.shopplus.controller;

import com.shopplus.pojo.Goods;
import com.shopplus.service.GoodsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @ApiOperation("返回index页面热销的商品数据")
    @RequestMapping("/hotgoods")
    public List<Goods> hotGoods() {
        List<Goods> hotsellGoods = goodsService.getHotsellGoods();
        return hotsellGoods;
    }
}
