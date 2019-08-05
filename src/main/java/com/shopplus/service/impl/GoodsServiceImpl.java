package com.shopplus.service.impl;

import com.shopplus.mapper.GoodsMapper;
import com.shopplus.pojo.FenType;
import com.shopplus.pojo.Goods;
import com.shopplus.pojo.GoodsType;
import com.shopplus.pojo.IndexBanner;
import com.shopplus.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;
    @Override
    public List<Goods> getGoodsByDongType(FenType dongId) {
       List<Goods> goodsList= goodsMapper.getGoodsByDongType(dongId);
        return goodsList;
    }

    @Override
    public List<Goods> priceDesc(FenType dongId) {
        List<Goods> priceDescList = goodsMapper.priceDesc(dongId);
        return priceDescList;
    }

    @Override
    public List<Goods> salesDesc(FenType dongId) {
        List<Goods> salesDescList = goodsMapper.salesDesc(dongId);
        return salesDescList;
    }

    @Override
    public List<Goods> getGoodsByBrand(FenType dongId, Goods brandId) {
        List<Goods> brandGoodsList =goodsMapper.getGoodsByBrand(dongId,brandId);
        return brandGoodsList;
    }

    @Override
    public List<IndexBanner> getBannerUrl() {

        return  goodsMapper.getBannerUrl();
    }

    @Override
    public List<GoodsType> getGoodsTypeList() {
        return goodsMapper.getGoodsTypeList();
    }

    @Override
    public List<Goods> getHotsellGoods() {
        return goodsMapper.getHotsellGoods();
    }

    @Override
    public List<Goods> getGoodsByTime() {
        return goodsMapper.getGoodsByTime();
    }

    @Override
    public List<Goods> getGoodsByDiscount() {
        return goodsMapper.getGoodsByDiscount();
    }

    @Override
    public Goods getGoodsById(int id) {
        return goodsMapper.getGoodsById(id);
    }
}
