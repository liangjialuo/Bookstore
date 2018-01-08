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

            <li><a href="#">文艺</a></li>

            <li><a href="#">小说</a></li>

            <li><a href="#">青春</a></li>

            <li><a href="#">童书</a></li>

            <li><a href="#">励志/成功</a></li>

            <li><a href="#">生活</a></li>

            <li><a href="#">人文社科</a></li>

            <li><a href="#">经管</a></li>

            <li><a href="#">科技</a></li>

            <li><a href="#">教育</a></li>

            <li><a href="#">工具书</a></li>

            <li><a href="#">期刊</a></li>

            <div class="fixed"></div>
        </ul>

    </div>
    <div class="w740 right">
        <div class="order02">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <th width="20%" class="bd2">书名</th>
                    <th width="20%" class="bd2">单价</th>
                    <th width="20%" class="bd2">数量</th>
                    <th width="20%" class="bd2">小计</th>
                    <th width="20%" class="bd2">操作</th>
                </tr>


                <tr>
                    <td width="20%" class="text">冷间谍</td>
                    <td width="20%" class="text">28.50</td>
                    <td width="20%" class="text">
                        <input class="input" style="width: 50px;text-align: center;" type="text" value="1">
                    </td>
                    <td width="20%" class="text">28.50</td>
                    <td width="20%" class="text">
                        <a href="#">删除</a>
                        <a href="#">更新</a>
                    </td>
                </tr>

                <tr>
                    <td width="20%" class="text">第一商会</td>
                    <td width="20%" class="text">24.80</td>
                    <td width="20%" class="text">
                        <input class="input" style="width: 50px;text-align: center;" type="text" value="1">
                    </td>
                    <td width="20%" class="text">24.80</td>
                    <td width="20%" class="text">
                        <a href="#">删除</a>
                        <a href="#">更新</a>
                    </td>
                </tr>


            </table>

            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="bd2">
                <tr bgcolor="#fefcea">
                    <td width="80%" align="right"><strong>订单总价：</strong></td>
                    <td width="20%" align="left"><strong><span class="STYLE1">53.30</span></strong></td>
                </tr>
            </table>
            <table width="738" border="0" cellspacing="0" cellpadding="0" class="mt10">
                <tr>
                    <td width="5%" align="center"></td>
                    <td width="30%" align="center">
                        <a href="#"><img src="images/btn_shoppingcart.png"/></a>
                    </td>
                    <td width="30%" align="center">
                        <a href="#"><img src="images/btn_jxgm.png"/></a>
                    </td>
                    <td width="30%" align="center">
                        <a href="#"><img src="images/btn_accounts.png"/></a>
                    </td>
                    <td width="5%"></td>
                </tr>
            </table>

        </div>
    </div>
    <div class="fixed"></div>
</div>
<!--end con-->

<!--footer-->

<div id="footer_wrap">
    <p>Copyright ©2014 飞凡教育，版权所有</p>
</div>

<!--end footer-->
</body>
</html>
