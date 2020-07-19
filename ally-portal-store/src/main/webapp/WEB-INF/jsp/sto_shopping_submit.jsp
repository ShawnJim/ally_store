<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Mosaddek">
<meta name="keyword"
	content="FlatLab, Dashboard, Bootstrap, Admin, Tprolate, Theme, Responsive, Fluid, Retina">
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	pageContext.setAttribute("IP_ADRESS", "http://localhost:8081");
	pageContext.setAttribute("STO_ADRESS", "http://localhost:8083");
	pageContext.setAttribute("LOGIN_ADRESS", "http://localhost:8084");
%>
<link rel="shortcut icon" href="img/favicon.html">

<title>ALLELUJA-个人中心</title>

<!-- Bootstrap core CSS -->
<link href="${APP_PATH}/static/css/bootstrap.min.css" rel="stylesheet">
<link href="${APP_PATH}/static/css/bootstrap-reset.css" rel="stylesheet">
<!--external css-->
<link href="${APP_PATH}/static/assets/font-awesome/css/font-awesome.css"
	rel="stylesheet" />
<link
	href="${APP_PATH}/static/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css"
	rel="stylesheet" type="text/css" media="screen" />
<link rel="stylesheet" href="${APP_PATH}/static/css/owl.carousel.css"
	type="text/css">
<!-- Custom styles for this tprolate -->
<link href="${APP_PATH}/static/css/style.css" rel="stylesheet">
<link href="${APP_PATH}/static/css/style-responsive.css"
	rel="stylesheet" />
<script src="${APP_PATH}/static/js/jquery.js"></script>

<!--时间组件-->

<!-- 数量组件 -->
<style type="text/css">
/* p_number */
.p_number .f_l {
	float: left;
}

.p_number .add_chose {
	width: 105px;
}

.p_number .add_chose a {
	float: left;
	margin: 5px 0 0 0;
	display: block;
	width: 15px;
	height: 15px;
	line-height: 99em;
	overflow: hidden;
	background: url(${APP_PATH}/static/images/reduce-add.gif) no-repeat;
}

.p_number .add_chose a.reduce {
	background-position: 0 0;
}

.p_number .add_chose a.reduce:hover {
	background-position: 0 -16px;
}

.p_number .add_chose a.add {
	background-position: -16px 0;
}

.p_number .add_chose a.add:hover {
	background-position: -16px -16px;
}

.p_number .add_chose .text {
	float: left;
	margin: 0 5px;
	display: inline;
	border: solid 1px #ccc;
	padding: 4px 3px 4px 8px;
	width: 40px;
	line-height: 18px;
	font-size: 14px;
	color: #990000;
	font-weight: 800;
}

.p_number .buy {
	line-height: 2em;
}

.p_number .buy .total-font {
	font-family: Arial;
	font-size: 26px;
}

.p_number .buy .jifen {
	margin-left: 20px;
	color: #ACACAC;
}

.p_number .buy .jifen b {
	margin: 0 3px;
}
</style>

