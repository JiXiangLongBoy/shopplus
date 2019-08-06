package com.shopplus.controller;

import com.shopplus.pojo.Goods;
import com.shopplus.pojo.GoodsType;
import com.shopplus.pojo.IndexBanner;
import com.shopplus.service.GoodsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @ApiOperation("返回index页面的商品类型的名字、图片及id")
    @RequestMapping("/goodstype")
    public List<GoodsType> goodsType() {
        List<GoodsType> hotsellGoods = goodsService.getGoodsTypeList();
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


    @ApiOperation("返回单个商品详情页面的数据，参数是商品的goodsId值")
    @RequestMapping("/goodsbyid")
    public Goods getGoodsById(int goodsId) {
        Goods goods = goodsService.getGoodsById(goodsId);
        return goods;
    }


    @ApiOperation("返回对应类型的所有商品，参数是商品类型的id值")
    @RequestMapping("/goodsbytypeid")
    public List<Goods> getGoodsByTypeId(int typeId) {
        List<Goods> goodsList = goodsService.getgoodsByTypeId(typeId);
        return goodsList;
    }


    @ApiOperation("根据商品名字搜索对应的商品，参数是输入的商品名字")
    @RequestMapping("/goodsbygoodsname")
    public List<Goods> getGoodsByGoodsName(String goodsName) {
        List<Goods> goodsList = goodsService.getGoodsByGoodsName(goodsName);
        return goodsList;
    }

}
