package com.shopplus.pojo;

public class OrderFail {

    private Integer goodsId;
    private Integer userId;
    private Integer goodsNum;

    @Override
    public String toString() {
        return "OrderFail{" +
                "goodsId=" + goodsId +
                ", userId=" + userId +
                ", goodsNum=" + goodsNum +
                '}';
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
