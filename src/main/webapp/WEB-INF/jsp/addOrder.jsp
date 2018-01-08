<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<head>
    <%@include file="main.jsp"%>
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
        <div class="o-mt">
            <h2>订单新增</h2>
        </div>
        <div class="order02 pb10">
            <form>
                <table width="738" align="center" cellpadding="0" cellspacing="0">
                    <tr class="bd2">
                        <th width="20%" align="center" class="bd2">收货人
                        </td>
                        <td width="80%" align="left" class="bd1 pl9">
                            <input type="text" name="" value="" class="input w300"><span class="required">*</span>
                        </td>
                    </tr>
                    <tr class="bd2">
                        <th width="20%" align="center" class="bd2">收货人电话
                        </td>
                        <td width="80%" align="left" class="bd1 pl9">
                            <input type="text" name="" value="" class="input w300"><span class="required">*</span>
                        </td>
                    </tr>
                    <tr class="bd2">
                        <th width="20%" align="center" class="bd2">收货人邮编
                        </td>
                        <td width="80%" align="left" class="bd1 pl9">
                            <input type="text" name="" value="" class="input w300"><span class="required">*</span>
                        </td>
                    </tr>
                    <tr class="bd2">
                        <th width="20%" align="center" class="bd2">收货人地址
                        </td>
                        <td width="80%" align="left" class="bd1 pl9">
                            <input type="text" name="" value="" class="input w300"><span class="required">*</span>
                        </td>
                    </tr>

                    <tr class="bd2">
                        <th width="20%" align="center" class="bd2">发货方式
                        </td>
                        <td width="80%" align="left" class="bd1 pl9">
                            <select name="" style="width:305px;">
                                <option value="">--请选择--</option>
                                <option value="1">平邮</option>
                                <option value="2">快递</option>
                            </select><span class="required">*</span>
                        </td>
                    </tr>
                </table>

                <table width="738" border="0" cellspacing="0" cellpadding="0" class="mt10" align="center">
                    <tr>
                        <td width="20%" align="center" class="bd2"></td>
                        <td width="80%" align="left" class="pl9">
                            <input type="submit" value="确定" class="btn"/>
                        </td>
                    </tr>
                </table>
            </form>
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
