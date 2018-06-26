<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>注册页面</title>

		<meta name="description" content="User login page" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

		<!-- bootstrap & fontawesome -->
		<link rel="stylesheet" href="/assets/css/bootstrap.min.css" />
		<link rel="stylesheet" href="/assets/font-awesome/4.2.0/css/font-awesome.min.css" />

		<!-- text fonts -->
		<link rel="stylesheet" href="/assets/fonts/fonts.googleapis.com.css" />

		<!-- ace styles -->
		<link rel="stylesheet" href="/assets/css/ace.min.css" />

		<!--[if lte IE 9]>
			<link rel="stylesheet" href="/assets/css/ace-part2.min.css" />
		<![endif]-->
		<link rel="stylesheet" href="/assets/css/ace-rtl.min.css" />

		<!--[if lte IE 9]>
		  <link rel="stylesheet" href="/assets/css/ace-ie.min.css" />
		<![endif]-->

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

		<!--[if lt IE 9]>
		<script src="/assets/js/html5shiv.min.js"></script>
		<script src="/assets/js/respond.min.js"></script>
		<![endif]-->
		
		<!-- 验证js -->
		<script src="/assets/js/check.js"></script>
		
		<!-- 供应商分销商按钮的样式 -->
			<style type="text/css">
				#center-box .btn-info {
					margin:10px;
				}
			</style>
			
		
	</head>

	<body class="login-layout">
		<div class="main-container">
			<div class="main-content">
				<div class="row">
					<div class="col-sm-10 col-sm-offset-1">
						<div class="login-container">
							<div class="center">
								<h1>
									<i class="ace-icon fa fa-leaf green"></i>
									<span class="red">跨境</span>
									<span class="white" id="id-text2">M2B2C平台</span>
								</h1>
								<h4 class="blue" id="id-company-text">&copy; 阿里路亚</h4>
							</div>

							<div class="space-6"></div>

							<div class="position-relative">
								<div id="select-box" class="login-box visible widget-box no-border">
									<div class="widget-body">
										<div class="widget-main">
											<h4 class="header blue lighter bigger">
												<i class="ace-icon fa fa-coffee green"></i>
												请选择您的入驻信息
											</h4>

											<div class="space-6"></div>
													
													<div id="center-box" align="center">
														
													<button type="button" data-target="#signup-box" class="btn btn-info">供应商入驻</button>
													<button type="button" data-target="#asignup-box" class="btn btn-info">分销商入驻</button><br/>
													<!--<button type="button" data-target="#signup-box" class="btn btn-info">分销商(个人)</button>
													<button type="button" data-target="#signup-box" class="btn btn-info">分销商(企业)</button>-->
													
													
													</div>
													<div class="space"></div>


													<div class="space-4"></div>
												<!--</fieldset>
											</form>-->

											<!--<div class="social-or-login center">
												<span class="bigger-110">第三方登录</span>
											</div>-->

											<div class="space-6"></div>
										</div><!-- /.widget-main -->

										<div class="toolbar clearfix">
											<div>
												<a href="/page/forget" class="forgot-password-link">
													<i class="ace-icon fa fa-arrow-left"></i>
													忘记密码
												</a>
											</div>

											<div>
												<a href="/page/login" class="user-signup-link">
													返回登录
													<i class="ace-icon fa fa-arrow-right"></i>
												</a>
											</div>
										</div>
									</div><!-- /.widget-body -->
								</div><!-- /.login-box -->
								

								<div id="signup-box" class="signup-box widget-box no-border">
									<div class="widget-body">
										<div class="widget-main">
											<h4 class="header green lighter bigger">
												<i class="ace-icon fa fa-users blue"></i>
												供应商用户注册
											</h4>

											<div class="space-6"></div>
											<p>填写信息: </p>

											<form class="g_register" id="2personRegForm">
												<fieldset>
												
													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="text" class="form-control" placeholder="用户名" name="username" id="2regName"/>
															<i class="ace-icon fa fa-user"></i>
														</span>
													</label>
												
													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<i class="ace-icon fa fa-envelope"></i>
															<input type="email" class="form-control" placeholder="邮箱" name="email" id="2email"/>
															
														</span>
													</label>



													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" class="form-control" placeholder="密码" name="password" id="2pwd" />
															<i class="ace-icon fa fa-lock"></i>
														</span>
													</label>

													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" class="form-control" placeholder="确认密码" name="RePassword" id="2pwdRepeat"/>
															<i class="ace-icon fa fa-retweet"></i>
														</span>
													</label>
													
													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="text" class="form-control" placeholder="手机号码" name="phone" id="2phone"/>
															<i class="ace-icon fa fa-phone"></i>
														</span>
													</label>
													
