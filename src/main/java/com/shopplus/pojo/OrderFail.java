package com.shopplus.pojo;

import java.util.Date;

public class OrderFail {
    private Integer orderId;
    private Integer userId;
    private Date orderNum;
    private Integer sumNum;
    private Integer sumPrice;
    private Integer goodsId;
    private Integer goodsNum;
    private Integer price;

    @Override
    public String toString() {
        return "OrderFail{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", orderNum=" + orderNum +
                ", sumNum=" + sumNum +
                ", sumPrice=" + sumPrice +
                ", goodsId=" + goodsId +
                ", goodsNum=" + goodsNum +
                ", price=" + price +
                '}';
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public OrderFail(Integer goodsId, Integer userId, Integer goodsNum) {
        this.goodsId = goodsId;
        this.userId = userId;
        this.goodsNum = goodsNum;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }
}
