<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Abstract Command</title>
</head>
<body>
	<div>当我们在浏览器中输入“http://localhost/springmvc/abstractCommand?username=123&password=123”，会自动将请求参数username和password绑定到命令对象；绑定时按照JavaBean命名规范绑定；</div>
	<br>
	
	<div>output result</div>
	<hr />
	${user.username }-${user.password }
</body>
</html>