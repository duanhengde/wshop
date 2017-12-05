<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />

		<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
		
        <script language="javascript">
           function userDel(userId)
           {
               if(confirm('您确定删除吗？'))
               {
                   window.location.href="<%=path %>/userDel.action?userId="+userId;
               }
           }
       </script>
	</head>

	<body leftmargin="2" topmargin="2" background='<%=path %>/img/allbg.gif'>
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#FF8033" align="center" style="margin-top:8px">
				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="10" background="<%=path %>/img/tbg.gif">&nbsp;会员管理&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
					<td width="10%">ID</td>
					<td width="10%">用户名</td>
					<td width="10%">密码</td>
					<td width="10%">真实姓名</td>
					<td width="10%">住址</td>
					<td width="10%">性别</td>
					<td width="10%">联系方式</td>
					<td width="10%">E-mail</td>
					<td width="10%">QQ</td>
					<td width="10%">操作</td>
		        </tr>	
				<s:iterator value="#request.userList" id="user">
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#user.userId"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#user.userName"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
					    <s:property value="#user.userPw"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#user.userRealname"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#user.userAddress"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
					    <s:property value="#user.userSex"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#user.userTel"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#user.userEmail"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
					    <s:property value="#user.userQq"/>
					</td>
					<td  bgcolor="#FFFFFF" align="center">
                        <a href="<%=path %>/userEditPre.action?userId=<s:property value="#user.userId"/>">修改</a>&nbsp;&nbsp;
						<a href="#" onclick="userDel(<s:property value="#user.userId"/>)" class="pn-loperator">删除</a>
					</td>
				</tr>
				</s:iterator>
			</table>
<table width="80%" border="0" style="text-align: center;">
<tr><td> 
<s:url id="url_first" value="userMana.action"> <s:param name="pageNow" value="1"></s:param> </s:url> <!-- 首页 -->
<s:url id="url_pre" value="userMana.action"> <s:param name="pageNow" value="pageNow-1"></s:param> </s:url> <!-- 上一页 --> 
<s:url id="url_next" value="userMana.action"> <s:param name="pageNow" value="pageNow+1"></s:param> </s:url> <!-- 下一页 -->
<s:url id="url_last" value="userMana.action"> <s:param name="pageNow" value="pageTotle"></s:param> </s:url> <!-- 末页 --> 
 <!-- 如果不是首页则提供首页的链接,如果是首页则不提供链接,以下类似 --> 
<s:if test="pageNow != 1">  [<s:a href="%{url_first}">首页</s:a>] </s:if> <s:else> [首页] </s:else>&nbsp;&nbsp;
<s:if test="pageNow>1">  [<s:a href="%{url_pre}">上一页</s:a>]  </s:if> <s:else> [上一页]  </s:else> &nbsp;&nbsp;
<s:if test=" pageTotle > pageNow "> [<s:a href="%{url_next}">下一页</s:a>] </s:if> <s:else> [下一页] </s:else> &nbsp;&nbsp;
<s:if test="pageTotle != pageNow"> [<s:a href="%{url_last}">末页</s:a>] </s:if> <s:else>  [末页] </s:else> 
</td> </tr>  
</table>
	</body>
</html>
