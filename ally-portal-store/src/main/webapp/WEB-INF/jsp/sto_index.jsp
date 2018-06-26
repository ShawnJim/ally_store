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
%>
<title>ALLELUJA-首页</title>
<!--[if lt IE 9]>
  <script src="http://apps.bdimg.com/libs/html5shiv/3.7/html5shiv.min.js"></script>
<![endif]-->
<meta http-equiv="X-UA-Compatible" content="edge" />
<link rel="stylesheet" type="text/css"
	href="${APP_PATH}/static/css/index.css">
<script src="${APP_PATH}/static/js/jquery-1.8.3.min.js"></script>
<script src="${APP_PATH}/static/js/jquery.fly.min.js"></script>
<script src="${APP_PATH}/static/js/public.js"></script>
<!--[if lte IE 9]>
</script><script src="js/ie9.js"></script>
<![endif]-->
<script src="${APP_PATH}/static/js/base.js"></script>
<script>document.createElement("top")</script>
<script>document.createElement("search")</script>
<script>document.createElement("light")</script>
<script>document.createElement("light1")</script>
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
		</div>
		<div class="vip_center">
			<a href="${APP_PATH}/sto_personal.html" id="jump_for_page">个人中心</a> <a href="#">商户中心</a> <a href="#">帮助</a>
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
	<!--导航-->
	<section class="dao_hang">
		<nav>
			<!--右下侧广告-->
			<div class="advertisement">
				<h4>最新公告</h4>
				<div class="notice_new">
					<p>
						<a href="#">【优选】金秋聚会，买一送一</a>
					</p>
					<p>
						<a href="#">【优选】中秋嘉年华，好礼钜惠</a>
					</p>
					<p>
						<a href="#">【优选】冰点破纪录，低价不猫腻</a>
					</p>
					<p>
						<a href="#">【优选】开学季，“纸”想“净、净”学习</a>
					</p>
					<p>
						<a href="#">【优选】金秋聚会，买一送一</a>
					</p>
					<p>
						<a href="#">【优选】中秋嘉年华，好礼钜惠</a>
					</p>
					<p>
						<a href="#">【优选】开学季，“纸”想“净、净”学习</a>
					</p>
				</div>
				<a href="#">
					<div class="notice_img">
						<img src="${APP_PATH}/static/images/activity.jpg" class="img1">
						<img src="${APP_PATH}/static/images/activity.jpg" class="img2">
					</div>
				</a>
				<!--<script>
			$(function(){
				$(".notice_img")
				})
            </script>-->
			</div>
			<!--全部商品分类-->
			<div class="important">
				<img src="${APP_PATH}/static/images/all_list.png"
					style="margin-top: 8px">&nbsp;全部商品分类
				<aside>
					<ul>
						<li class="cates" mt-ct="list01" style="height: 45px">
							<h3 id="ul_show_fcate0"></h3>
						</li>
						<li class="cates" mt-ct="list02" style="height: 45px">
							<h3 id="ul_show_fcate1"></h3>
						</li>
						<li class="cates" mt-ct="list03" style="height: 45px">
							<h3 id="ul_show_fcate2"></h3>
						</li>
						<li class="cates" mt-ct="list04" style="height: 45px">
							<h3 id="ul_show_fcate3"></h3>
						</li>
						<li class="cates" mt-ct="list05" style="height: 45px">
							<h3 id="ul_show_fcate4"></h3>
						</li>
						<li class="cates" mt-ct="list06" style="height: 45px">
							<h3 id="ul_show_fcate5"></h3>
						</li>
						<li class="cates" mt-ct="list07" style="height: 45px">
							<h3 id="ul_show_fcate6"></h3>
						</li>
						<li class="cates" mt-ct="list08" style="height: 45px">
							<h3 id="ul_show_fcate7"></h3>
						</li>
						<li class="cates" mt-ct="list09" style="height: 45px">
							<h3 id="ul_show_fcate8"></h3>
						</li>
					</ul>
				</aside>
				<div>
					<div class="import_list b-list01" id="show_scate_list0">
						<dt></dt>
						<dd></dd>
					</div>
					<div class="import_list b-list02" id="show_scate_list1">
						<dt></dt>
						<dd></dd>
					</div>
					<div class="import_list b-list03" id="show_scate_list2">
						<dt></dt>
						<dd></dd>
					</div>
					<div class="import_list b-list04" id="show_scate_list3">
						<dt></dt>
						<dd></dd>

					</div>
					<div class="import_list b-list05" id="show_scate_list4">
						<dt></dt>
						<dd></dd>
					</div>
					<div class="import_list b-list06" id="show_scate_list5">
						<dt></dt>
						<dd></dd>
					</div>
					<div class="import_list b-list07" id="show_scate_list6">
						<dt></dt>
						<dd></dd>
					</div>
					<div class="import_list b-list08" id="show_scate_list7">
						<dt></dt>
						<dd></dd>
					</div>
					<div class="import_list b-list09" id="show_scate_list8">
						<dt></dt>
						<dd></dd>
					</div>
				</div>
			</div>
			<!--结束-->
			<div class="dao_list">
				<a href="#">首页</a> <a href="#">母婴之家</a> <a href="#">厨房用品</a> <a
					href="#">生活必备</a> <a href="#">试吃申请</a> <a href="#">最新公告</a>
			</div>

		</nav>
	</section>
	<!--banner-->
	<div id="banner_tabs" class="flexslider">
		<ul class="slides">
			<li><a title="" target="_blank" href="#"> <img width="1920"
					height="500" alt=""
					style="background: url(${APP_PATH}/static/images/banner1.png) no-repeat center;"
					src="${APP_PATH}/static/images/main/lunbo2.jpg">
			</a></li>
			<li><a title="" href="#"> <img width="1920" height="500"
					alt=""
					style="background: url(${APP_PATH}/static/images/banner1.png) no-repeat center;"
					src="${APP_PATH}/static/images/main/lunbo1.jpg">
			</a></li>
		</ul>
		<ul class="flex-direction-nav">
			<li><a class="flex-prev" href="javascript:;">Previous</a></li>
			<li><a class="flex-next" href="javascript:;">Next</a></li>
		</ul>
		<ol id="bannerCtrl" class="flex-control-nav flex-control-paging">
			<li class="active"><a>1</a></li>
			<li><a>2</a></li>
			<li><a>2<
			/a></li>
			<li><a>2</a></li>
		</ol>
	</div>
	<script src="${APP_PATH}/static/js/slider.js"></script>
	<!--gong告-->
	<script type="text/javascript">
		window.onload=function(){
		$("top").animate({'margin-top':'400'},2)	
		$(".advertisement").animate({'top':'30','opacity':'1'},200)
		$(".flexslider").animate({'margin-top':'0'},200)
		$("aside").animate({'top':'30','opacity':'1'},200)
		$("top").animate({'margin-top':'-400'},1000)
		
		}
