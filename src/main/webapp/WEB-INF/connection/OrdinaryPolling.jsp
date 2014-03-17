<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="author" content="xuebing & http://lxbfly.sinaapp.com/">

<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script type="text/javascript">
    $(function () {
        window.setInterval(function () {
            $.get("${pageContext.request.contextPath}/ajaxRequest", 
                {"timed": new Date().getTime()}, 
                function (data) {
                    $("#logs").append("[data: " + data + " ]<br/>");
            });
        }, 3000);
        
    });
</script>
</head>
<body>

</body>
</html>