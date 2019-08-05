package com.shopplus.service.impl;

import com.shopplus.mapper.GoodsTypeMapper;
import com.shopplus.pojo.Goods;
import com.shopplus.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {


    @Autowired
    GoodsTypeMapper goodsTypeMapper;

    @Override
    public List<Goods> getGoodsListByGoodsTypeId(int typeId, int size) {
        return goodsTypeMapper.getGoodsListByGoodsTypeId(typeId,size);
    }
}
