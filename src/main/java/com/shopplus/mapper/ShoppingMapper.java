package com.shopplus.mapper;


import com.shopplus.pojo.Address;
import com.shopplus.pojo.Goods;
import com.shopplus.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShoppingMapper {
    List<Goods> selectShoppingById(Goods goods);

    List<Address> selectAddressByUser(User user);

    int updateAddressById(Address address);
}
