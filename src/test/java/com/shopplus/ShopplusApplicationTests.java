package com.shopplus;

import com.shopplus.pojo.OrderFail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopplusApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Test
    public static void main(String[] args) {
        List<OrderFail> orderFails = new ArrayList<OrderFail>();
        int sum =0;
        orderFails.add(new OrderFail(1,1,1));
        orderFails.add(new OrderFail(1,1,2));
        orderFails.add(new OrderFail(1,1,3));
        System.out.println(orderFails);
        for (OrderFail order :orderFails){
            int i = 0;
            i++;
            sum= sum + orderFails.get(i).getGoodsNum();
        }
        System.out.println("sum="+sum);
    }

}
