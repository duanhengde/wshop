<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <style type="text/css">
        .Header {background: url(<%=path %>/img/top.jpg) #d10e00 repeat-x left top; height: 120px;width: 966px;}
        .HeaderTop {margin: 0px auto;}
    </style>
     <script type="text/javascript">
            function myXinxi()
	        {
	            <s:if test="#session.user==null">
	                  alert("请先登录");
	            </s:if>
	            
	            <s:else>
	                var url="<%=path %>/qiantai/userinfo/userXinxi.jsp";
	                var n="";
	                var w="480px";
	                var h="500px";
	                var s="resizable:no;help:no;status:no;scroll:yes";
				    openWin(url,n,w,h,s);
	            </s:else>
	        }
	        
	        function liuyanAll()
	        {
	            <s:if test="#session.user==null">
	                  alert("请先登录");
	            </s:if>
	            
	            <s:else>
	                 var url="<%=path %>/liuyanAll.action";
				     window.open(url,"_self");
	            </s:else>
	        }
	        
	        function userReg()
	        {
	                var url="<%=path %>/qiantai/userinfo/userReg.jsp";
	                var n="";
	                var w="480px";
	                var h="500px";
	                var s="resizable:no;help:no;status:no;scroll:yes";
				    openWin(url,n,w,h,s);
	        }
	        
	        function myCart()
	        {
	            <s:if test="#session.user==null">
	                  alert("请先登录");
	            </s:if>
	            
	            <s:else>
	                 var s="<%=path %>/myCart.action";
	                 window.location.href=s;
	            </s:else>
	        }
	        
	        function myOrder()
	        {
	            <s:if test="#session.user==null">
	                  alert("请先登录");
	            </s:if>
	            
	            <s:else>
	                 var s="<%=path %>/myOrder.action";
	                 window.location.href=s;
	            </s:else>
	        }
     </script>
  </head>
  
  <body>
        <div class="Header HeaderTop">
			<br/>
			<font style="font-size: 40px;color: #CF0C00;font-weight: bolder;display: block;text-align: center;padding-top:10px;"></font>
		</div>
		<div class="topmenu cbody1">
			<ul>
				<li class="thisclass">
					<A href="<%=path %>/qiantai/default.jsp">网站首页</A>
				</li>
                <li class="thisclass">
					<a href="<%=path %>/goodsAllYesTejia.action">特价商品</a>
				</li>
                <li class="thisclass">
					<a href="<%=path %>/goodsAllHits.action">热门商品</a>
				</li>
                <li class="thisclass">
					<a href="<%=path %>/goodsAllNoTejia.action">最新商品</a>
				</li>
				<li class="thisclass">
					<A href="#" onclick="userReg()">免费注册</A>
				</li>
				<li class="thisclass">
					<A href="#" onclick="myXinxi()">我的信息</A>
				</li>
				<li class="thisclass">
					<A href="#" onclick="myCart()">我的购物车</A>
				</li>
				<li class="thisclass">
					<A href="#" onclick="myOrder()">我的订单</A>
				</li>
				<li class="thisclass">
					<A href="#" onclick="liuyanAll()">客服服务</A>
				</li>
			</ul>
		</div>
		<form id="searchForm" action="<%=path %>/goodsSearch.action" method="post">
			<div class="topsearch">
				<div class="title"></div>
				<div id="page_search_left">
					<input class="inputText" id="" size="16" onkeypress="if(event.keyCode==13){searchFormSubmit();return false;}" name="goodsName" type="text" />
				</div>
				<div id="page_search_btn">
					<input type="submit" value="搜索">
				</div>
				
                    <div  style="width:500px;float:left; text-align:left;padding-top:8px;">
				   <s:action name="keywordAll" executeResult="true" flush="true"></s:action>
		   </div>
				<div style="clear: both"></div>
			</div>
		</form>
  </body>
</html>
