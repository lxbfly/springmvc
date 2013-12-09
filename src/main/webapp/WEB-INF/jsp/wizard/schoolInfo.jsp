<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>步骤2：学校信息</title>
</head>
<body>

<form method="post">
学校类型：<select name="schoolInfo.schoolType">
  <c:forEach items="${schoolTypeList }" var="schoolType">
   <option value="${schoolType }" 
       <c:if test="${user.schoolInfo.schoolType eq schoolType}">
           selected="selected"
       </c:if>
   >
       ${schoolType}
   </option>
  </c:forEach>
</select><br/>
学校名称：<input type="text" name="schoolInfo.schoolName" value="${user.schoolInfo.schoolName}"/><br/>
专业：<input type="text" name="schoolInfo.specialty" value="${user.schoolInfo.specialty}"/><br/>
<input type="submit" name="_target0" value="上一步"/>
<input type="submit" name="_target2" value="下一步"/>
</form>
</body>
</html>