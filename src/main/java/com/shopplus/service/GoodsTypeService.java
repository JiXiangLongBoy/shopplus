package com.shopplus.service;


import com.shopplus.pojo.Goods;

import java.util.List;

public interface GoodsTypeService {
    List<Goods> getGoodsListByGoodsTypeId(int typeId, int size);
}
