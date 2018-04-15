package org.apache.jsp.aids.birth.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cn.com.sinosoft.frame.utility.GetFieldValue;
import cn.com.sinosoft.frame.dao.ValueObject;
import cn.com.sinosoft.cdc.aids.country.download.DLoadForReleaseRatFileInfoAction;

public final class customerrelease_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(6);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/frame-app.tld");
    _jspx_dependants.add("/WEB-INF/frame-html.tld");
    _jspx_dependants.add("/WEB-INF/permission-func.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhtml;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fframeHtml_005fbusiId_0026_005fvalue_005freqParam_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fproperty_005fcode;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fframeApp_005flistTitle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fframeApp_005fframeIterate_0026_005fscope_005frowNo_005fproperty_005findexId;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fframeApp_005flistValue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fframeApp_005fpagination_0026_005fforward_005fformName_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fframeHtml_005fbusiId_0026_005fvalue_005freqParam_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fproperty_005fcode = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fframeApp_005flistTitle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fframeApp_005fframeIterate_0026_005fscope_005frowNo_005fproperty_005findexId = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fframeApp_005flistValue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fframeApp_005fpagination_0026_005fforward_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml.release();
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.release();
    _005fjspx_005ftagPool_005fframeHtml_005fbusiId_0026_005fvalue_005freqParam_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.release();
    _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fproperty_005fcode.release();
    _005fjspx_005ftagPool_005fframeApp_005flistTitle_005fnobody.release();
    _005fjspx_005ftagPool_005fframeApp_005fframeIterate_0026_005fscope_005frowNo_005fproperty_005findexId.release();
    _005fjspx_005ftagPool_005fframeApp_005flistValue_005fnobody.release();
    _005fjspx_005ftagPool_005fframeApp_005fpagination_0026_005fforward_005fformName_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=GBK");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

     String pageState = cn.com.sinosoft.frame.utility.GetFieldValue.getPageState(pageContext);
    request.setAttribute("pageState",pageState);

      out.write("\r\n");
      out.write("\r\n");
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_005fhtml_005f0 = (org.apache.struts.taglib.html.HtmlTag) _005fjspx_005ftagPool_005fhtml_005fhtml.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_005fhtml_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhtml_005f0.setParent(null);
      int _jspx_eval_html_005fhtml_005f0 = _jspx_th_html_005fhtml_005f0.doStartTag();
      if (_jspx_eval_html_005fhtml_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("<head>\r\n");
          out.write("<meta http-equiv=\"Pragma\" content=\"no-cache\">\r\n");
          out.write("<meta http-equiv=\"Cache-Control\" content=\"no-cache\">\r\n");
          out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
          out.write("\r\n");
          out.write("<LINK href=\"");
          out.print(request.getContextPath());
          out.write("/css/listCss.css\" type=text/css rel=stylesheet>\r\n");
          out.write("<LINK href=\"");
          out.print(request.getContextPath());
          out.write("/css/default_style.css\" type=text/css rel=stylesheet>\r\n");
          out.write("<style type=\"text/css\">\r\n");
          out.write(".tb_title{\r\n");
          out.write("  background:#ADB0EC;\r\n");
          out.write("  font-size:13px;\r\n");
          out.write("  font-weight:bold;\r\n");
          out.write("  color:#ffffff;\r\n");
          out.write("  text-align:center\r\n");
          out.write("}\r\n");
          out.write("</style>\r\n");
          out.write("<script language=\"javascript\" src=\"");
          out.print(request.getContextPath());
          out.write("/js/Common.js\"></script>\r\n");
          out.write("<script language=\"javascript\" src=\"");
          out.print(request.getContextPath());
          out.write("/js/func_sys.js\"></script>\r\n");
          out.write("<script language=\"javascript\" src=\"");
          out.print(request.getContextPath());
          out.write("/js/frameTag.js\"></script>\r\n");
          out.write("<script language=\"javascript\" src=\"");
          out.print(request.getContextPath());
          out.write("/js/frameTag.js\"></script>\r\n");
          out.write("<script language=\"javascript\" src=\"");
          out.print(request.getContextPath());
          out.write("/js/popupDlg.js\"></script>\r\n");
          out.write("<script language=\"javascript\" src=\"");
          out.print(request.getContextPath());
          out.write("/js/formValidate.js\"></script>\r\n");
          out.write("<script language=\"javascript\" src=\"");
          out.print(request.getContextPath());
          out.write("/js/cdc.js\"></script>\r\n");
          out.write("\r\n");
          out.write("</head>\r\n");
          out.write("<script language=\"javascript\">\r\n");
          out.write("\tfunction sbar(st){st.style.backgroundColor='#FFFFFF';}\r\n");
          out.write("\tfunction cbar(st){st.style.backgroundColor='';}\r\n");
          out.write("</script>\r\n");
          out.write("<script language=\"javascript\">\r\n");
          out.write("\t//本段代码用于 用于查询提交的处理脚本\r\n");
          out.write("\tfunction querySubmit(obj){\r\n");
          out.write("\t    obj.form.action=\"");
          out.print(request.getContextPath());
          out.write("/aids/customerreleaseAction.do\";\r\n");
          out.write("\t    obj.form.act.value=\"queryParent\";\r\n");
          out.write("\t    document.all.busiId.value=\"CUSTOMER_SUPPORT_RELEASE_LOG\";\t\r\n");
          out.write("\t\tobj.form.submit();\r\n");
          out.write("\t   }\r\n");
          out.write("   //本段代码用于 用于添加提交的处理脚本\r\n");
          out.write("   function addSubmit(obj){  \r\n");
          out.write("\t\tobj.form.action=\"");
          out.print(request.getContextPath());
          out.write("/aids/edtcustomerreleaseAction.do\";\r\n");
          out.write("\t\tobj.form.act.value=\"addParentInput\";\t\r\n");
          out.write("\t\tdocument.all.busiId.value=\"CUSTOMER_SUPPORT_RELEASE_LOG\";\r\n");
          out.write("\t\tobj.form.submit();\r\n");
          out.write("   }\r\n");
          out.write("   \r\n");
          out.write("   //本段代码用于 用于查看提交的处理脚本\r\n");
          out.write("   function viewSubmit(formObj,codeVal){     \r\n");
          out.write("\t\tformObj.action=\"");
          out.print(request.getContextPath());
          out.write("/aids/edtcustomerreleaseAction.do\";\t\t\r\n");
          out.write("\t\tformObj.key_ID.value = codeVal;\r\n");
          out.write("\t\tformObj.act.value=\"viewParent\";\t\t\t\t\r\n");
          out.write("\t\tdocument.all.busiId.value=\"CUSTOMER_SUPPORT_RELEASE_LOG\";\r\n");
          out.write("\t\tformObj.submit();\r\n");
          out.write("   } \r\n");
          out.write("   //本段代码用于 用于修改提交的处理脚本\r\n");
          out.write("   function editSubmit(formObj,codeVal){\r\n");
          out.write("\t\tformObj.action=\"");
          out.print(request.getContextPath());
          out.write("/aids/edtcustomerreleaseAction.do\";\t\r\n");
          out.write("\t\tformObj.key_ID.value = codeVal;\r\n");
          out.write("\t\tformObj.act.value=\"editParentInput\";\r\n");
          out.write("\t\tdocument.all.busiId.value=\"CUSTOMER_SUPPORT_RELEASE_LOG\";\r\n");
          out.write("\t\tformObj.submit();\r\n");
          out.write("\t\t\r\n");
          out.write("   }\r\n");
          out.write("   \r\n");
          out.write("   //本段代码用于 用于删除提交的处理脚本\r\n");
          out.write("   function delSubmit(formObj,codeVal){\r\n");
          out.write("\t   \tformObj.action=\"");
          out.print(request.getContextPath());
          out.write("/aids/edtcustomerreleaseAction.do\";\r\n");
          out.write("\t\tformObj.act.value=\"delParentSubmit\";\r\n");
          out.write("\t\tformObj.key_ID.value=codeVal;\r\n");
          out.write("\t\tdocument.all.busiId.value=\"CUSTOMER_SUPPORT_RELEASE_LOG\";\r\n");
          out.write("\t\tif(window.confirm(\"确定删除该记录?\")){\r\n");
          out.write("\t\t   formObj.submit();\r\n");
          out.write("\t\t }\r\n");
          out.write("   }\r\n");
          out.write("   \r\n");
          out.write(" \r\n");
          out.write("       //导出excel \r\n");
          out.write("    function exportExcel(formObj){\r\n");
          out.write("\t\t\tvar action = formObj.action;\r\n");
          out.write("\t\t\tvar target = formObj.target;\r\n");
          out.write("\t\t\tformObj.action=\"");
          out.print(request.getContextPath());
          out.write("/aids/codeToExcel.do?\";\r\n");
          out.write("\t\t\tformObj.target = \"excelFrame\";\r\n");
          out.write("\t\t\tformObj.act.value = \"queryParent\";\r\n");
          out.write("\t\t\tformObj.busiId.value = \"CUSTOMER_SUPPORT_RELEASE_LOG\";\r\n");
          out.write("\t\t\tformObj.submit();\r\n");
          out.write("\t\t\tformObj.action = action;\r\n");
          out.write("\t\t\tformObj.target = target;\r\n");
          out.write("\t} \r\n");
          out.write("//跳转到下载图片页面\r\n");
          out.write("\r\n");
          out.write("function nextSubmit (obj){\r\n");
          out.write("\t\r\n");
          out.write("\tobj.form.action=\"");
          out.print(request.getContextPath());
          out.write("/aids/releaseratFileInfoQueryAction.do\";\r\n");
          out.write("\tobj.form.act.value=\"queryParent\";\t\r\n");
          out.write("\tdocument.all.busiId.value=\"CUSTOMER_SUPPORT_RELEASE_LOG\";\r\n");
          out.write("\tobj.form.submit();\t\r\n");
          out.write("}\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("//导出Excel\r\n");
          out.write(" function makeWord(formObj,codeVal,name){\r\n");
          out.write(" \t   window.open(\"");
          out.print(request.getContextPath());
          out.write("/makeWordAction.do?act=viewParent&busiId=RESUME&flag=downWordAction&key_STUBASID=\"+codeVal+\"&id=\"+ID);\r\n");
          out.write(" \t}\r\n");
          out.write("\r\n");
          out.write("//上传图片\r\n");
          out.write("</script>\r\n");
          out.write("<body>\r\n");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          // /aids/birth/customer/customerrelease.jsp(123,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fform_005f0.setAction("/customerreleaseAction.do");
          int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
          if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("   ");
              if (_jspx_meth_frameHtml_005fbusiId_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("                                             \r\n");
              out.write("   ");
              if (_jspx_meth_html_005fhidden_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("   \r\n");
              out.write("   <input type=\"hidden\" name=\"key_ID\"/>   \r\n");
              out.write("      <table style=\"width:95%\" class=\"tbMain\">\r\n");
              out.write("\t\t<tr>\r\n");
              out.write("\t\t\t<td class=\"tb_title\" colspan=\"4\" ><font size=3><span/>发布单</span></font></td>\t\t\t\r\n");
              out.write("\t\t</tr>\r\n");
              out.write("\t\t<tr>\r\n");
              out.write("\t\t     <td colspan=\"4\">\r\n");
              out.write("\t\t\t\t起始日期\r\n");
              out.write("\t\t\t\t");
              if (_jspx_meth_frameHtml_005fdateCtl_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
              out.write("\t\t\t\t终止日期\r\n");
              out.write("\t\t\t\t");
              if (_jspx_meth_frameHtml_005fdateCtl_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("<br><br>\r\n");
              out.write("\t\t\t\t涉及系统\r\n");
              out.write("\t\t\t\t");
              if (_jspx_meth_frameHtml_005fcodeSelect_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("\t\t     </td>\r\n");
              out.write("\t\t</tr>\r\n");
              out.write("         <tr>\r\n");
              out.write("\t\t\t<td align=\"right\">\t\t\t  \t\t  \r\n");
              out.write("\t\t\t    <input  type=\"button\" value=\"查询\" onclick=\"querySubmit(this)\" />\r\n");
              out.write("\t\t\t\t<input  type=\"button\" value=\"添加\" onclick=\"addSubmit(this);\" />\t\r\n");
              out.write("\t\t\t\t\t\t\t\r\n");
              out.write("\t\t\t</td>\r\n");
              out.write("\t\t</tr>\r\n");
              out.write("\t\t<tr>\r\n");
              out.write("\t\t<td colspan=\"4\">\r\n");
              out.write("\t\t\t\r\n");
              out.write("\t\t<table width=\"100%\" class=\"tbMain\">\r\n");
              out.write("\t\t\t  <colgroup>\r\n");
              out.write("\t\t       <col align=\"left\">\r\n");
              out.write("\t\t       <col align=\"left\">\r\n");
              out.write("\t\t       <col align=\"left\">\r\n");
              out.write("\t\t       <col align=\"left\">\r\n");
              out.write("\t\t       <col align=\"center\">\r\n");
              out.write("\t\t       <col align=\"center\">\r\n");
              out.write("\t\t      </colgroup>\r\n");
              out.write("\t\t\t<tr class=\"tbMain_title\">\r\n");
              out.write("\t\t\t");
              if (_jspx_meth_frameApp_005flistTitle_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t<td align=center width=\"10%\" nowrap=\"nowrap\">操作</td>\t\t                 \t\r\n");
              out.write("\t\t</tr>    \r\n");
              out.write("       ");
              //  frameApp:frameIterate
              cn.com.sinosoft.frame.taglib.logic.FrameIterateTag _jspx_th_frameApp_005fframeIterate_005f0 = (cn.com.sinosoft.frame.taglib.logic.FrameIterateTag) _005fjspx_005ftagPool_005fframeApp_005fframeIterate_0026_005fscope_005frowNo_005fproperty_005findexId.get(cn.com.sinosoft.frame.taglib.logic.FrameIterateTag.class);
              _jspx_th_frameApp_005fframeIterate_005f0.setPageContext(_jspx_page_context);
              _jspx_th_frameApp_005fframeIterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
              // /aids/birth/customer/customerrelease.jsp(166,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_frameApp_005fframeIterate_005f0.setProperty("paginationMgr");
              // /aids/birth/customer/customerrelease.jsp(166,7) name = rowNo type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_frameApp_005fframeIterate_005f0.setRowNo("rowNo");
              // /aids/birth/customer/customerrelease.jsp(166,7) name = indexId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_frameApp_005fframeIterate_005f0.setIndexId("indexId");
              // /aids/birth/customer/customerrelease.jsp(166,7) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_frameApp_005fframeIterate_005f0.setScope("session");
              int _jspx_eval_frameApp_005fframeIterate_005f0 = _jspx_th_frameApp_005fframeIterate_005f0.doStartTag();
              if (_jspx_eval_frameApp_005fframeIterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_frameApp_005fframeIterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_frameApp_005fframeIterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_frameApp_005fframeIterate_005f0.doInitBody();
                }
                do {
                  out.write("\r\n");
                  out.write("      <tr class=\"tbMain_data\">  \r\n");
                  out.write("      ");
                  if (_jspx_meth_frameApp_005flistValue_005f0(_jspx_th_frameApp_005fframeIterate_005f0, _jspx_page_context))
                    return;
                  out.write("       \r\n");
                  out.write("       ");

              String id =GetFieldValue.getFieldValue(pageContext,"ID"); 
            String fileName=GetFieldValue.getFieldValue(pageContext,"FILENAME");
           
            
                  out.write("  \r\n");
                  out.write("        <td nowrap>\r\n");
                  out.write("      \r\n");
                  out.write("      <input  type=\"button\" value=\"图片下载\" onclick=\"nextSubmit(this);\" />\r\n");
                  out.write("            <!--                                                        \r\n");
                  out.write("            <a class=\"BUTTON_01\" href=\"javascript:downSubmit(this.document.ratFileInfoQueryForm,'");
                  out.write('\'');
                  out.write(',');
                  out.write('\'');
                  out.write("')\">下载</a>\r\n");
                  out.write("              <a href=\"javascript:makeWord(this.document.qryAllUserInfoForm,'");
                  out.write('\'');
                  out.write(',');
                  out.write('\'');
                  out.write("')\">导出word</a>\r\n");
                  out.write("           -->\r\n");
                  out.write("          <a  href=\"javascript:editSubmit(this.document.forms[0],'");
                  out.print(id);
                  out.write("')\">修改</a> \r\n");
                  out.write("        \r\n");
                  out.write("\t      <a  href=\"javascript:viewSubmit(this.document.forms[0],'");
                  out.print(id);
                  out.write("')\">查看</a>        \r\n");
                  out.write("          <a  href=\"javascript:delSubmit(this.document.forms[0],'");
                  out.print(id);
                  out.write("')\">删除</a>   \r\n");
                  out.write("         </td>        \r\n");
                  out.write("      </tr>\r\n");
                  out.write("     ");
                  int evalDoAfterBody = _jspx_th_frameApp_005fframeIterate_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_frameApp_005fframeIterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_frameApp_005fframeIterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fframeApp_005fframeIterate_0026_005fscope_005frowNo_005fproperty_005findexId.reuse(_jspx_th_frameApp_005fframeIterate_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fframeApp_005fframeIterate_0026_005fscope_005frowNo_005fproperty_005findexId.reuse(_jspx_th_frameApp_005fframeIterate_005f0);
              out.write("         \r\n");
              out.write("        </table>        \r\n");
              out.write("      </td>\r\n");
              out.write("   </tr>\r\n");
              out.write("</table> \r\n");
              out.write("    <tr>\r\n");
              out.write("               <td>\r\n");
              out.write("              \r\n");
              out.write("               <input type=\"button\" value=\"导出Excel\" onclick=\"exportExcel(this.document.forms[0])\">\r\n");
              out.write("               </td>\r\n");
              out.write("\r\n");
              out.write("            \r\n");
              out.write("    \t <td>");
              if (_jspx_meth_frameApp_005fpagination_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("    \t \r\n");
              out.write("\t\t\r\n");
              out.write("\t</tr> \r\n");
              out.write("\t\r\n");
              int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f0);
          out.write("\r\n");
          out.write("</body>\r\n");
          out.write("\t<IFRAME name=\"excelFrame\" id=\"excelFrame\" width=\"0\" height=\"0\"></IFRAME>\r\n");
          int evalDoAfterBody = _jspx_th_html_005fhtml_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fhtml_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_frameHtml_005fbusiId_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:busiId
    cn.com.sinosoft.frame.taglib.html.BusiIdTag _jspx_th_frameHtml_005fbusiId_005f0 = (cn.com.sinosoft.frame.taglib.html.BusiIdTag) _005fjspx_005ftagPool_005fframeHtml_005fbusiId_0026_005fvalue_005freqParam_005fnobody.get(cn.com.sinosoft.frame.taglib.html.BusiIdTag.class);
    _jspx_th_frameHtml_005fbusiId_005f0.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fbusiId_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/customerrelease.jsp(124,3) name = reqParam type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fbusiId_005f0.setReqParam(false);
    // /aids/birth/customer/customerrelease.jsp(124,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fbusiId_005f0.setValue("CUSTOMER_SUPPORT_RELEASE_LOG");
    int _jspx_eval_frameHtml_005fbusiId_005f0 = _jspx_th_frameHtml_005fbusiId_005f0.doStartTag();
    if (_jspx_th_frameHtml_005fbusiId_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fbusiId_0026_005fvalue_005freqParam_005fnobody.reuse(_jspx_th_frameHtml_005fbusiId_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fbusiId_0026_005fvalue_005freqParam_005fnobody.reuse(_jspx_th_frameHtml_005fbusiId_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/customerrelease.jsp(125,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f0.setProperty("act");
    int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
    if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005fdateCtl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:dateCtl
    cn.com.sinosoft.frame.taglib.html.DateCtlTag _jspx_th_frameHtml_005fdateCtl_005f0 = (cn.com.sinosoft.frame.taglib.html.DateCtlTag) _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.get(cn.com.sinosoft.frame.taglib.html.DateCtlTag.class);
    _jspx_th_frameHtml_005fdateCtl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fdateCtl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/customerrelease.jsp(134,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fdateCtl_005f0.setProperty("QUERY(BEGIN)");
    // /aids/birth/customer/customerrelease.jsp(134,4) name = init type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fdateCtl_005f0.setInit(false);
    int _jspx_eval_frameHtml_005fdateCtl_005f0 = _jspx_th_frameHtml_005fdateCtl_005f0.doStartTag();
    if (_jspx_th_frameHtml_005fdateCtl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.reuse(_jspx_th_frameHtml_005fdateCtl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.reuse(_jspx_th_frameHtml_005fdateCtl_005f0);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005fdateCtl_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:dateCtl
    cn.com.sinosoft.frame.taglib.html.DateCtlTag _jspx_th_frameHtml_005fdateCtl_005f1 = (cn.com.sinosoft.frame.taglib.html.DateCtlTag) _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.get(cn.com.sinosoft.frame.taglib.html.DateCtlTag.class);
    _jspx_th_frameHtml_005fdateCtl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fdateCtl_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/customerrelease.jsp(136,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fdateCtl_005f1.setProperty("QUERY(END)");
    // /aids/birth/customer/customerrelease.jsp(136,4) name = init type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fdateCtl_005f1.setInit(true);
    int _jspx_eval_frameHtml_005fdateCtl_005f1 = _jspx_th_frameHtml_005fdateCtl_005f1.doStartTag();
    if (_jspx_th_frameHtml_005fdateCtl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.reuse(_jspx_th_frameHtml_005fdateCtl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.reuse(_jspx_th_frameHtml_005fdateCtl_005f1);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005fcodeSelect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:codeSelect
    cn.com.sinosoft.frame.taglib.html.CodeSelectTag _jspx_th_frameHtml_005fcodeSelect_005f0 = (cn.com.sinosoft.frame.taglib.html.CodeSelectTag) _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fproperty_005fcode.get(cn.com.sinosoft.frame.taglib.html.CodeSelectTag.class);
    _jspx_th_frameHtml_005fcodeSelect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fcodeSelect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/customerrelease.jsp(138,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fcodeSelect_005f0.setProperty("QUERY(SYSTEM)");
    // /aids/birth/customer/customerrelease.jsp(138,4) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fcodeSelect_005f0.setCode("CUS_ILL");
    int _jspx_eval_frameHtml_005fcodeSelect_005f0 = _jspx_th_frameHtml_005fcodeSelect_005f0.doStartTag();
    if (_jspx_eval_frameHtml_005fcodeSelect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_frameHtml_005fcodeSelect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_frameHtml_005fcodeSelect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_frameHtml_005fcodeSelect_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<option value=\"\">---请选择---</option>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_frameHtml_005fcodeSelect_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_frameHtml_005fcodeSelect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_frameHtml_005fcodeSelect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fproperty_005fcode.reuse(_jspx_th_frameHtml_005fcodeSelect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fproperty_005fcode.reuse(_jspx_th_frameHtml_005fcodeSelect_005f0);
    return false;
  }

  private boolean _jspx_meth_frameApp_005flistTitle_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameApp:listTitle
    cn.com.sinosoft.frame.taglib.logic.ListTitleTag _jspx_th_frameApp_005flistTitle_005f0 = (cn.com.sinosoft.frame.taglib.logic.ListTitleTag) _005fjspx_005ftagPool_005fframeApp_005flistTitle_005fnobody.get(cn.com.sinosoft.frame.taglib.logic.ListTitleTag.class);
    _jspx_th_frameApp_005flistTitle_005f0.setPageContext(_jspx_page_context);
    _jspx_th_frameApp_005flistTitle_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    int _jspx_eval_frameApp_005flistTitle_005f0 = _jspx_th_frameApp_005flistTitle_005f0.doStartTag();
    if (_jspx_th_frameApp_005flistTitle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeApp_005flistTitle_005fnobody.reuse(_jspx_th_frameApp_005flistTitle_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fframeApp_005flistTitle_005fnobody.reuse(_jspx_th_frameApp_005flistTitle_005f0);
    return false;
  }

  private boolean _jspx_meth_frameApp_005flistValue_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_frameApp_005fframeIterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameApp:listValue
    cn.com.sinosoft.frame.taglib.logic.ListValueTag _jspx_th_frameApp_005flistValue_005f0 = (cn.com.sinosoft.frame.taglib.logic.ListValueTag) _005fjspx_005ftagPool_005fframeApp_005flistValue_005fnobody.get(cn.com.sinosoft.frame.taglib.logic.ListValueTag.class);
    _jspx_th_frameApp_005flistValue_005f0.setPageContext(_jspx_page_context);
    _jspx_th_frameApp_005flistValue_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_frameApp_005fframeIterate_005f0);
    int _jspx_eval_frameApp_005flistValue_005f0 = _jspx_th_frameApp_005flistValue_005f0.doStartTag();
    if (_jspx_th_frameApp_005flistValue_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeApp_005flistValue_005fnobody.reuse(_jspx_th_frameApp_005flistValue_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fframeApp_005flistValue_005fnobody.reuse(_jspx_th_frameApp_005flistValue_005f0);
    return false;
  }

  private boolean _jspx_meth_frameApp_005fpagination_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameApp:pagination
    cn.com.sinosoft.frame.taglib.logic.PaginationLinkTag _jspx_th_frameApp_005fpagination_005f0 = (cn.com.sinosoft.frame.taglib.logic.PaginationLinkTag) _005fjspx_005ftagPool_005fframeApp_005fpagination_0026_005fforward_005fformName_005fnobody.get(cn.com.sinosoft.frame.taglib.logic.PaginationLinkTag.class);
    _jspx_th_frameApp_005fpagination_005f0.setPageContext(_jspx_page_context);
    _jspx_th_frameApp_005fpagination_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/customerrelease.jsp(199,10) name = forward type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameApp_005fpagination_005f0.setForward("b_01_FY0000");
    // /aids/birth/customer/customerrelease.jsp(199,10) name = formName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameApp_005fpagination_005f0.setFormName("codeToExcelForm");
    int _jspx_eval_frameApp_005fpagination_005f0 = _jspx_th_frameApp_005fpagination_005f0.doStartTag();
    if (_jspx_th_frameApp_005fpagination_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeApp_005fpagination_0026_005fforward_005fformName_005fnobody.reuse(_jspx_th_frameApp_005fpagination_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fframeApp_005fpagination_0026_005fforward_005fformName_005fnobody.reuse(_jspx_th_frameApp_005fpagination_005f0);
    return false;
  }
}
