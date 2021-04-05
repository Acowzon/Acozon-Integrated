package com.example.demo.mapper.order;


import com.example.demo.entity.order.OrderBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    int createOrder(String userID,String itemID,int num,double price,String sellerID);

    int deleteOrder(String orderID);

    int updateOrder(String orderID,int status);

    List<OrderBean> showOrderList(String userID);

    OrderBean showOrderDetails(String orderID);

    int chooseLogistics();

    int insertShoppingCart();


}
