    $.jqPaginator('#pagination', {
    	totalPages: 100,//设置分页的总页数
        visiblePages: 10,//设置最多显示的页码数（例如有100也，当前第1页，则显示1 - 5页）
        currentPage: 1,//设置当前的页码
        first: '<li class="first"><a href="javascript:;">首页</a></li>',
        prev: '<li class="prev"><a href="javascript:;"><i class="arrow arrow2"></i>上一页</a></li>',
        next: '<li class="next"><a href="javascript:;">下一页<i class="arrow arrow3"></i></a></li>',
        last: '<li class="last"><a href="javascript:;">末页</a></li>',
        page: '<li class="page"><a href="javascript:;">{{page}}</a></li>',
        onPageChange: function (num, type) {
            if (type == "change") {
            	$("#page_info").empty();//清空信息栏
            	$("#table_PageInfo").empty();//清空表格
        			$.ajax({
        				  type: "GET",
        				  url: "/back/adminPage.do?page="+num+"&rows=10",
        				  success: function(data){
        						showPageInfo(data);
        						showPageTable(data);
        						alert(data.total);
        				  }
        				});
            	
            }else{
            	$("#page_info").empty();//清空信息栏
            	$("#table_PageInfo").empty();//清空表格
        			$.ajax({
        				  type: "GET",
        				  url: "/back/adminPage.do?page="+num+"&rows=10",
        				  success: function(data){
        						showPageInfo(data);
        						showPageTable(data);
        						alert(data.total);
        				  }
        				});
            }
        }
    });
    
  //显示分页表格信息
    function showPageTable(data){
    	var state = "";
    	$.each(data.rows,function(i,item){
    		if(item.state == "1"){
    			state = "激活";
    		}else{
    			state = "冻结";
    		}
    		$("#table_PageInfo").append("<tr><td>"+item.id+"</td><td>"+item.username+"</td><td>"+item.password+"</td><td>"+item.name+"</td><td>"+item.email+"</td><td>"+item.loginTime+"</td><td>"+state+"</td><td><a href='edit.html'>编辑</a></td></tr>");
    	});	
    }


    //显示分页信息栏
    function showPageInfo(data){
    	$("#page_info").append("<strong>&nbsp;&nbsp;&nbsp;&nbsp;共"+data.total+"条记录 &nbsp;"+data.pageNum+"/"+data.pages+"页 </strong>");
    }