package com.shopplus.mapper;


import com.shopplus.pojo.Address;
import com.shopplus.pojo.Goods;
import com.shopplus.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShoppingMapper {
    List<Goods> selectShoppingById(Goods goods);

    int updateAddressById(Address address);

    List<Address> selectAddressByUser(int userId);
}
