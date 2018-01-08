<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<head>
    <%@include file="../main.jsp" %>
</head>
<body>
<!--top-->


<div id="top_div">


    <p class="left">您好，欢迎来到飞凡网上书店 ！</p>
    <p class="right"><a href="#">登陆</a> | <a href="#">注册</a> | <a href="#">我的购物车</a> | <a href="#">网站首页</a></p>


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

<!--content-->
<div class="w960 mt10">
    <div class="breadcrumb"></div>
</div>

<div class="w960">
    <div class="side left">


        <!--nav-->
        <h4>书籍管理</h4>
        <ul class="classify E6">
            <li>&nbsp;&nbsp;<a href="page/addBook">新&nbsp;增</a></li>
            <li>&nbsp;&nbsp;<a href="page/listBook1">未上架</a></li>
            <li>&nbsp;&nbsp;<a href="page/listBook2">已上架</a></li>
            <li>&nbsp;&nbsp;<a href="page/listBook3">已下架</a></li>
            <div class="fixed"></div>
        </ul>
        <h4>订单管理</h4>
        <ul class="classify E6">
            <li>&nbsp;&nbsp;<a href="page/listOrder1">未发货</a></li>
            <li>&nbsp;&nbsp;<a>已发货</a></li>
            <li>&nbsp;&nbsp;<a href="page/listOrder3">已签收</a></li>
            <div class="fixed"></div>
        </ul>
        <!--end nav-->

    </div>

    <div class="w740 right">
        <div class="o-mt">
            <h2>已发货订单</h2>
        </div>
        <div class="order01">
            <form name="" method="post" action="">
                <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
                    <tr>
                        <td width="15%" align="right">收货人电话：</td>
                        <td width="15%">
                            <input type="text" name="" value="" class="w110 input">
                        </td>
                        <td width="15%" align="right"></td>
                        <td width="15%">
                            <input type="image" name="imageField2" src="images/btn_cx.png"/>
                        </td>
                        <td width="15%" align="right"></td>
                        <td width="25%"></td>
                    </tr>
                </table>
            </form>
        </div>

        <div class="order02">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <th width="10%" class="bd2">下单日期</th>
                    <th width="15%" class="bd2">收货人</th>
                    <th width="15%" class="bd2">收货人电话</th>
                    <th width="15%" class="bd2">收货人邮编</th>
                    <th width="15%" class="bd2">收货人地址</th>
                    <th width="10%" class="bd2">发货方式</th>
                    <th width="10%" class="bd2">订单总价</th>
                    <th width="10%" class="bd2">操作</th>
                </tr>


                <tr>
                    <td width="10%" class="text">2014-11-27</td>
                    <td width="15%" class="text">张三</td>
                    <td width="15%" class="text">13312345678</td>
                    <td width="15%" class="text">021</td>
                    <td width="15%" class="text">北京</td>
                    <td width="10%" class="text">

                        平邮


                    </td>
                    <td width="10%" class="text">￥53.30</td>
                    <td width="10%" class="text">

                    </td>
                </tr>


            </table>
        </div>

        <!-- page -->
        <div style="text-align: right;">
            每页 5 行 共 1 行 第 1 页 共 1 页 <a href='javascript:gotoPage(1)'>首页</a> <a href='javascript:gotoPage(1)'>上一页</a> <a
                href='javascript:gotoPage(1)'>下一页</a> <a href='javascript:gotoPage(1)'>尾页</a> 页数 <input type='text'
                                                                                                        id='pageNumber'
                                                                                                        style='width:20px;'/>
            <a href='javascript:jumpPage()'>GO</a>
        </div>
        <!-- end page -->
    </div>
    <div class="fixed"></div>
</div>
<!--end content-->

<!--footer-->

<div id="footer_wrap">
    <p>Copyright ©2014 飞凡教育，版权所有</p>
</div>

<!--end footer-->
</body>
</html>
