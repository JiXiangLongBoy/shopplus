package com.shopplus.mapper;

import com.shopplus.pojo.FenType;
import com.shopplus.pojo.Goods;
import com.shopplus.pojo.GoodsType;
import com.shopplus.pojo.IndexBanner;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {
    List<Goods> getGoodsByDongType(FenType dongId);

    List<Goods> priceDesc(FenType dongId);

    List<Goods> salesDesc(FenType dongId);

    List<Goods> getGoodsByBrand(FenType dongId, Goods brandId);

    List<IndexBanner> getBannerUrl();

    List<GoodsType> getGoodsTypeList();

    List<Goods> getHotsellGoods();

    List<Goods> getGoodsByTime();

    List<Goods> getGoodsByDiscount();

    Goods getGoodsById(int id);

    List<Goods> getGoodsByTypeId(int typeId);

    List<Goods> getGoodsByGoodsName(String goodsName);
}
