package com.shopplus.controller;


import com.shopplus.pojo.Brand;
import com.shopplus.pojo.DongType;
import com.shopplus.pojo.FenType;
import com.shopplus.pojo.Goods;
import com.shopplus.service.BrandService;
import com.shopplus.service.FenTypeService;
import com.shopplus.service.GoodsService;
import com.shopplus.service.TypeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "商品类型")
@RequestMapping(method = {RequestMethod.GET,RequestMethod.POST})
public class TypeController {

    @Autowired
    TypeService typeService;
    @Autowired
    FenTypeService fenTypeService;
    @Autowired
    GoodsService goodsService;
    @Autowired
    BrandService brandService;


    @RequestMapping("/dongTypeList")
    public List<DongType> dongTypeList(){
        System.out.println(1);
        List<DongType> dongTypeList=typeService.dongTypeList();

        return dongTypeList;
    }
    @RequestMapping("/fenTypeList")
    public List<FenType> fenTypeList(DongType dongTypeId){
        System.out.println(dongTypeId);
        List<FenType> fenTypeList = fenTypeService.fenTypeList(dongTypeId);
        System.out.println(fenTypeList);
        return fenTypeList;
    }
    @RequestMapping("/getGoodsByDongType")
    public List<Goods> getGoodsByDongType(Model model, FenType dongId){
        List<Goods> goodsList = goodsService.getGoodsByDongType(dongId);
        return goodsList;
    }
    @RequestMapping("/priceDesc")
    public List<Goods> priceDesc(Model model,FenType dongId){
       List<Goods> priceDescList= goodsService.priceDesc(dongId);
       return priceDescList;
    }
    @RequestMapping("/salesDesc")
    public List<Goods> salesDesc(Model model,FenType dongId){
        List<Goods> salesDescList= goodsService.salesDesc(dongId);
        return salesDescList;
    }
    @RequestMapping("/brandList")
    public List<Brand> brandList(Model model){
       List<Brand> brandList= brandService.brandList();
       return brandList;
    }
    @RequestMapping("/getGoodsByBrand")
    public List<Goods> getGoodsByBrand(Model model,FenType dongId,Goods brandId){
        List<Goods> brandGoodsList=goodsService.getGoodsByBrand(dongId,brandId);
        return brandGoodsList;
    }
}
