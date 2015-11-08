<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理页面</title>
	<script type="text/javascript">
	
		function addUser(){
			var myForm = document.forms[0];
			//myForm.action = "user/addUser_error";
			myForm.action = "user/addUser_success";
			myForm.submit();
		}
		function delUser(){
			var myForm=document.forms[0];
			myForm.action="user/delUser";
			myForm.submit();
		}
		function modifyUser(){
			var myForm=document.forms[0];
			myForm.action="user/modifyUser";
			myForm.submit();
		}
	</script>
</head>
<body>
	<hr>
	<h2>登录页面——对应LoginAction2.</h2>
	<h3>pojo 将属性放在user里面</h3>
	<form>
		<center>
			用户名：<input type="text" name="user.userName" value="A001"><br> <br>
		</center>
		<center>
			密 码：<input type="password" name="user.password" value="589462"><br> <br>
		</center>
		<center>
			用户Id：<input type="text" name="user.userId" value="a1"><br> <br>
		</center>
		
		<center>
			年龄：<input type="text" name="user.age" value="12314"><br> <br>
		</center>
		<center>
			<input type="button" value="添加" onclick="addUser()">
			<input type="button" value="删除" onclick="delUser()">
			<input type="button" value="修改" onclick="modifyUser()">
		</center>
	</form>
	
	<hr>
	<h2>登录页面——对应LoginAction5.</h2>
	<h3>不继承ActionSupport接口,获取session、request、response的方法</h3>
	<form action="user5/login">
		<center>
			用户名：<input type="text" name="user.userName"><br> <br>
		</center>
		<center>
			密 码：<input type="password" name="user.password"><br> <br>
		</center>
		<center>
			<input type="submit" value="提交">
		</center>
	</form>
</body>
</html>