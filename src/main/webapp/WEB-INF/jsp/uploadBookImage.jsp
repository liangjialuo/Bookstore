<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<head>
    <%@include file="main.jsp" %>
</head>
<body>
<!--top-->


<div id="top_div">


    <p class="left">您好admin，欢迎来到飞凡网上书店 ！</p>
    <p class="right"><a href="#">后台管理</a> | <a href="#">退出系统</a> | <a href="#">网站首页</a></p>


    <div class="fixed"></div>
</div>

<div id="header_div">
    <div id="search">
        <!--form的id与下面文本框的id不能修改，因为使用了id选择器定义样式-->
        <form name="bookForm" id="form" method="post" action="#">
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
            <li>&nbsp;&nbsp;<a href="#">新&nbsp;&nbsp;增</a></li>
            <li>&nbsp;&nbsp;<a href="#">未上架</a></li>
            <li>&nbsp;&nbsp;<a href="#">已上架</a></li>
            <li>&nbsp;&nbsp;<a href="#">已下架</a></li>
            <div class="fixed"></div>
        </ul>
        <h4>订单管理</h4>
        <ul class="classify E6">
            <li>&nbsp;&nbsp;<a href="#">未发货</a></li>
            <li>&nbsp;&nbsp;<a href="#">已发货</a></li>
            <li>&nbsp;&nbsp;<a href="#">已签收</a></li>
            <div class="fixed"></div>
        </ul>
        <!--end nav-->

    </div>

    <div class="w740 right">
        <div class="o-mt">
            <h2>图片上传</h2>
        </div>
        <div class="order02 pb10">
            <form enctype="multipart/form-data">
                <table width="738" align="center" cellpadding="0" cellspacing="0">
                    <tr class="bd2">
                        <th width="20%" align="center" class="bd2">图片
                        </td>
                        <td width="80%" align="left" class="bd1 pl9">
                            <input type="file" id="" name="" class="input w300"/><span class="required">*</span>
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
<!--end content-->

<!--footer-->

<div id="footer_wrap">
    <p>Copyright ©2014 飞凡教育，版权所有</p>
</div>

<!--end footer-->
</body>
</html>
