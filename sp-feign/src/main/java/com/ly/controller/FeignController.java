package com.ly.controller;

import com.ly.pojo.Item;
import com.ly.pojo.Order;
import com.ly.pojo.User;
import com.ly.service.ItemFeignService;
import com.ly.service.OrderFeignService;
import com.ly.service.UserFeignService;
import com.ly.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FeignController {
    @Autowired
    private ItemFeignService itemServcie;
    @Autowired
    private UserFeignService userServcie;
    @Autowired
    private OrderFeignService orderServcie;

    @GetMapping("/item-service/{orderId}")
    public JsonResult<List<Item>> getItems(@PathVariable String orderId) {
        return itemServcie.getItems(orderId);
    }

    @PostMapping("/item-service/decreaseNumber")
    public JsonResult decreaseNumber(@RequestBody List<Item> items) {
        return itemServcie.decreaseNumber(items);
    }


    @GetMapping("/user-service/{userId}")
    public JsonResult<User> getUser(@PathVariable Integer userId) {
        return userServcie.getUser(userId);
    }

    @GetMapping("/user-service/{userId}/score")
    public JsonResult addScore(@PathVariable Integer userId, Integer score) {
        return userServcie.addScore(userId, score);
    }


    @GetMapping("/order-service/{orderId}")
    public JsonResult<Order> getOrder(@PathVariable String orderId) {
        return orderServcie.getOrder(orderId);
    }

    @GetMapping("/order-service")
    public JsonResult addOrder() {
        return orderServcie.addOrder();
    }
}
