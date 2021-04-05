package com.example.demo.ctrl.order;

import com.OrderManagement.test.ctrl.response.DefaultWebResponse;
import com.example.demo.ctrl.order.request.CreateOrderRequest;
import com.example.demo.ctrl.order.request.GetOrderDetailRequest;
import com.example.demo.ctrl.order.request.GetOrderListRequest;
import com.example.demo.ctrl.order.request.UpdateOrderStatusRequest;
import com.example.demo.entity.po.Order;
import com.example.demo.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/createOrder",method = RequestMethod.POST)
    public DefaultWebResponse createOrder(@RequestBody CreateOrderRequest request){
        if (request==null){
            DefaultWebResponse.Builder.fail("create order request null.");
        }
        return  DefaultWebResponse.Builder.success(this.orderService.createOrder(
                new Order(request.getItemID(),request.getUserID(),request.getSellerID(),
                        request.getItemNumber(),request.getItemPrice(),
                        request.getItemNumber()*request.getItemPrice(),request.getOrderStatus())
        ));
    }

    @RequestMapping(value = "/orderDetail",method = RequestMethod.POST)
    public DefaultWebResponse goDetailedOrderPage(
            @RequestBody GetOrderDetailRequest request
            ){
        if (request.getOrderID().equals("")||request==null){
            return DefaultWebResponse.Builder.fail("order detail request null.");
        }
        return DefaultWebResponse.Builder.success(this.orderService.showOrderDetails(request.getOrderID()));
    }

    @RequestMapping(value = "/orderList")
    public DefaultWebResponse showOrderList(
            @RequestBody GetOrderListRequest request
    ){
        if (request==null){
            return  DefaultWebResponse.Builder.fail("showOrderList orderID null.");
        }
        if (request.getSellerID()!=null){
            return DefaultWebResponse.Builder.success(this.orderService.showOrderListByBuyer(request.getSellerID()));
        }else {
            return DefaultWebResponse.Builder.success(this.orderService.showOrderListByBuyer(request.getUserID()));
        }
    }

    public DefaultWebResponse changeOrderStatus(@RequestBody UpdateOrderStatusRequest request){
        if (request==null){
            return  DefaultWebResponse.Builder.fail("changeOrderStatus order status null.");
        }
        return DefaultWebResponse.Builder.success(this.orderService.updateOrderStatus(request.getOrderID(),request.getStatus()));
    }




}
