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
	pageContext.setAttribute("SEARCH_ADRESS", "http://localhost:8086");

%>

<link rel="shortcut icon" href="${APP_PATH}/static/img/favicon.html">

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

<!--商品添加
		<link href="css/gloab.css" rel="stylesheet">
		<link href="css/index.css" rel="stylesheet">
		<script src="js/register.js"></script>
		<script src="js/pro_dese.js"></script>
		<script src="js/product_dec.js"></script>-->

<!--富文本编辑器-->
<script src="http://cdn.bootcss.com/ckeditor/4.5.11/ckeditor.js"></script>
<link rel="stylesheet" type="text/css"
	href="${APP_PATH}/static/css/bootstrap.min.css">
<script src="${APP_PATH}/static/js/jquery.js"></script>
<!--图片上传-->

<!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
<!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->

<script src="${APP_PATH}/static/js/bra_additem_service.js"></script>
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
							<li class="active" ><a id="jump_for_page02" class="" href="${APP_PATH}/bra_additem.html">商品发布</a></li>
							<li><a id="jump_for_page03" class=""
								href="${APP_PATH}/bra_seleitem.html">商品查询</a></li>
							<li><a id="jump_for_page04" class="" href="${APP_PATH}/bra_edititem.html">商品编辑</a></li>
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
									<h3>商品发布</h3>
								</div>
								<div class="row">
									<div class="col-md-12">
										<form class="form-horizontal" enctype="multipart/form-data"
											id="form_add_product">
											<div class="form-group">
												<label class="col-sm-2 control-label">商品名称</label>
												<div class="col-sm-3">
													<input type="text" class="form-control" id="input_pro_name"
														placeholder="商品名称" name="name">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">商品种类</label>
												<div class="col-sm-3">
													一级种类<select class="form-control" id="sele_pro_fcate"
														name="fCategoryid" onclick="form_select_getoption()">
														<option value="">请选择一级商品种类</option>
													</select>
													<p></p>
													二级种类<select class="form-control" id="sele_pro_scate"
														name="sCategoryid" ><!-- onclick="form_select_get2_option()" -->
														<option>请选择二级商品种类</option>
													</select>
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">商品库存</label>
												<div class="col-sm-2">
													<input type="text" class="form-control"
														id="input_pro_quantity" placeholder="库存" name="quantity">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">商品价格（元）</label>
												<div class="col-sm-2">
													<input type="text" class="form-control"
														id="input_pro_price" placeholder="价格" name="price">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">商品重量(kg)</label>
												<div class="col-sm-1">
													<input type="text" class="form-control"
														id="input_pro_weight" placeholder="重量" name="weight">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">商品大小(cm)</label>
												<div class="col-sm-1">
													商品长<input type="text" class="form-control"
														id="input_pro_long" placeholder="长"> 商品宽<input
														type="text" class="form-control" id="input_pro_width"
														placeholder="宽"> 商品高<input type="text"
														class="form-control" id="input_pro_high" placeholder="高">
													<input type="hidden" id="input_pro_size" name="size">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">建议售价（元）</label>
												<div class="col-sm-2">
													<input type="text" class="form-control"
														id="input_pro_recommendprice" placeholder="建议售价"
														name="recommendprice">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">商品颜色</label>
												<div class="col-sm-4">
													<label class="checkbox-inline"> <input
														type="checkbox" id="inlineCheckbox1" value="红色"
														name="color" checked="checked"> 红色
													</label> <label class="checkbox-inline"> <input
														type="checkbox" id="inlineCheckbox1" value="黄色"
														name="color"> 黄色
													</label> <label class="checkbox-inline"> <input
														type="checkbox" id="inlineCheckbox1" value="黑色"
														name="color"> 黑色
													</label> <label class="checkbox-inline"> <input
														type="checkbox" id="inlineCheckbox1" value="蓝色"
														name="color"> 蓝色
													</label>
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">商品状态</label>
												<div class="col-sm-2">
													<select class="form-control" name="skuStatus"
														id="sele_pro_status">
														<option value="0">待发布</option>
														<option value="1">销售中</option>
														<option value="2">已下架</option>
													</select>
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">商品仓库</label>
												<div class="col-sm-2">
													<select class="form-control" name="warehouseid"
														id="sele_pro_warehouseid">
														<option>请选择商品仓库</option>
														<option value="1" selected="selected">本地仓库</option>
														<option value="2">海外仓库</option>
													</select>
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">商品简述</label>
												<div class="col-sm-4">
													<textarea class="form-control" rows="3" name="sellPoint"
														id="text_pro_sellPoint"></textarea>
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">商品图片</label>
												<div class="col-sm-2">
													<input type="file" name="uploadfile" id="uploadfile" />
												</div>
												<div class="col-sm-2">
													<input type="button" value="上传" onclick="doUpload()"
														class="btn btn-success fileinput-button" /> <input
														type="hidden" name="picture" id="pictureCertificate"
														value="">
												</div>

											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">图片预览</label> <span>谷歌浏览器下
													图片可能无法正常显示</span>
												<div id="div_show_pic"></div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">商品详情</label>
												<div class="col-sm-8">
													<textarea id="applicationform" class="ckeditor"
														name="applicationform" rows="30" cols="20"></textarea>
													<input type="button" onclick="form_submit_details()"
														value="上传商品详情"> <input type="hidden" value=""
														name="details" id="form_pro_details">
												</div>
											</div>
											<div class="form-group">
												<div class="col-sm-offset-2 col-sm-10">
													<button type="button" class="btn btn-default"
														onclick="form_add_item()">提交</button>
												</div>
											</div>
										</form>
									</div>
								</div>
							</div>

						</section>
						<!--timeline end-->

					</div>
					<div class="col-lg-4"></div>
			</section>
		</section>
		<!--main content end-->
	</section>

	<!-- js placed at the end of the document so the pages load faster -->
	<!--<script src="js/jquery.js"></script>-->
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
		var cate;
		var fcate;
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
			//为每个跳转url+id属性
			Url_add_userid(id);
			//获取到当前用户的仓库
			/* get_user_warehouse(id); */
		});
		
		//获取到当前用户的仓库
		function get_user_warehouse(id){
			$.ajax({
				url : "${IP_ADRESS}/rest/getWarehouse/" + id,
				type : "GET",
				success : function(result) {
					if (result.code == 100) {
						//对返回的仓库数据的处理
						set_warehouse_data(result);
					} else {
						alert("数据处理失败！！请重新刷新也面");
					}
				}
			});
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
		
		//对返回的仓库数据的处理
		function set_warehouse_data(result){
			$("#sele_pro_warehouseid").empty();
			var warehouses = result.extend.warehouses;
			$.each(warehouses,function(){
				console.log(this);
				$("<option></option>").attr("value",this.id).text(this.name).appendTo($("#sele_pro_warehouseid"));
			});
		}
		

		//获取一级分类数据
		function form_select_getoption() {
			fcate = $("#sele_pro_fcate").val();
			if($("#sele_pro_fcate option").length != 1&&cate!=fcate){
				form_select_get2_option();
			}
			if ($("#sele_pro_fcate option").length == 1) {
				$("#sele_pro_fcate").empty();
				//ajax请求一级分类列表数据
				$.ajax({
					async : true,
					url : "${IP_ADRESS}/rest/itemfcate/list",
					type : "GET",
					dataType : "jsonp", // 返回的数据类型，设置为JSONP方式
					jsonp : 'callback', //指定一个查询参数名称来覆盖默认的 jsonp 回调参数名 callback
					jsonpCallback : 'handleFCateResponse', //设置回调函数名
					data : {
						q : "javascript",
						count : 1
					}
				});
			}
		}

		//一级分类列表数据返回解析
		function handleFCateResponse(result) {
			$.each(result, function() {
				$.each(this, function() {
					$("<option></option>").attr("value", this.id).text(
							this.name).appendTo($("#sele_pro_fcate"));
				});
			});
				form_select_get2_option();

		}

		//获取二级分类数据
		function form_select_get2_option() {
			cate = fcate;
			var fCateval = $("#sele_pro_fcate").val();
					$("#sele_pro_scate").empty();
					//ajax请求二级分类列表数据
					$.ajax({
						async : true,
						url : "${IP_ADRESS}/rest/itemscate/list/" + fCateval,
						type : "GET",
						dataType : "jsonp", // 返回的数据类型，设置为JSONP方式
						jsonp : 'callback', //指定一个查询参数名称来覆盖默认的 jsonp 回调参数名 callback
						jsonpCallback : 'handleSCateResponse', //设置回调函数名
						data : {
							q : "javascript",
							count : 1
						}
					});
		}

		//二级分类列表数据返回解析
		function handleSCateResponse(result) {
			$.each(result, function() {
				$.each(this, function() {
					$("<option></option>").attr("value", this.id).text(
							this.name).appendTo($("#sele_pro_scate"));
				});
			});

		}

		//custom select box

		//js代码
		function doUpload() {
			var formData = document.getElementById("uploadfile").files[0]; // js 获取文件对象
			var pic_value = $("#pictureCertificate").val();
			if (typeof (formData) == "undefined" || formData.size <= 0) {
				alert("请选择图片!");
				return;
			} else {
				var formData = new FormData();
				formData.append("uploadfile", document
						.getElementById("uploadfile").files[0]);
			}
			$
					.ajax({
						url : "${IP_ADRESS}/rest/pic/fileUpload",
						type : 'POST',
						data : formData,
						async : false,
						cache : false,
						contentType : false,
						processData : false,
						success : function(returndata) {
							//returndata);
							if (returndata.code == "3") {
								alert("上传图片格式不正确！");
							} else if (returndata.code == "0") {
								alert("上传文件不得大于3m！");
							} else if (returndata.code == "404"
									|| returndata.code == "1") {
								alert("上传凭证失败！");
							} else if (returndata.code == "200") {
								alert("上传凭证成功！");
								if ($("#pictureCertificate").val() == null
										|| $("#pictureCertificate").val() == "") {
									$("#pictureCertificate").val(
											returndata.path);
								} else {
									$("#pictureCertificate").val(
											$("#pictureCertificate").val()
													+ "--" + returndata.path);
								}
								$("<div></div>")
										.addClass("col-sm-2")
										.append(
												$(
														"<img alt='加载中' src='' width='100' height='100'>")
														.attr("src",
																returndata.path))
										.appendTo("#div_show_pic");
							}

						},
						error : function(returndata) {
							alert("上传凭证失败！");
						}
					});
		}

		//保存商品详情数据
		function form_submit_details() {
			var data = CKEDITOR.instances.applicationform.getData();
			$("#form_pro_details").val(data);
			/* alert($("#form_pro_details").val()); */
			alert("保存成功");
			
		}
		//跳转到所有订单
		function jump_select_item(){
			$.get("${SEARCH_ADRESS}/search/manager/importall", function(data) {
				
				});
			window.location.replace("${APP_PATH}/bra_seleitem.html?Id="+$("#user_id_val").val());
		}

		/* 商品长<input type="text" class="form-control" id="input_pro_long"
			placeholder="长"> 商品宽<input type="text"
			class="form-control" id="input_pro_width" placeholder="宽">
		商品高<input type="text" class="form-control" id="input_pro_high"
			placeholder="高"> <input type="hidden"
			id="input_pro_size" name="size"> */
		//计算商品大小
		function Calculated_Size() {
			var p_long = $("#input_pro_long").val();
			var p_width = $("#input_pro_width").val();
			var p_high = $("#input_pro_high").val();
			var p_size = p_long * p_width * p_high;
			$("#input_pro_size").val(p_size);
		}

		//上传表单数据
		function form_add_item() {
			//提交前计算商品大小
			Calculated_Size();
			if (confirm("你确定要提交操作吗？")) {
				//发送ajax请求保存商品
				$.ajax({
					url : "${IP_ADRESS}/rest/add_product",
					type : "POST",
					data : {
						userid : $("#user_id_val").val(),
						name : $("#input_pro_name").val(),
						color : $("#inlineCheckbox1").val(),
						skuStatus : $("#sele_pro_status").val(),
						picture : $("#pictureCertificate").val(),
						quantity : $("#input_pro_quantity").val(),
						size : $("#input_pro_size").val(),
						weight : $("#input_pro_weight").val(),
						sellPoint : $("#text_pro_sellPoint").val(),
						recommendprice : $("#input_pro_recommendprice").val(),
						fCategoryid : $("#sele_pro_fcate").val(),
						sCategoryid : $("#sele_pro_scate").val(),
						warehouseid : $("#sele_pro_warehouseid").val(),
						price : $("#input_pro_price").val(),
						details : $("#form_pro_details").val(),

					},
					success : function(result) {
						//打印返回结果
						console.log(result);
						if (result.code == 100) {
							alert("录入成功!商品id：" + result.extend.pro_id);
							jump_select_item();
						} else {
							alert("录入失败！");
						}
					}
				});
			}
		}
	</script>
</body>

</html>