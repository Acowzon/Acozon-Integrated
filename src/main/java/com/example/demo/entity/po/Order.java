package com.example.demo.entity.po;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
public class Order implements Serializable {
    private String orderId; // 订单id
    private String goodsId; // 商品id
    private String userId;  // 用户id
    private String retailerId;  // 商家id
    private int goodsCount; // 商品数量
    private double goodsPrice;  // 商品单价
    private double orderPrice;  // 订单价格
    private int orderState; // 订单状态 0未支付 1已支付 2取消订单
    private Date orderTime; // 订单创建的时间

    public Order(String goodsId, String userId, String retailerId, int goodsCount, double goodsPrice, double orderPrice,
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

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", goodsId='" + goodsId + '\'' +
                ", userId='" + userId + '\'' +
                ", retailerId='" + retailerId + '\'' +
                ", goodsCount=" + goodsCount +
                ", goodsPrice=" + goodsPrice +
                ", orderPrice=" + orderPrice +
                ", orderState=" + orderState +
                ", orderTime=" + orderTime +
                '}';
    }
}
