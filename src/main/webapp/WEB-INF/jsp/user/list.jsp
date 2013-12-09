<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/user/create">用户新增</a><br/>
<table border="1" width="50%">
   <tr>
      <th>用户名</th>
      <th>真实姓名</th>
      <th>操作</th>
   </tr> 
   <c:forEach items="${userList}" var="user">
   <tr>
      <td>${user.username }</td>
      <td>${user.realname }</td>
      <td>
          <a href="${pageContext.request.contextPath}/user/update?username=${user.username}">更新</a>
          |
          <a href="${pageContext.request.contextPath}/user/delete?username=${user.username}">删除</a>
      </td>
   </tr>
   </c:forEach>   
</table>
</body>
</html>