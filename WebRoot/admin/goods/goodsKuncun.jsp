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
		<script language="JavaScript" src="<%=path %>/js/public.js" type="text/javascript"></script>
		<script type="text/javascript" src="<%=path %>/js/popup.js"></script>
        <script language="javascript">
           
           function goodsRuku(goodsId)
           {
                var pop=new Popup({ contentType:1,isReloadOnClose:false,width:400,height:200});
	            pop.setContent("contentUrl","<%=path %>/admin/goods/goodsRuku.jsp?goodsId="+goodsId);
	            pop.setContent("title","入库");
	            pop.build();
	            pop.show();
           }
           
       </script>
	</head>

	<body leftmargin="2" topmargin="2" background='<%=path %>/img/allbg.gif'>
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#FF8033" align="center" style="margin-top:8px">
				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="3" background="<%=path %>/img/tbg.gif">&nbsp;商品管理&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
					<td width="50%">商品名称</td>
					<td width="20%">库存</td>
					<td width="30%">操作</td>
		        </tr>	
				<s:iterator value="#request.goodsList" id="goods">
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#goods.goodsName"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
					     <s:property value="#goods.goodsKucun"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<a href="#" onclick="goodsRuku(<s:property value="#goods.goodsId"/>)" class="pn-loperator">添加入库</a>
					</td>
				</tr>
				</s:iterator>
			</table>
<table width="80%" border="0" style="text-align: center;">
<tr><td> 
<s:url id="url_first" value="goodsKuncun.action"> <s:param name="pageNow" value="1"></s:param> </s:url> <!-- 首页 -->
<s:url id="url_pre" value="goodsKuncun.action"> <s:param name="pageNow" value="pageNow-1"></s:param> </s:url> <!-- 上一页 --> 
<s:url id="url_next" value="goodsKuncun.action"> <s:param name="pageNow" value="pageNow+1"></s:param> </s:url> <!-- 下一页 -->
<s:url id="url_last" value="goodsKuncun.action"> <s:param name="pageNow" value="pageTotle"></s:param> </s:url> <!-- 末页 --> 
 <!-- 如果不是首页则提供首页的链接,如果是首页则不提供链接,以下类似 --> 
<s:if test="pageNow != 1">  [<s:a href="%{url_first}">首页</s:a>] </s:if> <s:else> [首页] </s:else>&nbsp;&nbsp;
<s:if test="pageNow>1">  [<s:a href="%{url_pre}">上一页</s:a>]  </s:if> <s:else> [上一页]  </s:else> &nbsp;&nbsp;
<s:if test=" pageTotle > pageNow "> [<s:a href="%{url_next}">下一页</s:a>] </s:if> <s:else> [下一页] </s:else> &nbsp;&nbsp;
<s:if test="pageTotle != pageNow"> [<s:a href="%{url_last}">末页</s:a>] </s:if> <s:else>  [末页] </s:else> 
</td> </tr>  
</table>
			
	</body>
</html>
