package com.shopplus.service.impl;

import com.shopplus.mapper.OrderMapper;
import com.shopplus.pojo.Order;
import com.shopplus.pojo.OrderFail;
import com.shopplus.pojo.OrderGoods;
import com.shopplus.pojo.OrderIdList;
import com.shopplus.service.OrderService;
import org.omg.CORBA.DATA_CONVERSION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public int getPriceSum(int userId, Integer[] goodsId, Integer[] goodsNum) {
        OrderIdList orderIdList = new OrderIdList();
        List<Integer> id = Arrays.asList(goodsId);
        orderIdList.setIdList(id);
        List<Integer> priceList =orderMapper.getPriceSum(orderIdList);
        int sum = 0;
        for (int i = 0; i <goodsNum.length; i++) {
            sum = sum + priceList.get(i)*goodsNum[i];
        }
        return sum;
    }

    @Override
    public List<OrderFail> showOrderById(int userId) {
        List<OrderFail> orderFailList=orderMapper.showOrderById(userId);
        return orderFailList;
    }

    @Override
    public void delOrderByOrderNum(int orderId) {
        orderMapper.delOrderByOrderNum(orderId);
    }

    @Override
    public void addOrder(int userId, Integer[] goodsId, Integer[] goodsNum) {
        OrderIdList orderIdList = new OrderIdList();
        List<Integer> id = Arrays.asList(goodsId);
        orderIdList.setIdList(id);
        List<Integer> priceList =orderMapper.getPriceSum(orderIdList);
        int sumPrice = 0;
        int sumNum=0;
        Date data = new Date();
        List<OrderGoods> orderGoods = new ArrayList<>();
        for (int i = 0; i < goodsNum.length; i++) {
            orderGoods.add(new OrderGoods(null,data,null,goodsNum[i],null));
            sumNum += goodsNum[i];
        }
        for (int i = 0; i <goodsNum.length; i++) {
            sumPrice = priceList.get(i)*goodsNum[i];
        }
        for (int i = 0; i <goodsId.length; i++) {
            orderGoods.get(i).setGoodsId(goodsId[i]);
            orderGoods.get(i).setPrice(priceList.get(i));
        }
        Order order = new Order(null,userId,data,sumNum,sumPrice);
        orderMapper.addOrder(order);
        orderMapper.addOrderGoods(orderGoods);

    }
}
