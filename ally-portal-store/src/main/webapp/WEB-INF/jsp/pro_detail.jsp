<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	pageContext.setAttribute("IP_ADRESS", "http://localhost:8081");
	pageContext.setAttribute("STO_ADRESS", "http://localhost:8083");
%>
<title>ALLELUJA-商品详情</title>
<!--[if lt IE 9]>
  <script src="http://apps.bdimg.com/libs/html5shiv/3.7/html5shiv.min.js"></script>
<![endif]-->
<meta http-equiv="X-UA-Compatible" content="edge" />
<link rel="stylesheet" href="${APP_PATH}/static/css/shouye.css">
<link rel="stylesheet" type="text/css"
	href="${APP_PATH}/static/css/index.css">
<script src="${APP_PATH}/static/js/jquery-1.8.3.min.js"></script>
<script src="${APP_PATH}/static/js/jquery.fly.min.js"></script>
<script src="${APP_PATH}/static/js/public.js"></script>

<!--//内容选择-->
<%-- 	<link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/default.css" />
		<link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/component.css" />
		<script src="${APP_PATH}/static/js/modernizr.custom.js"></script> --%>
<!--[if lte IE 9]>
</script><script src="js/ie9.js"></script>
<![endif]-->
<script src="${APP_PATH}/static/js/base.js"></script>
<script>
			document.createElement("top")
		</script>
<script>
			document.createElement("search")
		</script>
<script>
			document.createElement("light")
		</script>
<script>
			document.createElement("light1")
		</script>
<script src="${APP_PATH}/static/js/modernizr-custom-v2.7.1.min.js"></script>

</head>

