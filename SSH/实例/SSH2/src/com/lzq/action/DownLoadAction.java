package com.lzq.action;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownLoadAction extends ActionSupport {
	
	private InputStream fileInput;
	
	private String fileName;

	public InputStream getFileInput() {
		return ServletActionContext.getServletContext().getResourceAsStream("upload\\"+fileName);
	}

	public void setFileInput(InputStream fileInput) {
		this.fileInput = fileInput;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	
	
	@Override
	public String execute() throws Exception {
		return "success";
	}
	
}
