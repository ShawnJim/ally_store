/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-06-26 03:23:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pro_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");

	pageContext.setAttribute("APP_PATH", request.getContextPath());
	pageContext.setAttribute("IP_ADRESS", "http://localhost:8081");
	pageContext.setAttribute("STO_ADRESS", "http://localhost:8083");

      out.write("\r\n");
      out.write("<title>ALLELUJA-商品详情</title>\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("  <script src=\"http://apps.bdimg.com/libs/html5shiv/3.7/html5shiv.min.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"edge\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/css/shouye.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/css/index.css\">\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery.fly.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/public.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--//内容选择-->\r\n");
      out.write("\r\n");
      out.write("<!--[if lte IE 9]>\r\n");
      out.write("</script><script src=\"js/ie9.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/base.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t\t\tdocument.createElement(\"top\")\r\n");
      out.write("\t\t</script>\r\n");
      out.write("<script>\r\n");
      out.write("\t\t\tdocument.createElement(\"search\")\r\n");
      out.write("\t\t</script>\r\n");
      out.write("<script>\r\n");
      out.write("\t\t\tdocument.createElement(\"light\")\r\n");
      out.write("\t\t</script>\r\n");
      out.write("<script>\r\n");
      out.write("\t\t\tdocument.createElement(\"light1\")\r\n");
      out.write("\t\t</script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/modernizr-custom-v2.7.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<!--最大的背景-->\r\n");
      out.write("\t<div class=\"maxbj\"></div>\r\n");
      out.write("\r\n");
      out.write("\t<!--头部-->\r\n");
      out.write("\t<top>\r\n");
      out.write("\t<section class=\"seck\">\r\n");
      out.write("\t\t<div class=\"register_login\">\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"user_id\"> \r\n");
      out.write("\t\t\t<em id=\"show_user_name\">您好，</em> <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_ADRESS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/page/login.html\" id=\"page_log\">会员登录</a> <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_ADRESS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/page/register.html\" id=\"page_reg\">快速注册</a>\r\n");
      out.write("\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${STO_ADRESS }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/sto_index.html\" id=\"jump_for_page01\">返回首页</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"vip_center\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/sto_personal.html\" id=\"jump_for_page\">个人中心</a> <a href=\"#\">商户中心</a> <a href=\"#\">帮助</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t</top>\r\n");
      out.write("\t<!--header-->\r\n");
      out.write("\r\n");
      out.write("\t<header>\r\n");
      out.write("\t<p></p>\r\n");
      out.write("\t\t<b><i id=\"detail_pro_fcate\" style=\"font-size: 25px;\"></i><a\r\n");
      out.write("\t\t\thref=\"#\" style=\"font-size: 25px; color: red;\" id=\"detail_pro_scate\"></a></b>\r\n");
      out.write("\t\t<b><a href=\"#\" style=\"font-size: 22px; margin-left: 50%;\"><img\r\n");
      out.write("\t\t\t\talt=\"购物车\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/images/shopping_cart95.png\"\r\n");
      out.write("\t\t\t\twidth=\"22px\" /> 购物车</a></b>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<!--banner-->\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"Xcontent\">\r\n");
      out.write("\t\t<ul class=\"Xcontent01\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"Xcontent06\" id=\"show_pro_pic\"></div>\r\n");
      out.write("\t\t\t<ol class=\"Xcontent08\">\r\n");
      out.write("\t\t\t\t<div class=\"Xcontent07\" id=\"show_pro_pic0\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"Xcontent09\" id=\"show_pro_pic1\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"Xcontent10\" id=\"show_pro_pic2\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"Xcontent11\" id=\"show_pro_pic3\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"Xcontent12\" id=\"show_pro_pic4\"></div>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\t\t\t<ol class=\"Xcontent13\">\r\n");
      out.write("\t\t\t\t<div class=\"Xcontent14\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t<p id=\"detail_pro_name\"></p>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"Xcontent15\">\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/images/X11.png\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"Xcontent16\">\r\n");
      out.write("\t\t\t\t\t<p id=\"detail_pro_sellpoint\"></p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"Xcontent17\">\r\n");
      out.write("\t\t\t\t\t<p class=\"Xcontent18\">售价</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"Xcontent19\">\r\n");
      out.write("\t\t\t\t\t\t￥<span id=\"detail_pro_price\"></span>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<div class=\"Xcontent20\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"Xcontent21\">上架时间</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"Xcontent22\" id=\"detail_pro_shelftime\"></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"Xcontent23\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"Xcontent24\">仓库</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"Xcontent25\" id=\"detail_pro_warehouseName\"></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"Xcontent26\">\r\n");
      out.write("\t\t\t\t\t<p class=\"Xcontent27\">刊登平台（亚马逊暂不可用）</p>\r\n");
      out.write("\t\t\t\t\t<div class=\"Xcontent28\" style=\"line-height: 50px; font-size: 16px;\">ebay</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"Xcontent29\" style=\"line-height: 50px; font-size: 16px;\">亚马逊</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"Xcontent30\">\r\n");
      out.write("\t\t\t\t\t<p class=\"Xcontent31\">数量</p>\r\n");
      out.write("\t\t\t\t\t<div class=\"Xcontent32\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/images/X15.png\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t<input class=\"input\" value=\"1\" id=\"input_order_total\">\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t<div class=\"Xcontent33\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/images/16.png\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"Xcontent34\">\r\n");
      out.write("\t\t\t\t\t<a onclick=\"pro_published_submit()\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/images/X17.png\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"Xcontent35\">\r\n");
      out.write("\t\t\t\t\t<a><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/images/X18.png\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"height: 50px; background-color: #1B6D85;\"></div>\r\n");
      out.write("\t<!--\r\n");
      out.write("        \t作者：offline\r\n");
      out.write("        \t时间：2018-06-18\r\n");
      out.write("        \t描述：内容展示\r\n");
      out.write("       -->\r\n");
      out.write("\t<div class=\"menus menus2\">\r\n");
      out.write("\t<input type=\"hidden\" id=\"bra_id\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<div class=\"bg\"></div>\r\n");
      out.write("\t\t\t<li><span>商品描述</span></li>\r\n");
      out.write("\t\t\t<li><span>商品属性</span></li>\r\n");
      out.write("\t\t\t<li><span>商品评价</span></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t<div class=\"tab tab1 show\" id=\"detail_proDetail\"\r\n");
      out.write("\t\t\tstyle=\"overflow: auto;\"></div>\r\n");
      out.write("\t\t<div class=\"tab tab1\">\r\n");
      out.write("\t\t\t<h3 style=\"font-size: 16px;\">商品颜色:</h3>\r\n");
      out.write("\t\t\t<b id=\"detail_pro_color\"></b>\r\n");
      out.write("\t\t\t<h3 style=\"font-size: 16px;\">商品大小:</h3>\r\n");
      out.write("\t\t\t<b id=\"detail_pro_size\"></b>\r\n");
      out.write("\t\t\t<h3 style=\"font-size: 16px;\">商品重量:</h3>\r\n");
      out.write("\t\t\t<b id=\"detail_pro_weight\"></b>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"tab tab1\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/slider.js\"></script>\r\n");
      out.write("\t<!--gong告-->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\twindow.onload = function() {\r\n");
      out.write("\t\t\t\t\t$(\"top\").animate({\r\n");
      out.write("\t\t\t\t\t\t'margin-top': '0'\r\n");
      out.write("\t\t\t\t\t}, 2)\r\n");
      out.write("\t\t\t\t\t$(\".advertisement\").animate({\r\n");
      out.write("\t\t\t\t\t\t'top': '30',\r\n");
      out.write("\t\t\t\t\t\t'opacity': '1'\r\n");
      out.write("\t\t\t\t\t}, 200)\r\n");
      out.write("\t\t\t\t\t$(\".flexslider\").animate({\r\n");
      out.write("\t\t\t\t\t\t'margin-top': '0'\r\n");
      out.write("\t\t\t\t\t}, 200)\r\n");
      out.write("\t\t\t\t\t$(\"aside\").animate({\r\n");
      out.write("\t\t\t\t\t\t'top': '30',\r\n");
      out.write("\t\t\t\t\t\t'opacity': '1'\r\n");
      out.write("\t\t\t\t\t}, 200)\r\n");
      out.write("\t\t\t\t\t$(\"top\").animate({\r\n");
      out.write("\t\t\t\t\t\t'margin-top': '-400'\r\n");
      out.write("\t\t\t\t\t}, 1000)\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t<!--页脚-->\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<section class=\"foot_in\">\r\n");
      out.write("\t\t\t<!--left-->\r\n");
      out.write("\t\t\t<div class=\"foot_in_left\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<div class=\"foots\">\r\n");
      out.write("\t\t<div class=\"foots_in\">\r\n");
      out.write("\t\t\t<a href=\"#\" style=\"float: left\"> </a> <em>CopyRight © 2000-2016\r\n");
      out.write("\t\t\t\tBitAuto,All Rights Reserved.</em>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--侧边栏-->\r\n");
      out.write("\t<div class=\"toolbar\">\r\n");
      out.write("\t\t<a href=\"###\" class=\"toolbar-item toolbar-item-weixin\"\r\n");
      out.write("\t\t\tstyle=\"position: relative\"> <em\r\n");
      out.write("\t\t\tstyle=\"position: absolute; display: block; line-height: 20px; font-size: 12px; color: #f00; top: -20px; left: 0\">(0)</em>\r\n");
      out.write("\t\t\t<!--<span class=\"toolbar-layer\"></span>-->\r\n");
      out.write("\t\t</a> <a href=\"###\" class=\"toolbar-item toolbar-item-feedback\"></a> <a\r\n");
      out.write("\t\t\thref=\"###\" class=\"toolbar-item toolbar-item-app\"> <span\r\n");
      out.write("\t\t\tclass=\"toolbar-layer\"></span>\r\n");
      out.write("\t\t</a> <a href=\"javascript:scroll(0,0)\" id=\"top\"\r\n");
      out.write("\t\t\tclass=\"toolbar-item toolbar-item-top\"></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--购物车fly插件-->\r\n");
      out.write("\t<!--内容详情切换插件-->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/index.js\"></script>\r\n");
      out.write("\t<!-- 逻辑js -->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(function() {\r\n");
      out.write("\t\t\t\t//获取url传的参数\r\n");
      out.write("\t\t\t\tvar id = getUrlParam(\"id\");\r\n");
      out.write("\t\t\t\t//根据商品id进行商品数据的获取\r\n");
      out.write("\t\t\t\tget_product(id);\r\n");
      out.write("\t\t\t\t//从页面中获取id\r\n");
      out.write("\t\t\t\tvar cid = getUrlParam(\"Id\");\r\n");
      out.write("\t\t\t\t//根据id发送ajax获取用户的数据\r\n");
      out.write("\t\t\t\tget_user(cid);\r\n");
      out.write("\t\t\t\t$(\"#user_id\").val(cid);\r\n");
      out.write("\t\t\t\t$(\"#jump_for_page\").attr(\"href\",$(\"#jump_for_page\").attr(\"href\")+\"?Id=\"+cid);\r\n");
      out.write("\t\t\t\t$(\"#jump_for_page01\").attr(\"href\",$(\"#jump_for_page01\").attr(\"href\")+\"?Id=\"+cid);\r\n");
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//判断用户登陆状态\r\n");
      out.write("\t\t\tfunction user_islogin(){\r\n");
      out.write("\t\t\t\tvar islogin = $(\"#show_user_name\").val();\r\n");
      out.write("\t\t\t\tif(islogin == 1 ){\r\n");
      out.write("\t\t\t\t\t$(\"#page_log\").text(\"退出登陆\");\r\n");
      out.write("\t\t\t\t\t$(\"#page_reg\").hide();\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(\"#page_reg\").show();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//获取url传的参数\r\n");
      out.write("\t\t\tfunction getUrlParam(name) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar reg = new RegExp(\"(^|&)\" + name + \"=([^&]*)(&|$)\"); //构造一个含有目标参数的正则表达式对象\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar r = window.location.search.substr(1).match(reg); //匹配目标参数\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tif (r != null)\r\n");
      out.write("\t\t\t\t\treturn unescape(r[2]);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\treturn null; //返回参数值\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//根据id发送ajax获取用户的数据,并进行数据处理\r\n");
      out.write("\t\t\tfunction get_user(id){\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IP_ADRESS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/rest/getUser/\" + id,\r\n");
      out.write("\t\t\t\t\ttype : \"GET\",\r\n");
      out.write("\t\t\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\t\t\tif (result.code == 100) {\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#show_user_name\").text($(\"#show_user_name\").text()+result.extend.User.compellation)\r\n");
      out.write("\t\t\t\t\t\t\t.attr(\"value\",1);\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\talert(\"数据处理失败！！请重新刷新也面\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t//判断用户登陆状态\r\n");
      out.write("\t\t\t\t\t\tuser_islogin();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//根据商品id进行商品数据的获取\r\n");
      out.write("\t\t\tfunction get_product(id){\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IP_ADRESS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/rest/get_product/\"+id,\r\n");
      out.write("\t\t\t\t\ttype : \"GET\",\r\n");
      out.write("\t\t\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\t\t\t//进行数据填充\r\n");
      out.write("\t\t\t\t\t\tpro_data_add(result); \r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//商品数据的填充\r\n");
      out.write("\t\t\tfunction pro_data_add(result){\r\n");
      out.write("\t\t\t\tvar product = result.extend.product;\r\n");
      out.write("\t\t\t\tconsole.log(product);\r\n");
      out.write("\t\t\t\t$(\"#bra_id\").val(product.userid);\r\n");
      out.write("\t\t\t\t$(\"#detail_pro_name\").text(product.name);\r\n");
      out.write("\t\t\t\t$(\"#detail_pro_sellpoint\").text(product.sellPoint);\r\n");
      out.write("\t\t\t\t$(\"#detail_pro_price\").text(product.price);\r\n");
      out.write("\t\t\t\t$(\"#detail_pro_shelftime\").text(timestampToTime(product.shelftime));\r\n");
      out.write("\t\t\t\t//获取页商品数据仓库的名称\r\n");
      out.write("\t\t\t\tget_pro_wareName(product.warehouseid);\r\n");
      out.write("\t\t\t\t$(\"#detail_proDetail\").append(product.details);\r\n");
      out.write("\t\t\t\t$(\"#detail_pro_color\").append(product.color);\r\n");
      out.write("\t\t\t\t$(\"#detail_pro_size\").append(product.size+\"cm²\");\r\n");
      out.write("\t\t\t\t$(\"#detail_pro_weight\").append(product.weight+\" kg\");\r\n");
      out.write("\t\t\t\t//获取商品数据种类的名称\r\n");
      out.write("\t\t\t\tget_pro_cateName(product.fCategoryid);\r\n");
      out.write("\t\t\t\tget_pro_cateName(product.sCategoryid);\r\n");
      out.write("\t\t\t\tvar pics = product.picture.split('--');\r\n");
      out.write("\t\t\t\t$(\"#show_pro_pic\").append($(\"<img src='' width='429px' height='430px'>\").attr(\"src\",pics[0]));\r\n");
      out.write("\t\t\t\tfor(var i=0;i<5;i++){\r\n");
      out.write("\t\t\t\t\tif(pics[i]==null){\r\n");
      out.write("\t\t\t\t\t\t$(\"#show_pro_pic\"+i).hide();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t$(\"#show_pro_pic\"+i).append($(\"<img src=''>\").attr(\"src\",pics[i]));\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//根据分类id获取商品分类名称\r\n");
      out.write("\t\t\tfunction get_pro_cateName(id){\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IP_ADRESS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/rest/getCate/\"+id,\r\n");
      out.write("\t\t\t\t\ttype : \"GET\",\r\n");
      out.write("\t\t\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\t\t\tif (result.code == 100) {\r\n");
      out.write("\t\t\t\t\t\t\t//进行商品分类数据处理\r\n");
      out.write("\t\t\t\t\t\t\tadd_cate_data(result);\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\talert(\"数据处理失败！！请重新刷新也面\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//分类数据填充\r\n");
      out.write("\t\t\tfunction add_cate_data(result){\r\n");
      out.write("\t\t\t\tvar isparent = result.extend.category.idparent;\r\n");
      out.write("\t\t\t\tif(isparent==\"1\"){\r\n");
      out.write("\t\t\t\t\t$(\"#detail_pro_fcate\").append(\"商品分类：\"+result.extend.category.name+\">\");\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(\"#detail_pro_scate\").text(result.extend.category.name);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//日期格式化\r\n");
      out.write("\t\t\tfunction timestampToTime(timestamp) {\r\n");
      out.write("\t\t\t\tvar date = new Date(timestamp);//时间戳为10位需*1000，时间戳为13位的话不需乘1000  \r\n");
      out.write("\t\t\t\tY = date.getFullYear() + '/';\r\n");
      out.write("\t\t\t\tM = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date\r\n");
      out.write("\t\t\t\t\t\t.getMonth() + 1)\r\n");
      out.write("\t\t\t\t\t\t+ '/';\r\n");
      out.write("\t\t\t\tD = date.getDate() + ' ';\r\n");
      out.write("\t\t\t\th = date.getHours() + ':';\r\n");
      out.write("\t\t\t\tm = date.getMinutes() + ':';\r\n");
      out.write("\t\t\t\ts = date.getSeconds();\r\n");
      out.write("\t\t\t\treturn Y + M + D + h + m + s;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//获取页商品数据仓库的名称\r\n");
      out.write("\t\t\tfunction get_pro_wareName(warehouseId){\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IP_ADRESS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/rest/getWarehouseById/\"+warehouseId,\r\n");
      out.write("\t\t\t\t\ttype : \"GET\",\r\n");
      out.write("\t\t\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\t\t\tif (result.code == 100) {\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#detail_pro_warehouseName\").text(result.extend.warehouse.name);\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\talert(\"数据处理失败！！请重新刷新也面\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t\tvar $miaobian = $('.Xcontent08>div');\r\n");
      out.write("\t\t\t\tvar $huantu = $('.Xcontent06>img');\r\n");
      out.write("\t\t\t\tvar $miaobian1 = $('.Xcontent26>div');\r\n");
      out.write("\t\t\t\t$miaobian.mousemove(function() {\r\n");
      out.write("\t\t\t\t\tmiaobian(this);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$miaobian1.click(function() {\r\n");
      out.write("\t\t\t\t\tmiaobian1(this);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tfunction miaobian(thisMb) {\r\n");
      out.write("\t\t\t\t\tfor(var i = 0; i < $miaobian.length; i++) {\r\n");
      out.write("\t\t\t\t\t\t$miaobian[i].style.borderColor = '#dedede';\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tthisMb.style.borderColor = '#cd2426';\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t/* $huantu[0].src = thisMb.children[0].src; */\r\n");
      out.write("\t\t\t\t\t$(\"#show_pro_pic\").empty();\r\n");
      out.write("\t\t\t\t\t$(\"#show_pro_pic\").append($(\"<img src='' width='429px' height='430px'>\").attr(\"src\",thisMb.children[0].src));\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tfunction miaobian1(thisMb1) {\r\n");
      out.write("\t\t\t\t\tfor(var i = 0; i < $miaobian1.length; i++) {\r\n");
      out.write("\t\t\t\t\t\t$miaobian1[i].style.borderColor = '#dedede';\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t//\t\tthisMb.style.borderColor = '#cd2426';\r\n");
      out.write("\t\t\t\t\t$miaobian.css('border-color', '#dedede');\r\n");
      out.write("\t\t\t\t\tthisMb1.style.borderColor = '#cd2426';\r\n");
      out.write("\t\t\t\t\t$huantu[0].src = thisMb1.children[0].src;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t$(\".Xcontent33\").click(function() {\r\n");
      out.write("\t\t\t\t\tvar value = parseInt($('.input').val()) + 1;\r\n");
      out.write("\t\t\t\t\t$('.input').val(value);\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\".Xcontent32\").click(function() {\r\n");
      out.write("\t\t\t\t\tvar num = $(\".input\").val()\r\n");
      out.write("\t\t\t\t\tif(num > 0) {\r\n");
      out.write("\t\t\t\t\t\t$(\".input\").val(num - 1);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction pro_published_submit(){\r\n");
      out.write("\t\t\t\t//品牌商id\r\n");
      out.write("\t\t\t\tvar braid = $(\"#bra_id\").val();\r\n");
      out.write("\t\t\t\t//分销商id\r\n");
      out.write("\t\t\t\tvar stoid = $(\"#user_id\").val();\r\n");
      out.write("\t\t\t\t//商品数量\r\n");
      out.write("\t\t\t\tvar productnum = $(\"#input_order_total\").val();\r\n");
      out.write("\t\t\t\t//商品单价\r\n");
      out.write("\t\t\t\tvar price = $(\"#detail_pro_price\").text();\r\n");
      out.write("\t\t\t\t//订单总价\r\n");
      out.write("\t\t\t\tvar totalprice = productnum*price;\r\n");
      out.write("\t\t\t\t//商品id\r\n");
      out.write("\t\t\t\tvar productid = getUrlParam(\"id\");\r\n");
      out.write("\t\t\t\t//发送ajax请求添加订单\r\n");
      out.write("\t\t\t\tadd_order_pro(braid,stoid,productnum,totalprice,productid); \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//发送ajax请求添加订单\r\n");
      out.write("\t\t\tfunction add_order_pro(braid,stoid,productnum,totalprice,productid){\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IP_ADRESS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/rest/add_order/\",\r\n");
      out.write("\t\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\t\tbraid : braid,\r\n");
      out.write("\t\t\t\t\t\tstoid : stoid,\r\n");
      out.write("\t\t\t\t\t\tproductnum : productnum,\r\n");
      out.write("\t\t\t\t\t\ttotalprice : totalprice,\r\n");
      out.write("\t\t\t\t\t\tproductid : productid\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\t\t\tif (result.code == 100) {\r\n");
      out.write("\t\t\t\t\t\t\tconsole.log(result);\r\n");
      out.write("\t\t\t\t\t\t\t//跳转到订单提交\r\n");
      out.write("\t\t\t\t\t\t\tjump_order_detail(result);\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\talert(\"数据处理失败！！请重新刷新也面\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//跳转到订单提交\r\n");
      out.write("\t\t\tfunction jump_order_detail(result){\r\n");
      out.write("\t\t\t\tvar oid = result.extend.orderID;\r\n");
      out.write("\t\t\t\twindow.location.replace(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/sto_shopping_submit.html?orderid=\"+oid+\"&Id=\"+$(\"#user_id\").val());\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}