<!-- 													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="text" class="form-control" placeholder="企业名称" name="companyName"/>
															<i class="ace-icon fa fa-home"></i>
														</span>
													</label> -->
													
													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="text" class="form-control" placeholder="真实姓名" name="compellation" id="2compellation"/>
															<i class="ace-icon fa fa-circle"></i>
														</span>
													</label>
													
															<input type="hidden" class="form-control" name="roleid" value="2"/>

													<label class="block">
														<input type="checkbox" class="ace" checked/>
														<span class="lbl">
															接受
															<a href="/page/contract" target="_blank">用户协议</a>
														</span>
													</label>

													<div class="space-24"></div>

													<div class="clearfix">
														<button type="reset" class="width-30 pull-left btn btn-sm">
															<i class="ace-icon fa fa-refresh"></i>
															<span class="bigger-110">重置</span>
														</button>

														<button type="button" id="g_register" class="width-65 pull-right btn btn-sm btn-success" onclick="REGISTER.reg(this.id);">
															<span class="bigger-110">注册</span>

															<i class="ace-icon fa fa-arrow-right icon-on-right"></i>
														</button>
													</div>
												</fieldset>
											</form>
										</div>

										<div class="toolbar center">
											<a href="/page/login"  class="back-to-login-link">
												<i class="ace-icon fa fa-arrow-left"></i>
												返回登录
											</a>
										</div>
									</div><!-- /.widget-body -->
								</div><!-- /.signup-box -->
							</div><!-- /.position-relative -->
								
								
								<div id="asignup-box" class="signup-box widget-box no-border">
									<div class="widget-body">
										<div class="widget-main">
											<h4 class="header green lighter bigger">
												<i class="ace-icon fa fa-users blue"></i>
												分销商用户注册
											</h4>

											<div class="space-6"></div>
											<p>填写信息: </p>

											<form class="f_register" id="3personRegForm">
												<fieldset>
												
													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="text" class="form-control" placeholder="用户名" name="username" id="3regName"/>
															<i class="ace-icon fa fa-user"></i>
														</span>
													</label>
													
													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="email" id="register_email" class="form-control" placeholder="邮箱" name="email" id="3email"/>
															<i class="ace-icon fa fa-envelope"></i>
														</span>
													</label>



													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" id="register_password" class="form-control" placeholder="密码" name="password" id="3pwd"/>
															<i class="ace-icon fa fa-lock"></i>
														</span>
													</label>

													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" id="register_RePassword" class="form-control" placeholder="确认密码" name="RePassword" id="3pwdRepeat"/>
															<i class="ace-icon fa fa-retweet"></i>
														</span>
													</label>
													
													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="text" id="register_phone" class="form-control" placeholder="手机号码" name="phone" id="3phone"/>
															<i class="ace-icon fa fa-phone"></i>
														</span>
													</label>
													
<!-- 													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="text" id="register_companyName" class="form-control" placeholder="企业名称" name="companyName" />
															<i class="ace-icon fa fa-home"></i>
														</span>
													</label> -->
													
													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="text" id="register_name" class="form-control" placeholder="真实姓名" name="compellation" id="3compellation"/>
															<i class="ace-icon fa fa-circle"></i>
														</span>
													</label>
													
													<input type="hidden" class="form-control" name="roleid" value="3"/>

													<label class="block">
														<input type="checkbox" class="ace" checked/>
														<span class="lbl">
															接受
															<a href="/page/contract" target="_blank">用户协议</a>
														</span>
													</label>

													<div class="space-24"></div>

													<div class="clearfix">
														<button type="reset" class="width-30 pull-left btn btn-sm">
															<i class="ace-icon fa fa-refresh"></i>
															<span class="bigger-110">重置</span>
														</button>

														<button type="button" id="f_register" class="width-65 pull-right btn btn-sm btn-success" onclick="REGISTER.reg(this.id);">
															<span class="bigger-110">注册</span>

															<i class="ace-icon fa fa-arrow-right icon-on-right"></i>
														</button>
													</div>
												</fieldset>
											</form>
										</div>

										<div class="toolbar center">
											<a href="/page/login" class="back-to-login-link">
												<i class="ace-icon fa fa-arrow-left"></i>
												返回登录
											</a>
										</div>
									</div><!-- /.widget-body -->
								</div><!-- /.signup-box -->
							</div><!-- /.position-relative -->
							
						</div>
					</div><!-- /.col -->
				</div><!-- /.row -->
			</div><!-- /.main-content -->
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->
		<script src="/assets/js/jquery.2.1.1.min.js"></script>

		<!-- <![endif]-->

		<!--[if IE]>
