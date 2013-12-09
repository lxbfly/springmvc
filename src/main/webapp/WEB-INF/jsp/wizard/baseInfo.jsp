<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>步骤1：基本信息</title>
</head>
<body>

<form method="post">
真实姓名:<input type="text" name="realname" value="${user.realname}"><br/>
<input type="submit" name="_target1" value="下一步"/>
</form>
</body>
</html>