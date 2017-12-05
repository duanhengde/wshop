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
        <script language="javascript">
           function orderDel(orderId)
           {
               if(confirm('您确定删除吗？'))
               {
                   window.location.href="<%=path %>/orderDelByAd.action?orderId="+orderId;
               }
           }
           
           function orderShouli(orderId)
           {
               if(confirm('您确定受理订单吗？'))
               {
                   window.location.href="<%=path %>/orderShouli.action?orderId="+orderId;
               }
           }
           
           
           function orderDetail(orderId)
           {
                 var url="<%=path %>/orderDetail.action?orderId="+orderId;
                 var n="";
                 var w="700px";
                 var h="500px";
                 var s="resizable:no;help:no;status:no;scroll:yes";
			     openWin(url,n,w,h,s);
           }
           
           function userXinxi(userId)
           {
                 var url="<%=path %>/userXinxi.action?userId="+userId;
                 var n="";
                 var w="300px";
                 var h="400px";
                 var s="resizable:no;help:no;status:no;scroll:yes";
			     openWin(url,n,w,h,s);
           }
       </script>
	</head>

	<body leftmargin="2" topmargin="2" background='<%=path %>/img/allbg.gif'>
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#FF8033" align="center" style="margin-top:8px">
				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="8" background="<%=path %>/img/tbg.gif">&nbsp;订单管理&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
                    <td width="10%">订单编号</td>
					<td width="8%">会员</td>
					
					<td width="8%">金额</td>
					<td width="14%">下单日期</td>
					<td width="18%">送货地址</td>
					<td width="10%">付款方式</td>
					<td width="10%">订单状态</td>
					<td width="22%">操作</td>
		        </tr>	
				<s:iterator value="#request.orderList" id="order">
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#order.orderBianhao"/>
					</td>
                    <td bgcolor="#FFFFFF" align="center">
						<a href="#" onclick="userXinxi(<s:property value="#order.orderUserId"/>)" style="color: red"><s:property value="#order.user.userRealname"/></a>
					</td>
					
					<td bgcolor="#FFFFFF" align="center">
					   ￥<s:property value="#order.orderJine"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
					   <s:property value="#order.orderDate"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
					   <s:property value="#order.odderSonghuodizhi"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
					   <s:property value="#order.odderFukuangfangshi"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
					   <s:property value="#order.orderZhuangtai"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
					        <a href="#" onclick="orderDetail(<s:property value="#order.orderId"/>)" class="pn-loperator">订单明细</a>&nbsp;&nbsp;
						    <a href="<%=path %>/orderEditPre.action?orderId=<s:property value="#order.orderId"/>">订单处理</a>&nbsp;&nbsp;
                         
							<a href="#" onclick="orderDel(<s:property value="#order.orderId"/>)" class="pn-loperator">删除订单</a>
					</td>
				</tr>
				</s:iterator>
			</table>
<table width="80%" border="0" style="text-align: center;">
<tr><td> 
<s:url id="url_first" value="orderMana.action"> <s:param name="pageNow" value="1"></s:param> </s:url> <!-- 首页 -->
<s:url id="url_pre" value="orderMana.action"> <s:param name="pageNow" value="pageNow-1"></s:param> </s:url> <!-- 上一页 --> 
<s:url id="url_next" value="orderMana.action"> <s:param name="pageNow" value="pageNow+1"></s:param> </s:url> <!-- 下一页 -->
<s:url id="url_last" value="orderMana.action"> <s:param name="pageNow" value="pageTotle"></s:param> </s:url> <!-- 末页 --> 
 <!-- 如果不是首页则提供首页的链接,如果是首页则不提供链接,以下类似 --> 
<s:if test="pageNow != 1">  [<s:a href="%{url_first}">首页</s:a>] </s:if> <s:else> [首页] </s:else>&nbsp;&nbsp;
<s:if test="pageNow>1">  [<s:a href="%{url_pre}">上一页</s:a>]  </s:if> <s:else> [上一页]  </s:else> &nbsp;&nbsp;
<s:if test=" pageTotle > pageNow "> [<s:a href="%{url_next}">下一页</s:a>] </s:if> <s:else> [下一页] </s:else> &nbsp;&nbsp;
<s:if test="pageTotle != pageNow"> [<s:a href="%{url_last}">末页</s:a>] </s:if> <s:else>  [末页] </s:else> 
</td> </tr>  
</table>
	</body>
</html>
