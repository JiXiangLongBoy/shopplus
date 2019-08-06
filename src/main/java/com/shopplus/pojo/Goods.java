package com.shopplus.pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Goods {

    private Integer goodsId;
    private String goodsName;
    private Integer price;
    private Integer discount;
    private Integer typeId;
    private Integer sales;
    private Date time;
    private String standrd;
    private String weight;
    private String pack;
    private String endTime;
    private String brand;
    private Integer goodsNum;
    private Integer statusId;
    private Integer dongId;
    private String goodsImgUrl;
    private String goodsInfoUrl;
    private String brandName;
    private List<Integer> idList;
}
