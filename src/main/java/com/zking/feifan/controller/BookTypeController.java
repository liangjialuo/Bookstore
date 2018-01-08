package com.zking.feifan.controller;

import com.zking.feifan.biz.IBookTypeBiz;
import com.zking.feifan.model.Booktype;
import com.zking.feifan.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/type")
public class BookTypeController {

    @Autowired
    private IBookTypeBiz iBookTypeBiz;

    @RequestMapping("/listBookType")
    public String listBookType(Model model, String msg) {
        List<Booktype> listBooktype = iBookTypeBiz.list(null, null);
        model.addAttribute("listBooktype", listBooktype);
        return msg;
    }
}
