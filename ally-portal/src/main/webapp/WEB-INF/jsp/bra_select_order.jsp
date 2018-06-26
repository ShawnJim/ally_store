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
%>
<link rel="shortcut icon" href="img/favicon.html">

<title>ALLELUJA-品牌商管理</title>

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

<!--时间组件-->

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
			<a href="#" class="logo">ALLE<span>LUJA</span></a>
			<a href="#" class="logo" style="margin-left: 40%;">品牌商</a>
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
							<span class="username" id="show_user_name"></span> <b class="caret"></b>
					</a>
						<ul class="dropdown-menu extended logout">
							<div class="log-arrow-up"></div>
							<li><a href="#"><i class=" icon-suitcase"></i>Profile</a></li>
							<li><a href="#"><i class="icon-cog"></i> Settings</a></li>
							<li><a hrefdropdown="#"><i class="icon-bell-alt"></i>
									Notification</a></li>
							<li><a href="login.html"><i class="icon-key"></i>退出</a></li>
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
					<li class="sub-menu"><a class="" href="javascript:;"> <i
							class="icon-dashboard"></i> <span>我的账号</span> <span class="arrow"></span>
					</a>
						<ul class="sub">
							<li><a id="jump_for_page00" class="" href="${APP_PATH}/bra_index.html">基本资料</a></li>
							<li><a class="" id="jump_for_page01">账号安全</a></li>
						</ul></li>
					<li class="sub-menu"><a href="javascript:;" class="">
							<i class="icon-book"></i> <span>商品管理</span> <span class="arrow"></span>
					</a>
						<ul class="sub">
							<li><a id="jump_for_page02" class="" href="${APP_PATH}/bra_additem.html">商品发布</a></li>
							<li><a id="jump_for_page03" class=""
								href="${APP_PATH}/bra_seleitem.html">商品查询</a></li>
							<li><a id="jump_for_page04" class="" href="${APP_PATH}/bra_edititem.html">商品编辑</a></li>
							<li><a id="jump_for_page05" class="" href="slider.html">商品审核</a></li>
						</ul></li>
					<li class="sub-menu active"><a href="javascript:;" class=""> <i
							class="icon-cogs"></i> <span>订单管理</span> <span class="arrow"></span>
					</a>
						<ul class="sub">
							<li class="active" ><a id="jump_for_page06" class="" href="${APP_PATH}/bra_select_order.html">订单查询</a></li>
						</ul></li>
					<li class="sub-menu"><a href="javascript:;" class=""> <i
							class="icon-tasks"></i> <span>物流管理</span> <span class="arrow"></span>
					</a>
						<ul class="sub">
							<li><a id="jump_for_page09" class="" href="form_component.html">物流模板</a></li>
							<li><a id="jump_for_page010" class="" href="form_wizard.html">发货地址</a></li>
							<li><a id="jump_for_page011" class="" href="form_validation.html">揽收网点</a></li>
						</ul></li>
					<li><a id="jump_for_page012" class="" href="login.html"> <i class="icon-user"></i>
							<span>服务模板</span>
					</a></li>
					<li><a id="jump_for_page013" class="" href="inbox.html"> <i
							class="icon-envelope"></i> <span>评价管理 </span> <span
							class="label label-danger pull-right mail-info">0</span>
					</a></li>
					<li class="sub-menu"><a href="javascript:;" class=""> <i
							class="icon-glass"></i> <span>财务管理</span> <span class="arrow"></span>
					</a>
						<ul class="sub">
							<li><a id="jump_for_page014" class="" href="blank.html">个人账户</a></li>
							<li><a id="jump_for_page015" class="" href="profile.html">结算</a></li>
							<li><a id="jump_for_page016" class="" href="invoice.html">结算明细</a></li>
							<li><a id="jump_for_page017" class="" href="404.html">物流费明细</a></li>
							<li><a id="jump_for_page018" class="" href="500.html">银行账号</a></li>
						</ul></li>
					<li class="sub-menu"><a class="" href="javascript:;"> <i
							class="icon-user"></i> <span>客户服务</span> <span class="arrow"></span>
					</a>
						<ul class="sub">
							<li><a id="jump_for_page019" class="" href="blank.html">投诉</a></li>
							<li><a id="jump_for_page020" class="" href="profile.html">帮助</a></li>
							<li><a id="jump_for_page021" class="" href="invoice.html">建议</a></li>
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
									<h3>所有订单</h3>
								</div>
								<form class="form-horizontal" id="form_sele_pro">
									<input type="hidden" name="userid" value="1"
										id="get_pro_userid">
									<div class="form-group">
										<label for="inputPassword3" class="col-sm-1 control-label">订单号</label>
										<div class="col-sm-2">
											<input type="text" class="form-control"
												id="sele_input_number" placeholder="">
										</div>
									</div>
									<div class="form-group">
										<div class="form-group">
											<div class="col-md-3 col-md-offset-9">
												<button type="button" class="btn btn-info"
													onclick="from_get_pros()">开始查询</button>
											</div>
										</div>
								</form>
								<!-- 显示表格数据 -->
								<div class="row">
									<div class="col-md-12">
										<table class="table table-hover" id="pros_table">
											<thead>
												<tr bgcolor="#22BACF">
													<th>订单编号</th>
													<th>商品名称</th>
													<th>商品单价</th>
													<th>商品数量</th>
													<th>创建时间</th>
													<th>总价</th>
													<th>订单状态</th>
													<th>操作</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td class="no-padding" colspan="7" bgcolor="#e5e5e5">
														<div align="center">
															<img
																src="${APP_PATH}/static/images/empty_search_result-551f162e825a44193cc0559f75795b4a.png"
																alt="proty search result" /> <span>没有查到符合条件的记录</span>
														</div>
													</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
								<!-- 显示分页数据 -->
								<div class="row">
									<!-- 分页文字信息 -->
									<div class="col-md-6" id="page_info_area"></div>
									<!-- 分页条信息 -->
									<div class="col-md-6 col-md-offset-6" id="page_nav_area">
										<nav aria-label="Page navigation">
											<ul class="pagination pagination-lg">
												<li><a href="#" aria-label="Previous"> <span
														aria-hidden="true">&laquo;</span>
												</a></li>
												<li><a href="#">1</a></li>
												<li><a href="#">2</a></li>
												<li><a href="#">3</a></li>
												<li><a href="#">4</a></li>
												<li><a href="#">5</a></li>
												<li><a href="#" aria-label="Next"> <span
														aria-hidden="true">&raquo;</span>
												</a></li>
											</ul>
										</nav>
									</div>

								</div>

								<div class="clearfix">&nbsp;</div>
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
	<script src="${APP_PATH}/static/js/jquery.js"></script>
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

	<!--时间组件-->
	<script type="text/javascript"
		src="${APP_PATH}/static/datetime/bootstrap/js/bootstrap-datetimepicker.min.js"
		charset="UTF-8"></script>
	<script type="text/javascript"
		src="${APP_PATH}/static/datetime/bootstrap/js/bootstrap-datetimepicker.zh-CN.js"
		charset="UTF-8"></script>
	<script type="text/javascript"
		src="${APP_PATH}/static/datetime/bootstrap/js/datetime.js"></script>

	
	<script>
		//owl carousel

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
			$("#user_id_val").val(id);
			//根据id发送ajax获取用户的数据
			get_user(id);
			/* //根据id发送ajax获取用户钱包的余额
			get_money(id); */
			//为每个跳转url+id属性
			Url_add_userid(id);
			toPage(1);
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
						$("#show_money_name").text(
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

		//页面跳转
		function toPage(pn) {
			$.ajax({
				url : "${IP_ADRESS}/rest/get_orderByBraid",
				data : {
					pn : pn,
					braid : $("#user_id_val").val()
				},
				type : "GET",
				success : function(result) {
					console.log(result);
					//1.解析并显示员工数据
					build_pros_table(result);
					//2.解析并显示分页信息
					build_page_info(result);
					//3.分页条
					build_page_nav(result);
				}
			});
		}

		//解析并且显示商品数据
		function build_pros_table(result) {
			var pros = result.extend.pageInfo.list;
			console.log(result);
			//每次清空员工信息
			if(pros[0].orderuuid!=""||pros[0].orderuuid!=null){
				$("#pros_table tbody").empty();
			}
			$
					.each(
							pros,
							function(index, item) {
								var IDTd = $("<td></td>")
										.append(item.orderuuid);
								var nameTd = $("<td></td>").append(
										item.products[0].name);
								var priceTd = $("<td></td>").append(
										item.products[0].price);
								var pNumTd = $("<td></td>").append(
										item.productnum);
								var timeTd = $("<td></td>").append(
										timestampToTime(item.creationtime));
								var totalpriceTd = $("<td></td>").append(
										item.totalprice);
								var status_value;
								var button = $("<td></td>")/* .append(vditTd)
																.append(" ").append(shelvesTd)
																.append(" ").append(delTd) */;
								if (item.orderstatus == "0") {
									status_value = "待支付";
									//支付
									var paybtnTd = $(
											"<button type='button'></button>")
											.addClass(
													"btn btn-primary btn-sm pay_btn")
											.append(
													$("<span></span>")
															.addClass(
																	"glyphicon glyphicon-hand-right"))
											.append("支付");
									paybtnTd.attr("pay_id", item.orderuuid);
									//删除按钮
									var delTd = $(
											"<button type='button'></button>")
											.addClass(
													"btn btn-danger btn-sm del_btn")
											.append(
													$("<span></span>")
															.addClass(
																	"glyphicon glyphicon-trash"))
											.append("删除 ");
									delTd.attr("del_id", item.orderuuid);
									
									//撤销按钮
									var repealbtnTd = $(
											"<button type='button'></button>")
											.addClass(
													"btn btn-info btn-sm repeal_btn")
											.append(
													$("<span></span>")
															.addClass(
																	"glyphicon glyphicon-arrow-left"))
											.append("撤销");
									repealbtnTd.attr("repeal_id",
											item.orderuuid);
									//添加到按钮组件
									button.append(
											repealbtnTd).append(" ").append(
											delTd);

								} else if (item.orderstatus == "1") {
									status_value = "待完成";
									//撤销按钮
									var repealbtnTd = $(
											"<button type='button'></button>")
											.addClass(
													"btn btn-info btn-sm repeal_btn")
											.append(
													$("<span></span>")
															.addClass(
																	"glyphicon glyphicon-arrow-left"))
											.append("撤销");
									repealbtnTd.attr("repeal_id",
											item.orderuuid);
									//删除按钮
									var delTd = $(
											"<button type='button'></button>")
											.addClass(
													"btn btn-danger btn-sm del_btn")
											.append(
													$("<span></span>")
															.addClass(
																	"glyphicon glyphicon-trash"))
											.append("删除 ");
									delTd.attr("del_id", item.orderuuid);
									
									//成功按钮
									var sucsTd = $(
											"<button type='button'></button>")
											.addClass(
													"btn btn-success btn-sm sucs_btn")
											.append(
													$("<span></span>")
															.addClass(
																	"glyphicon glyphicon-saved"))
											.append("完成");
									sucsTd.attr("sucs_id", item.orderuuid);
									
									//添加到按钮组件
									button.append(paybtnTd).append(" ").append(
											repealbtnTd).append(" ").append(
											delTd).append(" ").append(
													sucsTd);

								} else if (item.orderstatus == "2") {
									status_value = "已完成";
									//删除按钮
									var delTd = $(
											"<button type='button'></button>")
											.addClass(
													"btn btn-danger btn-sm del_btn")
											.append(
													$("<span></span>")
															.addClass(
																	"glyphicon glyphicon-trash"))
											.append("删除 ");
									delTd.attr("del_id", item.orderuuid);
									//添加到按钮组件
									button.append(delTd);
								} else {
									status_value = "已撤销";

									//删除按钮
									var delTd = $(
											"<button type='button'></button>")
											.addClass(
													"btn btn-danger btn-sm del_btn")
											.append(
													$("<span></span>")
															.addClass(
																	"glyphicon glyphicon-trash"))
											.append("删除 ");
									delTd.attr("del_id", item.orderuuid);
									//添加到按钮组件
									button.append(
											delTd);

								}
								var status = $("<td></td>")
										.append(status_value);
								$("<tr></tr>").append(IDTd).append(nameTd)
										.append(priceTd).append(pNumTd).append(
												timeTd).append(totalpriceTd)
										.append(status).append(button)
										.appendTo("#pros_table tbody");
							});
		}

		//分页信息
		function build_page_info(result) {
			$("#page_info_area").empty();
			$("#page_info_area").append(
					"当前第 " + result.extend.pageInfo.pageNum + " 页,共有 "
							+ result.extend.pageInfo.pages + " 页,一共 "
							+ result.extend.pageInfo.total + " 条数据。");
			$totalRecord = result.extend.pageInfo.total;
			$pageRecord = result.extend.pageInfo.pageNum;
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

		//分页条
		function build_page_nav(result) {
			$("#page_nav_area").empty();
			//列表
			var ul = $("<ul></ul>").addClass("pagination");
			//首页
			var firstPageLi = $("<li></li>").append(
					$("<a></a>").attr("href", "#").append("首页"));
			//上一页
			var prevPageLi = $("<li></li>").append(
					$("<a></a>").attr("href", "#").append("&laquo;"));
			//判断是否第一页
			if (result.extend.pageInfo.hasPreviousPage == false) {
				firstPageLi.addClass("disabled");
				prevPageLi.addClass("disabled");
			} else {
				firstPageLi.click(function() {
					toPage(1);
				});
				prevPageLi.click(function() {
					toPage(result.extend.pageInfo.pageNum - 1);
				});
			}

			ul.append(firstPageLi).append(prevPageLi);
			//遍历页码
			$.each(result.extend.pageInfo.navigatepageNums, function(index,
					pageNum) {
				var numLi = $("<li></li>").append(
						$("<a></a>").attr("href", "#").append(pageNum));
				if (result.extend.pageInfo.pageNum == pageNum) {
					numLi.addClass("active");
				}
				numLi.click(function() {
					toPage(pageNum);
				});
				ul.append(numLi);
			});
			//下一页
			var nextPageLi = $("<li></li>").append(
					$("<a></a>").attr("href", "#").append("&raquo;"));
			//末页
			var listPageLi = $("<li></li>").append(
					$("<a></a>").attr("href", "#").append("末页"));
			if (result.extend.pageInfo.hasNextPage == false) {
				nextPageLi.addClass("disabled");
				listPageLi.addClass("disabled");
			} else {
				nextPageLi.click(function() {
					toPage(result.extend.pageInfo.pageNum + 1);
				});
				listPageLi.click(function() {
					toPage(result.extend.pageInfo.pages);
				});
			}
			ul.append(nextPageLi).append(listPageLi).appendTo(
					$("#page_nav_area"));
		}

		//搜索记录
		function from_get_pros() {
			var number = $("#sele_input_number").val();
			$.ajax({
				url : "${IP_ADRESS}/rest/get_order",
				data : {
					pn : 1,
					oid : number
				},
				type : "GET",
				success : function(result) {
					console.log(result);
					//解析并且显示单个商品数据
					build_pro_table(result);
				}
			});
		}

		//解析并且显示单个商品数据
		function build_pro_table(result) {
			var pros = result.extend.orderVO;
			console.log(result);
			//每次清空员工信息
			$("#pros_table tbody").empty();
			var IDTd = $("<td></td>").append(pros.orderuuid);
			var nameTd = $("<td></td>").append(pros.products[0].name);
			var priceTd = $("<td></td>").append(pros.products[0].price);
			var pNumTd = $("<td></td>").append(pros.productnum);
			var timeTd = $("<td></td>").append(
					timestampToTime(pros.creationtime));
			var totalpriceTd = $("<td></td>").append(pros.totalprice);
			var status_value;
			var button = $("<td></td>")/* .append(vditTd)
											.append(" ").append(shelvesTd)
											.append(" ").append(delTd) */;
			if (pros.orderstatus == "0") {
				status_value = "待支付";
				//支付
				var paybtnTd = $("<button type='button'></button>").addClass(
						"btn btn-primary btn-sm pay_btn").append(
						$("<span></span>").addClass(
								"glyphicon glyphicon-hand-right")).append("支付");
				paybtnTd.attr("pay_id", pros.orderuuid);
				//撤销按钮
				var repealbtnTd = $("<button type='button'></button>")
						.addClass("btn btn-info btn-sm repeal_btn").append(
								$("<span></span>").addClass(
										"glyphicon glyphicon-arrow-left"))
						.append("撤销");
				repealbtnTd.attr("repeal_id", pros.orderuuid);
				//删除按钮
				var delTd = $("<button type='button'></button>").addClass(
						"btn btn-danger btn-sm del_btn").append(
						$("<span></span>")
								.addClass("glyphicon glyphicon-trash")).append(
						"删除 ");
				delTd.attr("del_id", pros.orderuuid);
				//添加到按钮组件
				button.append(paybtnTd).append(" ").append(repealbtnTd).append(
						" ").append(delTd);

			} else if (pros.orderstatus == "1") {
				status_value = "待完成";
				//撤销按钮
				var repealbtnTd = $("<button type='button'></button>")
						.addClass("btn btn-info btn-sm repeal_btn").append(
								$("<span></span>").addClass(
										"glyphicon glyphicon-arrow-left"))
						.append("撤销");
				repealbtnTd.attr("repeal_id", pros.orderuuid);
				//删除按钮
				var delTd = $("<button type='button'></button>").addClass(
						"btn btn-danger btn-sm del_btn").append(
						$("<span></span>")
								.addClass("glyphicon glyphicon-trash")).append(
						"删除 ");
				delTd.attr("del_id", pros.orderuuid);
				//添加到按钮组件
				button.append(paybtnTd).append(" ").append(repealbtnTd).append(
						" ").append(delTd);

			} else if (pros.orderstatus == "2") {
				status_value = "已完成";
				//删除按钮
				var delTd = $("<button type='button'></button>").addClass(
						"btn btn-danger btn-sm del_btn").append(
						$("<span></span>")
								.addClass("glyphicon glyphicon-trash")).append(
						"删除 ");
				delTd.attr("del_id", pros.orderuuid);
				//添加到按钮组件
				button.append(delTd);
			} else {
				status_value = "已撤销";

				//支付
				var paybtnTd = $("<button type='button'></button>").addClass(
						"btn btn-primary btn-sm pay_btn").append(
						$("<span></span>").addClass(
								"glyphicon glyphicon-hand-right")).append("支付");
				paybtnTd.attr("pay_id", pros.orderuuid);

				//删除按钮
				var delTd = $("<button type='button'></button>").addClass(
						"btn btn-danger btn-sm del_btn").append(
						$("<span></span>")
								.addClass("glyphicon glyphicon-trash")).append(
						"删除 ");
				delTd.attr("del_id", pros.orderuuid);
				//添加到按钮组件
				button.append(paybtnTd).append(" ").append(delTd);

			}
			var status = $("<td></td>").append(status_value);
			$("<tr></tr>").append(IDTd).append(nameTd).append(priceTd).append(
					pNumTd).append(timeTd).append(totalpriceTd).append(status)
					.append(button).appendTo("#pros_table tbody");

		}

		//支付商品
		$(document).on("click", ".pay_btn", function() {
			var proIds = $(this).attr("pay_id");
			jump_order_detail(proIds)
		});

		//撤销商品
		$(document).on("click", ".repeal_btn", function() {
			var proName = $(this).parents("tr").find("td:eq(1)").text();
			var proIds = $(this).attr("repeal_id");
			if (confirm("确定撤销【" + proName + "】吗")) {
				$.ajax({
					url : "${IP_ADRESS}/rest/update_order",
					type : "GET",
					data : {
						orderuuid : proIds,
						orderstatus : 4
					},
					success : function(result) {
						if (result.code == 100) {
							alert("撤销成功");
						} else {
							alert("处理失败");
						}
						toPage($pageRecord);
					}
				});
			}
		});
		
		//结束订单
		$(document).on("click", ".sucs_btn", function() {
			var proName = $(this).parents("tr").find("td:eq(1)").text();
			var proIds = $(this).attr("sucs_id");
			if (confirm("确定通过【" + proName + "】吗")) {
				$.ajax({
					url : "${IP_ADRESS}/rest/update_order",
					type : "GET",
					data : {
						orderuuid : proIds,
						orderstatus : 2
					},
					success : function(result) {
						if (result.code == 100) {
							alert("处理成功");
						} else {
							alert("处理失败");
						}
						toPage($pageRecord);
					}
				});
			}
		});

		//删除商品
		$(document).on("click", ".del_btn", function() {
			var proName = $(this).parents("tr").find("td:eq(1)").text();
			var proIds = $(this).attr("del_id");
			if (confirm("确定删除【" + proName + "】吗")) {
				$.ajax({
					url : "${IP_ADRESS}/rest/delete_order",
					type : "GET",
					data : {
						orderuuid : proIds
					},
					success : function(result) {
						if (result.code == 100) {
							alert("删除成功");
						} else {
							alert("删除失败");
						}
						toPage($pageRecord);
					}
				});
			}
		});

		//跳转到订单提交
		function jump_order_detail(oid) {
			window.location
					.replace("${APP_PATH}/sto_shopping_submit.html?orderid="
							+ oid + "&Id=" + $("#user_id_val").val());
		}
	</script>

</body>

</html>