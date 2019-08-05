package com.shopplus.controller;

import com.shopplus.pojo.Goods;
import com.shopplus.pojo.IndexBanner;
import com.shopplus.service.GoodsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/goods",method = {RequestMethod.GET,RequestMethod.POST})
public class GoodsController {

    @Autowired
    GoodsService goodsService;



    @ApiOperation("返回index页面的banner图及其对应的商品id")
    @RequestMapping("/banner")
    public List<IndexBanner> banner() {
        List<IndexBanner> hotsellGoods = goodsService.getBannerUrl();
        return hotsellGoods;
    }

    @ApiOperation("返回index页面热销的商品数据")
    @RequestMapping("/hotgoods")
    public List<Goods> hotGoods() {
        List<Goods> hotsellGoods = goodsService.getHotsellGoods();
        return hotsellGoods;
    }

    @ApiOperation("返回index页面新品的商品数据")
    @RequestMapping("/newgoods")
    public List<Goods> newGoods() {
        List<Goods> newGoods = goodsService.getGoodsByTime();
        return newGoods;
    }

    @ApiOperation("返回index页面打折的商品数据")
    @RequestMapping("/discountgoods")
    public List<Goods> discountGoods() {
        List<Goods> discountGoods = goodsService.getGoodsByDiscount();
        return discountGoods;
    }

}