<script src="/assets/js/jquery.1.11.1.min.js"></script>
<![endif]-->

		<!--[if !IE]> -->
		<script type="text/javascript">
			window.jQuery || document.write("<script src='/assets/js/jquery.min.js'>"+"<"+"/script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='/assets/js/jquery1x.min.js'>"+"<"+"/script>");
</script>
<![endif]-->

		<!-- 验证js -->
		<!-- <script src="/assets/js/check.js"></script> -->
		
<script type="text/javascript">

//改变背景
jQuery(function($) {
// $('#btn-login-light').on('click', function(e) {
	$('body').attr('class', 'login-layout light-login');
	$('#id-text2').attr('class', 'grey');
	$('#id-company-text').attr('class', 'blue');
	
});

jQuery(function($) {
	 $(document).on('click', '.toolbar a[data-target]', function(e) {
		e.preventDefault();
		var target = $(this).data('target');
		$('.widget-box.visible').removeClass('visible');//hide others
		$(target).addClass('visible');//show target
	 });
	});
	
jQuery(function($) {
	 $(document).on('click', '#center-box button[data-target]', function(e) {
		e.preventDefault();
		var target = $(this).data('target');
		$('.widget-box.visible').removeClass('visible');//hide others
		$(target).addClass('visible');//show target
	 });
	});
	
	var REGISTER={
		param:{
			//单点登录系统的url
			surl:""
		},
		inputcheck:function(roleId){
				//不能为空检查
				if ($("#"+roleId+"regName").val() == "") {
					alert("用户名不能为空a");
					$("#"+roleId+"regName").focus();
					return false;
				}
				if ($("#"+roleId+"pwd").val() == "") {
					alert("密码不能为空");
					$("#"+roleId+"pwd").focus();
					return false;
				}
				if ($("#"+roleId+"phone").val() == "") {
					alert("手机号不能为空");
					$("#"+roleId+"phone").focus();
					return false;
				}
				if ($("#"+roleId+"email").val() == "") {
					alert("邮箱不能为空");
					$("#"+roleId+"email").focus();
					return false;
				}
				if ($("#"+roleId+"compellation").val() == "") {
					alert("姓名不能为空");
					$("#"+roleId+"compellation").focus();
					return false;
				}
				//密码检查
				if ($("#"+roleId+"pwd").val() != $("#"+roleId+"pwdRepeat").val()) {
					alert("确认密码和密码不一致，请重新输入！");
					$("#"+roleId+"pwdRepeat").select();
					$("#"+roleId+"pwdRepeat").focus();
					return false;
				}
				return true;
		},
		beforeSubmit:function(roleId) {
				//检查用户是否已经被占用
				$.ajax({
	            	url : REGISTER.param.surl + "/user/check/"+escape($("#"+roleId+"regName").val())+"/1?r=" + Math.random(),
	            	success : function(data) {
	            		if (data.data) {
	            			//检查手机号是否存在
	            			$.ajax({
	            				url : REGISTER.param.surl + "/user/check/"+$("#"+roleId+"phone").val()+"/2?r=" + Math.random(),
				            	success : function(data) {
				            		if (data.data) {
					            		REGISTER.doSubmit(roleId);
				            		} else {
				            			alert("此手机号已经被注册！");
				            			$("#"+roleId+"phone").select();
				            		}
				            	}
	            			});
	            		} else {
	            			alert("此用户名已经被占用，请选择其他用户名");
	            			$("#"+roleId+"regName").select();
	            		}	
	            	}
				});
	            	
		},
		doSubmit:function(roleId) {		
			$.post("/user/register",$("#"+roleId+"personRegForm").serialize(), function(data){
				if(data.status == 200){
					alert('用户注册成功，请登录！');
					REGISTER.login();
				} else {
					alert("注册失败！");
				}
			});
		},
		login:function() {
			 location.href = "/page/login";
			 return false;
		},
		reg:function(id) {
			var roleId = "";
			if(id == "g_register"){
				roleId = 2 ;				
			}else{
				roleId = 3 ;				
			}
			if (this.inputcheck(roleId)) {
				this.beforeSubmit(roleId);
			}
		}
	};
</script>
	</body>
</html>