package com.example.demo.dto.order;

import java.util.Date;

public class OrderDTO {
    private String orderID;
    private String userID;
    private String itemID;
    private String sellerID;
    private float itemPrice;
    private int itemNumber;
    private float totalCost;
    private Date date;
    private int status;

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getSellerID() {
        return sellerID;
    }

    public void setSellerID(String sellerID) {
        this.sellerID = sellerID;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "orderID='" + orderID + '\'' +
                ", userID='" + userID + '\'' +
                ", itemID='" + itemID + '\'' +
                ", sellerID='" + sellerID + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemNumber=" + itemNumber +
                ", totalCost=" + totalCost +
                ", date=" + date +
                ", status=" + status +
                '}';
    }
}
