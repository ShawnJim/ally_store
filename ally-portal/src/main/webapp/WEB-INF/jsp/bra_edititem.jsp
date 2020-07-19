<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Mosaddek">
<metahttp-equiv ="Content-Type" content="text/html;charset=UTF-8" />
<meta name="keyword"
	content="FlatLab, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	pageContext.setAttribute("IP_ADRESS", "http://localhost:8081");
%>


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
<!-- Custom styles for this template -->
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
					<li class="sub-menu active"><a href="javascript:;" class="">
							<i class="icon-book"></i> <span>商品管理</span> <span class="arrow"></span>
					</a>
						<ul class="sub">
							<li><a id="jump_for_page02" class="" href="${APP_PATH}/bra_additem.html">商品发布</a></li>
							<li><a id="jump_for_page03" class=""
								href="${APP_PATH}/bra_seleitem.html">商品查询</a></li>
							<li class="active" ><a id="jump_for_page04" class="" href="${APP_PATH}/bra_edititem.html">商品编辑</a></li>
							<li><a id="jump_for_page05" class="" href="slider.html">商品审核</a></li>
						</ul></li>
					<li class="sub-menu"><a href="javascript:;" class=""> <i
							class="icon-cogs"></i> <span>订单管理</span> <span class="arrow"></span>
					</a>
						<ul class="sub">
							<li><a id="jump_for_page06" class="" href="${APP_PATH}/bra_select_order.html">订单查询</a></li>
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
									<h3>商品编辑</h3>
								</div>
								<form class="form-horizontal">
									<div class="form-group">
										<label for="inputEmail3" class="col-sm-1 control-label">商品id</label>
										<div class="col-sm-3">
											<input type="text" class="form-control" id="edit_pro_id"
												name="id" placeholder="输入要进行编辑商品id">
										</div>
									</div>
									<div class="form-group">
										<div class="col-md-3 col-md-offset-9">
											<button type="button" class="btn btn-info"
												onclick="form_edit_forward()">开始搜索</button>
										</div>
									</div>
								</form>



								<div class="clearfix">&nbsp;</div>
							</div>
						</section>
						<!--timeline end-->
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

	<script>
			//owl carousel

			$(document).ready(function() {
				$("#owl-demo").owlCarousel({
					navigation: true,
					slideSpeed: 300,
					paginationSpeed: 400,
					singleItem: true

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
				//为每个跳转url+id属性
				Url_add_userid(id);			
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
			function get_user(id){
				$.ajax({
					url : "${IP_ADRESS}/rest/getUser/" + id,
					type : "GET",
					success : function(result) {
						if (result.code == 100) {
							console.log(result);
							$("#show_user_name").text(result.extend.User.compellation);
						} else {
							alert("数据处理失败！！请重新刷新也面");
						}
					}
				
				});
			}
			
			//为每个跳转url+id属性
			function Url_add_userid(id){
				for(var i=0;i<22;i++){
					$("#jump_for_page0"+i).attr("href",$("#jump_for_page0"+i).attr("href")+"?Id="+id);
				}
			}
			function form_edit_forward(){
				var pro_id = $("#edit_pro_id").val();
				alert(pro_id);
				//发送ajax请求验证id是否存在
				$.ajax({
					url : "${IP_ADRESS}/rest/vali_id",
					data : {
						id : pro_id
					},
					type : "POST",
					success : function(result) {
						console.log(result);
						if(result.code==100){
							//跳转到编辑界面
							jump_edit_page(pro_id);
						}else{
							alert("输入的商品有误");
						}
					},error : function(result){
						alert("输入的商品id有误");
					}
				});
			}
			
			function jump_edit_page(id){
				window.location.replace("${APP_PATH}/bra_actionedit.html" +"?id="+id+"&Id="+$("#user_id_val").val());
			}
		</script>

</body>

</html>