package com.shopplus.mapper;

import com.shopplus.pojo.Order;
import com.shopplus.pojo.OrderFail;
import com.shopplus.pojo.OrderGoods;
import com.shopplus.pojo.OrderIdList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface OrderMapper {


    void addOrder(Order order);


    List<Integer> getPriceSum(OrderIdList orderIdList);

    void addOrderGoods(List<OrderGoods> orderGoods);

    List<OrderFail> showOrderById(int userId);

    void delOrderByOrderNum(int orderId);
}
