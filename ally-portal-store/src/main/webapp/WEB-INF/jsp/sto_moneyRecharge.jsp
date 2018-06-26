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

<title>ALLELUJA-品牌商管理</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/amazeui.min.css" />
<link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/main.css" />
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
							<span class="username" id="show_user_name"></span> <b class="caret"></b>
					</a>
						<ul class="dropdown-menu extended logout">
							<div class="log-arrow-up"></div>
							<li><a href="#"><i class=" icon-suitcase"></i>Profile</a></li>
							<li><a href="#"><i class="icon-cog"></i> Settings</a></li>
							<li><a hrefdropdown="#"><i class="icon-bell-alt"></i>
									Notification</a></li>
							<li><a href="${LOGIN_ADRESS }/page/login.html"><i class="icon-key"></i>退出</a></li>
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
							<li><a id="jump_for_page00" class="" href="${APP_PATH}/sto_personal.html">基本资料</a></li>
							<li><a class="" id="jump_for_page01">账号安全</a></li>
						</ul></li>
					<li class="sub-menu"><a href="javascript:;" class=""> <i
							class="icon-cogs"></i> <span>订单管理</span> <span class="arrow"></span>
					</a>
						<ul class="sub">
							<li><a id="jump_for_page06" class="" href="${STO_ADRESS }/sto_allOrder.html">全部订单</a></li>
							<li><a id="jump_for_page07" class="" href="${STO_ADRESS }/sto_waitCompleteOrder.html">待完成订单</a></li>
							<li><a id="jump_for_page08" class="" href="${STO_ADRESS }/sto_waitpayforOrder.html">未付款订单</a></li>
							<li><a id="jump_for_page05" class="" href="${STO_ADRESS }/sto_CompleteOrder.html">已完成订单</a></li>
						</ul></li>
					<li><a id="jump_for_page09" class="" href="login.html"> <i class="icon-user"></i>
							<span>服务模板</span>
					</a></li>
					<li><a id="jump_for_page010" class="" href="inbox.html"> <i
							class="icon-envelope"></i> <span>评价管理 </span> <span
							class="label label-danger pull-right mail-info">0</span>
					</a></li>
					<li class="sub-menu active"><a href="javascript:;" class=""> <i
							class="icon-glass"></i> <span>财务管理</span> <span class="arrow"></span>
					</a>
						<ul class="sub">
							<li><a id="jump_for_page011" class="" href="${STO_ADRESS }/sto_moneyInfo.html">个人账户</a></li>
							<li class="active"><a id="jump_for_page012" class="" href="${STO_ADRESS}/sto_moneyRecharge.html">充值</a></li>
							<li><a id="jump_for_page013" class="" href="${STO_ADRESS}/sto_moneyWithdraw.html">提现</a></li>
							<li><a id="jump_for_page014" class="" href="${STO_ADRESS}/sto_rechargeRecord.html">充值记录</a></li>
							<li><a id="jump_for_page015" class="" href="${STO_ADRESS}/sto_withdrawRecord.html">提现记录</a></li>
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
					<!-- 这里写钱包页面 -->
					
		<div class="pay">
			<!--主内容开始编辑-->
			<div class="tr_recharge">
				<div class="tr_rechtext">
					<p class="te_retit"><img src="${APP_PATH}/static/images/coin.png" alt="" />充值中心</p>
