package com.example.demo.ctrl.order.request;

public class UpdateOrderStatusRequest {
    private int status;
    private String orderID;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
}
