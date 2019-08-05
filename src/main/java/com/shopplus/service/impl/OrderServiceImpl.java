package com.shopplus.service.impl;

import com.shopplus.mapper.OrderMapper;
import com.shopplus.pojo.OrderFail;
import com.shopplus.pojo.OrderIdList;
import com.shopplus.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Override
    public int getPriceSum(List<OrderFail> orderFailList) {
        OrderIdList orderIdList = new OrderIdList();
        List<Integer> id = new ArrayList<Integer>();
        for(OrderFail orderFail:orderFailList){
            int i=0;
            i++;
            id.add(orderFailList.get(i).getGoodsId());
        }
        orderIdList.setIdList(id);
        List<Integer> priceList =orderMapper.getPriceSum(orderIdList);
        int sum = 0;
        for (OrderFail orderFail:orderFailList){
            int j = 0;
            j++;
            sum = sum + priceList.get(j)*orderFailList.get(j).getGoodsNum();
        }
        return sum;
    }

    @Override
    public void addOrder(List<OrderFail> orderFailList) {

    }
}