<body>
	<!--最大的背景-->
	<div class="maxbj"></div>

	<!--头部-->
	<top>
	<section class="seck">
		<div class="register_login">
		<input type="hidden" id="user_id"> 
			<em id="show_user_name">您好，</em> <a href="${LOGIN_ADRESS}/page/login.html" id="page_log">会员登录</a> <a href="${LOGIN_ADRESS}/page/register.html" id="page_reg">快速注册</a>
			<a href="${STO_ADRESS }/sto_index.html" id="jump_for_page01">返回首页</a>
		</div>
		<div class="vip_center">
			<a href="${APP_PATH}/sto_personal.html" id="jump_for_page">个人中心</a> <a href="#">商户中心</a> <a href="#">帮助</a>
		</div>
	</section>
	</top>
	<!--header-->

	<header>
	<p></p>
		<b><i id="detail_pro_fcate" style="font-size: 25px;"></i><a
			href="#" style="font-size: 25px; color: red;" id="detail_pro_scate"></a></b>
		<b><a href="#" style="font-size: 22px; margin-left: 50%;"><img
				alt="购物车" src="${APP_PATH}/static/images/shopping_cart95.png"
				width="22px" /> 购物车</a></b>
	</header>
	<!--banner-->

	<div class="Xcontent">
		<ul class="Xcontent01">

			<div class="Xcontent06" id="show_pro_pic"></div>
			<ol class="Xcontent08">
				<div class="Xcontent07" id="show_pro_pic0"></div>
				<div class="Xcontent09" id="show_pro_pic1"></div>
				<div class="Xcontent10" id="show_pro_pic2"></div>
				<div class="Xcontent11" id="show_pro_pic3"></div>
				<div class="Xcontent12" id="show_pro_pic4"></div>
			</ol>
			<ol class="Xcontent13">
				<div class="Xcontent14">
					<a href="#">
						<p id="detail_pro_name"></p>
					</a>
				</div>
				<div class="Xcontent15">
					<img src="${APP_PATH}/static/images/X11.png">
				</div>
				<div class="Xcontent16">
					<p id="detail_pro_sellpoint"></p>
				</div>
				<div class="Xcontent17">
					<p class="Xcontent18">售价</p>
					<p class="Xcontent19">
						￥<span id="detail_pro_price"></span>
					</p>
					<div class="Xcontent20">
						<p class="Xcontent21">上架时间</p>
						<p class="Xcontent22" id="detail_pro_shelftime"></p>
					</div>
					<div class="Xcontent23">
						<p class="Xcontent24">仓库</p>
						<p class="Xcontent25" id="detail_pro_warehouseName"></p>
					</div>

				</div>
				<div class="Xcontent26">
					<p class="Xcontent27">刊登平台（亚马逊暂不可用）</p>
					<div class="Xcontent28" style="line-height: 50px; font-size: 16px;">ebay</div>
					<div class="Xcontent29" style="line-height: 50px; font-size: 16px;">亚马逊</div>
				</div>
				<div class="Xcontent30">
					<p class="Xcontent31">数量</p>
					<div class="Xcontent32">
						<img src="${APP_PATH}/static/images/X15.png">
					</div>
					<form>
						<input class="input" value="1" id="input_order_total">
					</form>
					<div class="Xcontent33">
						<img src="${APP_PATH}/static/images/16.png">
					</div>

				</div>
				<div class="Xcontent34">
					<a onclick="pro_published_submit()"><img src="${APP_PATH}/static/images/X17.png"></a>
				</div>
				<div class="Xcontent35">
					<a><img src="${APP_PATH}/static/images/X18.png"></a>
				</div>

			</ol>
		</ul>
	</div>
	<div style="height: 50px; background-color: #1B6D85;"></div>
	<!--
        	作者：offline
        	时间：2018-06-18
        	描述：内容展示
       -->
	<div class="menus menus2">
	<input type="hidden" id="bra_id">
		<ul>
			<div class="bg"></div>
			<li><span>商品描述</span></li>
			<li><span>商品属性</span></li>
			<li><span>商品评价</span></li>
		</ul>
		<div class="clear"></div>
		<div class="tab tab1 show" id="detail_proDetail"
			style="overflow: auto;"></div>
		<div class="tab tab1">
			<h3 style="font-size: 16px;">商品颜色:</h3>
			<b id="detail_pro_color"></b>
			<h3 style="font-size: 16px;">商品大小:</h3>
			<b id="detail_pro_size"></b>
			<h3 style="font-size: 16px;">商品重量:</h3>
			<b id="detail_pro_weight"></b>
		</div>
		<div class="tab tab1"></div>
	</div>
	<script src="${APP_PATH}/static/js/slider.js"></script>
	<!--gong告-->
	<script type="text/javascript">
				window.onload = function() {
					$("top").animate({
						'margin-top': '0'
					}, 2)
					$(".advertisement").animate({
						'top': '30',
						'opacity': '1'
					}, 200)
					$(".flexslider").animate({
						'margin-top': '0'
					}, 200)
					$("aside").animate({
						'top': '30',
						'opacity': '1'
					}, 200)
					$("top").animate({
						'margin-top': '-400'
					}, 1000)

				}
			</script>

	<!--页脚-->
	<footer>
		<section class="foot_in">
			<!--left-->
			<div class="foot_in_left">
			
			</div>
		</section>
	</footer>
	<div class="foots">
		<div class="foots_in">
			<a href="#" style="float: left"> </a> <em>CopyRight © 2000-2016
				BitAuto,All Rights Reserved.</em>
		</div>
	</div>
	<!--侧边栏-->
	<div class="toolbar">
		<a href="###" class="toolbar-item toolbar-item-weixin"
			style="position: relative"> <em
			style="position: absolute; display: block; line-height: 20px; font-size: 12px; color: #f00; top: -20px; left: 0">(0)</em>
			<!--<span class="toolbar-layer"></span>-->
		</a> <a href="###" class="toolbar-item toolbar-item-feedback"></a> <a
			href="###" class="toolbar-item toolbar-item-app"> <span
			class="toolbar-layer"></span>
		</a> <a href="javascript:scroll(0,0)" id="top"
			class="toolbar-item toolbar-item-top"></a>
	</div>
	<!--购物车fly插件-->
	<!--内容详情切换插件-->
	<script src="${APP_PATH}/static/js/index.js"></script>
	<!-- 逻辑js -->
	<script type="text/javascript">
			$(function() {
				//获取url传的参数
				var id = getUrlParam("id");
				//根据商品id进行商品数据的获取
				get_product(id);
				//从页面中获取id
				var cid = getUrlParam("Id");
				//根据id发送ajax获取用户的数据
				get_user(cid);
				$("#user_id").val(cid);
				$("#jump_for_page").attr("href",$("#jump_for_page").attr("href")+"?Id="+cid);
				$("#jump_for_page01").attr("href",$("#jump_for_page01").attr("href")+"?Id="+cid);

			});
			
			//判断用户登陆状态
			function user_islogin(){
				var islogin = $("#show_user_name").val();
				if(islogin == 1 ){
					$("#page_log").text("退出登陆");
					$("#page_reg").hide();
				}else{
					$("#page_reg").show();
				}
			}
			
			//获取url传的参数
			function getUrlParam(name) {

				var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象

				var r = window.location.search.substr(1).match(reg); //匹配目标参数

				if (r != null)
					return unescape(r[2]);

				return null; //返回参数值

			}
			
			
			//根据id发送ajax获取用户的数据,并进行数据处理
			function get_user(id){
				$.ajax({
					url : "${IP_ADRESS}/rest/getUser/" + id,
					type : "GET",
					success : function(result) {
						if (result.code == 100) {
							$("#show_user_name").text($("#show_user_name").text()+result.extend.User.compellation)
							.attr("value",1);
						} else {
							alert("数据处理失败！！请重新刷新也面");
						}
						//判断用户登陆状态
						user_islogin();
					}
				
				});
			}
			
			//根据商品id进行商品数据的获取
			function get_product(id){
				$.ajax({
					url : "${IP_ADRESS}/rest/get_product/"+id,
					type : "GET",
					success : function(result) {
						//进行数据填充
						pro_data_add(result); 
					}
				});
			}
			
			//商品数据的填充
			function pro_data_add(result){
				var product = result.extend.product;
				console.log(product);
				$("#bra_id").val(product.userid);
				$("#detail_pro_name").text(product.name);
				$("#detail_pro_sellpoint").text(product.sellPoint);
				$("#detail_pro_price").text(product.price);
				$("#detail_pro_shelftime").text(timestampToTime(product.shelftime));
				//获取页商品数据仓库的名称
				get_pro_wareName(product.warehouseid);
				$("#detail_proDetail").append(product.details);
				$("#detail_pro_color").append(product.color);
				$("#detail_pro_size").append(product.size+"cm²");
				$("#detail_pro_weight").append(product.weight+" kg");
				//获取商品数据种类的名称
				get_pro_cateName(product.fCategoryid);
				get_pro_cateName(product.sCategoryid);
				var pics = product.picture.split('--');
				$("#show_pro_pic").append($("<img src='' width='429px' height='430px'>").attr("src",pics[0]));
				for(var i=0;i<5;i++){
					if(pics[i]==null){
						$("#show_pro_pic"+i).hide();
					}
					$("#show_pro_pic"+i).append($("<img src=''>").attr("src",pics[i]));
				}
			}
			
			//根据分类id获取商品分类名称
			function get_pro_cateName(id){
				$.ajax({
					url : "${IP_ADRESS}/rest/getCate/"+id,
					type : "GET",
					success : function(result) {
						if (result.code == 100) {
							//进行商品分类数据处理
							add_cate_data(result);
						} else {
							alert("数据处理失败！！请重新刷新也面");
						}
					}
				
				});
			}
			
			//分类数据填充
			function add_cate_data(result){
				var isparent = result.extend.category.idparent;
				if(isparent=="1"){
					$("#detail_pro_fcate").append("商品分类："+result.extend.category.name+">");
				}else{
					$("#detail_pro_scate").text(result.extend.category.name);
				}
			}
			
			//日期格式化
			function timestampToTime(timestamp) {
				var date = new Date(timestamp);//时间戳为10位需*1000，时间戳为13位的话不需乘1000  
				Y = date.getFullYear() + '/';
				M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date
						.getMonth() + 1)
						+ '/';
				D = date.getDate() + ' ';
				h = date.getHours() + ':';
				m = date.getMinutes() + ':';
				s = date.getSeconds();
				return Y + M + D + h + m + s;
			}
			
			//获取页商品数据仓库的名称
			function get_pro_wareName(warehouseId){
				$.ajax({
					url : "${IP_ADRESS}/rest/getWarehouseById/"+warehouseId,
					type : "GET",
					success : function(result) {
						if (result.code == 100) {
							$("#detail_pro_warehouseName").text(result.extend.warehouse.name);
						} else {
							alert("数据处理失败！！请重新刷新也面");
						}
					}
				
				});
			}
			</script>

	<script>
			$(document).ready(function() {
				var $miaobian = $('.Xcontent08>div');
				var $huantu = $('.Xcontent06>img');
				var $miaobian1 = $('.Xcontent26>div');
				$miaobian.mousemove(function() {
					miaobian(this);
				});
				$miaobian1.click(function() {
					miaobian1(this);
				});

				function miaobian(thisMb) {
					for(var i = 0; i < $miaobian.length; i++) {
						$miaobian[i].style.borderColor = '#dedede';
					}
					thisMb.style.borderColor = '#cd2426';

					
					/* $huantu[0].src = thisMb.children[0].src; */
					$("#show_pro_pic").empty();
					$("#show_pro_pic").append($("<img src='' width='429px' height='430px'>").attr("src",thisMb.children[0].src));
				}

				function miaobian1(thisMb1) {
					for(var i = 0; i < $miaobian1.length; i++) {
						$miaobian1[i].style.borderColor = '#dedede';
					}
					//		thisMb.style.borderColor = '#cd2426';
					$miaobian.css('border-color', '#dedede');
					thisMb1.style.borderColor = '#cd2426';
					$huantu[0].src = thisMb1.children[0].src;
				}
				$(".Xcontent33").click(function() {
					var value = parseInt($('.input').val()) + 1;
					$('.input').val(value);
				})

				$(".Xcontent32").click(function() {
					var num = $(".input").val()
					if(num > 0) {
						$(".input").val(num - 1);
					}

				})

			})
			
			function pro_published_submit(){
				//品牌商id
				var braid = $("#bra_id").val();
				//分销商id
				var stoid = $("#user_id").val();
				//商品数量
				var productnum = $("#input_order_total").val();
				//商品单价
				var price = $("#detail_pro_price").text();
				//订单总价
				var totalprice = productnum*price;
				//商品id
				var productid = getUrlParam("id");
				//发送ajax请求添加订单
				add_order_pro(braid,stoid,productnum,totalprice,productid); 
			}
			
			//发送ajax请求添加订单
			function add_order_pro(braid,stoid,productnum,totalprice,productid){
				$.ajax({
					url : "${IP_ADRESS}/rest/add_order/",
					type : "POST",
					data : {
						braid : braid,
						stoid : stoid,
						productnum : productnum,
						totalprice : totalprice,
						productid : productid
					},
					success : function(result) {
						if (result.code == 100) {
							console.log(result);
							//跳转到订单提交
							jump_order_detail(result);
						} else {
							alert("数据处理失败！！请重新刷新也面");
						}
					}
				});
			}
			
			//跳转到订单提交
			function jump_order_detail(result){
				var oid = result.extend.orderID;
				window.location.replace("${APP_PATH}/sto_shopping_submit.html?orderid="+oid+"&Id="+$("#user_id").val());
			}
			
			
		</script>

</body>

</html>