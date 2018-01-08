package com.zking.feifan.controller;

import com.zking.feifan.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {
    @ModelAttribute
    public void init(Model model, Book book) {
        model.addAttribute("book", book);
    }

    /**
     * 后台新增书本
     */
    @RequestMapping("/addBook")
    public String addBook() {
        return "page/addBook";
    }

    /**
     * 后台不知道是什么
     */
    @RequestMapping("/console1")
    public String console1() {
        return "page/console1";
    }

    /**
     * 后台编辑书本
     */
    @RequestMapping("/editBook")
    public String editBook() {
        return "page/editBook";
    }

    /**
     * 后台未上架的书
     */
    @RequestMapping("/listBook1")
    public String listBook1() {
        return "page/listBook1";
    }

    /**
     * 后台已上架的书
     */
    @RequestMapping("/listBook2")
    public String listBook2() {
        return "page/listBook2";
    }

    /**
     * 后台已下架的书
     */
    @RequestMapping("/listBook3")
    public String listBook3() {
        return "page/listBook3";
    }

    /**
     * 后台未发货的订单
     */
    @RequestMapping("/listOrder1")
    public String listOrder1() {
        return "page/listOrder1";
    }

    /**
     * 后台已发货的订单
     */
    @RequestMapping("/listOrder2")
    public String listOrder2() {
        return "page/listOrder2";
    }

    /**
     * 后台已签收的订单
     */
    @RequestMapping("/listOrder3")
    public String listOrder3() {
        return "page/listOrder3";
    }
}
