<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<title>首页</title>
<style>
* {
	padding: 0px;
	margin: 0px;
	font-size: 14px;
}

.menu {
	width: 216px;
	margin-left: 100px;
	border: 2px solid #E4393C;
}

.title {
	height: 40px;
	line-height: 40px;
	background-color: #E4393C;
	padding-left: 20px;
}

.title a {
	color: white;
	text-decoration: none;
	font-weight: bold;
}

.title01 {
	height: 30px;
	line-height: 30px;
	padding-left: 10px;
	background: url("images/2.png") no-repeat right center;
	z-index: 3;
} /*为后面的悬浮层做准备*/
.title01 a {
	color: #313131;
	text-decoration: none;
	font-size: 13px;
}

.title01 a:hover {
	text-decoration: underline;
	font-weight: bold;
	color: #E4393C;
}

.title01:hover {
	border: 1px solid #ddd;
	border-right: none;
	-webkit-box-shadow: 0 0 8px #ddd; /*阴影外发光效果*/
	-moz-box-shadow: 0 0 8px #ddd;
	box-shadow: 0 0 8px #ddd;
}

.title01:hover .show_menu {
	display: block;
}

.title01:hover span { /*添加空标签span来形成遮罩层挡住边框线*/
	width: 25px;
	height: 30px;
	background-color: #fff;
	position: relative;
	z-index: 10;
	float: right;
	right: -2px;
}

.show_menu {
	display: none;
	position: absolute;
	z-index: 4;
	top: 42px;
	left: 318px;
	border: 1px solid #ccc;
	width: 715px;
	background: #fff;
}

.left_div {
	width: 400px;
	float: left;
	margin: 0 5px;
}

