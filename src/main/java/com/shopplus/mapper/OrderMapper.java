package com.shopplus.mapper;

import com.shopplus.pojo.OrderIdList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface OrderMapper {
    List<Integer> getPriceSum(OrderIdList orderIdList);
}
