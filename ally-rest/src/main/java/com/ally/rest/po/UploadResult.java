package com.ally.rest.po;

public class UploadResult {
	/**
     * 错误代码
     */
    private String code;
    /**
     * 上传文件路径
     */
    private String path;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
}
