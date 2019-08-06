package com.shopplus.service;


import com.shopplus.pojo.Address;
import com.shopplus.pojo.Goods;
import com.shopplus.pojo.User;

import java.util.List;

public interface ShoppingService {
    List<Goods> selectAllShoppings(Integer[] goodsId);

    List<Address> selectAddressByUser(User user);


    int updateAddress(Address address);
}
