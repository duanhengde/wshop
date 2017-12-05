<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page isELIgnored="false" %> 
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK"%>

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

	<body leftmargin="2" topmargin="9" background='<%=path %>/img/allbg.gif'>
			<form action="<%=path %>/orderEdit.action" name="formAdd" method="post">
				     <table width="98%" align="center" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px">
						<tr bgcolor="#EEF4EA">
					        <td colspan="3" background="<%=path %>/img/wbg.gif" class='title'><span>订单处理</span></td>
					    </tr>
                        <tr align='center' bgcolor="#FFFFFF"  height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						          用户ID：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <a href="#" onclick="userXinxi(${order.orderUserId })" style="color: red">${order.orderUserId }</a>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF"  height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						          编号：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <input type="text" name="orderBianhao"  value="${order.orderBianhao }"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF"  height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						        金额：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
                                 <input type="text" name="orderJine"  value="${order.orderJine }"/>
						    </td>
						</tr>
                         <tr align='center' bgcolor="#FFFFFF"  height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						          时间：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        ${order.orderDate }
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF"  height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						        收货人地址：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
                                 <input type="text" name="odderSonghuodizhi"  value="${order.odderSonghuodizhi }"/>
						    </td>
						</tr>   
                         <tr align='center' bgcolor="#FFFFFF"  height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						          付款方式：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <input type="text" name="odderFukuangfangshi"  value="${order.odderFukuangfangshi }"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF"  height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						        订单状态：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
                                
                                 &nbsp;
							<input type="radio" name="orderZhuangtai" value="未受理" <s:if test="${order.orderZhuangtai=='未受理'}"> checked="checked" </s:if>/>未受理
							&nbsp;&nbsp;
							<input type="radio" name="orderZhuangtai" value="出库中" <s:if test="${order.orderZhuangtai=='出库中'}"> checked="checked" </s:if>/>出库中
                            &nbsp;&nbsp;
							<input type="radio" name="orderZhuangtai" value="配送中" <s:if test="${order.orderZhuangtai=='配送中'}"> checked="checked" </s:if>/>配送中
                            &nbsp;&nbsp;
							<input type="radio" name="orderZhuangtai" value="交易成功" <s:if test="${order.orderZhuangtai=='交易成功'}"> checked="checked" </s:if>/>交易成功
						    </td>
						</tr>   
                            
                            
                            
						<tr align='center' bgcolor="#FFFFFF"  height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						        &nbsp;
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
                                <input type="hidden" name="orderId" value="${order.orderId }" />
						       <input type="submit" value="提交"/>&nbsp; 
						       &nbsp;&nbsp;<input type="button"  onclick="javascript:history.go(-1);" value="返回" />
						    </td>
						</tr>
					 </table>
			</form>
           <table cellspacing="1" cellpadding="0" width="100%" border="0" bgcolor="#F7F3F7">
          <tr height="26" bgcolor="#EEF4EA">
              <td  align="center">商品名称</td>
              <td  align="center">购买数量</td>
              <td  align="center">购买价格</td>
          </tr>
		  <s:iterator value="#request.orderItemList" id="orderItem">
		  <tr class="text" align="center" bgcolor="#FFFFFF">
			  <td>
				<s:property value="#orderItem.goods.goodsName"/>
			  </td>
			  <td><s:property value="#orderItem.goodsQuantity"/></td>
			  <td><s:property value="#orderItem.goods.goodsTejia"/></td>
		  </tr>
		  </s:iterator>
  	</table>
   </body>
</html>
