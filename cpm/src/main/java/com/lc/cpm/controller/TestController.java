package com.lc.cpm.controller;

import com.lc.cpm.entity.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @username 熊一飞
 * @date 2023/3/9 22:44
 */

@RestController
public class TestController {

    @RequestMapping("/user")
    public List<User> getAllUser() {
        return new User().selectAll();
    }
    @RequestMapping("/ShoppingCartItem")
    public List<ShoppingCartItem> getShoppingCartItem() {
        return new ShoppingCartItem().selectAll();
    }
    @RequestMapping("/Order")
    public List<Order> getAllOrder() {
        return new Order().selectAll();
    }
    @RequestMapping("/Item")
    public List<Item> getItem() {
        return new Item().selectAll();
    }
    @RequestMapping("/GoodsInfo")
    public List<GoodsInfo> getGoodsInfo() {
        return new GoodsInfo().selectAll();
    }
    @RequestMapping("/Config")
    public List<Config> getConfig() {
        return new Config().selectAll();
    }
    @RequestMapping("/Category")
    public List<Category> getCategory() {
        return new Category().selectAll();
    }
    @RequestMapping("/Carousel")
    public List<Carousel> getCarousel() {
        return new Carousel().selectAll();
    }
}
