<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #016aa9;
	overflow: hidden;
}

.STYLE1 {
	color: #000000;
	font-size: 14px;
}
-->
</style>
</head>

<body>
	<table width="100%" height="100%" border="0" cellpadding="0"
		cellspacing="0">
		<tr>
			<s:form method="post" action="login" namespace="/" >
				<td><table width="962" border="0" align="center"
						cellpadding="0" cellspacing="0">
						<tr>
							<td height="235" width="962" background="images/login_03.gif">&nbsp;</td>
						</tr>
						<tr>
							<td height="51"><table width="100%" border="0"
									cellspacing="0" cellpadding="0">
									<tr>
										<td width="394" height="53" background="images/login_05.gif">&nbsp;</td>
										<td width="206" background="images/login_06.gif"><table
												width="100%" border="0" cellspacing="0" cellpadding="0">
												<tr>
													<td width="20%" height="26"><div align="center">
															<span class="STYLE1">用户</span>
														</div></td>
													<td width="80%" height="26"><div align="left">
															<input type="text" name="username"
																style="width: 105px; height: 20px; background-color: #292929; border: solid 1px; font-size: 14px; color: #6cd0ff">
														</div></td>
												</tr>
												<tr>
													<td height="27"><div align="center">
															<span class="STYLE1">密码</span>
														</div></td>
													<td height="27"><div align="left">
															<input type="password" name="password"
																style="width: 105px; height: 20px; background-color: #292929; border: solid 1px; font-size: 14px; color: #6cd0ff">
														</div></td>
												</tr>
											</table></td>
										<td width="362" background="images/login_07.gif">&nbsp;</td>
									</tr>
								</table></td>
						</tr>
						<tr>
							<td height="213" align="center" valign="top"
								background="images/login_08.gif"><table width="200"
									border="0">
									<tr>
										<td><div align="center">
												<input type="submit" name="submit" value="登录">
											</div></td>
										<td><div align="left">
												<input type="reset" name="reset" value="重置">
											</div></td>
									</tr>
								</table></td>
						</tr>
					</table></td>
			</s:form>
		</tr>
	</table>
</body>
</html>