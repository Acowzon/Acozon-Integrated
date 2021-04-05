package com.example.demo.service.order;


import com.example.demo.dto.order.OrderDTO;
import com.example.demo.entity.po.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderService {

    public int createOrder(Order order);

    int deleteOrder(String orderID);

    int updateOrderStatus(String orderID,int status);

    int updateOrderItem(String orderID,String itemID,int num);

    OrderDTO[] showOrderListByBuyer(String userID);

    OrderDTO[] showOrderListBySeller(String sellerID);

    OrderDTO showOrderDetails(String orderID);
    
}