<!-- 					<p>1.招兵币是51招兵买马退出的虚拟货币，你可以使用招兵币购买站内的简历。</p>
					<p>2.招兵币与人民币换算为1：1，即1元=1招兵币，你可以选择支付宝或者是微信的付款方式来进行充值，招兵币每次10个起充。</p> -->
				</div>
				<form class="am-form" id="doc-vld-msg">
					<div class="tr_rechbox">
						<div class="tr_rechhead">
							<img src="${APP_PATH}/static/images/ys_head2.jpg" />
							<p>充值帐号：
								<a><span id="show_money_name"></a>
							</p>
							<div class="tr_rechheadcion">
								<img src="${APP_PATH}/static/images/coin.png" alt="" />
								<span>当前余额：<span id="show_money_info"></span></span>
							</div>
						</div>
						<div class="tr_rechli am-form-group">
							<ul class="ui-choose am-form-group" id="uc_01">
								<li>
									<label class="am-radio-inline">
								        	<input type="radio"  value="" name="docVlGender" required data-validation-message="请选择一项充值额度"> 10￥
									    </label>
								</li>
								<li>
									<label class="am-radio-inline">
									        <input type="radio" name="docVlGender" data-validation-message="请选择一项充值额度"> 20￥
								      	</label>
								</li>

								<li>
									<label class="am-radio-inline">
									        <input type="radio" name="docVlGender" data-validation-message="请选择一项充值额度"> 50￥
								        </label>
								</li>
								<li>
									<label class="am-radio-inline">
									        <input type="radio" name="docVlGender" data-validation-message="请选择一项充值额度"> 其他金额
								        </label>
								</li>
							</ul>
							<!--<span>1招兵币=1元 10元起充</span>-->
						</div>
						<div class="tr_rechoth am-form-group">
							<span>其他金额：</span>
							<input type="number" min="10" max="10000" value="10.00元" class="othbox" data-validation-message="充值金额范围：10-10000元" />
							<!--<p>充值金额范围：10-10000元</p>-->
						</div>
						<div class="tr_rechcho am-form-group">
							<span>充值方式：</span>
							<%-- <label class="am-radio">
							        <input type="radio" name="radio1" value="" data-am-ucheck required data-validation-message="请选择一种充值方式"><img src="${APP_PATH}/static/images/wechatpay.png"/>
							    </label>
							<label class="am-radio" style="margin-right:30px;">
							        <input type="radio" name="radio1" value="" data-am-ucheck data-validation-message="请选择一种充值方式"><img src="${APP_PATH}/static/images/zfbpay.png"/>
							    </label> --%>
							    <label class="am-radio">
							        <input type="radio" name="radio1" value="" data-am-ucheck required data-validation-message="请选择一种充值方式"><img src="${APP_PATH}/static/images/wechatpay.png"/>
							    </label>
							<label class="am-radio" style="margin-right:30px;">
							        <input type="radio" name="radio1" value="" data-am-ucheck data-validation-message="请选择一种充值方式"><img src="${APP_PATH}/static/images/zfbpay.png"/>
							    </label>
							    
						</div>
						<div class="tr_rechnum">
							<span>应付金额：</span>
							<p class="rechnum" id="rechargeMoney">0.00元</p>
						</div>
					</div>
					<div class="tr_paybox">
						<input type="button" value="确认充值" class="tr_pay am-btn" id="subRechargeMoney"/>
						<span>温馨提示：请勿随意相信陌生人,遇到问题请拨打联系电话。</span>
					</div>
				</form>
			</div>
		</div>
				</div>
			</section>
		</section>
		<!--main content end-->
	</section>
	<script type="text/javascript"
		src="${APP_PATH}/static/js/jquery-1.8.3.min.js"></script>
		
		<script type="text/javascript" src="${APP_PATH}/static/js/ui-choose.js"></script>
			
	<script type="text/javascript">
		// 将所有.ui-choose实例化

		$('.ui-choose').ui_choose();
		// uc_01 ul 单选
		var uc_01 = $('#uc_01').data('ui-choose'); // 取回已实例化的对象
		uc_01.click = function(index, item) {
			console.log('click', index, item.text())
		}
		uc_01.change = function(index, item) {
			console.log('change', index, item.text())
		}
		$(function() {
			$('#uc_01 li:eq(3)').click(function() {
				$('.tr_rechoth').show();
				$('.tr_rechoth').find("input").attr('required', 'true')
				$('.rechnum').text('10.00元');
			})
			$('#uc_01 li:eq(0)').click(function() {
				$('.tr_rechoth').hide();
				$('.rechnum').text('10.00元');
				$('.othbox').val('');
			})
			$('#uc_01 li:eq(1)').click(function() {
				$('.tr_rechoth').hide();
				$('.rechnum').text('20.00元');
				$('.othbox').val('');
			})
			$('#uc_01 li:eq(2)').click(function() {
				$('.tr_rechoth').hide();
				$('.rechnum').text('50.00元');
				$('.othbox').val('');
			})
			$(document).ready(function() {
				$('.othbox').on('input propertychange', function() {
					var num = $(this).val();
					$('.rechnum').html(num + ".00元");
				});
			});
		})

 		$(function() {
			$('#doc-vld-msg')
					.validator(
							{
								onValid : function(validity) {
									$(validity.field).closest('.am-form-group')
											.find('.am-alert').hide();
								},
								onInValid : function(validity) {
									var $field = $(validity.field);
									var $group = $field
											.closest('.am-form-group');
									var $alert = $group.find('.am-alert');
									// 使用自定义的提示信息 或 插件内置的提示信息
									var msg = $field.data('validationMessage')
											|| this
													.getValidationMessage(validity);

									if (!$alert.length) {
										$alert = $(
												'<div class="am-alert am-alert-danger"></div>')
												.hide().appendTo($group);
									}
									$alert.html(msg).show();
								}
							});
		});
	</script>

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
		<!-- 钱包js -->
	<script type="text/javascript"
		src="${APP_PATH}/static/js/amazeui.min.js"></script>



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
			//根据id发送ajax获取用户钱包的余额
			get_money(id);
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
						$("#show_money_name").text(result.extend.User.compellation);
					} else {
						alert("数据处理失败！！请重新刷新也面");
					}
				}
			
			});
		}
		
		//根据id发送ajax获取用户的余额数据,并进行数据处理
		function get_money(id){
			$.ajax({
				url : "${IP_ADRESS}/rest/getMoney/" + id,
				type : "POST",
				success : function(result) {
					if (result.code == 100) {
						console.log(result);
						$("#show_money_info").text(result.extend.Money[0].totalmoney);
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
		
		//点击充值按钮
		$("#subRechargeMoney").click(function(){
			var id = getUrlParam("Id");
			var moneys = $("#rechargeMoney").text();//获得充值金额
			var indexOf = moneys.length;//计算长度
			var money = moneys.substring(0,indexOf-1);//截取需要的金额
		$.ajax({
				url : "${IP_ADRESS}/rest/rechargeMoney?id="+id+"&money="+money,
				type : "POST",
				success : function(result) {
					if (result.code == 100) {
						console.log(result);
						//$("#show_money_info").text(result.extend.Money.totalmoney);
						alert("充值金额:"+money+",订单已提交,请等待审核!");
						//跳转到钱包账户
						window.location.href="${STO_ADRESS }/sto_moneyInfo.html?Id="+id;
						
					} else {
						alert("数据处理失败！！请重新刷新页面");
					}
				}
			
			}); 
			
		});
		
	</script>

</body>

</html>