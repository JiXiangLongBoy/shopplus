package com.shopplus.service.impl;


import com.shopplus.mapper.ShoppingMapper;
import com.shopplus.pojo.Address;
import com.shopplus.pojo.Goods;
import com.shopplus.pojo.User;
import com.shopplus.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {

    @Autowired
    ShoppingMapper shoppingMapper;
    @Override
    public List<Goods> selectAllShoppings(Integer[] goodsId) {
        Goods goods = new Goods();
        List<Integer> integers = Arrays.asList(goodsId);
        goods.setIdList(integers);

        return shoppingMapper.selectShoppingById(goods);
    }

    @Override
    public int updateAddress(Address address) {

        return shoppingMapper.updateAddressById(address);
    }

    @Override
    public List<Address> selectAddressByUser(int userId) {
        return shoppingMapper.selectAddressByUser(userId);
    }


}
