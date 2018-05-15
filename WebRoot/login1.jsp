<%@ page language="java" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<head>
<title>login.jsp</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="<%=path%>/css/style.css">
<style type="text/css">
body {
	margin-left: 0px;
}

.style2 {
	color: #990000
}

.input2 {
	font-size: 12px;
	border: 3px double #A8D0EE;
	color: #344898;
}

.submit1 {
	border: 3px double #416C9C;
	height: 22px;
	width: 45px;
	background-color: #F2F2F2;
	font-size: 12px;
	padding-top: 1px;
	background-image: url(bt.gif);
	cursor: hand;
}

.STYLE12 {
	font-family: Georgia, "Times New Roman", Times, serif
}

.STYLE13 {
	color: #316BD6;
}

.STYLE15 {
	color: #fdsere;
	font-size: 9pt;
}
</style>


<script type='text/javascript'
	src='<%=path%>/dwr/interface/loginService.js'></script>
<script type='text/javascript' src='<%=path%>/dwr/engine.js'></script>
<script type='text/javascript' src='<%=path%>/dwr/util.js'></script>

<script language="javascript">
 function check1()
 {                                                                                         
	 if(document.ThisForm.userPw.value=="")
	 {
	 	alert("请输入密码");
		document.ThisForm.userPw.focus();
		return false;
	 }
	 document.getElementById("indicator").style.display="block";
	 loginService.login("admin",document.ThisForm.userPw.value,0,callback);
 }

 function callback(data)
 {
    document.getElementById("indicator").style.display="none";
    if(data=="no")
    {
        alert("用户名或密码错误");
    }
    if(data=="yes")
    {
        alert("通过验证,系统登录成功");
        window.location.href="<%=path%>/loginSuccess1.jsp";
		}
	}
</script>
</head>
<body>

	<br>
	<br>
	<br>
	<br>
	<table width="650px" height="423" border="0" align="center"
		cellpadding="0" cellspacing="0" background="<%=path%>/img/dfff.jpg">
		<tr>
			<td><div align="center"
					style="FONT-WEIGHT: bold; FONT-SIZE: 33pt;">&nbsp;&nbsp;&nbsp;&nbsp;</div></td>
		</tr>
		<tr>
			<td width="650px">
				<form name="ThisForm" method="POST" action="">
					<table width="360" height="198" border="0" align="right"
						cellpadding="0" cellspacing="0">
						<tr>
							<td height="10" colspan="2" valign="bottom"></td>
						</tr>
						<tr>
							<td height="22" valign="top" class="STYLE15" align="right"
								valign="bottom">密&nbsp;&nbsp;&nbsp;&nbsp;码：</td>
							<td width="260" valign="bottom"><input name="userPw"
								type="password" size="21" class="input2" align="bottom"
								onMouseOver="this.style.background='#F0DAF3';"
								onMouseOut="this.style.background='#FFFFFF'"></td>
						</tr>
						<tr>
							<td height="10" colspan="2" valign="bottom"></td>
						</tr>
						<tr>
							<td colspan="2" valign="top" align="center">&nbsp; &nbsp;
								&nbsp; &nbsp; <input name="button" type="button" class="submit1"
								value="登录" onClick="check1()"> &nbsp; <input
								name="Submit2" type="reset" class="submit1" value="重置">
								<img id="indicator" src="<%=path%>/img/loading.gif"
								style="display: none" />
							</td>
						</tr>
					</table>
				</form>
			</td>
		</tr>
	</table>
</body>