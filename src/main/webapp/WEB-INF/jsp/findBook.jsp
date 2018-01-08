<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<head>
    <%@include file="main.jsp" %>
</head>

<body>
<!--top-->
<div id="top_div">
    <p class="left">您好，欢迎来到飞凡网上书店 ！</p>
    <p class="right"><a href="login">登陆</a> | <a href="register">注册</a> | <a href="shoppingCar">我的购物车</a> | <a
            href="index">网站首页</a></p>
    <div class="fixed"></div>
</div>

<div id="header_div">
    <div id="search">
        <!--下面form标签的id属性不能修改，因为在css中使用了一个id选择器-->
        <form id="form">
            <table width="413" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td>
                        <input type="text" name="" value="" id="input">
                    </td>
                    <td>
                        <input type="image" name="imageField" src="images/btn_search.png"/>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>

<!--nav-->
<div id="nav">
    <ul id="menu"></ul>
</div>
<!--end nav-->

<!--end top-->

<!--con-->
<div class="w960 mt10">
    <div class="side left">
        <h3>图书分类</h3>
        <ul class="classify bgf7e4e4 bdf7e4e4">
            <c:if test="${listBooktype == null}">
                <jsp:forward page="/type/listBookType?msg=findBook"/>
            </c:if>
            <c:forEach items="${listBooktype}" var="v">
                <li><a href="book/listBook?booktypeid=${v.booktypeid}">${v.booktypename }</a></li>
            </c:forEach>
            <div class="fixed"></div>
        </ul>
    </div>
    <div class="w740 right">
        <div class="order02 pb10">

            <c:if test="${listBook == null}">
                <jsp:forward page="book/listBook"/>
            </c:if>
            <c:forEach items="${listBook}" var="v">
                <dl class="findbook">
                    <dt class="left"><img src="http://127.0.0.1:8089/${v.bookimage}"/></dt>
                    <dd class="right">
                        <h4>${v.bookname}</h4>
                        <p><strong>作者：</strong>${v.bookauthor}</p>
                        <p><strong>价格：</strong>￥${v.bookprice}</p>
                        <p><strong>出版社：</strong>${v.bookconcern}</p>
                        <p><strong>书籍简介：</strong>${v.booksynopsis} </p>
                        <p class="mt10"><a onclick="ajax(${v.bookid},${v.bookid})" href="javascript:;"><img
                                src="images/btn_shopping.png"/></a><a href="#"><img
                                src="images/btn_accounts.png"/></a></p>
                    </dd>
                    <div class="fixed"></div>
                </dl>
            </c:forEach>
        </div>
        <!-- page -->
        <div style="text-align: right;">
            每页 5 行 共 9 行 第 1 页 共 2 页 <a href='javascript:gotoPage(1)'>首页</a> <a href='javascript:gotoPage(1)'>上一页</a> <a
                href='javascript:gotoPage(2)'>下一页</a> <a href='javascript:gotoPage(2)'>尾页</a> 页数 <input type='text'
                                                                                                        id='pageNumber'
                                                                                                        style='width:20px;'/>
            <a href='javascript:jumpPage()'>GO</a>
        </div>
        <!-- end page -->

    </div>
    <div class="fixed"></div>
</div>
<!--end con-->
<!--end con-->

<!--footer-->

<div id="footer_wrap">
    <p>Copyright ©2014 飞凡教育，版权所有</p>
</div>
<script>
    function ajax(bookid, userid) {
//        $.get("Shopping/insertShopping?bookid=" + bookid + "&userid" + userid, function (data) {
//            alert("添加购物车成功");
//        });
        $.ajax({
            type: "post",
            url: "Shopping/insertShopping",
            date: "bookid=" + bookid + "&userid" + userid,
            async: false, // 使用同步方式
            dataType: "text",
            success: function (data) {
                alert("添加购物车成功");
            }
        });
    }
</script>

<!--end footer-->
</body>
</html>
