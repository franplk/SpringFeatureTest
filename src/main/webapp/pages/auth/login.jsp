<%@ page contentType="text/html;charset=UTF-8"%>

<% String path = request.getContextPath(); %>

<html>
<head>
<title>首页</title>
<base href="<%=path%>/"/>
</head>

<body>
<form action="auth/login" method="post">
	<table>
		<tr>
			<td>用户名：</td>
			<td><input type="text" name="username" /></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="password" name="password" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value=" 登录 " />
				<input type="reset" value=" 重置 " />
			</td>
		</tr>
	</table>
</form>
</body>
</html>