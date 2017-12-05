<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
	</head>

	<body>
	     <table  cellpadding="0" cellspacing="0" border="0">
		     
		          <tr>
              <s:iterator value="#request.keywordList" id="keyword">        
                  <td height="28" id="roll-line-154" style=" padding-left: 5px;" >
		                   <div class="f-left">
                               <a href="<%=path %>/lineSearch.action?lineId=<s:property value="#keyword.keywordId" />">
		                         <span style=""><s:property value="#keyword.keywordName"/></span>&nbsp;
		                      </a>
		                   </div>
		              </td>
   		     </s:iterator>                           
		          </tr>

		 </table>
	</body>
</html>
