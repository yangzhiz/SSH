<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>多文件上传</h3>
	<hr>
	<form action="file/uploads" enctype="multipart/form-data" method="post">
		<input type="file" name="upload"><br>
		<input type="file"name="upload"> <br>
		<input type="file" name="upload"> <br>
		<input type="file" name="upload"><br>
		<input type="submit" name="btnUpload" value="批量上传">
	</form>
</body>
</html>