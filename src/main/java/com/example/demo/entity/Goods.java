package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods implements Serializable {
    private int goodsId; // 商品id
    private String goodsName; // 商品名称
    private String goodsType; // 商品类型
    private double goodsPrice; // 商品价格
    private String goodsImage; // 商品图片的存储地址
    private String goodsSimpleDes; // 商品的简单描述
    private String goodsDescription; // 商品的描述
    private int goodsInventory; // 商品库存
    private int commentCount; // 商品评论数量
    private int soldCount; // 商品售出个数
    private int retailerId; // 商品上架商家的id
    private int goodsStarsCount; // 喜欢此商品的人数
    private int views; // 商品的浏览数
    private int isFreeShipping; // 是否包邮
    private Date createTime; // 商品创建时间
    private Date updateTime; // 商品修改时间

    public Goods(String goodsName, String goodsType, double goodsPrice, String goodsImage, String goodsSimpleDes, String goodsDescription, int goodsInventory, int retailerId, int isFreeShipping, Date createTime, Date updateTime) {
        this.goodsName = goodsName;
        this.goodsType = goodsType;
        this.goodsPrice = goodsPrice;
        this.goodsImage = goodsImage;
        this.goodsSimpleDes = goodsSimpleDes;
        this.goodsDescription = goodsDescription;
        this.goodsInventory = goodsInventory;
        this.retailerId = retailerId;
        this.isFreeShipping = isFreeShipping;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
