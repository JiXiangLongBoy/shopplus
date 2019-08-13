package com.shopplus.pojo;

import java.util.Date;


public class OrderGoods {
    private Integer id;
    private Date orderNum;
    private Integer goodsId;
    private Integer goodsNum;
    private Integer price;

    public OrderGoods(Integer id, Date orderNum, Integer goodsId, Integer goodsNum, Integer price) {
        this.id = id;
        this.orderNum = orderNum;
        this.goodsId = goodsId;
        this.goodsNum = goodsNum;
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderGoods{" +
                "id=" + id +
                ", orderNum=" + orderNum +
                ", goodsId=" + goodsId +
                ", goodsNum=" + goodsNum +
                ", price=" + price +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Date orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
