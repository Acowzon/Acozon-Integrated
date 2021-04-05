package com.example.demo.mapper;

import com.example.demo.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface OrderMapper {
    // 查询所有的订单
    List<Order> queryAllOrder();

    // 根据id查询订单
    Order queryOrderById(@Param("id") String id);

    // 查询一个买家的所有订单
    List<Order> queryOrderByBuyer(@Param("id") String id);

    // 查询一个卖家的所有订单
    List<Order> queryOrderByRetailer(@Param("id") String id);

    // 插入一个订单
    int addOrder(Order order);

    // 修改订单的商品数量
    int updateOrderGoodsCount(@Param("id") String id, @Param("count") int count);

    // 修改订单的价格
    int updateOrderPrice(@Param("id") String id, @Param("price") double price);

    // 修改一个订单的状态
    int updateOrderState(@Param("id") String id, @Param("state") int state );

    // 删除一个订单
    int delOrderById(@Param("id") String id);
}
