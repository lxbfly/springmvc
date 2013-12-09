<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户新增</title>
</head>
<body>
<form:form commandName="command">
<form:errors path="*" cssStyle="color:red"></form:errors><br/>
用户名： <input type="text" name="username" value="${command.username}"/><br/>
真实姓名：<input type="text" name="realname" value="${command.realname}"/><br/>
<input type="submit" value="新增"/>

</form:form>
</body>
</html>