</script>
	<!--楼层分布图-->

	<div class="fixed_position">
		<div class="fixed_position_1">
			<ul>
				<li id="Floor_fcate_li00"></li>
				<li id="Floor_fcate_li01"></li>
				<li id="Floor_fcate_li02"></li>
				<li id="Floor_fcate_li03"></li>
			</ul>
		</div>
	</div>

	<!--数码相机及摄影器材-->
	<span class="as blessing_package"> <a href="#"
		style="color: #000"><h3 style="float: left" id="a_fcate_li00">
				&nbsp;<img src="${APP_PATH}/static/images/zd.png"
					style="display: block; float: left; margin-top: 5px">
			</h3></a>
		<div class="detailed_navigation">
			<ul>
				<li class="dog d-1-lt01 yadi" dg-floor="1" dg-ct="lt01">镜片</li>
				<li class="dog d-1-lt02" dg-floor="1" dg-ct="lt02">菲林相机</li>
				<li class="dog d-1-lt03" dg-floor="1" dg-ct="lt03">数码相机</li>
			</ul>
		</div>
	</span>
	<div>
		<div class="currency f-1-lt01">
			<ul id="show_ul_li10">
			</ul>
		</div>
		<div class="currency f-1-lt02" style="display: none">
			<ul id="show_ul_li11">
			</ul>
		</div>
		<div class="currency f-1-lt03" style="display: none">
			<ul id="show_ul_li12">
			</ul>
		</div>

	</div>
	<!--电子产品及电器专区-->
	<span class="as blessing_package"> <a href="#"
		style="color: #000"><h3 style="float: left" id="a_fcate_li01">
				&nbsp;
			</h3></a>
		<div class="detailed_navigation">
			<ul>
				<li class="dog d-2-lt01 yadi" dg-floor="2" dg-ct="lt01">家居音响器材</li>
				<li class="dog d-2-lt02" dg-floor="2" dg-ct="lt02">家居影视器材</li>
				<li class="dog d-2-lt03" dg-floor="2" dg-ct="lt03">mp3播放器及配件</li>
				<li class="dog d-2-lt04" dg-floor="2" dg-ct="lt04">汽车影音器材</li>
			</ul>
		</div>
	</span>
	<div>
		<div class="currency f-2-lt01">
			<ul id="show_ul_li14">
			</ul>
		</div>
		<div class="currency f-2-lt02" style="display: none">
			<ul id="show_ul_li15">

			</ul>
		</div>
		<div class="currency f-2-lt03" style="display: none">
			<ul id="show_ul_li16">

			</ul>
		</div>
		<div class="currency f-2-lt04" style="display: none">
			<ul id="show_ul_li17">

			</ul>
		</div>

	</div>
	<!--服装、鞋及配件专区 -->
	<span class="as blessing_package"> 
	<a href="#" style="color: #000"><h3 style="float: left" id="a_fcate_li02">&nbsp;</h3></a>
		<div class="detailed_navigation">
			<ul>
				<li class="dog d-3-lt01 yadi" dg-floor="3" dg-ct="lt01">女装</li>
				<li class="dog d-3-lt02" dg-floor="3" dg-ct="lt02">女装及根包</li>
				<li class="dog d-3-lt03" dg-floor="3" dg-ct="lt03">男装</li>
				<li class="dog d-3-lt04" dg-floor="3" dg-ct="lt04">男装鞋</li>
			</ul>
		</div>
	</span>
	<div>
		<div class="currency f-3-lt01">
			<ul id="show_ul_li18">
				
			</ul>
		</div>
		<div class="currency f-3-lt02" style="display: none">
			<ul id="show_ul_li19">
				
			</ul>
		</div>
		<div class="currency f-3-lt03" style="display: none">
			<ul id="show_ul_li20">
				
			</ul>
		</div>
		<div class="currency f-3-lt04" style="display: none">
			<ul id="show_ul_li21">
				
			</ul>
		</div>
	</div>
	<!--书籍专区-->
	<span class="as blessing_package"> 
	<a href="#" style="color: #000"><h3 style="float: left" id="a_fcate_li03">&nbsp;</h3></a>
		<div class="detailed_navigation">
			<ul>
				<li class="dog d-4-lt01 yadi" dg-floor="4" dg-ct="lt01">漫画</li>
				<li class="dog d-4-lt02" dg-floor="4" dg-ct="lt02">儿童、益智</li>
				<li class="dog d-4-lt03" dg-floor="4" dg-ct="lt03">科学技术教科参考书</li>
			</ul>
		</div>
	</span>
	<div>
		<div class="currency f-4-lt01">
			<ul id="show_ul_li22">
			</ul>
		</div>
		<div class="currency f-4-lt02" style="display: none">
			<ul id="show_ul_li23">
			</ul>
		</div>
		<div class="currency f-4-lt03" style="display: none">
			<ul id="show_ul_li24">
				
			</ul>
		</div>
	</div>

	<!--页脚-->
	<footer>
		<section class="foot_in">
			<!--left-->
			<div class="foot_in_left">
				<div>
					<h5></h5>
					<ul>
					</ul>
				</div>
			</div>
			<%-- <!--right-->
			<div class="foot_in_right">
				<div>
					<h5>联系我们</h5>
					<p>
						<img src="${APP_PATH}/static/images/dian.png" width="40"
							height="40" style="float: left"><em
							style="float: left; line-height: 40px; color: #eb4e01; font-size: 20px">&nbsp;&nbsp;&nbsp;6001-666-888</em>
					</p>
					<p>
						<img src="${APP_PATH}/static/images/wx.png" width="40" height="40"
							style="float: left"><em
							style="float: left; line-height: 40px; color: #eb4e01; font-size: 20px">&nbsp;&nbsp;&nbsp;<a
							href="#" style="color: #eb4e01">在线客服</a></em>
					</p>
				</div>
			</div> --%>
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
	<!--购物车fly插件-->
	<!-- 页面js -->
	<%-- <script src="${APP_PATH}/static/js/sto_index.js"></script> --%>
	<script type="text/javascript">
	//页面加载之后
	$(function () {
		//发送ajax请求分类列表数据
		get_cate_list();
		//发送ajax请求 电子产品及电器 层的商品数据
		get_scate_pros();
		//从页面中获取id
		var id = getUrlParam("Id");
		//根据id发送ajax获取用户的数据
		get_user(id);
		$("#user_id").val(id);
		$("#jump_for_page").attr("href",$("#jump_for_page").attr("href")+"?Id="+id);
	
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
		$.each(result, function() {		
			$.each(this,function(){
				$("#ul_show_fcate"+count).append(result.date[count].n);
				if(count <= 4){
					$("#Floor_fcate_li0"+count).append(result.date[count].n);
					$("#a_fcate_li0"+count).append(result.date[count].n);
				}
				$("#show_scate_list"+count+" dt").append(result.date[count].n+":");
				$.each(this.i,function(){
					$("#show_scate_list"+count+" dd").append(this.n);
				});
				count = count + 1;
			});
	    });
	}

	//发送ajax请求 电子产品及电器 层的商品数据
	function get_scate_pros(){
		//数码相机及摄影器材 层数据的填充
		ajax_get_pros(10);
		ajax_get_pros(11);
		ajax_get_pros(12);
		//电子产品及电器专区 层数据的填充
		ajax_get_pros(14);
		ajax_get_pros(15);
		ajax_get_pros(16);
		ajax_get_pros(17);
		//服装、鞋及配件专区 层数据的填充
		ajax_get_pros(18);
		ajax_get_pros(19);
		ajax_get_pros(20);
		ajax_get_pros(21);
		//书籍专区 层数据的填充
		ajax_get_pros(22);
		ajax_get_pros(23);
		ajax_get_pros(24);
	}

	//发送ajax请求
	function ajax_get_pros(id){
		var sid = id;
		//发送ajax请求列表数据
		$.ajax({
	        url : "${IP_ADRESS}/rest/get_scate_products",
	        type : "POST",
	        data : {
	        	id : sid
	        } ,
	        success: function(result){
	        	if(result.code==200){
	        		alert("获取商品数据失败")
	        	}else{
	        		deal_pros_result(result,sid);
	        	}
	        }
		});
	}

	//处理传来的数据
	function deal_pros_result(result,id){
	    var products = result.extend.scate_products;
	    var count = 0;
	    if(products.products!=null){
	    	$.each(products.products,function(){
	    		 var pics = this.picture.split('--');
	    		 if(count<5){
	    		$("#show_ul_li"+id).append($("<li></li>")
	    				.append($("<a></a>").attr("href","/pro_detail.html?id="+this.id+"&Id="+$("#user_id").val())
	    						.append($("<img src='' style=' margin:0 auto; display:block; width:220px; height:220px'>").attr("src",pics[0])))
	    				.append($("<light1></light1>")
	    						.append($("<img src='/static/images/saoguang.png'>")))  
	    				.append($("<span></span").text("￥"+this.price)) 
	    				.append($("<a href=''></a>")
	    						.attr("href","/pro_detail.html?id="+this.id+"&Id="+$("#user_id").val())
	    						.append($("<p></p>").text(this.name+"  "+this.sellPoint)))
	    				.append($("<em></em>")
	    						.append($("<a href='#'>收藏</a>"))
	    						.append($("<a href='javascript:void(0)' class='add_scar'>加入购物车</a>"))) );
	    		 }
	    		 count = count +1;
	    	});
	    }
	}

	//商品分类搜索
	$(document).on("click", ".scate_a", function() {
		var cate_name = $(this).text();
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