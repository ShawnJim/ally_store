package com.ally.rest.service;

import java.util.List;

import org.apache.http.HttpResponse;
import org.springframework.web.multipart.MultipartFile;

import com.ally.rest.po.UploadResult;

public interface UploadService {

	UploadResult uploadPic(List<MultipartFile> uploadfile) throws Exception;
}
