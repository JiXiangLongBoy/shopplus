package com.shopplus.service;

import com.shopplus.pojo.OrderFail;

import java.util.List;

public interface OrderService {
    int getPriceSum(List<OrderFail> orderFailList);

    void addOrder(List<OrderFail> orderFailList);
}
