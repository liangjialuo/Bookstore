package com.zking.feifan.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zking.feifan.biz.IShoppingBiz;
import com.zking.feifan.model.Book;
import com.zking.feifan.model.Shopping;
import com.zking.feifan.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/Shopping")
public class ShoppingController {

    @Autowired
    private IShoppingBiz iShoppingBiz;

    @ModelAttribute
    public void init(Model model, Shopping shopping) {
        System.out.println(model);
        model.addAttribute("shopping", shopping);
    }

    @RequestMapping("/insertShopping")
    public String listBookJson(Shopping shopping, HttpServletResponse response) throws IOException {
//        iShoppingBiz.insert(shopping);
        System.out.println(shopping);
        response.setContentType("text/html;charset=UTF-8");
        String msg = "ok";
        PrintWriter pw = response.getWriter();
        pw.print(msg);
        pw.close();
        return null;
    }

}
