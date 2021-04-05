package com.example.demo.entity.order;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * 订单类 对应订单表
 */

public class OrderBean implements Serializable {
    private String orderId; // 订单id
    private String goodsId; // 商品id
    private String userId;  // 用户id
    private String retailerId;  // 商家id
    private int goodsCount; // 商品数量
    private double goodsPrice;  // 商品单价
    private double orderPrice;  // 订单价格
    private int orderState; // 订单状态 0未支付 1已支付 2取消订单
    private Date orderTime; // 订单创建的时间

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(String retailerId) {
        this.retailerId = retailerId;
    }

    public int getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public OrderBean(String goodsId, String userId, String retailerId, int goodsCount, double goodsPrice, double orderPrice,
                     int orderState) {
        this.orderId = UUID.randomUUID().toString();
        this.goodsId = goodsId;
        this.userId = userId;
        this.retailerId = retailerId;
        this.goodsCount = goodsCount;
        this.goodsPrice = goodsPrice;
        this.orderPrice = orderPrice;
        this.orderState = orderState;
        this.orderTime = new Date();
    }
}
