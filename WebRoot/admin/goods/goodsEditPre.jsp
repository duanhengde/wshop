<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page isELIgnored="false" %> 
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
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
        
        <script type='text/javascript' src='<%=path %>/dwr/interface/catelogService.js'></script>
        <script type='text/javascript' src='<%=path %>/dwr/engine.js'></script>
        <script type='text/javascript' src='<%=path %>/dwr/util.js'></script>
        <script type="text/javascript" src="<%=path %>/js/popup.js"></script>
        
        <script language="javascript">
            var i=0;
		    function goodsCatelogSelect()
		    {
		        if(i==0)
		        {
		           document.getElementById("indicator").style.display="block";
		           catelogService.findAllCatelog(callback);
		           i=1;
		        }
		        
		    }
		   
		    function callback(data)
			{
			    document.getElementById("indicator").style.display="none";
			    //document.getElementById("goodsCatelogId1").style.display="none";
			    DWRUtil.addOptions("goodsCatelogId",data,"catelogId","catelogName");
			    //document.getElementById("goodsCatelogId").style.display="block";
			}
			
			function up()
		    {
		        var pop=new Popup({ contentType:1,isReloadOnClose:false,width:400,height:200});
	            pop.setContent("contentUrl","<%=path %>/upload/upload.jsp");
	            pop.setContent("title","文件上传");
	            pop.build();
	            pop.show();
		    }
			
		    
		    function check()
		    {
		        if(document.formAdd.goodsCatelogId.value==0)
		        {
		            alert("请选择类别");
		            return false;
		        }
		        if(document.formAdd.goodsName.value=="")
		        {
		            alert("请填写商品名称");
		            return false;
		        }
		        if(document.formAdd.goodsShichangjia.value=="")
		        {
		            alert("请填写商品价格");
		            return false;
		        }
		        if(document.formAdd.goodsTejia.value=="")
		        {
		            alert("请填写商品特价");
		            return false;
		        }
		        document.formAdd.submit();
		    }
        </script>
	</head>

	<body leftmargin="2" topmargin="9" background='<%=path %>/img/allbg.gif'>
			<form action="<%=path %>/goodsEdit.action" name="formAdd" method="post" enctype="multipart/form-data">
				     <table width="98%" align="center" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px">
						<tr bgcolor="#EEF4EA">
					        <td colspan="3" background="<%=path %>/img/wbg.gif" class='title'><span>商品修改</span></td>
					    </tr>
						<tr align='center' bgcolor="#FFFFFF"  height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						         商品类别：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <table>
						           <tr>
						               <td>
						                 
                                           <select  name="goodsCatelogId" id="goodsCatelogId" >
				<c:choose>
				  <c:when test="${empty catelogList}">   
					  <option value="0" >没有任何类别</option>
				  </c:when>
				  <c:otherwise>
					<c:forEach items="${catelogList}" var="t">	
						<c:if test="${goods.goodsCatelogId==t.catelogId}"><option  value="${t.catelogId}"  selected="selected">${t.catelogName}</option> </c:if> 
						<c:if test="${goods.goodsCatelogId!=t.catelogId}"><option value="${t.catelogId}" >${t.catelogName}</option> </c:if>						                   
					</c:forEach>
				  </c:otherwise>
				</c:choose>
		  </select>
						               </td>
						               <td>
						                   <img id="indicator" src="<%=path %>/img/loading.gif" style="display:none"/>
						               </td>
						           </tr>
						        </table>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF"  height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						         商品名称：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <input type="text" name="goodsName" size="40" value="${goods.goodsName }"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF"  height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						        商品描述：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <FCK:editor instanceName="goodsMiaoshu"  basePath="/fckeditor" width="500" height="200"  value="${goods.goodsMiaoshu }" toolbarSet="Basic">
                                </FCK:editor>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF"  height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						         商品图片：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <input type="text" name="fujian" id="fujian" size="30" readonly="readonly"  value="${goods.goodsPic }"/>
						        <input type="button" value="上传" onclick="up()"/>
						        <input type="hidden" name="fujianYuanshiming" id="fujianYuanshiming"  value="${goods.goodsPic }"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF"  height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						         市场价格：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <input type="text" name="goodsShichangjia" size="20" value="${goods.goodsShichangjia }" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')"/>
						    </td>
						</tr>
						<tr style="display: none" align='center' bgcolor="#FFFFFF"  height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						         特格：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <input type="text" name="goodsTejia" size="20" value="0"  value="${goods.goodsTejia }" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')"/>
						        (<font color="red">特格为0表示没有特价</font>)
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF"  height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						         库存：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <input type="text" name="goodsKucun" size="20" value="100"  value="${goods.goodsKucun }" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF"  height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						        &nbsp;
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
                                <input type="hidden" name="goodsId" value="${goods.goodsId }" />
						       <input type="button" value="提交" onclick="check()"/>&nbsp; 
						      &nbsp;&nbsp;&nbsp;<input type="button"  onclick="javascript:history.go(-1);" value="返回" />
						    </td>
						</tr>
					 </table>
			</form>
   </body>
</html>
