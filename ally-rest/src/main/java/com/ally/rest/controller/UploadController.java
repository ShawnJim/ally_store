package com.ally.rest.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ally.rest.po.UploadResult;
import com.ally.rest.service.UploadService;

@Controller
public class UploadController {

	@Autowired
	UploadService uploadService;
	
	@RequestMapping("/pic/fileUpload")
	@ResponseBody
	public UploadResult uploadPic(@RequestParam("uploadfile") List<MultipartFile> uploadfile,HttpServletResponse response) throws Exception {
		response.addHeader("Access-Control-Allow-Origin", "*");
		UploadResult result = uploadService.uploadPic(uploadfile);
		return result;
	}
}
