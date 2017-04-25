<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<% String path = request.getContextPath(); %>

<html>
<head>
<title>首页</title>
<base href="<%=path%>/"/>
</head>

<body>
<table>
	<tr>
		<td>序号</td>
		<td>文件名称</td>
		<td>文件大小</td>
		<td>上传时间</td>
	</tr>
	<c:forEach var="fileInfo" items="${ fileInfoList }">
	<tr>
		<td>文件1：</td>
		<td>${ fileInfo.name }</td>
		<td>${ fileInfo.size }</td>
		<td>${ fileInfo.time }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>