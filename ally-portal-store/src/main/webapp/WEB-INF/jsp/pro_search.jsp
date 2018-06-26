<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	pageContext.setAttribute("IP_ADRESS", "http://localhost:8081");
	pageContext.setAttribute("LOGIN_ADRESS", "http://localhost:8084");
	pageContext.setAttribute("SEARCH_ADRESS", "http://localhost:8086");
%>
<title>ALLELUJA-搜索详情</title>
<!doctype html>
<html>

<head>
<meta charset="utf-8">
<title>index</title>
<!--[if lt IE 9]>
  <script src="http://apps.bdimg.com/libs/html5shiv/3.7/html5shiv.min.js"></script>
<![endif]-->
<meta http-equiv="X-UA-Compatible" content="edge" />
<link rel="stylesheet" type="text/css"
	href="${APP_PATH}/static/css/index.css">
<link rel="stylesheet" href="${APP_PATH}/static/css/common.css">
<script src="${APP_PATH}/static/js/jquery-1.8.3.min.js"></script>
<!--
		<script src="js/jquery.fly.min.js"></script>-->
<script src="${APP_PATH}/static/js/public.js"></script>

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
</head>

<body>
	<!--最大的背景-->
	<div class="maxbj"></div>

	<!--头部-->
	<top>
	<section class="seck">
		<div class="register_login">
			<input type="hidden" id="user_id"> <em id="show_user_name">您好，</em>
			<a href="${LOGIN_ADRESS}/page/login.html" id="page_log">会员登录</a> <a
				href="${LOGIN_ADRESS}/page/register.html" id="page_reg">快速注册</a>
			<a href="${APP_PATH}/sto_index.html" id="jump_for_page1">回到首页</a>
		</div>
		<div class="vip_center">
			<a href="${APP_PATH}/sto_personal.html" id="jump_for_page">个人中心</a> <a
				href="#">商户中心</a> <a href="#">帮助</a>
		</div>
	</section>
	</top>
	<!--header-->
	<div class="maxbj1">
		<header>
			<b class="logo"><h1>ALLELUJA</h1></b>
			<search>
			<form>
				<input type="text" placeholder="查询关键词..." required
					style="width: 440px; height: 30px; text-indent: 2em; float: left; box-shadow: none" id="input_search_pro">
				<button type="button" onclick="search_pro_btn()">搜索</button>
			</form>
			</search>
			<div class="sping_car">
				<b></b> <a href="#"><em>我的购物车</em></a>
			</div>
		</header>
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
	<!--分类选项-->
	<div class="filter">
		<div class="container">
			<div class="box">
				<div class="title-h">按条件筛选</div>
				<dl>
					<dt>分类</dt>
					<dd id="show_scate_list"></dd>
				</dl>
				<dl>
					<dt>价格</dt>
					<dd>
						<i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</i> <a href="#" rel="0"
							name="sort" class="all on">升序</a> <a href="#" rel="1" name="sort"
							class="sx_child">降序</a>
					</dd>
				</dl>
			</div>
		</div>
	</div>
	<!--分类插件-->
	<script src="${APP_PATH}/static/js/tagSelect.js"></script>
	<script>
			$(function() {
				new SelectTag({
					child: ".sx_child", //所有筛选范围内的子类
					over: 'on', //选中状态样式名称
					all: ".all"
				});
			})
		</script>
	<!--商品展示-->
	<span class="as blessing_package"> <a href="#"
		style="color: #000"><h3 style="float: left">&nbsp;所有商品</h3></a>
		<div class="detailed_navigation">
			<ul>
				<div class="col-md-6" id="page_info_area"></div>
			</ul>
		</div>
	</span>
	<div>
		<div class="currency">
			<div align="center" id="Prompt_message_null">
				<img
					src="${APP_PATH}/static/images/empty_search_result-551f162e825a44193cc0559f75795b4a.png"
					alt="proty search result" /> <span>没有查到符合条件的记录</span>
			</div>
			<ul id="show_ul_li0">
			</ul>
			<ul id="show_ul_li1">
			</ul>
			<ul id="show_ul_li2">
			</ul>
			<ul id="show_ul_li3">
			</ul>
			<ul id="show_ul_li4">
			</ul>
		</div>
	</div>

	<!--页脚-->
	<footer>
		<section class="foot_in">
			<!--left-->
			<div class="foot_in_left"></div>
			<!--right-->
			<div class="foot_in_right">
				<!--<div>
            	<h5>联系我们</h5>
                <p><img src="images/dian.png" width="40" height="40" style=" float:left"><em style=" float:left; line-height:40px; color:#eb4e01; font-size:20px">&nbsp;&nbsp;&nbsp;6001-666-888</em></p>
                <p><img src="images/wx.png" width="40" height="40" style=" float:left"><em style=" float:left; line-height:40px; color:#eb4e01; font-size:20px">&nbsp;&nbsp;&nbsp;<a href="#" style="color:#eb4e01">在线客服</a></em></p>
            </div>-->
			</div>
		</section>
	</footer>
	<div class="foots">
		<div class="foots_in">
			<a href="#" style="float: left">
				<h1>ALLELUJA</h1>
			</a> <em>CopyRight © 2000-2016 BitAuto,All Rights Reserved.</em>
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

	<script type="text/javascript">
	//页面加载之后
	$(function () {
		//发送ajax请求分类列表数据
		get_cate_list();
		//从页面中获取id
		var id = getUrlParam("Id");
		//根据id发送ajax获取用户的数据
		get_user(id);
		$("#user_id").val(id);
		$("#jump_for_page").attr("href",$("#jump_for_page").attr("href")+"?Id="+id); 
		$("#jump_for_page1").attr("href",$("#jump_for_page1").attr("href")+"?Id="+id); 
		//从页面中获取搜索名称
		var q = getUrlParam("q");
		var cate = getUrlParam("cate");
		var sort = getUrlParam("sort");
		//进行数据查询
		get_solr_pro(q,cate,sort);
		
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
	
	//获取url传的参数
	function getUrlParam(name) {

		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象

		var r = window.location.search.substr(1).match(reg); //匹配目标参数

		if (r != null)
			return unescape(r[2]);

		return null; //返回参数值

	}
	
	//请求分类数据
	function get_cate_list(){
		//发送ajax请求列表数据
		$.ajax({
			async : true,
	        url : "${IP_ADRESS}/rest/itemcat/list",
	        type : "GET",
	        dataType : "jsonp", // 返回的数据类型，设置为JSONP方式
	        jsonp : 'callback', //指定一个查询参数名称来覆盖默认的 jsonp 回调参数名 callback
	        jsonpCallback: 'cateListResponse', //设置回调函数名
	        data : {
	            q : "javascript", 
	            count : 1
	        }
		});
	}
	
	
	//返回分类列表数据后进行的数据处理
	function cateListResponse(result){
		var count = 0;
		$("#ul_show_fcate").append($("<i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</i>"));
		$("#show_scate_list").append($("<i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</i>"));
		$.each(result, function() {	
			$.each(this,function(){
				$("#ul_show_fcate").append($("<a href='#' value='"+this.n+"' class='fcate_a'>"+this.n+"</a>"));
				$.each(this.i,function(){
					$("#show_scate_list").append(this.n);
				});
			});
	    });
	}
	
	//进行商品数据查询
	function get_solr_pro(q,cate,sort){
		//发送ajax请求列表数据
		$.ajax({
	        url : "${SEARCH_ADRESS}/search/query",
	        type : "POST",
	        data : {
	            q :q, 
	            cate :cate,
	            sort :sort
	        },success : function(result){
	        	console.log(result);
	        	if(result.code==100){
	        		//进行商品数据填充
	        		deal_pros_result(result);
	        		//处理分页信息
	        		build_page_info(result);
	        	}else{
	        		alert(result.extend.message);
	        	}
	        }
		});
	}
	
	//处理传来的商品数据
	function deal_pros_result(result){
	    var products = result.extend.searchResult;
	    var count = 0;
	    var num = 0;
	    if(products.itemList!=null&&products.itemList.length!=0){
	    	$("#Prompt_message_null").hide();
	    	$.each(products.itemList,function(){
	    		 var pics = this.picture.split('--');
	    		 if(num<5){
	    		$("#show_ul_li"+count).append($("<li></li>")
	    				.append($("<a></a>").attr("href","/pro_detail.html?id="+this.id+"&Id="+$("#user_id").val())
	    						.append($("<img src='' style=' margin:0 auto; display:block; width:220px; height:220px'>").attr("src",pics[0])))
	    				.append($("<light1></light1>")
	    						.append($("<img src='/static/images/saoguang.png'>")))  
	    				.append($("<span></span").text("￥"+this.price)) 
	    				.append($("<a href=''></a>")
	    						.attr("href","/pro_detail.html?id="+this.id+"&Id="+$("#user_id").val())
	    						.append($("<p></p>").append(this.pro_name+"  "+this.sell_point)))
	    				.append($("<em></em>")
	    						.append($("<a href='#'>收藏</a>"))
	    						.append($("<a href='javascript:void(0)' class='add_scar'>加入购物车</a>"))) );
	    		 }else{
	    			 count = count+1;
	    			 num = 0;
	    			 $("#show_ul_li"+count).append($("<li></li>")
	 	    				.append($("<a></a>").attr("href","/pro_detail.html?id="+this.id+"&Id="+$("#user_id").val())
	 	    						.append($("<img src='' style=' margin:0 auto; display:block; width:220px; height:220px'>").attr("src",pics[0])))
	 	    				.append($("<light1></light1>")
	 	    						.append($("<img src='/static/images/saoguang.png'>")))  
	 	    				.append($("<span></span").text("￥"+this.price)) 
	 	    				.append($("<a href=''></a>")
	 	    						.attr("href","/pro_detail.html?id="+this.id+"&Id="+$("#user_id").val())
	 	    						.append($("<p></p>").append(this.pro_name+"  "+this.sell_point)))
	 	    				.append($("<em></em>")
	 	    						.append($("<a href='#'>收藏</a>"))
	 	    						.append($("<a href='javascript:void(0)' class='add_scar'>加入购物车</a>"))) );
	    		 }
	    		 num = num +1;
	    	});
	    }
	}
	
	//分页信息
	function build_page_info(result) {
		$("#page_info_area").empty();
		$("#page_info_area").append(
				"当前第 " + result.extend.searchResult.pageCount + " 页,共有 "
						+ result.extend.searchResult.curPage + " 页,一共 "
						+ result.extend.searchResult.recordCount + " 条数据。");
		if(result.extend.searchResult.curPage!=1&&result.extend.searchResult.pageCount!=result.extend.searchResult.curPage){
			$("#page_info_area")
			.append($("<input type='button' class='prev_btn' value='上一页'>&nbsp;&nbsp;&nbsp;&nbsp;"))
			.append($("<input type='button' class='next_btn' value='下一页'>"));
		}else if(result.extend.searchResult.curPage!=1&&result.extend.searchResult.pageCount==result.extend.searchResult.curPage){
			$("#page_info_area")
			.append($("<input type='button' class='prev_btn' value='上一页'>&nbsp;&nbsp;&nbsp;&nbsp;"));
		}else if(result.extend.searchResult.curPage=1&&result.extend.searchResult.pageCount!=result.extend.searchResult.curPage&&result.extend.searchResult.pageCount!=0){
			$("#page_info_area")
			.append($("<input type='button' class='next_btn' value='下一页'>"));
		}
		
		/* $totalRecord = result.extend.searchResult.total;
		$pageRecord = result.extend.searchResult.pageNum; */
	}
	

	//商品分类搜索
	$(document).on("click", ".scate_a", function() {
		var cate_name = $(this).text();
		//进行数据查询
		window.location.replace("${APP_PATH}/pro_search.html?Id="+$("#user_id").val()+"&q="+cate_name+"&cate=1&sort=0");

	});
	
	//搜索按钮方法
	function search_pro_btn(){
		var q = $("#input_search_pro").val();
		if(q!=""&&q.length>0){
		window.location.replace("${APP_PATH}/pro_search.html?Id="+$("#user_id").val()+"&q="+q+"&cate=0&sort=0");
		}
	}
	</script>
</body>

</html>