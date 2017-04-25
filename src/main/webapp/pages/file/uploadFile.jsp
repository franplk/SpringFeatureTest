<%@ page contentType="text/html;charset=UTF-8"%>

<% String path = request.getContextPath(); %>

<html>
<head>
<title>首页</title>
<base href="<%=path%>/"/>
</head>

<body>
<form action="file/upload" method="post" enctype="multipart/form-data">
	<table>
		<tr>
			<td>文件1：</td>
			<td><input type="file" name="files" /></td>
		</tr>
		<tr>
			<td>文件2：</td>
			<td><input type="file" name="files" /></td>
		</tr>
		<tr>
			<td>文件3：</td>
			<td><input type="file" name="files" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="上传" />
				<input type="reset" value="重置 " />
			</td>
		</tr>
	</table>
</form>
</body>
</html>