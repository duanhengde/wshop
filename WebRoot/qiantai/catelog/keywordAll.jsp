<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<table  cellpadding="0" cellspacing="0" border="0" style=" float:left;" align="left">
		          <tr>
              <s:iterator value="#request.keywordList" id="keyword">        
                  <td height="28" id="roll-line-154" style=" padding-left: 5px;" >
		                   <div class="f-left">
                               <a href="<%=path %>/goodsSearch.action?goodsId=<s:property value="#keyword.keywordId" />">
		                         <span style=""><s:property value="#keyword.keywordName"/></span>&nbsp;
		                      </a>
		                   </div>
		              </td>
   		     </s:iterator>                           
		          </tr>
		 </table>
	