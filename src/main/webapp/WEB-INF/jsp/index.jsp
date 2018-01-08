<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<head>
    <%@include file="main.jsp" %>
</head>
<body>
<!--top-->
<div id="top_div">
    <p class="left">您好，欢迎来到飞凡网上书店 ！</p>
    <p class="right"><a href="login">登陆</a> | <a href="register">注册</a> | <a>我的购物车</a> | <a
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
                <jsp:forward page="/type/listBookType?msg=index"/>
            </c:if>
            <c:forEach items="${listBooktype}" var="v">
                <li><a href="book/listBook?booktypeid=${v.booktypeid}">${v.booktypename }</a></li>
            </c:forEach>
            <div class="fixed"></div>
        </ul>
    </div>
    <div class="w740 right">
        <div class="main_div">
            <div class="banner left"><img src="images/banner.png"/></div>
            <div class="fixed"></div>
        </div>

        <div class="main_div mt10">
            <h2>
                <cite class="left">新书上架</cite>
                <div class="fixed"></div>
            </h2>
            <ul id="arivals1" class="arivals">
            </ul>
        </div>
        <div class="main_div mt10">
            <h2>
                <cite class="left">热销图书</cite>
                <div class="fixed"></div>
            </h2>

            <ul id="arivals2" class="arivals">

            </ul>
        </div>
    </div>
    <div class="fixed"></div>
</div>
<!--end con-->
<script>
    $.getJSON("book/listBookJson?state=1", function (json) {
        var str = "";
        for (var i = 0; i < json.length; i++) {
            str += " <li><a href='#'><img src='http://127.0.0.1:8089/" + json[i].bookimage + "'/></a>" +
                "     <p>" + json[i].bookname + "</p>" +
                "     <p class='red'>￥" + json[i].bookprice + "</p>" +
                "     </li>";
        }
        str += "<div class='fixed'></div>";
        $("#arivals1").html(str);
        $("#arivals2").html(str);
    });
    //    $.ajax({
    //        type: "post",
    //        url: 'book/listBookJson?state=1',
    //        async: false, // 使用同步方式
    //        contentType: "application/json; charset=utf-8",
    //        dataType: "json",
    //        success: function (data) {
    //            if (data != null) {
    //                var str = "";
    //                for (var i = 0; i < data.length; i++) {
    //                    str += " <li><a href='#'><img src='http://127.0.0.1:8089/" + data[i].bookimage + "'/></a>" +
    //                        "     <p>" + data[i].bookname + "</p>" +
    //                        "     <p class='red'>￥" + data[i].bookprice + "</p>" +
    //                        "     </li>";
    //                }
    //                str += "<div class='fixed'></div>";
    //                $("#arivals1").html(str);
    //                $("#arivals2").html(str);
    //            }
    //        }
    //    });
</script>
<!--footer-->

<div id="footer_wrap">
    <p>Copyright ©2014 飞凡教育，版权所有</p>
</div>
<!--end footer-->
</body>
</html>
