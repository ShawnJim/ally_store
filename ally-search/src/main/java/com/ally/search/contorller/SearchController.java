package com.ally.search.contorller;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ally.search.po.Msg;
import com.ally.search.po.SearchResult;
import com.ally.search.service.SearchService;



@Controller
public class SearchController {

	@Autowired
	SearchService searchService;

	@RequestMapping("/query")
	@ResponseBody
	public Msg search(@RequestParam("q")String queryString,
			@RequestParam(value="page",defaultValue="1")Integer page,
			@RequestParam(value="rows",defaultValue="60")Integer rows,
			@RequestParam(value="cate",defaultValue="0")String cate,
			@RequestParam(value="sort",defaultValue="0")String sort,HttpServletResponse response) {
		//允许跨域
		allowCrossDomain(response);
		//查询条件不能为空
		if(StringUtils.isBlank(queryString))
			return Msg.flia().add("message", "查询条件不能为空");
		try {
			queryString = new String(queryString.getBytes("iso-8859-1"),"utf-8");
			System.out.println(queryString);
			SearchResult searchResult = searchService.search(queryString,page,rows,cate,sort);
			return Msg.success().add("searchResult",searchResult);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Msg.flia().add("message","获取数据失败");
		}
	}
	
	
	public void allowCrossDomain(HttpServletResponse response) {
		//设置回传编码,并且允许跨域
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.setCharacterEncoding("utf-8");
	}

}
