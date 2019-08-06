package com.shopplus.service;

import com.shopplus.pojo.OrderFail;

import java.util.List;

public interface OrderService {
    void addOrder(int userId, Integer[] goodsId, Integer[] goodsNum);

    int getPriceSum(int userId, Integer[] goodsId, Integer[] goodsNum);

    List<OrderFail> showOrderById(int userId);

    void delOrderByOrderNum(int orderId);
}
