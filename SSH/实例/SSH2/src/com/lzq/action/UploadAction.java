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

		// ��ȡ������·��
		String passpath = ServletActionContext.getServletContext().getRealPath(
				"upload");

		File uploadFile = new File(passpath);

		/*
		 * ���������Ŀ¼�����ڣ����ڷ���������
		 */
		if (!uploadFile.exists()) {
			uploadFile.mkdir();
		}

		/*
		 * ��һ�ַ�ʽʵ���ϴ� �������������ʵ�ַ���
		 */
		// �����ļ�������
		FileInputStream input = new FileInputStream(upload);
		// �ļ������
		FileOutputStream out = new FileOutputStream(uploadFile + "\\"+ uploadFileName);
		try { 
			byte[] b = new byte[1024]; // 1kb
			// ����һ��λ��
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
		 * �ڶ��ַ�ʽʵ���ϴ� ���߰���һ�仰�ķ�װ��ʵ�ֶ�д
		 */
		// ����������ʵ��
		// FileUtils.copyFile(upload, new File(uploadFile+"//"+uploadFileName));
		// FileUtils.copyFile(upload, new File(uploadFile, uploadFileName));

		/*
		 * �����ַ�ʽ
		 */
		// BufferedReader bReader = new BufferedReader(new InputStreamReader(
		// new FileInputStream(upload)));
		// BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(
		// new FileOutputStream(uploadFile + "\\" + uploadFileName)));
		// try {
		// // byte[] b=new byte[1024]; //1kb
		// char[] c = new char[1024];
		// // ����һ��λ��
		// int i = 0;
		// while ((i = bReader.read(c)) > 0) {
		// bWriter.write(c, 0, i);
		// }
		// } catch (Exception e) {
		// e.printStackTrace();
		// } finally {
		// bReader.close();
		// bWriter.close();
		// //ɾ����ʱ�ļ�
		// upload.delete();
		// }
		return "success";
	}

}
