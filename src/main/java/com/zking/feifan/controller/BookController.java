package com.zking.feifan.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.deploy.net.HttpResponse;
import com.zking.feifan.biz.IBookBiz;
import com.zking.feifan.model.Book;
import com.zking.feifan.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private IBookBiz iBookBiz;

    @ModelAttribute
    public void init(Model model) {
        model.addAttribute("book", new Book());
    }

    @RequestMapping("/listBookJson")
    public String listBookJson(Book book, HttpServletResponse response) throws IOException {
        PageBean pageBean = new PageBean();
        List<Book> listBook = iBookBiz.list(book, pageBean);
        response.setContentType("text/html;charset=UTF-8");
        GsonBuilder gsonBuidler;// 使用GsonBuilder来创建Gson，可以设置时间转换格式。
        gsonBuidler = new GsonBuilder();
        gsonBuidler.setDateFormat("yyyy-MM-dd HH:mm:ss");
//        gsonBuidler.setDateFormat("MM-dd HH:mm");
        Gson gson = gsonBuidler.create();
        // 设置response的编码集
        String json = gson.toJson(listBook);
        System.out.println(json);
        PrintWriter pw = response.getWriter();
        pw.print(json);
        pw.close();
        return null;
    }

    @RequestMapping("/listBook")
    public String listBook(Model model, Book book) {
        PageBean pageBean = new PageBean();
        pageBean.setPageRecord(5);
        List<Book> listBook = iBookBiz.list(book, pageBean);
        model.addAttribute("listBook", listBook);
        return "findBook";
    }

    @RequestMapping("/insertBook")
    public String insertBook(HttpServletRequest request, HttpServletResponse response) throws IllegalStateException, IOException {
        //创建一个通用的多部分解析器
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        //判断 request 是否有文件上传,即多部分请求
        if (multipartResolver.isMultipart(request)) {
            //转换成多部分request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            //取得request中的所有文件名
            Iterator<String> iter = multiRequest.getFileNames();
            while (iter.hasNext()) {
                //记录上传过程起始时的时间，用来计算上传时间
                int pre = (int) System.currentTimeMillis();
                //取得上传文件
                MultipartFile file = multiRequest.getFile(iter.next());
                if (file != null) {
                    //取得当前上传文件的文件名称
                    String myFileName = file.getOriginalFilename();
                    //如果名称不为“”,说明该文件存在，否则说明该文件不存在
                    if (myFileName.trim() != "") {
//                        System.out.println(myFileName);
                        //重命名上传后的文件名
                        String fileName = "demoUpload" + file.getOriginalFilename();
                        //定义上传路径
                        String path = "D:/nginx/imgServer/" + fileName;
                        File localFile = new File(path);
                        file.transferTo(localFile);
                        String bookname = request.getParameter("bookname");
                        String booktypeid = request.getParameter("booktypeid");
                        String bookauthor = request.getParameter("bookauthor");
                        String bookprice = request.getParameter("bookprice");
                        String bookconcern = request.getParameter("bookconcern");
                        String booksynopsis = request.getParameter("booksynopsis");
                        String bookinventory = request.getParameter("bookinventory");
                        Book book = new Book();
                        book.setBookname(bookname);
                        book.setBooktypeid(Integer.parseInt(booktypeid));
                        book.setBookauthor(bookauthor);
                        book.setBookprice(Float.parseFloat(bookprice));
                        book.setBookconcern(bookconcern);
                        book.setBooksynopsis(booksynopsis);
                        book.setBookinventory(Integer.parseInt(bookinventory));
                        book.setBookimage(fileName);
                        book.setBooksales(0);
                        iBookBiz.insert(book);
                    }
                }
            }
        }
        return "redirect:/page/listBook1";
    }

    @RequestMapping("/editState")
    public String editState(Book book, String msg) {
        iBookBiz.update(book);
        return "page/" + msg;
    }
}
