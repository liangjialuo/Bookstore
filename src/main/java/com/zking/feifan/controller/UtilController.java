package com.zking.feifan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilController {

    /**
     * 添加订单
     */
    //TODO
    @RequestMapping("/addOrder")
    public String addOrder() {
        return "addOrder";
    }

    /**
     * 后台
     */
    //TODO
    @RequestMapping("/console2")
    public String console2() {
        return "console2";
    }

    /**
     * 后台
     * TODO
     */
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    /**
     * 后台
     */
    //TODO
    @RequestMapping("/findBook")
    public String findBook() {
        return "findBook";
    }

    /**
     * 未发货
     * TODO
     */
    @RequestMapping("/listMyOrder1")
    public String listMyOrder1() {
        return "listMyOrder1";
    }

    /**
     * 已发货
     * TODO
     */
    @RequestMapping("/listMyOrder2")
    public String listMyOrder2() {
        return "listMyOrder2";
    }

    /**
     * 已签收
     * TODO
     */
    @RequestMapping("/listMyOrder3")
    public String listMyOrder3() {
        return "listMyOrder3";
    }

    /**
     * 登陆
     * TODO
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * 注册
     * TODO
     */
    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    /**
     * 购物车
     * TODO
     */
    @RequestMapping("/shoppingCar")
    public String shoppingCar() {
        return "shoppingCar";
    }

}
