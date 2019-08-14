package com.shopplus.service;


import com.shopplus.pojo.Address;
import com.shopplus.pojo.Goods;
import com.shopplus.pojo.User;

import java.util.List;

public interface ShoppingService {
    List<Goods> selectAllShoppings(Integer[] goodsId);


    int updateAddress(Address address);

    List<Address> selectAddressByUser(int userId);
}
