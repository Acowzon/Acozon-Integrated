package com.example.demo.ctrl.order;


import com.example.demo.ctrl.DefaultWebResponse;
import com.example.demo.ctrl.order.request.CreateOrderRequest;
import com.example.demo.ctrl.order.request.GetOrderDetailRequest;
import com.example.demo.ctrl.order.request.GetOrderListRequest;
import com.example.demo.ctrl.order.request.UpdateOrderStatusRequest;
import com.example.demo.entity.Order;
import com.example.demo.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    /**
     *  CreateOrderRequest request:
     *  是一个对象，包括生成订单的全部属性
     *      private String userID;
     *     private String itemID;
     *     private String sellerID;
     *     private float itemPrice;
     *     private int itemNumber;
     *     private int orderStatus;
     *    由前端以json格式传过来
     *    返回信息：
     *      就是林锟的DefaultWebReponse
     *      在合适的位置显示即可
     *
     * @param request
     * @return
     */

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

    /**GetOrderDetailRequest:
     *  private String orderID;
     *  前端传来的都是json字符串
     * @param request
     * @return
     *  返回值全部存储在DefaultWebResponse的data对象中
     *  本接口返回一个OrderDTO
     *      private String orderId; // 订单id
     *     private String goodsId; // 商品id
     *     private String userId;  // 用户id
     *     private String retailerId;  // 商家id
     *     private int goodsCount; // 商品数量
     *     private double goodsPrice;  // 商品单价
     *     private double orderPrice;  // 订单价格
     *     private int orderState; // 订单状态 0未支付 1已支付 2取消订单
     *     private Date orderTime; // 订单创建的时间
     */

    @RequestMapping(value = "/orderDetail",method = RequestMethod.POST)
    public DefaultWebResponse goDetailedOrderPage(
            @RequestBody GetOrderDetailRequest request
            ){
        if (request.getOrderID().equals("")||request==null){
            return DefaultWebResponse.Builder.fail("order detail request null.");
        }
        return DefaultWebResponse.Builder.success(this.orderService.showOrderDetails(request.getOrderID()));
    }

    /**
     * GetOrderListRequest:
     *   private String userID;
     *    private String sellerID;
     *   两个属性，那个字段不为空，查的就是那个字段的订单列表
     * @param request
     * @return
     *  本接口返回一个OrderDTO的数组
     *     需要前端解析并列出
     */
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

    /**
     * 可以先不做
     * 改变订单状态，需要对应的前端按钮：取消
     * 来完成取消功能
     * @param request
     * @return
     */

    @RequestMapping("/changeOrderStatus")
    public DefaultWebResponse changeOrderStatus(@RequestBody UpdateOrderStatusRequest request){
        if (request==null){
            return  DefaultWebResponse.Builder.fail("changeOrderStatus order status null.");
        }
        return DefaultWebResponse.Builder.success(this.orderService.updateOrderStatus(request.getOrderID(),request.getStatus()));
    }




}
