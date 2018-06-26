/*轮播图自动播放*/
$("#myCarousel").carousel({  
	interval :4000,  
});

//导航栏鼠标悬浮显示隐藏
$(function () {
	$("#comSortLe").hide();
	$("#sort").hover(function () {
		$("#comSortLe").show();
	}, function () {
		$("#comSortLe").hide();
	})
	$("#comSortLe").hover(function () {
		$("#comSortLe").show();
	}, function () {
		$("c").hide();
	})
	$("#comSortRi-one").hide();
	$("#comSortLe").hover(function () {
		$("#comSortRi-one").show();
	}, function () {
		$("#comSortRi-one").hide();
	})
	$("#comSortRi-one").hover(function () {
		$("#comSortRi-one").show();
	}, function () {
		$("c").hide();
	})
	//ajax请求分类列表数据
	$.ajax({
		async : true,
        url : "http://localhost:8081/rest/itemcat/list",
        type : "GET",
        dataType : "jsonp", // 返回的数据类型，设置为JSONP方式
        jsonp : 'callback', //指定一个查询参数名称来覆盖默认的 jsonp 回调参数名 callback
        jsonpCallback: 'handleResponse', //设置回调函数名
        data : {
            q : "javascript", 
            count : 1
        }, 
        success: function(response, status, xhr){
           /* console.log('状态为：' + status + ',状态是：' + xhr.statusText);
            console.log(response);*/
        }
	});
});
function handleResponse(result){
    var cate_ul = $("<ul></ul>");
    var comsortRi_ul = $("<ul></ul>");
	$.each(result, function() {
		$.each(this,function(){
			cate_ul.append($("<li></li>")
					.append(this.n));
			$.each(this.i,function(){
				console.log(this.n);
				comsortRi_ul.append($("<li></li>")
						.append(this.n));
			});
			comsortRi_ul.append("|");
		});
    });
	cate_ul.appendTo($("#comSortLe"));
	comsortRi_ul.appendTo($("#comSortRi-one"));
}