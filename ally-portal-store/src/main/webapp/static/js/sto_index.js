//页面加载之后
$(function () {
	//发送ajax请求分类列表数据
	get_cate_list();
	//发送ajax请求 电子产品及电器 层的商品数据
	get_scate_pros();
});

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
				$("#a_fcate_li0"+count).text(result.date[count].n);
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
    		 console.log(this);
    		 var pics = this.picture.split('--');
    		 if(count<5){
    		$("#show_ul_li"+id).append($("<li></li>")
    				.append($("<a></a>").attr("href","/pro_detail.html?id="+this.id)
    						.append($("<img src='' style=' margin:0 auto; display:block; width:220px; height:220px'>").attr("src",pics[0])))
    				.append($("<light1></light1>")
    						.append($("<img src='/static/images/saoguang.png'>")))  
    				.append($("<span></span").text("￥"+this.price)) 
    				.append($("<a href=''></a>")
    						.attr("href","/pro_detail.html?id="+this.id)
    						.append($("<p></p>").text(this.name+"  "+this.sellPoint)))
    				.append($("<em></em>")
    						.append($("<a href='#'>收藏</a>"))
    						.append($("<a href='javascript:void(0)' class='add_scar'>加入购物车</a>"))) );
    		 }
    		 count = count +1;
    	});
    }
}
