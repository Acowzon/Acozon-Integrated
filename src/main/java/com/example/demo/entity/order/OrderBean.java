package com.example.demo.entity.order;

import java.util.Date;

/**
 * 订单类 对应订单表
 */

public class OrderBean {
    private String orderID;
    private String userID;
    private String itemID;
    private String sellerID;
    private float itemPrice;
    private int itemNumber;
    private float totalCost;
    private Date date;
    private int status;

    private LogisticsBean logisticsBean;
    private String imageURL;

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
    public LogisticsBean getLogisticsBean() {
        return logisticsBean;
    }
    public void setLogisticsBean(LogisticsBean logisticsBean) {
        this.logisticsBean = logisticsBean;
    }

    public String getSellerID() {
        return sellerID;
    }

    public void setSellerID(String sellerID) {
        this.sellerID = sellerID;
    }

    @Override
    public String toString() {
        return "OrderBean{" +
                "orderID=" + orderID +
                ", userID=" + userID +
                ", itemID=" + itemID +
                ", itemPrice=" + itemPrice +
                ", itemNumber=" + itemNumber +
                ", totalCost=" + totalCost +
                ", date=" + date +
                ", status=" + status +
                ", logisticsBean="  +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

}