<!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
<!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<section id="container" class="">
		<!--header start-->
		<header class="header white-bg">
			<div class="sidebar-toggle-box">
				<div data-original-title="Toggle Navigation" data-placement="right"
					class="icon-reorder tooltips"></div>
			</div>
			<!--logo start-->
			<a href="${STO_ADRESS}/sto_index.html" class="logo" id="jump_for_page020">ALLE<span>LUJA</span></a>
			<a href="${STO_ADRESS}/sto_index.html" class="logo" style="margin-left: 5%" id="jump_for_page021">首页</a>
			<a href="#" class="logo" style="margin-left: 30%;">分销商</a>
			<!--logo end-->
			<div class="top-nav ">
				<input type="hidden" id="user_id_val">
				<!--search & user info start-->
				<ul class="nav pull-right top-menu">
					<li><input type="text" class="form-control search"
						placeholder="Search"></li>
					<!-- user login dropdown start-->
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#"> <img alt=""
							src="${APP_PATH}/static/img/touxiang.png" width="29" height="29">
							<span class="username" id="show_user_name"></span> <b
							class="caret"></b>
					</a>
						<ul class="dropdown-menu extended logout">
							<div class="log-arrow-up"></div>
							<li><a href="#"><i class=" icon-suitcase"></i>Profile</a></li>
							<li><a href="#"><i class="icon-cog"></i> Settings</a></li>
							<li><a hrefdropdown="#"><i class="icon-bell-alt"></i>
									Notification</a></li>
							<li><a href="${LOGIN_ADRESS }/page/login.html"><i
									class="icon-key"></i>退出</a></li>
						</ul></li>
					<!-- user login  end -->
				</ul>
				<!--search & user info end-->
			</div>
		</header>
		<!--header end-->
		<!--sidebar start-->
		<aside>
			<div id="sidebar" class="nav-collapse ">
				<!-- sidebar menu start-->
				<ul class="sidebar-menu">
					<li class="sub-menu"><a class="" href="javascript:;">
							<i class="icon-dashboard"></i> <span>我的账号</span> <span
							class="arrow"></span>
					</a>
						<ul class="sub">
							<li><a id="jump_for_page00" class=""
								href="${APP_PATH}/sto_personal.html">基本资料</a></li>
							<li><a class="" id="jump_for_page01">账号安全</a></li>
						</ul></li>
					<li class="sub-menu active"><a href="javascript:;" class=""> <i
							class="icon-cogs"></i> <span>订单管理</span> <span class="arrow"></span>
					</a>
						<ul class="sub">
							<li class="active"><a id="jump_for_page06" class="" href="${STO_ADRESS }/sto_allOrder.html">全部订单</a></li>
							<li><a id="jump_for_page07" class="" href="${STO_ADRESS }/sto_waitCompleteOrder.html">待完成订单</a></li>
							<li><a id="jump_for_page08" class="" href="${STO_ADRESS }/sto_waitpayforOrder.html">未付款订单</a></li>
							<li><a id="jump_for_page05" class="" href="${STO_ADRESS }/sto_CompleteOrder.html">已完成订单</a></li>
						</ul></li>
					<li><a id="jump_for_page09" class="" href="login.html"> <i
							class="icon-user"></i> <span>服务模板</span>
					</a></li>
					<li><a id="jump_for_page010" class="" href="inbox.html"> <i
							class="icon-envelope"></i> <span>评价管理 </span> <span
							class="label label-danger pull-right mail-info">0</span>
					</a></li>
					<li class="sub-menu"><a href="javascript:;" class=""> <i
							class="icon-glass"></i> <span>财务管理</span> <span class="arrow"></span>
					</a>
						<ul class="sub">
							<li><a id="jump_for_page011" class=""
								href="${STO_ADRESS }/sto_moneyInfo.html">个人账户</a></li>
							<li><a id="jump_for_page012" class=""
								href="${STO_ADRESS}/sto_moneyRecharge.html">充值</a></li>
							<li><a id="jump_for_page013" class=""
								href="${STO_ADRESS}/sto_moneyWithdraw.html">提现</a></li>
							<li><a id="jump_for_page014" class=""
								href="${STO_ADRESS}/sto_rechargeRecord.html">充值记录</a></li>
							<li><a id="jump_for_page015" class=""
								href="${STO_ADRESS}/sto_withdrawRecord.html">提现记录</a></li>
						</ul></li>
					<li class="sub-menu"><a class="" href="javascript:;"> <i
							class="icon-user"></i> <span>客户服务</span> <span class="arrow"></span>
					</a>
						<ul class="sub">
							<li><a id="jump_for_page016" class="" href="blank.html">投诉</a></li>
							<li><a id="jump_for_page017" class="" href="profile.html">帮助</a></li>
							<li><a id="jump_for_page018" class="" href="invoice.html">建议</a></li>
						</ul></li>
				</ul>
				<!-- sidebar menu end-->
			</div>
		</aside>
		<!--sidebar end-->
		<!--main content start-->
		<section id="main-content">
			<section class="wrapper">
				<!--state overview start-->
				<div class="row state-overview">
					<div class="col-lg-11">
						<!--timeline start-->
						<section class="panel">
							<div class="panel-body">
								<div class="border-head">
									<h3>商品订单信息填写</h3>
								</div>
								<div class="row">
									<div class="col-md-12">
										<form class="form-horizontal" enctype="multipart/form-data"
											id="form_add_product">
											<div>
												<input type="hidden" value="1" name="userid"
													id="form_pro_userId">
											</div>
											<div class="form-group">
												<label class="col-sm-1 control-label">订单编号</label>
												<div class="col-sm-3">
													<p class="form-control-static" id="orde_detail_oid"></p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-1 control-label">商品名称</label>
												<div class="col-sm-3">
													<p class="form-control-static" id="orde_detail_proName"></p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-1 control-label">商品单价</label>
												<div class="col-sm-3">
													<p class="form-control-static" id="price_item_1">￥</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-1 control-label">商品数量</label>
												<div class="col-sm-3">
													<div class="p_number">
														<div class="f_l add_chose">
															<a class="reduce"
																onClick="setAmount.reduce('#qty_item_1')"
																href="javascript:void(0)"> -</a> <input type="text"
																name="qty_item_1" value="1" id="qty_item_1"
																onKeyUp="setAmount.modify('#qty_item_1')" class="text" />
															<a class="add" onClick="setAmount.add('#qty_item_1')"
																href="javascript:void(0)"> +</a>
														</div>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-1 control-label">商品总价</label>
												<div class="col-sm-3">
													<p class="form-control-static" id="total_item_1"></p>
													<input type="hidden" name="total_price" id="total_price"
														value="" />
												</div>
											</div>

											<div class="form-group">
												<label class="col-sm-1 control-label">买家姓名</label>
												<div class="col-sm-3">
													<input type="text" class="form-control" id="input_sell_name"
														placeholder="" name="name">
												</div>
											</div>

											<div class="form-group">
												<label class="col-sm-1 control-label">买家联系电话</label>
												<div class="col-sm-3">
													<input type="text" class="form-control" id="input_sell_phone"
														placeholder="">
												</div>
											</div>

											<div class="form-group">
												<label class="col-sm-1 control-label">买家地址</label>
												<div class="col-sm-1">
												<label>国</label>
													<input type="text" class="form-control" id="input_adress_guo"
														placeholder=""d>
												</div>
												<div class="col-sm-1">
												<label>省</label>
													<input type="text" class="form-control" id="input_adress_shen"
														placeholder="">
												</div>
												<div class="col-sm-1">
												<label>市</label>
													<input type="text" class="form-control" id="input_adress_shi"
														placeholder="">
												</div>
												<div class="col-sm-3">
												<label>详细地址</label>
													<input type="text" class="form-control" id="input_adress_detail"
														placeholder="" >
												</div>
												<input type="hidden" class="form-control" id="input_sell_adress"
														placeholder="">
											</div>

											<div class="form-group">
												<label class="col-sm-1 control-label">备注</label>
												<div class="col-sm-4">
													<textarea class="form-control" rows="3"
														id="text_sell_note"></textarea>
												</div>
											</div>



											<div class="form-group">
												<div class="col-sm-offset-1 col-sm-10">
													<button type="button" class="btn btn-default"
														onclick="form_add_item()">支付订单</button>
												</div>
											</div>
										</form>
									</div>
								</div>
							</div>

						</section>
						<!--timeline end-->
					</div>
				</div>
			</section>
		</section>
		<!--main content end-->
	</section>

	<!-- js placed at the end of the document so the pages load faster -->
	<script src="${APP_PATH}/static/js/bootstrap.min.js"></script>
	<script src="${APP_PATH}/static/js/jquery.scrollTo.min.js"></script>
	<script src="${APP_PATH}/static/js/jquery.nicescroll.js"
		type="text/javascript"></script>
	<script src="${APP_PATH}/static/js/jquery.sparkline.js"
		type="text/javascript"></script>
	<script
		src="${APP_PATH}/static/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js"></script>
	<script src="${APP_PATH}/static/js/owl.carousel.js"></script>
	<script src="${APP_PATH}/static/js/jquery.customSelect.min.js"></script>

	<!--common script for all pages-->
	<script src="${APP_PATH}/static/js/common-scripts.js"></script>

	<!--script for this page-->
	<script src="${APP_PATH}/static/js/sparkline-chart.js"></script>
	<script src="${APP_PATH}/static/js/easy-pie-chart.js"></script>

	<!-- 数量组件 -->
	<script type="text/javascript" src="${APP_PATH}/static/js/payfor.js"></script>

	<script>
		//owl carousel
		var proID;

		$(document).ready(function() {
			$("#owl-demo").owlCarousel({
				navigation : true,
				slideSpeed : 300,
				paginationSpeed : 400,
				singleItem : true

			});
		});

		//custom select box

		$(function() {
			$('select.styled').customSelect();
			//从页面中获取id
			var id = getUrlParam("Id");
			var oid = getUrlParam("orderid");
			//商品单价
			/* $("#price_item_1").text("￥"+total); */
			//商品数量
			/* $("#qty_item_1").val(pNum); */
			//商品总价
			/* $("#total_price").val(total*pNum);
			$("#total_item_1").text("￥"+total*pNum); */
			
			$("#user_id_val").val(id);
			//根据id发送ajax获取用户的数据
			get_user(id);
			//为每个跳转url+id属性
			Url_add_userid(id);
			//数据填充
			order_data_add(oid); 
			
		});

		//获取url传的参数
		function getUrlParam(name) {

			var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象

			var r = window.location.search.substr(1).match(reg); //匹配目标参数

			if (r != null)
				return unescape(r[2]);

			return null; //返回参数值

		}

		//根据id发送ajax获取用户的数据,并进行数据处理
		function get_user(id) {
			$.ajax({
				url : "${IP_ADRESS}/rest/getUser/" + id,
				type : "GET",
				success : function(result) {
					if (result.code == 100) {
						console.log(result);
						$("#show_user_name").text(
								result.extend.User.compellation);
					} else {
						alert("数据处理失败！！请重新刷新也面");
					}
				}

			});
		}

		//为每个跳转url+id属性
		function Url_add_userid(id) {
			for (var i = 0; i < 22; i++) {
				$("#jump_for_page0" + i).attr("href",
						$("#jump_for_page0" + i).attr("href") + "?Id=" + id);
			}
		}
		
		//订单数据填充
		function order_data_add(oid){
			$.ajax({
				url : "${IP_ADRESS}/rest/get_order/",
				type : "GET",
				data :{
					oid : oid
				},
				success : function(result) {
					if (result.code == 100) {
						console.log(result);
						var orderVO = result.extend.orderVO;
						$("#orde_detail_oid").text(orderVO.orderuuid);
						$("#qty_item_1").val(orderVO.productnum);
						$("#total_item_1").text("￥"+orderVO.totalprice);
						$("#total_price").val(orderVO.totalprice);
						proID = orderVO.productid
						$.each(orderVO.products,function(){
							console.log(this);
							$("#orde_detail_proName").text(this.name);
							$("#price_item_1").text("￥"+this.price);
						});
					} else {
						alert("数据处理失败！！请重新刷新也面");
					}
				}

			});
		}
		
		//表单提交
		function form_add_item(){
			var productnum = $("#qty_item_1").val();
			var totalprice = $("#total_price").val();
			totalprice = totalprice.substring(1,totalprice.length-1);
			alert(totalprice);
			var oid = $("#orde_detail_oid").text();
			var nameofconsignee = $("#input_sell_name").val();
			$("#input_sell_adress").val($("#input_adress_guo").val()+$("#input_adress_shen").val()+$("#input_adress_shi").val()+$("#input_adress_detail").val());
			var address =  $("#input_sell_adress").val();
			var consigneetelephone = $("#input_sell_phone").val();
			var note = $("#text_sell_note").val();	
			$.ajax({
				url : "${IP_ADRESS}/rest/update_order/",
				type : "POST",
				data :{
					orderuuid : oid,
					productid : proID,
					productnum : productnum,
					totalprice : totalprice,
					nameofconsignee : nameofconsignee,
					address : address,
					consigneetelephone : consigneetelephone,
					note : note,
					orderstatus : 1
				},
				success : function(result) {
					if(result.code==100){
						alert("下单成功");
						jump_order_all();
					}else{
						alert("处理失败")
					}
				}
			});
		}
		
		//跳转到所有订单
		function jump_order_all(){
			window.location.replace("${APP_PATH}/sto_allOrder.html?Id="+$("#user_id_val").val());
		}
	</script>

</body>

</html>