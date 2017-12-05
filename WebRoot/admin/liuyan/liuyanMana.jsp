<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK"%>
<%@ page isELIgnored="false" %> 
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" href="<%=path%>/css/woncore.css" type="text/css"></link>
				<style type="text/css">
		.tdp0 p{ margin:0px;}
		</style>
		
	</head>

	<body>
    <div class="body-box">
		<TABLE cellSpacing=1 cellPadding=4 width="100%" border=0>
			<s:iterator value="#request.liuyanList" id="liuyan">
			    <TR>
				<TD>
					<TABLE class=tpt width="100%" border=0>
						<TBODY>
							<TR bgcolor=#cccccc>
								<TD align=middle width="10%">
									<STRONG>提问人：</STRONG>
								</TD>
								<TD width="47%"  align="left">
									<FONT color=#000000>&nbsp;<s:property value="#liuyan.liuyanUser"/></FONT>
								</TD>
								<TD align=middle width="14%">
									<STRONG>提问时间：</STRONG>
								</TD>
								<TD width="29%">
									<FONT color=#000000>&nbsp;<s:property value="#liuyan.liuyanDate"/></FONT>
									<a style="color: red" href="<%=path %>/liuyanEditPre.action?liuyanId=<s:property value="#liuyan.liuyanId"/>">回复</a>
									&nbsp;&nbsp;
									<a style="color: red" href="<%=path %>/liuyanDel.action?liuyanId=<s:property value="#liuyan.liuyanId"/>">删除</a>
								</TD>
							</TR>
							<TR>
								<TD align=middle>
									<STRONG>标题：</STRONG>
								</TD>
								<TD colSpan=3  align="left">
									<FONT color=#000000>&nbsp;<s:property value="#liuyan.liuyanTitle"/></FONT>
								</TD>
							</TR>
							<TR>
								<TD vAlign=top align=middle>
									<STRONG>内容：</STRONG>
								</TD>
								<TD colSpan=3  align="left"  class="tdp0">
									<s:property value="#liuyan.liuyanContent" escape="false"/>
								</TD>
							</TR>
							<TR>
								<TD vAlign=top align=middle>
									<STRONG>回复：</STRONG>
								</TD>
								<TD colSpan=3  align="left"  valign="top"  class="tdp0" >
									<s:property value="#liuyan.liuyanReplay" escape="false"/>
								</TD>
							</TR>
						</TBODY>
					</TABLE>
				</TD>
			</TR>
			</s:iterator>
		</TABLE>
		<table width="80%" border="0"  align="center" style="text-align: center;">
<tr><td> 
<s:url id="url_first" value="liuyanMana.action"> <s:param name="pageNow" value="1"></s:param> </s:url> <!-- 首页 -->
<s:url id="url_pre" value="liuyanMana.action"> <s:param name="pageNow" value="pageNow-1"></s:param> </s:url> <!-- 上一页 --> 
<s:url id="url_next" value="liuyanMana.action"> <s:param name="pageNow" value="pageNow+1"></s:param> </s:url> <!-- 下一页 -->
<s:url id="url_last" value="liuyanMana.action"> <s:param name="pageNow" value="pageTotle"></s:param> </s:url> <!-- 末页 --> 
 <!-- 如果不是首页则提供首页的链接,如果是首页则不提供链接,以下类似 --> 
<s:if test="pageNow != 1">  [<s:a href="%{url_first}">首页</s:a>] </s:if> <s:else> [首页] </s:else>&nbsp;&nbsp;
<s:if test="pageNow>1">  [<s:a href="%{url_pre}">上一页</s:a>]  </s:if> <s:else> [上一页]  </s:else> &nbsp;&nbsp;
<s:if test=" pageTotle > pageNow "> [<s:a href="%{url_next}">下一页</s:a>] </s:if> <s:else> [下一页] </s:else> &nbsp;&nbsp;
<s:if test="pageTotle != pageNow"> [<s:a href="%{url_last}">末页</s:a>] </s:if> <s:else>  [末页] </s:else> 
</td> </tr>  
</table>
	</div>
	</BODY>
</html>