.right_div {
	width: 300px;
	float: left;
	background-color: greenyellow;
	margin: 0 2px;
}
</style>
<link rel="stylesheet" href="${APP_PATH}/static/css/bootstrap.min.css">
<link rel="stylesheet" href="${APP_PATH}/static/css/global.css" />
<link rel="stylesheet" href="${APP_PATH}/static/css/local.css" />
</head>
<body>
	<!--我是头顶上的div-->
	<div class="topNav">
		<div class="to">
			<ul class="ri">
				<li><a href="#">你好!</a></li>
				<li><a href="#" id="names">[请登录]</a> <!--到时候添加一个id把用户昵称放在这里--></li>
				<li><a href="#">[免费注册]</a> <!--到时候添加一个id把用户昵称放在这里--> <span
					class="sep">|</span></li>
				<li><span class="glyphicon glyphicon-shopping-cart"
					aria-hidden="true"></span> <a href="#">购物车</a> <span class="sep">|</span>
				</li>
				<li><span class="glyphicon glyphicon-tags" aria-hidden="true"></span>
					<a href="#">我的订单</a> <span class="sep">|</span></li>
				<li><span class="glyphicon glyphicon-heart" aria-hidden="true"></span>
					<a href="#">我的收藏</a> <span class="sep">|</span></li>
				<li><span class="glyphicon glyphicon-user" aria-hidden="true"></span>
					<a href="#">个人中心</a></li>
			</ul>
		</div>
	</div>
	<!--我是logo和搜索的div-->
	<div class="ce">
		<!--logo的div-->
		<h1>ALLELUJA</h1>

		<!--搜索框-->
		<div class="search">
			<div class="sea-text">
				<input type="text" placeholder="请输入商品名称" id="keyword" value="" />
			</div>
			<div class="sea-btn">
				<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
			</div>

		</div>
	</div>
	<!--商品分类div-->
	<div class="sortBox">
		<div class="sortCen">
			<div id="sort">
				<span class="glyphicon glyphicon-menu-hamburger" aria-hidden="true"></span>
				商品分类
			</div>
			<!--分类旁边的导航-->
			<div class="sortRig">
				<ul>
					<li><a href="#">首页</a></li>
					<li><a href="#">待定</a></li>
					<li><a href="#">待定</a></li>
					<li><a href="#">待定</a></li>
				</ul>
			</div>
		</div>
		<!--全部分类展开div-->
		<div id="comSortLe">
		</div>
		<div id="comSortRi-one">
		</div>
		
	<!--轮播图-->
	<div id="myCarousel" class="carousel slide">
		<!-- 轮播（Carousel）指标 -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
			<li data-target="#myCarousel" data-slide-to="3"></li>
		</ol>
		<!-- 轮播（Carousel）项目 -->
		<div class="carousel-inner">
			<div class="item active">
				<img src="${APP_PATH}/static/img/1.jpg" alt="1">
				<!--图片的大小 宽1100px;高440px;-->
			</div>
			<div class="item">
				<img src="${APP_PATH}/static/img/2.jpg" alt="2">
			</div>
			<div class="item">
				<img src="${APP_PATH}/static/img/3.jpg" alt="3">
			</div>
			<div class="item">
				<img src="${APP_PATH}/static/img/4.jpg" alt="4">
			</div>
		</div>
		<!-- 轮播（Carousel）导航 -->
		<a class="carousel-control lef" href="#myCarousel" data-slide="prev">
			<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
		</a> <a class="carousel-control rig" href="#myCarousel" data-slide="next">
			<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
		</a>
	</div>

	<!--开始写下面放着的东西啦-->
	<!--举个栗子 我第一个要写 人气单品-->
	<div class="contentOne">
		<!--这里写标题-->
		<div class="tit">人气单品</div>
		<!--放图片-->
		<div class="pic">
			<ul>
				<!--时不时插一张活动的图片-->
				<li><a href="#"><img src="${APP_PATH}/static/img/b3.jpg"
						class="hotImg" /></a></li>
				<li class="revLi"><a href="#"> <img
						src="${APP_PATH}/static/img/b1.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li class="revLi"><a href="#"> <img src="img/b2.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li class="revLi"><a href="#"> <img
						src="${APP_PATH}/static/img/b1.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li class="revLi"><a href="#"> <img
						src="${APP_PATH}/static/img/b2.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li class="revLi"><a href="#"> <img
						src="${APP_PATH}/static/img/b1.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li class="revLi"><a href="#"> <img
						src="${APP_PATH}/static/img/b2.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li><a href="#"><img src="img/b3.jpg" class="hotImg" /></a></li>
			</ul>
		</div>


	</div>

	<!--这个是第二个展示的地方了   这里地方展示品牌-->
	<div class="contentTwo">
		<!--这里写标题-->
		<div class="tit">优选品牌</div>
		<!--放图片-->
		<div class="pic">
			<!--品牌商的轮播-->
			<ul>
				<!--第一行-->
				<li><a href="#"><img src="${APP_PATH}/static/img/l1.jpg"
						class="pic-img1" /></a></li>
				<li><a href="#"><img src="${APP_PATH}/static/img/l2.jpg"
						class="pic-img1" /></a></li>
				<li><a href="#"><img src="${APP_PATH}/static/img/l3.jpg"
						class="pic-img1" /></a></li>
				<!--第二行-->
				<li><a href="#"><img src="${APP_PATH}/static/img/a1.jpg" /></a></li>
				<!--这里所有图都是W:378px;H:248px;-->
				<li><a href="#"><img src="${APP_PATH}/static/img/a2.jpg" /></a></li>
				<li><a href="#"><img src="${APP_PATH}/static/img/a1.jpg" /></a></li>
				<li><a href="#"><img src="${APP_PATH}/static/img/a2.jpg" /></a></li>
				<li><a href="#"><img src="${APP_PATH}/static/img/a1.jpg" /></a></li>
				<li><a href="#"><img src="${APP_PATH}/static/img/a2.jpg" /></a></li>
				<!--第三行-->
				<li><a href="#"><img src="${APP_PATH}/static/img/a2.jpg" /></a></li>
				<li><a href="#"><img src="${APP_PATH}/static/img/a1.jpg" /></a></li>
				<li><a href="#"><img src="${APP_PATH}/static/img/a2.jpg" /></a></li>
				<li><a href="#"><img src="${APP_PATH}/static/img/a1.jpg" /></a></li>
				<li><a href="#"><img src="${APP_PATH}/static/img/a2.jpg" /></a></li>
				<li class="more"><a href="#">MORE&nbsp;&gt;</a></li>
			</ul>
		</div>
	</div>

	<!--第三个  第三个  第三个啦-->
	<div class="content">
		<!--这里写标题-->
		<div class="tit">精品上衣</div>
		<!--放图片-->
		<div class="pic">
			<!--左侧无序-->
			<div id="Three-divLe">
				<ul class="coatLeft">
					<li><a href="#"><img src="${APP_PATH}/static/img/s1.jpg" /></a></li>
					<li><a href="#"><img src="${APP_PATH}/static/img/s2.jpg" /></a></li>

					<div class="coatLeft2-div">
						<ul class="coatLeft2">
							<li><a href="#">卫衣</a></li>
							<li><a href="#">T桖</a></li>
							<li><a href="#">衬衫</a></li>
							<li><a href="#">啤酒</a></li>
							<li><a href="#">瓜子</a></li>
							<li><a href="#">花生</a></li>
							<li><a href="#">饮料</a></li>
							<li><a href="#">这位</a></li>
							<li><a href="#">兄台</a></li>
							<li><a href="#">抬</a></li>
							<li><a href="#">一下jio</a></li>
							<li><a href="#">MORE&nbsp;&gt;</a></li>

						</ul>
					</div>
				</ul>
			</div>

			<ul class="coatRight">
				<li><a href="#"><img src="${APP_PATH}/static/img/c1.jpg"
						class="hotImg" /></a></li>
				<li class="revLi"><a href="#"> <img
						src="${APP_PATH}/static/img/b2.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li class="revLi"><a href="#"> <img
						src="${APP_PATH}/static/img/b1.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li><a href="#"><img src="${APP_PATH}/static/img/c2.jpg"
						class="hotImg" /></a></li>
				<li class="revLi"><a href="#"> <img src="img/b2.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li class="revLi"><a href="#"> <img
						src="${APP_PATH}/static/img/b1.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li class="revLi"><a href="#"> <img
						src="${APP_PATH}/static/img/b2.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li class="revLi"><a href="#"> <img
						src="${APP_PATH}/static/img/b1.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li class="revLi"><a href="#"> <img src="img/b2.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li class="revLi"><a href="#"> <img src="img/b1.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li class="revLi"><a href="#"> <img src="img/b2.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
			</ul>

		</div>
	</div>

	<!--复制第三个  然后她就变成了第四个-->
	<div class="content">
		<!--这里写标题-->
		<div class="tit">精品上衣</div>
		<!--放图片-->
		<div class="pic">
			<!--左侧无序-->
			<div id="Three-divLe">
				<ul class="coatLeft">
					<li><a href="#"><img src="${APP_PATH}/static/img/s1.jpg" /></a></li>
					<li><a href="#"><img src="${APP_PATH}/static/img/s2.jpg" /></a></li>

					<div class="coatLeft2-div">
						<ul class="coatLeft2">
							<li><a href="#">卫衣</a></li>
							<li><a href="#">T桖</a></li>
							<li><a href="#">衬衫</a></li>
							<li><a href="#">啤酒</a></li>
							<li><a href="#">瓜子</a></li>
							<li><a href="#">花生</a></li>
							<li><a href="#">饮料</a></li>
							<li><a href="#">这位</a></li>
							<li><a href="#">兄台</a></li>
							<li><a href="#">抬</a></li>
							<li><a href="#">一下jio</a></li>
							<li><a href="#">MORE&nbsp;&gt;</a></li>

						</ul>
					</div>
				</ul>
			</div>

			<ul class="coatRight">
				<li><a href="#"><img src="${APP_PATH}/static/img/c1.jpg"
						class="hotImg" /></a></li>
				<li class="revLi"><a href="#"> <img
						src="${APP_PATH}/static/img/b2.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li class="revLi"><a href="#"> <img
						src="${APP_PATH}/static/img/b1.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li><a href="#"><img src="${APP_PATH}/static/img/c2.jpg"
						class="hotImg" /></a></li>
				<li class="revLi"><a href="#"> <img
						src="${APP_PATH}/static/img/b2.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li class="revLi"><a href="#"> <img
						src="${APP_PATH}/static/img/b1.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li class="revLi"><a href="#"> <img
						src="${APP_PATH}/static/img/b2.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li class="revLi"><a href="#"> <img
						src="${APP_PATH}/static/img/b1.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li class="revLi"><a href="#"> <img
						src="${APP_PATH}/static/img/b2.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li class="revLi"><a href="#"> <img
						src="${APP_PATH}/static/img/b1.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
				<li class="revLi"><a href="#"> <img
						src="${APP_PATH}/static/img/b2.jpg" />
						<p title="性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌">性感美女在线打地铺或者发牌，你是猪你是猪，略略略略；性感美女在线打地铺或者发牌</p>
						<strong>¥&nbsp;99</strong>
						<button type="button" id="buy">立即购买</button>
				</a></li>
			</ul>

		</div>
	</div>


	<script type="text/javascript"
		src="${APP_PATH}/static/js/jquery.min.js"></script>
	<script type="text/javascript"
		src="${APP_PATH}/static/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${APP_PATH}/static/js/index.js"></script>
</body>
</html>