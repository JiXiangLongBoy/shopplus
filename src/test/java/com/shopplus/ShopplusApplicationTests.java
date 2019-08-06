package com.shopplus;

import com.shopplus.mapper.OrderMapper;
import com.shopplus.pojo.Order;
import com.shopplus.pojo.OrderFail;
import com.shopplus.pojo.OrderIdList;
import io.swagger.models.auth.In;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopplusApplicationTests {
    @Autowired
    static  OrderMapper orderMapper;
    @Test
    public void contextLoads() {
    }
    @Test
    public static void main(String[] args) {


    }

}
