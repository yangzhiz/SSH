package com.lzq.action;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {

	private File upload;

	private String uploadFileName;

	private String uploadContentType;

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContextType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	@Override
	public String execute() throws Exception {

		// 获取服务器路径
		String passpath = ServletActionContext.getServletContext().getRealPath(
				"upload");

		File uploadFile = new File(passpath);

		/*
		 * 如果服务器目录不存在，则在服务器创建
		 */
		if (!uploadFile.exists()) {
			uploadFile.mkdir();
		}

		/*
		 * 第一种方式实现上传 下面是最基本的实现方法
		 */
		// 创建文件输入流
		FileInputStream input = new FileInputStream(upload);
		// 文件输出流
		FileOutputStream out = new FileOutputStream(uploadFile + "\\"+ uploadFileName);
		try { 
			byte[] b = new byte[1024]; // 1kb
			// 定义一个位置
			int i = 0;
			while ((i = input.read(b)) > 0) {
				out.write(b, 0, i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			input.close();
			out.close();
		}

		/*
		 * 第二种方式实现上传 工具包的一句话的封装：实现读写
		 */
		// 下面是两种实现
		// FileUtils.copyFile(upload, new File(uploadFile+"//"+uploadFileName));
		// FileUtils.copyFile(upload, new File(uploadFile, uploadFileName));

		/*
		 * 第三种方式
		 */
		// BufferedReader bReader = new BufferedReader(new InputStreamReader(
		// new FileInputStream(upload)));
		// BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(
		// new FileOutputStream(uploadFile + "\\" + uploadFileName)));
		// try {
		// // byte[] b=new byte[1024]; //1kb
		// char[] c = new char[1024];
		// // 定义一个位置
		// int i = 0;
		// while ((i = bReader.read(c)) > 0) {
		// bWriter.write(c, 0, i);
		// }
		// } catch (Exception e) {
		// e.printStackTrace();
		// } finally {
		// bReader.close();
		// bWriter.close();
		// //删除临时文件
		// upload.delete();
		// }
		return "success";
	}

}
