package com.example.demo;

import com.example.demo.ctrl.good.GoodMgnCtrl;
import com.example.demo.ctrl.user.UserController;
import com.example.demo.dto.good.GoodDTO;
import com.example.demo.entity.Order;
import com.example.demo.exception.BusinessException;
import com.example.demo.service.good.GoodMgnService;
import com.example.demo.service.order.OrderService;
import com.example.demo.service.user.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    OrderService orderService;

    @Autowired
    UserService userService;

    @Autowired
    GoodMgnService goodMgnService;

    @Test
    void contextLoads() throws ParseException, BusinessException {

        //worked
        /*GoodDTO[] goodDTOS = goodMgnService.getAllGoods();
        for(GoodDTO goodDTO:goodDTOS){
            System.out.println(goodDTO.toString());
        }*/

        //GoodDTO goodDTO = goodMgnService.getGoodById("7b51cd91-a06c-43a7-b689-f419df1ef448");
        //System.out.println(goodDTO.toString());
        //SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        //Date birthDate = sf.parse("2000-08-11");

        //User user = new User("syboomsy3","10086", "SY", "sy", "xxx.jpg", "13692165769", "1378681102@qq.com", "m", birthDate, 0, "test-add-id");
        //worked
        //int res = -999;
        //res = this.userService.register(user);

        //worked
        //UserDTO userDTO = this.userService.login("5472b893-36ae-4ed0-83d1-9bb3fc27a87a","10086",null,null);
        //User user2 = this.userService.getUserInfo("5472b893-36ae-4ed0-83d1-9bb3fc27a87a");

        //System.out.println(" test "+user2.toString());

        /*
        Order order = new Order(
                "8848",
                "8848",
                "8846",
                1,
                8848,
                8848,
                1
        );
        Order order2 = new Order(
                "8848",
                "8848",
                "8846",
                1,
                8848,
                8848,
                1
        );*/
        Order order3 = new Order(
                "8848",
                "8848",
                "8846",
                1,
                8848,
                8848,
                1
        );
        //worked
        //int res = orderService.createOrder(order3);

        //worked
        //res = orderService.updateOrderStatus("13eef662-28ed-402c-b044-6f4cab2c5b79",2);

        //worked
        //OrderDTO orderDTO = orderService.showOrderDetails("13eef662-28ed-402c-b044-6f4cab2c5b79");

        //both BySeller & ByBuyer worked
        /*
        OrderDTO[] orderDTOS = this.orderService.showOrderListBySeller("8846");
        System.out.println(orderDTOS.length);
        for(OrderDTO orderDTO : orderDTOS){
            System.out.println("test "+orderDTO.toString());
        }*/
        //System.out.println("test "+orderDTO.toString());


    }

}
