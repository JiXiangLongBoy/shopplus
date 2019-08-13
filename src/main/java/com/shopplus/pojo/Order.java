package com.shopplus.pojo;

import java.util.Date;

public class Order {
    private Integer orderId;
    private Integer userId;
    private Date orderNum;
    private Integer sumNum;
    private Integer sumPrice;
    public Order(){

    }
    public Order(Integer orderId, Integer userId, Date orderNum, Integer sumNum, Integer sumPrice) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderNum = orderNum;
        this.sumNum = sumNum;
        this.sumPrice = sumPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", orderNum=" + orderNum +
                ", sumNum=" + sumNum +
                ", sumPrice=" + sumPrice +
                '}';
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Date orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getSumNum() {
        return sumNum;
    }

    public void setSumNum(Integer sumNum) {
        this.sumNum = sumNum;
    }

    public Integer getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Integer sumPrice) {
        this.sumPrice = sumPrice;
    }
}
