/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.82
 * Generated at: 2018-04-11 13:26:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin.goods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class goodsEditPre_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fFCK_005feditor_0026_005fwidth_005fvalue_005ftoolbarSet_005finstanceName_005fheight_005fbasePath;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fFCK_005feditor_0026_005fwidth_005fvalue_005ftoolbarSet_005finstanceName_005fheight_005fbasePath = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fFCK_005feditor_0026_005fwidth_005fvalue_005ftoolbarSet_005finstanceName_005fheight_005fbasePath.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"pragma\" content=\"no-cache\" />\r\n");
      out.write("\t\t<meta http-equiv=\"cache-control\" content=\"no-cache\" />\r\n");
      out.write("\t\t<meta http-equiv=\"expires\" content=\"0\" />\r\n");
      out.write("\t\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\" />\r\n");
      out.write("\t\t<meta http-equiv=\"description\" content=\"This is my page\" />\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path );
      out.write("/css/base.css\" />\r\n");
      out.write("        \r\n");
      out.write("        <script type='text/javascript' src='");
      out.print(path );
      out.write("/dwr/interface/catelogService.js'></script>\r\n");
      out.write("        <script type='text/javascript' src='");
      out.print(path );
      out.write("/dwr/engine.js'></script>\r\n");
      out.write("        <script type='text/javascript' src='");
      out.print(path );
      out.write("/dwr/util.js'></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/popup.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <script language=\"javascript\">\r\n");
      out.write("            var i=0;\r\n");
      out.write("\t\t    function goodsCatelogSelect()\r\n");
      out.write("\t\t    {\r\n");
      out.write("\t\t        if(i==0)\r\n");
      out.write("\t\t        {\r\n");
      out.write("\t\t           document.getElementById(\"indicator\").style.display=\"block\";\r\n");
      out.write("\t\t           catelogService.findAllCatelog(callback);\r\n");
      out.write("\t\t           i=1;\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t    function callback(data)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t    document.getElementById(\"indicator\").style.display=\"none\";\r\n");
      out.write("\t\t\t    //document.getElementById(\"goodsCatelogId1\").style.display=\"none\";\r\n");
      out.write("\t\t\t    DWRUtil.addOptions(\"goodsCatelogId\",data,\"catelogId\",\"catelogName\");\r\n");
      out.write("\t\t\t    //document.getElementById(\"goodsCatelogId\").style.display=\"block\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction up()\r\n");
      out.write("\t\t    {\r\n");
      out.write("\t\t        var pop=new Popup({ contentType:1,isReloadOnClose:false,width:400,height:200});\r\n");
      out.write("\t            pop.setContent(\"contentUrl\",\"");
      out.print(path );
      out.write("/upload/upload.jsp\");\r\n");
      out.write("\t            pop.setContent(\"title\",\"文件上传\");\r\n");
      out.write("\t            pop.build();\r\n");
      out.write("\t            pop.show();\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    function check()\r\n");
      out.write("\t\t    {\r\n");
      out.write("\t\t        if(document.formAdd.goodsCatelogId.value==0)\r\n");
      out.write("\t\t        {\r\n");
      out.write("\t\t            alert(\"请选择类别\");\r\n");
      out.write("\t\t            return false;\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t        if(document.formAdd.goodsName.value==\"\")\r\n");
      out.write("\t\t        {\r\n");
      out.write("\t\t            alert(\"请填写商品名称\");\r\n");
      out.write("\t\t            return false;\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t        if(document.formAdd.goodsShichangjia.value==\"\")\r\n");
      out.write("\t\t        {\r\n");
      out.write("\t\t            alert(\"请填写商品价格\");\r\n");
      out.write("\t\t            return false;\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t        if(document.formAdd.goodsTejia.value==\"\")\r\n");
      out.write("\t\t        {\r\n");
      out.write("\t\t            alert(\"请填写商品特价\");\r\n");
      out.write("\t\t            return false;\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t        document.formAdd.submit();\r\n");
      out.write("\t\t    }\r\n");
      out.write("        </script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body leftmargin=\"2\" topmargin=\"9\" background='");
      out.print(path );
      out.write("/img/allbg.gif'>\r\n");
      out.write("\t\t\t<form action=\"");
      out.print(path );
      out.write("/goodsEdit.action\" name=\"formAdd\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t\t     <table width=\"98%\" align=\"center\" border=\"0\" cellpadding=\"4\" cellspacing=\"1\" bgcolor=\"#CBD8AC\" style=\"margin-bottom:8px\">\r\n");
      out.write("\t\t\t\t\t\t<tr bgcolor=\"#EEF4EA\">\r\n");
      out.write("\t\t\t\t\t        <td colspan=\"3\" background=\"");
      out.print(path );
      out.write("/img/wbg.gif\" class='title'><span>商品修改</span></td>\r\n");
      out.write("\t\t\t\t\t    </tr>\r\n");
      out.write("\t\t\t\t\t\t<tr align='center' bgcolor=\"#FFFFFF\"  height=\"22\">\r\n");
      out.write("\t\t\t\t\t\t    <td width=\"25%\" bgcolor=\"#FFFFFF\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t         商品类别：\r\n");
      out.write("\t\t\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t\t\t    <td width=\"75%\" bgcolor=\"#FFFFFF\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t        <table>\r\n");
      out.write("\t\t\t\t\t\t           <tr>\r\n");
      out.write("\t\t\t\t\t\t               <td>\r\n");
      out.write("\t\t\t\t\t\t                 \r\n");
      out.write("                                           <select  name=\"goodsCatelogId\" id=\"goodsCatelogId\" >\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t  </select>\r\n");
      out.write("\t\t\t\t\t\t               </td>\r\n");
      out.write("\t\t\t\t\t\t               <td>\r\n");
      out.write("\t\t\t\t\t\t                   <img id=\"indicator\" src=\"");
      out.print(path );
      out.write("/img/loading.gif\" style=\"display:none\"/>\r\n");
      out.write("\t\t\t\t\t\t               </td>\r\n");
      out.write("\t\t\t\t\t\t           </tr>\r\n");
      out.write("\t\t\t\t\t\t        </table>\r\n");
      out.write("\t\t\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr align='center' bgcolor=\"#FFFFFF\"  height=\"22\">\r\n");
      out.write("\t\t\t\t\t\t    <td width=\"25%\" bgcolor=\"#FFFFFF\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t         商品名称：\r\n");
      out.write("\t\t\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t\t\t    <td width=\"75%\" bgcolor=\"#FFFFFF\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t        <input type=\"text\" name=\"goodsName\" size=\"40\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.goodsName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr align='center' bgcolor=\"#FFFFFF\"  height=\"22\">\r\n");
      out.write("\t\t\t\t\t\t    <td width=\"25%\" bgcolor=\"#FFFFFF\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t        商品描述：\r\n");
      out.write("\t\t\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t\t\t    <td width=\"75%\" bgcolor=\"#FFFFFF\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t        ");
      if (_jspx_meth_FCK_005feditor_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr align='center' bgcolor=\"#FFFFFF\"  height=\"22\">\r\n");
      out.write("\t\t\t\t\t\t    <td width=\"25%\" bgcolor=\"#FFFFFF\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t         商品图片：\r\n");
      out.write("\t\t\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t\t\t    <td width=\"75%\" bgcolor=\"#FFFFFF\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t        <input type=\"text\" name=\"fujian\" id=\"fujian\" size=\"30\" readonly=\"readonly\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.goodsPic }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t        <input type=\"button\" value=\"上传\" onclick=\"up()\"/>\r\n");
      out.write("\t\t\t\t\t\t        <input type=\"hidden\" name=\"fujianYuanshiming\" id=\"fujianYuanshiming\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.goodsPic }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr align='center' bgcolor=\"#FFFFFF\"  height=\"22\">\r\n");
      out.write("\t\t\t\t\t\t    <td width=\"25%\" bgcolor=\"#FFFFFF\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t         市场价格：\r\n");
      out.write("\t\t\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t\t\t    <td width=\"75%\" bgcolor=\"#FFFFFF\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t        <input type=\"text\" name=\"goodsShichangjia\" size=\"20\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.goodsShichangjia }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" onkeyup=\"this.value=this.value.replace(/\\D/g,'')\" onafterpaste=\"this.value=this.value.replace(/\\D/g,'')\"/>\r\n");
      out.write("\t\t\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr style=\"display: none\" align='center' bgcolor=\"#FFFFFF\"  height=\"22\">\r\n");
      out.write("\t\t\t\t\t\t    <td width=\"25%\" bgcolor=\"#FFFFFF\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t         特格：\r\n");
      out.write("\t\t\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t\t\t    <td width=\"75%\" bgcolor=\"#FFFFFF\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t        <input type=\"text\" name=\"goodsTejia\" size=\"20\" value=\"0\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.goodsTejia }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" onkeyup=\"this.value=this.value.replace(/\\D/g,'')\" onafterpaste=\"this.value=this.value.replace(/\\D/g,'')\"/>\r\n");
      out.write("\t\t\t\t\t\t        (<font color=\"red\">特格为0表示没有特价</font>)\r\n");
      out.write("\t\t\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr align='center' bgcolor=\"#FFFFFF\"  height=\"22\">\r\n");
      out.write("\t\t\t\t\t\t    <td width=\"25%\" bgcolor=\"#FFFFFF\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t         库存：\r\n");
      out.write("\t\t\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t\t\t    <td width=\"75%\" bgcolor=\"#FFFFFF\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t        <input type=\"text\" name=\"goodsKucun\" size=\"20\" value=\"100\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.goodsKucun }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" onkeyup=\"this.value=this.value.replace(/\\D/g,'')\" onafterpaste=\"this.value=this.value.replace(/\\D/g,'')\"/>\r\n");
      out.write("\t\t\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr align='center' bgcolor=\"#FFFFFF\"  height=\"22\">\r\n");
      out.write("\t\t\t\t\t\t    <td width=\"25%\" bgcolor=\"#FFFFFF\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t        &nbsp;\r\n");
      out.write("\t\t\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t\t\t    <td width=\"75%\" bgcolor=\"#FFFFFF\" align=\"left\">\r\n");
      out.write("                                <input type=\"hidden\" name=\"goodsId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.goodsId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t       <input type=\"button\" value=\"提交\" onclick=\"check()\"/>&nbsp; \r\n");
      out.write("\t\t\t\t\t\t      &nbsp;&nbsp;&nbsp;<input type=\"button\"  onclick=\"javascript:history.go(-1);\" value=\"返回\" />\r\n");
      out.write("\t\t\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t </table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("   </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t  ");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t  ");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /admin/goods/goodsEditPre.jsp(101,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty catelogList}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("   \r\n");
          out.write("\t\t\t\t\t  <option value=\"0\" >没有任何类别</option>\r\n");
          out.write("\t\t\t\t  ");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t  ");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
      // /admin/goods/goodsEditPre.jsp(105,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/admin/goods/goodsEditPre.jsp(105,5) '${catelogList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${catelogList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /admin/goods/goodsEditPre.jsp(105,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("t");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\t\r\n");
            out.write("\t\t\t\t\t\t");
            if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write(" \r\n");
            out.write("\t\t\t\t\t\t");
            if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\t\t\t\t\t\t                   \r\n");
            out.write("\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /admin/goods/goodsEditPre.jsp(106,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.goodsCatelogId==t.catelogId}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<option  value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${t.catelogId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"  selected=\"selected\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${t.catelogName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option> ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /admin/goods/goodsEditPre.jsp(107,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.goodsCatelogId!=t.catelogId}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${t.catelogId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${t.catelogName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option> ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_FCK_005feditor_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  FCK:editor
    net.fckeditor.tags.EditorTag _jspx_th_FCK_005feditor_005f0 = (net.fckeditor.tags.EditorTag) _005fjspx_005ftagPool_005fFCK_005feditor_0026_005fwidth_005fvalue_005ftoolbarSet_005finstanceName_005fheight_005fbasePath.get(net.fckeditor.tags.EditorTag.class);
    boolean _jspx_th_FCK_005feditor_005f0_reused = false;
    try {
      _jspx_th_FCK_005feditor_005f0.setPageContext(_jspx_page_context);
      _jspx_th_FCK_005feditor_005f0.setParent(null);
      // /admin/goods/goodsEditPre.jsp(133,14) name = instanceName type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_FCK_005feditor_005f0.setInstanceName("goodsMiaoshu");
      // /admin/goods/goodsEditPre.jsp(133,14) name = basePath type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_FCK_005feditor_005f0.setBasePath("/fckeditor");
      // /admin/goods/goodsEditPre.jsp(133,14) name = width type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_FCK_005feditor_005f0.setWidth("500");
      // /admin/goods/goodsEditPre.jsp(133,14) name = height type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_FCK_005feditor_005f0.setHeight("200");
      // /admin/goods/goodsEditPre.jsp(133,14) name = value type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_FCK_005feditor_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.goodsMiaoshu }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      // /admin/goods/goodsEditPre.jsp(133,14) name = toolbarSet type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_FCK_005feditor_005f0.setToolbarSet("Basic");
      int _jspx_eval_FCK_005feditor_005f0 = _jspx_th_FCK_005feditor_005f0.doStartTag();
      if (_jspx_eval_FCK_005feditor_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_FCK_005feditor_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_FCK_005feditor_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fFCK_005feditor_0026_005fwidth_005fvalue_005ftoolbarSet_005finstanceName_005fheight_005fbasePath.reuse(_jspx_th_FCK_005feditor_005f0);
      _jspx_th_FCK_005feditor_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_FCK_005feditor_005f0, _jsp_getInstanceManager(), _jspx_th_FCK_005feditor_005f0_reused);
    }
    return false;
  }
}
