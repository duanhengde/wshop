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

<link rel="stylesheet" type="text/css" href="<%=path%>/css/base.css" />
<script language="JavaScript" src="<%=path%>/js/public.js"
	type="text/javascript"></script>
<script type="text/javascript" src="<%=path%>/js/popup.js"></script>
<script language="javascript">
           
         function keywordDel(keywordId)
        {
            if(confirm('您确定删除吗？'))
            {
                window.location.href="<%=path%>/keywordDel.action?keywordId="+keywordId;
            }
        }
        
        function keywordEditPre(keywordId)
        {
                window.location.href="<%=path%>/keywordEditPre.action?keywordId="+keywordId;
        }
        
        function keywordAdd()
        {
              var url="<%=path%>/admin/keyword/keywordAdd.jsp";
			  window.location.href=url;
        }	
       </script>
</head>

<body leftmargin="2" topmargin="2" background='<%=path%>/img/allbg.gif'>
	<table width="98%" border="0" cellpadding="2" cellspacing="1"
		bgcolor="#FF8033" align="center" style="margin-top: 8px">
		<tr bgcolor="#E7E7E7">
			<td height="14" colspan="9" background="<%=path%>/img/tbg.gif">&nbsp;商品管理&nbsp;</td>
		</tr>
		<tr align="center" bgcolor="#FAFAF1" height="22">
			<td width="40%">品牌名称</td>
			<td width="60%">操作</td>
		</tr>
		<s:iterator value="#request.keywordList" id="keyword">
			<tr align='center' bgcolor="#FFFFFF"
				onMouseMove="javascript:this.bgColor='red';"
				onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
				<td bgcolor="#FFFFFF" align="center"><s:property
						value="#keyword.keywordName" /></td>

				<td bgcolor="#FFFFFF" align="center"><a
					href="<%=path%>/keywordEditPre.action?keywordId=<s:property value="#keyword.keywordId"/>">修改</a>&nbsp;&nbsp;
					<a href="#"
					onclick="keywordDel(<s:property value="#keyword.keywordId"/>)"
					class="pn-loperator">删除</a></td>
			</tr>
		</s:iterator>
	</table>
	<table width="80%" border="0" style="text-align: center;">
		<tr>
			<td><s:url id="url_first" value="keywordEdit.action">
					<s:param name="pageNow" value="1"></s:param>
				</s:url> <!-- 首页 --> <s:url id="url_pre" value="keywordEdit.action">
					<s:param name="pageNow" value="pageNow-1"></s:param>
				</s:url> <!-- 上一页 --> <s:url id="url_next" value="keywordEdit.action">
					<s:param name="pageNow" value="pageNow+1"></s:param>
				</s:url> <!-- 下一页 --> <s:url id="url_last" value="keywordEdit.action">
					<s:param name="pageNow" value="pageTotle"></s:param>
				</s:url> <!-- 末页 --> <!-- 如果不是首页则提供首页的链接,如果是首页则不提供链接,以下类似 --> <s:if
					test="pageNow != 1">  [<s:a href="%{url_first}">首页</s:a>] </s:if> <s:else> [首页] </s:else>&nbsp;&nbsp;
				<s:if test="pageNow>1">  [<s:a href="%{url_pre}">上一页</s:a>]  </s:if>
				<s:else> [上一页]  </s:else> &nbsp;&nbsp; <s:if
					test=" pageTotle > pageNow "> [<s:a href="%{url_next}">下一页</s:a>] </s:if>
				<s:else> [下一页] </s:else> &nbsp;&nbsp; <s:if
					test="pageTotle != pageNow"> [<s:a href="%{url_last}">末页</s:a>] </s:if>
				<s:else>  [末页] </s:else></td>
		</tr>
	</table>

	</table>
	<table width='98%' border='0'
		style="margin-top: 8px; margin-left: 5px;">
		<tr>
			<td><input type="button" value="添加" style="width: 80px;"
				onclick="keywordAdd()" /></td>
		</tr>
	</table>
</body>
</html>
