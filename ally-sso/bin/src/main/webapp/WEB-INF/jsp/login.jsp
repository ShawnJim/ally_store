<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta charset="utf-8" />
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
/* 	pageContext.setAttribute("IP_ADRESS", "http://localhost:8081"); */
	pageContext.setAttribute("BRA_ADRESS", "http://localhost:8082");
	pageContext.setAttribute("STO_ADRESS", "http://localhost:8083");
%>
<title>登录页面</title>


<meta name="description" content="User login page" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

<!-- bootstrap & fontawesome -->
<link rel="stylesheet" href="/assets/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="/assets/font-awesome/4.2.0/css/font-awesome.min.css" />

<!-- text fonts -->
<link rel="stylesheet" href="/assets/fonts/fonts.googleapis.com.css" />

<!-- ace styles -->
<link rel="stylesheet" href="/assets/css/ace.min.css" />

<!--[if lte IE 9]>
			<link rel="stylesheet" href="assets/css/ace-part2.min.css" />
		<![endif]-->
<link rel="stylesheet" href="/assets/css/ace-rtl.min.css" />

<!--[if lte IE 9]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

<!--[if lt IE 9]>
		<script src="assets/js/html5shiv.min.js"></script>
		<script src="assets/js/respond.min.js"></script>
		<![endif]-->

</head>

<body class="login-layout">
	<div class="main-container">
		<div class="main-content">
			<div class="row">
				<div class="col-sm-10 col-sm-offset-1">
					<div class="login-container">
						<div class="center">
							<h1>
								<i class="ace-icon fa fa-leaf green"></i> <span class="red">跨境</span>
								<span class="white" id="id-text2">M2B2C平台</span>
							</h1>
							<h4 class="blue" id="id-company-text">&copy; 阿里路亚</h4>
						</div>

						<div class="space-6"></div>

						<div class="position-relative">
							<div id="login-box"
								class="login-box visible widget-box no-border">
								<div class="widget-body">
									<div class="widget-main">
										<h4 class="header blue lighter bigger">
											<i class="ace-icon fa fa-coffee green"></i> 请输入您的信息
										</h4>

										<div class="space-6"></div>

										<form class="loginForm" id="formlogin">
											<fieldset>
												<label class="block clearfix"> <span
													class="block input-icon input-icon-right"> <input
														type="text" id="login_userName" name="username"
														class="form-control" placeholder="Username" /> <i
														class="ace-icon fa fa-user"></i>
												</span>
												</label> <span id="Uspinfo"></span> <label class="block clearfix">
													<span class="block input-icon input-icon-right"> <input
														type="password" id="login_password" name="password"
														class="form-control" placeholder="Password" /> <i
														class="ace-icon fa fa-lock"></i>
												</span>
												</label> <span id="Pspinfo"></span>

												<div class="space"></div>

												<div class="clearfix">
													<label class="inline"> <input type="checkbox"
														class="ace" /> <span class="lbl"> 记住</span>
													</label>

													<button type="button" id="loginSub"
														class="width-35 pull-right btn btn-sm btn-primary">
														<i class="ace-icon fa fa-key"></i> <span
															class="bigger-110">登录</span>
													</button>
												</div>

												<div class="space-4"></div>
											</fieldset>
										</form>

										<!--<div class="social-or-login center">
												<span class="bigger-110">第三方登录</span>
											</div>-->

										<div class="space-6"></div>

										<!--<div class="social-login center">
												<a class="btn btn-primary">
													<i class="ace-icon fa fa-facebook"></i>
												</a>

												<a class="btn btn-info">
													<i class="ace-icon fa fa-twitter"></i>
												</a>

												<a class="btn btn-danger">
													<i class="ace-icon fa fa-google-plus"></i>
												</a>
											</div>-->
									</div>
									<!-- /.widget-main -->

									<div class="toolbar clearfix">
										<div>
											<a href="/page/forget" class="forgot-password-link"> <i
												class="ace-icon fa fa-arrow-left"></i> 忘记密码
											</a>
										</div>

										<div>
											<a href="/page/register" class="user-signup-link"> 注册 <i
												class="ace-icon fa fa-arrow-right"></i>
											</a>
										</div>
									</div>
								</div>
								<!-- /.widget-body -->
							</div>
							<!-- /.login-box -->

						</div>
					</div>
					<!-- /.col -->
				</div>
				<!-- /.row -->
			</div>
			<!-- /.main-content -->
		</div>
		<!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->
		<script src="/assets/js/jquery.2.1.1.min.js"></script>

		<!-- <![endif]-->

		<!--[if IE]>
<script src="assets/js/jquery.1.11.1.min.js"></script>
<![endif]-->

		<!--[if !IE]> -->
		<script type="text/javascript">
			window.jQuery
					|| document.write("<script src='/assets/js/jquery.min.js'>"
							+ "<"+"/script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='assets/js/jquery1x.min.js'>"+"<"+"/script>");
</script>
<![endif]-->
		<script type="text/javascript">
			if ('ontouchstart' in document.documentElement)
				document
						.write("<script src='/assets/js/jquery.mobile.custom.min.js'>"
								+ "<"+"/script>");
		</script>

		<!-- 验证js -->
		<script type="text/javascript" src="/assets/js/check.js"></script>


		<script type="text/javascript">
			//改变背景
			jQuery(function($) {
				//$('#btn-login-light').on('click', function(e) {
				$('body').attr('class', 'login-layout light-login');
				$('#id-text2').attr('class', 'grey');
				$('#id-company-text').attr('class', 'blue');
			});

			var redirectUrl = "${redirect}";
			var LOGIN = {
				checkInput : function() {
					if ($("#login_userName").val() == "") {
						alert("用户名不能为空");
						$("#loginname").focus();
						return false;
					}
					if ($("#login_password").val() == "") {
						alert("密码不能为空");
						$("#nloginpwd").focus();
						return false;
					}
					return true;
				},
				doLogin : function() {
					$.post(
									"/user/login",
									$("#formlogin").serialize(),
									function(data) {
										if (data.status == 200) {
											
											if (redirectUrl == "") {
												//获取userId和roleId
												var userId = data.extend.user[0].id;
												var roleId = data.extend.user[0].roleid;
												var state = data.extend.user[0].state;
												if(state == 0 ){
													alert("对不起你的账号未通过审核,请等待审核!");
													return false;
												}else if(state == 1){
													alert("登录成功！");
													if(roleId == 2){
														//跳转到供应商
														location.href = "${BRA_ADRESS}/bra_index.html?Id="+userId;
													}else{
														//跳转到分销商
														location.href = "${STO_ADRESS}/sto_index.html?Id="+userId;
													}
												}else{
													alert("你的账号被冻结,请联系管理员!");
													return false;
												}
				
											} else {
												location.href = redirectUrl;
											}
										} else {
											alert("登录失败，原因是：" + data.msg);
											$("#login_userName").select();
										}
									});
				},
				login : function() {
					if (this.checkInput()) {
						this.doLogin();
					}
				}

			};
			$(function() {
				$("#loginSub").click(function() {
					LOGIN.login();
				});
			});
		</script>
</body>
</html>