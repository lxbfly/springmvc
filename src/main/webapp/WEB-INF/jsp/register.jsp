<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
</head>
<body>

<form method="post">
	Username:<input type="text" name="username" value="${user.username}">
	<br/>
	Password:<input type="password" name="password">
	<br/>
	City:<select>
	  <c:forEach items="${cityList }" var="city">
	   <option>${city}</option>
	  </c:forEach>
	</select>
	<br/>
	<input type="submit" value="注册"/>
	<input type="submit" name="_cancel" value="取消"/>
</form>
</body>
</html>