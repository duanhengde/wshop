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

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" href="<%=path%>/css/woncore.css" type="text/css"></link>
				<link href="<%=path %>/css/layout.css" type="text/css" rel="stylesheet" />
	</head>

	<body>
    		<jsp:include flush="true" page="/qiantai/inc/incTop.jsp"></jsp:include>
		<div class="page_row">
			<!--左边的 -->
			<div class="page_main_msg left">		
		        <div class="left_row">
		            <div class="list pic_news">
		  	                <div class="list_bar"> <span style="float:left">&nbsp;客服服务&nbsp;&nbsp;&nbsp;</span>
		  	               <span style="float:right"> 
		  	               <a style="vertical-align:bottom; " href='tencent://Message/?Uin=22964771&amp;amp;websiteName=q-zone.qq.com&amp;amp;Menu=yes'>
                 <img alt="点击交谈..." src="<%=path %>/img/qq11.JPG"  align="absMiddle" border="0" />在线咨询小雯</a>
		  	               <a style="vertical-align:bottom; " href='tencent://Message/?Uin=253782116&amp;amp;websiteName=q-zone.qq.com&amp;amp;Menu=yes'>
                 <img alt="点击交谈..." src="<%=path %>/img/qq11.JPG"  align="absMiddle" border="0" />在线咨询小哲</a>
		  	                
		  	                </span>
		  	                &nbsp;&nbsp;&nbsp;</div>
		<TABLE cellSpacing=1 cellPadding=4 width="100%" border=0>
			<s:iterator value="#request.liuyanList" id="liuyan">
			    <TR>
				<TD>
					<TABLE class=tpt width="100%" border=0>
						<TBODY>
							<TR bgColor=#cccccc>
								<TD align=middle width="10%">
									<STRONG>提问人：</STRONG>
								</TD>
								<TD width="47%">
									<FONT color=#000000>&nbsp;<s:property value="#liuyan.liuyanUser"/></FONT>
								</TD>
								<TD align=middle width="14%">
									<STRONG>提问时间：</STRONG>
								</TD>
								<TD width="29%">
									<FONT color=#000000>&nbsp;<s:property value="#liuyan.liuyanDate"/></FONT>
								</TD>
							</TR>
							<TR>
								<TD align=middle>
									<STRONG>标题：</STRONG>
								</TD>
								<TD colSpan=3>
									<FONT color=#000000>&nbsp;<s:property value="#liuyan.liuyanTitle"/></FONT>
								</TD>
							</TR>
							<TR>
								<TD vAlign=top align=middle>
									<STRONG>内容：</STRONG>
								</TD>
								<TD colSpan=3>
									<s:property value="#liuyan.liuyanContent" escape="false"/>
								</TD>
							</TR>
							<TR>
								<TD vAlign=top align=middle>
									<STRONG>回复：</STRONG>
								</TD>
								<TD colSpan=3  align="left"  valign="top"  class="pmbox" >
									<s:property value="#liuyan.liuyanReplay" escape="false"/>
								</TD>
							</TR>
						</TBODY>
					</TABLE>
				</TD>
			</TR>
			</s:iterator>
		</TABLE>
		<BR>
		<form action="<%=path %>/liuyanAdd.action" method="post">
		<table border="0">
		     <tr>
		         <td style="font-size: 11px;">标题</td>
		         <td><input type="text" name="liuyanTitle" size="50"/></td>
		     </tr>
		     <tr>
		         <td style="font-size: 11px;">内容</td>
		         <td>
		              <FCK:editor instanceName="liuyanContent"  basePath="/fckeditor" width="500" height="200" value="" toolbarSet="Basic">
                      </FCK:editor>
                 </td>
		     </tr>
		     <tr>
		         <td style="font-size: 11px;">&nbsp;</td>
		         <td>
		             <input type="submit" name="" value="提交提问">
                 </td>
		     </tr>
		</table>
		</form>
	 </div>
		         </div>	
	        </div>
			<!--左边的 -->
			<!-- 右边的用户登录。留言。投票 -->
			<div class="page_other_msg right">
				<div class="left_row">
					<div class="list">
						<div class="list_bar">
							用户登录
						</div>
						<div class="list_content">
							<div id="div">
								<jsp:include flush="true" page="/qiantai/userlogin/userlogin.jsp"></jsp:include>
							</div>
						</div>
					</div>
				</div>
                <div class="left_row">
				    <div class="list">
				        <div class="list_bar">商品分类</div>
				        <div class="list_content">
				            <div id="div"> 
				                   <div style="overflow:hidden;height:150px;">
							             <div id="roll-orig-1607838439">
										     <s:action name="catelogAll" executeResult="true" flush="true"></s:action>
							             </div>
						                 <div id="roll-copy-1607838439"></div>
				                   </div>
					        </div>
					    </div>
				    </div>
				</div>
				<div class="left_row">
				    <div class="list">
				        <div class="list_bar">网站公告</div>
				        <div class="list_content">
				            <div id="div"> 
				                   <div style="overflow:hidden;height:150px;">
							             <div id="roll-orig-1607838439">
										 <s:action name="gonggaoQian5" executeResult="true" flush="true"></s:action>
							             </div>
						                 <div id="roll-copy-1607838439"></div>
				                   </div>
					        </div>
					    </div>
				    </div>
				</div>
			</div>
			<div style="clear: both"></div>
			<!-- 右边的用户登录。留言。投票 -->
		</div>
		
		<div class="foot">
		   <jsp:include flush="true" page="/qiantai/inc/incFoot.jsp"></jsp:include>
	    </div>
	</body>
</html>
	</BODY>
</html>
