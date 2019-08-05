package com.shopplus.service;


import com.shopplus.pojo.FenType;
import com.shopplus.pojo.Goods;
import com.shopplus.pojo.GoodsType;

import java.util.List;

public interface GoodsService {
    List<Goods> getGoodsByDongType(FenType goodsId);

    List<Goods> priceDesc(FenType dongId);

    List<Goods> salesDesc(FenType dongId);

    List<Goods> getGoodsByBrand(FenType dongId, Goods brandId);

    List<String> getBannerUrl();

    List<GoodsType> getGoodsTypeList();

    List<Goods> getHotsellGoods();

    List<Goods> getGoodsByTime();

    List<Goods> getGoodsByDiscount();

    Goods getGoodsById(int id);
}