package com.lzq.action;

import java.io.File;
import java.util.List;

public class UploadsAction {
	
	private File[] upload;
//	private List<File> upload;
	
	private String[] uploadFileName;
//	private List<String> uploadFileName;
	
	private String[] uploadContentType;
//	private List<String> uploadContentType;
	
	public File[] getUpload() {
		return upload;
	}

	public void setUpload(File[] upload) {
		this.upload = upload;
	}

	public String[] getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String[] uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String[] getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String[] uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	
	public String execute(){
		return "";
	}
	
}
