package org.apache.jsp.aids.birth.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cn.com.sinosoft.frame.utility.GetFieldValue;
import cn.com.sinosoft.frame.dao.ValueObject;

public final class edtcustomerrelease_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fonsubmit_005fmethod_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fframeApp_005ftoken_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fsize_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fframeHtml_005ftext_0026_005fproperty_005feditState_005faddState_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fframeHtml_005ftext_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fframeHtml_005ftimeCtl_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fframeHtml_005fdlgData_0026_005fjsVarName_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fframeHtml_005fmultiSelDlg_0026_005ftitle_005fproperty_005fjsVarName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005frows_005freadonly_005fproperty_005fcols_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fproperty_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fvalue_005fproperty_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005freadonly_005fproperty_005fcols_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fvalue_005fproperty_005fcode;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fonclick;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fonsubmit_005fmethod_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fframeApp_005ftoken_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fsize_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fframeHtml_005ftext_0026_005fproperty_005feditState_005faddState_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fframeHtml_005ftext_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fframeHtml_005ftimeCtl_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fframeHtml_005fdlgData_0026_005fjsVarName_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fframeHtml_005fmultiSelDlg_0026_005ftitle_005fproperty_005fjsVarName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005frows_005freadonly_005fproperty_005fcols_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fproperty_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fvalue_005fproperty_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005freadonly_005fproperty_005fcols_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fvalue_005fproperty_005fcode = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fonclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml.release();
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fonsubmit_005fmethod_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fframeApp_005ftoken_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fsize_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fframeHtml_005ftext_0026_005fproperty_005feditState_005faddState_005fnobody.release();
    _005fjspx_005ftagPool_005fframeHtml_005ftext_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fframeHtml_005ftimeCtl_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.release();
    _005fjspx_005ftagPool_005fframeHtml_005fdlgData_0026_005fjsVarName_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fframeHtml_005fmultiSelDlg_0026_005ftitle_005fproperty_005fjsVarName_005fnobody.release();
    _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005frows_005freadonly_005fproperty_005fcols_005fnobody.release();
    _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fproperty_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fvalue_005fproperty_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005freadonly_005fproperty_005fcols_005fnobody.release();
    _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fvalue_005fproperty_005fcode.release();
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fonclick.release();
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
     if (pageState==null){
	    pageState = "add";
     }
    request.setAttribute("pageState",pageState);
    String id =GetFieldValue.getFieldValue(pageContext,"ID"); 


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
          out.write("\r\n");
          out.write("<meta http-equiv=\"Pragma\" content=\"no-cache\">\r\n");
          out.write("<meta http-equiv=\"Cache-Control\" content=\"no-cache\">\r\n");
          out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
          out.write("<LINK href=\"");
          out.print(request.getContextPath());
          out.write("/css/editCss.css\" type=text/css rel=stylesheet>\r\n");
          out.write("<LINK href=\"");
          out.print(request.getContextPath());
          out.write("/css/default_style.css\" type=text/css rel=stylesheet>\r\n");
          out.write("<script language=\"javascript\" src=\"");
          out.print(request.getContextPath());
          out.write("/js/Common.js\"></script>\r\n");
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
          out.write("/aids/js/addSubHelp.js\"></script>\r\n");
          out.write("\r\n");
          out.write("<script language=\"javascript\">   \r\n");
          out.write("\tfunction funcReturn(formObj){\r\n");
          out.write("\t   formObj.action=\"");
          out.print(request.getContextPath());
          out.write("/aids/customerreleaseAction.do?pageState=add\";\r\n");
          out.write("\t   formObj.busiId.value=\"CUSTOMER_SUPPORT_RELEASE_LOG\";\r\n");
          out.write("\t   formObj.act.value=\"reQuery\";\r\n");
          out.write("\t   formObj.act.value=\"queryParent\";\r\n");
          out.write("\t   formObj.submit();\r\n");
          out.write("\t}\r\n");
          out.write("\r\n");
          out.write("\tfunction checkForm(obj){\r\n");
          out.write("\t\ttry{\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_logic_005fequal_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\t\r\n");
          out.write("\t\t\treturn checkAll();\r\n");
          out.write("\r\n");
          out.write("\t\t}catch(e){\r\n");
          out.write("\t\t\treturn false;\r\n");
          out.write("\t\t}\r\n");
          out.write("\t}\r\n");
          out.write("\r\n");
          out.write("\t function replaceKey(){\r\n");
          out.write("\t\t   \tif(event.keyCode==13)\r\n");
          out.write("\t\t   \t\tif(event.srcElement.type){\r\n");
          out.write("\t\t   \t\t\tif(event.srcElement.type!='submit' && event.srcElement.type!='hidden' &&  event.srcElement.style.display!='none')\r\n");
          out.write("\t\t   \t\t\t\tevent.keyCode=9;\r\n");
          out.write("\t\t   \t\t}\r\n");
          out.write("\t\t   \telse event.keyCode=9;\r\n");
          out.write("\t   \t}\r\n");
          out.write("\r\n");
          out.write("\t \r\n");
          out.write("\t //信息中心应用技术室-意见选择否，跳出理由输入框\r\n");
          out.write("\t function  openreason(obj){\r\n");
          out.write("\t\t var reason=obj.value;\r\n");
          out.write("\t\t if(reason=='71'){\r\n");
          out.write("\t\t\t document.all('APPLICATION_REASON').style.display=\"block\";\r\n");
          out.write("\t\t }else{\r\n");
          out.write("\t\t\t \r\n");
          out.write("\t\t\t document.all('APPLICATION_REASON').style.display=\"none\";\r\n");
          out.write("\t\t }\r\n");
          out.write("\t\t \r\n");
          out.write("\t }\r\n");
          out.write("\t \r\n");
          out.write("\t //信息中心-意见选择否，跳出理由输入框\r\n");
          out.write("\r\n");
          out.write(" function  openreason(obj){\r\n");
          out.write("\t\t var reason=obj.value;\r\n");
          out.write("\t\t if(reason=='71'){\r\n");
          out.write("\t\t\t document.all('APPLICATION_REASON').style.display=\"block\";\r\n");
          out.write("\t\t }else{\r\n");
          out.write("\t\t\t \r\n");
          out.write("\t\t\t document.all('APPLICATION_REASON').style.display=\"none\";\r\n");
          out.write("\t\t }\r\n");
          out.write("\t\t \r\n");
          out.write("\t }\r\n");
          out.write("\r\n");
          out.write(" function addSubmit(obj){  \r\n");
          out.write("\t\tobj.form.action=\"");
          out.print(request.getContextPath());
          out.write("/aids/ratFileInfoEditAction.do\";\r\n");
          out.write("\t\tobj.form.act.value=\"addParentInput\";\t\r\n");
          out.write("\t\tdocument.all.busiId.value=\"CUSTOMER_SUPPORT_RELEASE_LOG\";\r\n");
          out.write("\t\tobj.form.submit();\r\n");
          out.write("}\r\n");
          out.write("\r\n");
          out.write("</script>\r\n");
          out.write("</head>\r\n");
          out.write("<body onkeydown=\"replaceKey()\">\r\n");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fonsubmit_005fmethod_005fenctype_005faction.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          // /aids/birth/customer/edtcustomerrelease.jsp(109,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fform_005f0.setAction("/edtcustomerreleaseAction.do");
          // /aids/birth/customer/edtcustomerrelease.jsp(109,0) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fform_005f0.setEnctype("multipart/form-data");
          // /aids/birth/customer/edtcustomerrelease.jsp(109,0) name = onsubmit type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fform_005f0.setOnsubmit("return checkForm(this)");
          // /aids/birth/customer/edtcustomerrelease.jsp(109,0) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_html_005fform_005f0.setMethod("post");
          int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
          if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("    ");
              if (_jspx_meth_html_005fhidden_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("    <input type=\"hidden\" name=\"key_ID\"/>   \r\n");
              out.write("    <input type=\"hidden\" name=\"busiId\" value=\"CUSTOMER_SUPPORT_RELEASE_LOG\">\r\n");
              out.write("    ");
if("add".equals(pageState)) {
              out.write("\r\n");
              out.write("   ");
              if (_jspx_meth_logic_005fequal_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("    ");
}else{ 
              out.write("\r\n");
              out.write("     ");
              if (_jspx_meth_logic_005fequal_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("    ");
} 
              out.write("\r\n");
              out.write("    ");
              if (_jspx_meth_html_005fhidden_005f3(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("     ");
if("add".equals(pageState)) {
              out.write("\r\n");
              out.write("<tr style=\"display:none\">\r\n");
              out.write("\t<td class=\"tb_title\" colspan=2>\r\n");
              out.write("\t    <input type=\"hidden\" name=\"isUpdateFile\" value=\"true\"/>\r\n");
              out.write("   \t\t ");
              if (_jspx_meth_logic_005fequal_005f3(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t</td>\r\n");
              out.write("\t</tr>\r\n");
              out.write("\t ");
}else{ 
              out.write("\r\n");
              out.write("\t <tr style=\"display:block\">\r\n");
              out.write("\t<td class=\"tb_title\" colspan=2>\r\n");
              out.write("\t    <input type=\"hidden\" name=\"isUpdateFile\" value=\"false\"/>\r\n");
              out.write("   \t\t ");
              if (_jspx_meth_logic_005fequal_005f4(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t</td>\r\n");
              out.write("\t</tr>\r\n");
              out.write("\t");
} 
              out.write("\r\n");
              out.write("\r\n");
              out.write("    <input type=\"hidden\" name=\"pageState\" value=\"");
              out.print(pageState);
              out.write("\"/>\r\n");
              out.write("    ");
              if (_jspx_meth_frameApp_005ftoken_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("    <p align=\"center\" class=\"tb_title\">\r\n");
              out.write("      <font size=\"4\" face=\"宋体\">中国疾病预防控制信息系统发布申请单</font></p>\r\n");
              out.write("       <table width=\"95%\" border=\"1\" cellspacing=\"1\" cellpadding=\"2\" class=\"tbMain\" > \r\n");
              out.write("       <tr>\r\n");
if("add".equals(pageState)) {
              out.write('\r');
              out.write('\n');
              if (_jspx_meth_logic_005fequal_005f5(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write('\r');
              out.write('\n');
              out.write('	');
}else{ 
              out.write("\r\n");
              out.write("\t\r\n");
              out.write("\t");
              if (_jspx_meth_logic_005fequal_005f6(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("\t");
}
              out.write("\r\n");
              out.write("\t  </tr>\r\n");
              out.write("\t  \r\n");
              out.write("\t   <tr bordercolor=\"#C9C9C9\" >\r\n");
              out.write("           <td class=\"td_name\" height=\"16\">文档编号</td>\r\n");
              out.write("           <td class=\"td_value\" height=\"16\" colspan='3'>\r\n");
              out.write("           \t ");
              if (_jspx_meth_frameHtml_005ftext_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write(' ');
if ("add".equals(pageState)){
              out.write("(保存后系统自动生成)");
}
              out.write("\r\n");
              out.write("\t\t   </td>\r\n");
              out.write("\t   </tr> \r\n");
              out.write("\t  \r\n");
              out.write("             <tr>\r\n");
              out.write("\t <td class=\"td_name\" height=\"16\">申请人</td>\r\n");
              out.write("\t <td class=\"td_value\" height=\"16\" >\r\n");
              out.write("\t ");
              if (_jspx_meth_frameHtml_005ftext_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t </td>\r\n");
              out.write("\r\n");
              out.write("\t <td class=\"td_name\" height=\"16\">发布服务器</td>\r\n");
              out.write("\t <td class=\"td_value\" height=\"16\" >\r\n");
              out.write("\t ");
              if (_jspx_meth_frameHtml_005ftext_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t </td>\r\n");
              out.write("\t </tr>\r\n");
              out.write("        <tr>\r\n");
              out.write("\t<td class=\"td_name\" height=\"16\" >申请发布开始时间</td>\r\n");
              out.write("           <td class=\"td_value\" height=\"16\" >\r\n");
              out.write("           \t ");
              if (_jspx_meth_frameHtml_005ftimeCtl_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("           </td>\r\n");
              out.write("           \r\n");
              out.write("          <td class=\"td_name\" height=\"16\">估计发布结束时间</td>\r\n");
              out.write("\t <td class=\"td_value\" height=\"16\" >\r\n");
              out.write("\t ");
              if (_jspx_meth_frameHtml_005ftimeCtl_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t </td> \r\n");
              out.write("\t </tr>   \r\n");
              out.write("           <tr>\r\n");
              out.write(" <td class=\"td_name\" height=\"16\" >发布人</td>\r\n");
              out.write("           <td class=\"td_value\" height=\"16\" >\r\n");
              out.write("           \t ");
              if (_jspx_meth_frameHtml_005ftext_005f3(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("           </td>\r\n");
              out.write("   <td class=\"td_name\" height=\"16\" >填表日期</td>\r\n");
              out.write("\t <td class=\"td_value\" height=\"16\" >\r\n");
              out.write("\t ");
              if (_jspx_meth_frameHtml_005fdateCtl_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t </td>\r\n");
              out.write("  \r\n");
              out.write("\t </tr>\r\n");
              out.write("\r\n");
              out.write("\t  <tr>\r\n");
              out.write("<td class=\"td_name\">发布的系统</td>\r\n");
              out.write("        <td class=\"td_value\" colspan=\"3\">\r\n");
              out.write("\t\t\t\r\n");
              out.write("           \t  ");
              if (_jspx_meth_frameHtml_005fdlgData_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t  ");
              if (_jspx_meth_frameHtml_005fmultiSelDlg_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("</span>\t\r\n");
              out.write("\r\n");
              out.write("        </td>  \r\n");
              out.write("\t  </tr>\r\n");
              out.write("\t  <tr>\r\n");
              out.write("\t    <td class=\"td_name\" height=\"16\" >申请发布的内容</td>\r\n");
              out.write("           <td class=\"td_value\" height=\"16\" >\r\n");
              out.write("           \t ");
              if (_jspx_meth_frameHtml_005ftextarea_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("           </td>\r\n");
              out.write("           \r\n");
              out.write("           <td class=\"td_name\" height=\"16\" >影响范围/风险说明</td>\r\n");
              out.write("           <td class=\"td_value\" height=\"16\" >\r\n");
              out.write("           \t ");
              if (_jspx_meth_frameHtml_005ftextarea_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("           </td>\r\n");
              out.write("\t  </tr>\r\n");
              out.write("\t <!-- 刚加的 -->\r\n");
              out.write("\t  <tr>\r\n");
              out.write("\t   <td class=\"td_name\" height=\"16\" >是否系统服务中断</td>\r\n");
              out.write("           <td class=\"td_value\" height=\"16\" >\r\n");
              out.write("           \t ");
              if (_jspx_meth_frameHtml_005fradio_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("           </td>\r\n");
              out.write("\t  \t  ");

			String value1="display:none";
			
			if ("add".equals(pageState)) {
			
				String reason = (String) cn.com.sinosoft.frame.utility.GetFieldValue.lookup(pageContext,"MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(APPLICATION)",null);
				if ("71".equals(reason)) { //信息中心应用技术室
						value1="display:block";
				
			}
			}
		
              out.write("\r\n");
              out.write("\t   <td class=\"td_name\" height=\"16\" >是否设备网络资源调整</td>\r\n");
              out.write("           <td class=\"td_value\" height=\"16\" >\r\n");
              out.write("           \t ");
              if (_jspx_meth_frameHtml_005fradio_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("           </td>\r\n");
              out.write("\t  </tr>\r\n");
              out.write("\t  </table>\r\n");
              out.write("\r\n");
              out.write("\t    <p align=\"center\" class=\"tb_title\">\r\n");
              out.write("      <font size=\"4\" face=\"宋体\">业务科室测试意见</font></p>\r\n");
              out.write("       <table width=\"95%\" border=\"1\" cellspacing=\"1\" cellpadding=\"2\" class=\"tbMain\" >  \r\n");
              out.write("\t   <tr >\r\n");
              out.write("\t <td  align=\"center\"> 建议</td>\r\n");
              out.write("\t <td height=\"30\"  colspan='3'>\r\n");
              out.write("\t  ");
              if (_jspx_meth_frameHtml_005fradio_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("<font color=\"red\">(若不同意，请填写理由)</font>\r\n");
              out.write("\t  ");
              if (_jspx_meth_frameHtml_005ftextarea_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("</td>\r\n");
              out.write(" </tr>\r\n");
              out.write("  <td class=\"td_name\" height=\"16\" >签字</td>\r\n");
              out.write("           <td class=\"td_value\" height=\"16\" >\r\n");
              out.write("\t\t\t\t");
              if (_jspx_meth_frameHtml_005fcodeSelect_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("           </td>\r\n");
              out.write("     \r\n");
              out.write("  <td class=\"td_name\" height=\"16\" >签字时间</td>\r\n");
              out.write("           <td class=\"td_value\" height=\"16\" >\r\n");
              out.write("           \t ");
              if (_jspx_meth_frameHtml_005fdateCtl_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("           </td>\r\n");
              out.write("\t  </tr>  \r\n");
              out.write("\t  </table>\r\n");
              out.write("\t  <td></td>\r\n");
              out.write("\t  <td></td>\r\n");
              out.write("\t  <p align=\"center\" class=\"tb_title\">\r\n");
              out.write("      <font size=\"4\" face=\"宋体\">信息中心系统运维和管理科室意见</font></p>\r\n");
              out.write("       <table width=\"95%\" border=\"1\" cellspacing=\"1\" cellpadding=\"2\" class=\"tbMain\" >    \r\n");
              out.write("\t  <tr >\r\n");
              out.write("\t <td  align=\"center\"> 建议</td>\r\n");
              out.write("\t <td height=\"30\" colspan='3'>\r\n");
              out.write("\t  ");
              if (_jspx_meth_frameHtml_005fradio_005f3(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("<font color=\"red\">(若不同意，请填写理由)</font>\r\n");
              out.write("\r\n");
              out.write("\t  ");
              if (_jspx_meth_frameHtml_005ftextarea_005f3(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("</td>\r\n");
              out.write("\t </tr> \r\n");
              out.write("\t <tr>  \r\n");
              out.write("\t   <td class=\"td_name\" height=\"16\" >签字</td>\r\n");
              out.write("           <td class=\"td_value\" height=\"16\" >\r\n");
              out.write("           \t");
              if (_jspx_meth_frameHtml_005fcodeSelect_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("           </td>\r\n");
              out.write("        \r\n");
              out.write("  <td class=\"td_name\" height=\"16\" >签字时间</td>\r\n");
              out.write("           <td class=\"td_value\" height=\"16\" >\r\n");
              out.write("           \t ");
              if (_jspx_meth_frameHtml_005fdateCtl_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("           </td>\r\n");
              out.write("\t  </tr>\r\n");
              out.write("\t  </table>\r\n");
              out.write("\t   <p align=\"center\" class=\"tb_title\">\r\n");
              out.write("      <font size=\"4\" face=\"宋体\">信息中心数据中心与安全管理部门意见</font></p>\r\n");
              out.write("       <table width=\"95%\" border=\"1\" cellspacing=\"1\" cellpadding=\"2\" class=\"tbMain\" >    \r\n");
              out.write("\t    <tr >\r\n");
              out.write("\t <td  align=\"center\">建议</td>\r\n");
              out.write("\t <td height=\"30\" colspan='3'>\r\n");
              out.write("\t  ");
              if (_jspx_meth_frameHtml_005fradio_005f4(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("<font color=\"red\">(若不同意，请填写理由)</font>\r\n");
              out.write("\r\n");
              out.write("\t  ");
              if (_jspx_meth_frameHtml_005ftextarea_005f4(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("</td>\r\n");
              out.write("\t </tr> \r\n");
              out.write("\t <tr>  \r\n");
              out.write("\t   <td class=\"td_name\" height=\"16\" >签字</td>\r\n");
              out.write("           <td class=\"td_value\" height=\"16\" >\r\n");
              out.write("            \t");
              if (_jspx_meth_frameHtml_005fcodeSelect_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("           </td>\r\n");
              out.write("        \r\n");
              out.write("  <td class=\"td_name\" height=\"16\" >签字时间</td>\r\n");
              out.write("           <td class=\"td_value\" height=\"16\" >\r\n");
              out.write("           \t ");
              if (_jspx_meth_frameHtml_005fdateCtl_005f3(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("           </td>\r\n");
              out.write("\t  </tr>\r\n");
              out.write("\t  </table>\r\n");
              out.write("\t   <p align=\"center\" class=\"tb_title\">\r\n");
              out.write("      <font size=\"4\" face=\"宋体\">信息中心系统运维和管理部门分管主任意见</font></p>\r\n");
              out.write("       <table width=\"95%\" border=\"1\" cellspacing=\"1\" cellpadding=\"2\" class=\"tbMain\" >    \r\n");
              out.write("\t      <tr >\r\n");
              out.write("\t <td  align=\"center\">建议</td>\r\n");
              out.write("\t <td height=\"30\" colspan='3'>\r\n");
              out.write("\t  ");
              if (_jspx_meth_frameHtml_005fradio_005f5(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("<font color=\"red\">(若不同意，请填写理由)</font>\r\n");
              out.write("\r\n");
              out.write("\t  ");
              if (_jspx_meth_frameHtml_005ftextarea_005f5(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("</td>\r\n");
              out.write("\t </tr> \r\n");
              out.write("\t <tr>  \r\n");
              out.write("\t   <td class=\"td_name\" height=\"16\" >签字</td>\r\n");
              out.write("           <td class=\"td_value\" height=\"16\" >\r\n");
              out.write("           \t");
              if (_jspx_meth_frameHtml_005fcodeSelect_005f3(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("           </td>\r\n");
              out.write("        \r\n");
              out.write("  <td class=\"td_name\" height=\"16\" >签字时间</td>\r\n");
              out.write("           <td class=\"td_value\" height=\"16\" >\r\n");
              out.write("           \t ");
              if (_jspx_meth_frameHtml_005fdateCtl_005f4(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("           </td>\r\n");
              out.write("\t  </tr>\r\n");
              out.write("\t  </table>\r\n");
              out.write(" <p align=\"center\" class=\"tb_title\">\r\n");
              out.write("      <font size=\"4\" face=\"宋体\">信息中心主管主任意见</font></p>\r\n");
              out.write("       <table width=\"95%\" border=\"1\" cellspacing=\"1\" cellpadding=\"2\" class=\"tbMain\" >    \r\n");
              out.write("\t      <tr >\r\n");
              out.write("\t <td  align=\"center\">建议</td>\r\n");
              out.write("\t <td height=\"30\" colspan='3'>\r\n");
              out.write("\t  ");
              if (_jspx_meth_frameHtml_005fradio_005f6(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("<font color=\"red\">(若不同意，请填写理由)</font>\r\n");
              out.write("\r\n");
              out.write("\t  ");
              if (_jspx_meth_frameHtml_005ftextarea_005f6(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("</td>\r\n");
              out.write("\t </tr> \r\n");
              out.write("\t <tr>  \r\n");
              out.write("\t   <td class=\"td_name\" height=\"16\" >签字</td>\r\n");
              out.write("           <td class=\"td_value\" height=\"16\" >\r\n");
              out.write("           ");
              if (_jspx_meth_frameHtml_005fcodeSelect_005f4(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("           \t \r\n");
              out.write("           </td>\r\n");
              out.write("        \r\n");
              out.write("  <td class=\"td_name\" height=\"16\" >签字时间</td>\r\n");
              out.write("           <td class=\"td_value\" height=\"16\" >\r\n");
              out.write("           \t ");
              if (_jspx_meth_frameHtml_005fdateCtl_005f5(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("           </td>\r\n");
              out.write("\t  </tr>\r\n");
              out.write("\t\r\n");
              out.write("\t  </table>\r\n");
              out.write("    \t\r\n");
              out.write("    \t<table width=\"95%\" align=\"center\">\r\n");
              out.write("\t  \t    <tr align=\"center\">\r\n");
              out.write("\t    \t   <td align=\"center\">\r\n");
              out.write("\t             ");
              if (_jspx_meth_logic_005fequal_005f7(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t             ");
              if (_jspx_meth_logic_005fequal_005f8(_jspx_th_html_005fform_005f0, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("\t\t     \t <input type=button value=\"返回\" onclick=\"funcReturn(this.form)\">                \r\n");
              out.write("\t           </td>\r\n");
              out.write("\t        </tr>\r\n");
              out.write("\t    </table>\r\n");
              int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fform_0026_005fonsubmit_005fmethod_005fenctype_005faction.reuse(_jspx_th_html_005fform_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fform_0026_005fonsubmit_005fmethod_005fenctype_005faction.reuse(_jspx_th_html_005fform_005f0);
          out.write("\r\n");
          out.write("</body>\r\n");
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
      out.write('\r');
      out.write('\n');
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

  private boolean _jspx_meth_logic_005fequal_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(45,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f0.setName("edtcustomerreleaseForm");
    // /aids/birth/customer/edtcustomerrelease.jsp(45,3) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f0.setProperty("act");
    // /aids/birth/customer/edtcustomerrelease.jsp(45,3) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f0.setValue("addParentInput");
    int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
    if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\tvar file = document.all[\"blobFile\"].value;\r\n");
        out.write("\t\t\tif(file==null || file==\"\"){\r\n");
        out.write("\t\t\t\talert(\"请选择一个图片上传!\");\r\n");
        out.write("\t\t\t\treturn false;\r\n");
        out.write("\t\t\t}\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\tvar pos = trim(file).lastIndexOf(\"\\\\\");\r\n");
        out.write("\t\t\tdocument.all[\"MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(FILENAME)\"].value = trim(file).substring(pos+1);\r\n");
        out.write("\t\t\tisNotEmpty(document.all[\"MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(FILENAME)\"],\"上传文件名不能为空\");\r\n");
        out.write("\t\t\tcheckLength(document.all[\"MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(FILENAME)\"].value,0,100,\"上传文件名过长\");\t\t\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
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
    // /aids/birth/customer/edtcustomerrelease.jsp(110,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f0.setProperty("act");
    int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
    if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(114,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f1.setName("edtcustomerreleaseForm");
    // /aids/birth/customer/edtcustomerrelease.jsp(114,3) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f1.setProperty("act");
    // /aids/birth/customer/edtcustomerrelease.jsp(114,3) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f1.setValue("addParentInput");
    int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
    if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    ");
        if (_jspx_meth_html_005fhidden_005f1(_jspx_th_logic_005fequal_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
    // /aids/birth/customer/edtcustomerrelease.jsp(115,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f1.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(FILENAME)");
    int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
    if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(118,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f2.setName("edtcustomerreleaseForm");
    // /aids/birth/customer/edtcustomerrelease.jsp(118,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f2.setProperty("act");
    // /aids/birth/customer/edtcustomerrelease.jsp(118,5) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f2.setValue("editParentInput");
    int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
    if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    ");
        if (_jspx_meth_html_005fhidden_005f2(_jspx_th_logic_005fequal_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
    // /aids/birth/customer/edtcustomerrelease.jsp(119,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f2.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(FILENAME)");
    int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
    if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(122,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f3.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(ID)");
    int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
    if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(127,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f3.setName("edtcustomerreleaseForm");
    // /aids/birth/customer/edtcustomerrelease.jsp(127,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f3.setProperty("act");
    // /aids/birth/customer/edtcustomerrelease.jsp(127,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f3.setValue("addParentInput");
    int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
    if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t    \t<script language=\"javascript\" >\r\n");
        out.write("\t    \tdocument.all.isUpdateFile.value=\"true\";\r\n");
        out.write("\t    \t</script>\r\n");
        out.write("   \t\t ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(138,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f4.setName("edtcustomerreleaseForm");
    // /aids/birth/customer/edtcustomerrelease.jsp(138,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f4.setProperty("act");
    // /aids/birth/customer/edtcustomerrelease.jsp(138,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f4.setValue("editParentInput");
    int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
    if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t    \t<script language=\"javascript\" >\r\n");
        out.write("\t    \tdocument.all.isUpdateFile.value=\"true\";\r\n");
        out.write("\t    \t\r\n");
        out.write("\t    \t</script>\r\n");
        out.write("   \t\t ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
    return false;
  }

  private boolean _jspx_meth_frameApp_005ftoken_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameApp:token
    cn.com.sinosoft.frame.taglib.html.TokenTag _jspx_th_frameApp_005ftoken_005f0 = (cn.com.sinosoft.frame.taglib.html.TokenTag) _005fjspx_005ftagPool_005fframeApp_005ftoken_005fnobody.get(cn.com.sinosoft.frame.taglib.html.TokenTag.class);
    _jspx_th_frameApp_005ftoken_005f0.setPageContext(_jspx_page_context);
    _jspx_th_frameApp_005ftoken_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    int _jspx_eval_frameApp_005ftoken_005f0 = _jspx_th_frameApp_005ftoken_005f0.doStartTag();
    if (_jspx_th_frameApp_005ftoken_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeApp_005ftoken_005fnobody.reuse(_jspx_th_frameApp_005ftoken_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fframeApp_005ftoken_005fnobody.reuse(_jspx_th_frameApp_005ftoken_005f0);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(155,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f5.setName("edtcustomerreleaseForm");
    // /aids/birth/customer/edtcustomerrelease.jsp(155,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f5.setProperty("act");
    // /aids/birth/customer/edtcustomerrelease.jsp(155,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f5.setValue("addParentInput");
    int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
    if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("   <tr >\r\n");
        out.write("    \t<td class=\"td_name\" colspan=1>上传图片:</td>\r\n");
        out.write("    \t<td >\r\n");
        out.write("    \t ");
        if (_jspx_meth_html_005ffile_005f0(_jspx_th_logic_005fequal_005f5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    \t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
    return false;
  }

  private boolean _jspx_meth_html_005ffile_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:file
    org.apache.struts.taglib.html.FileTag _jspx_th_html_005ffile_005f0 = (org.apache.struts.taglib.html.FileTag) _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.FileTag.class);
    _jspx_th_html_005ffile_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ffile_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
    // /aids/birth/customer/edtcustomerrelease.jsp(159,6) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ffile_005f0.setProperty("blobFile");
    // /aids/birth/customer/edtcustomerrelease.jsp(159,6) name = size type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ffile_005f0.setSize("50");
    int _jspx_eval_html_005ffile_005f0 = _jspx_th_html_005ffile_005f0.doStartTag();
    if (_jspx_th_html_005ffile_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ffile_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ffile_005f0);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(165,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f6.setName("edtcustomerreleaseForm");
    // /aids/birth/customer/edtcustomerrelease.jsp(165,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f6.setProperty("act");
    // /aids/birth/customer/edtcustomerrelease.jsp(165,1) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f6.setValue("editParentInput");
    int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
    if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("   <tr >\r\n");
        out.write("    \t<td class=\"td_name\" colspan=1>上传图片:</td>\r\n");
        out.write("    \t<td >\r\n");
        out.write("    \t ");
        if (_jspx_meth_html_005ffile_005f1(_jspx_th_logic_005fequal_005f6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    \t</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
    return false;
  }

  private boolean _jspx_meth_html_005ffile_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:file
    org.apache.struts.taglib.html.FileTag _jspx_th_html_005ffile_005f1 = (org.apache.struts.taglib.html.FileTag) _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.FileTag.class);
    _jspx_th_html_005ffile_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005ffile_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
    // /aids/birth/customer/edtcustomerrelease.jsp(169,6) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ffile_005f1.setProperty("blobFile");
    // /aids/birth/customer/edtcustomerrelease.jsp(169,6) name = size type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ffile_005f1.setSize("50");
    int _jspx_eval_html_005ffile_005f1 = _jspx_th_html_005ffile_005f1.doStartTag();
    if (_jspx_th_html_005ffile_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ffile_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ffile_005f1);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:text
    cn.com.sinosoft.frame.taglib.html.FrameTextTag _jspx_th_frameHtml_005ftext_005f0 = (cn.com.sinosoft.frame.taglib.html.FrameTextTag) _005fjspx_005ftagPool_005fframeHtml_005ftext_0026_005fproperty_005feditState_005faddState_005fnobody.get(cn.com.sinosoft.frame.taglib.html.FrameTextTag.class);
    _jspx_th_frameHtml_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(179,13) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftext_005f0.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(SERIAL)");
    // /aids/birth/customer/edtcustomerrelease.jsp(179,13) name = addState type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftext_005f0.setAddState("view");
    // /aids/birth/customer/edtcustomerrelease.jsp(179,13) name = editState type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftext_005f0.setEditState("view");
    int _jspx_eval_frameHtml_005ftext_005f0 = _jspx_th_frameHtml_005ftext_005f0.doStartTag();
    if (_jspx_th_frameHtml_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005ftext_0026_005fproperty_005feditState_005faddState_005fnobody.reuse(_jspx_th_frameHtml_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005ftext_0026_005fproperty_005feditState_005faddState_005fnobody.reuse(_jspx_th_frameHtml_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005ftext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:text
    cn.com.sinosoft.frame.taglib.html.FrameTextTag _jspx_th_frameHtml_005ftext_005f1 = (cn.com.sinosoft.frame.taglib.html.FrameTextTag) _005fjspx_005ftagPool_005fframeHtml_005ftext_0026_005fproperty_005fnobody.get(cn.com.sinosoft.frame.taglib.html.FrameTextTag.class);
    _jspx_th_frameHtml_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(186,2) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftext_005f1.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(INQUIRY_NAME)");
    int _jspx_eval_frameHtml_005ftext_005f1 = _jspx_th_frameHtml_005ftext_005f1.doStartTag();
    if (_jspx_th_frameHtml_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_frameHtml_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_frameHtml_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005ftext_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:text
    cn.com.sinosoft.frame.taglib.html.FrameTextTag _jspx_th_frameHtml_005ftext_005f2 = (cn.com.sinosoft.frame.taglib.html.FrameTextTag) _005fjspx_005ftagPool_005fframeHtml_005ftext_0026_005fproperty_005fnobody.get(cn.com.sinosoft.frame.taglib.html.FrameTextTag.class);
    _jspx_th_frameHtml_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(191,2) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftext_005f2.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(APPLY_SERVER)");
    int _jspx_eval_frameHtml_005ftext_005f2 = _jspx_th_frameHtml_005ftext_005f2.doStartTag();
    if (_jspx_th_frameHtml_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_frameHtml_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_frameHtml_005ftext_005f2);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005ftimeCtl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:timeCtl
    cn.com.sinosoft.frame.taglib.html.TimeCtlTag _jspx_th_frameHtml_005ftimeCtl_005f0 = (cn.com.sinosoft.frame.taglib.html.TimeCtlTag) _005fjspx_005ftagPool_005fframeHtml_005ftimeCtl_0026_005fproperty_005fnobody.get(cn.com.sinosoft.frame.taglib.html.TimeCtlTag.class);
    _jspx_th_frameHtml_005ftimeCtl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005ftimeCtl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(197,13) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftimeCtl_005f0.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(APPLY_START_TIME)");
    int _jspx_eval_frameHtml_005ftimeCtl_005f0 = _jspx_th_frameHtml_005ftimeCtl_005f0.doStartTag();
    if (_jspx_th_frameHtml_005ftimeCtl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005ftimeCtl_0026_005fproperty_005fnobody.reuse(_jspx_th_frameHtml_005ftimeCtl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005ftimeCtl_0026_005fproperty_005fnobody.reuse(_jspx_th_frameHtml_005ftimeCtl_005f0);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005ftimeCtl_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:timeCtl
    cn.com.sinosoft.frame.taglib.html.TimeCtlTag _jspx_th_frameHtml_005ftimeCtl_005f1 = (cn.com.sinosoft.frame.taglib.html.TimeCtlTag) _005fjspx_005ftagPool_005fframeHtml_005ftimeCtl_0026_005fproperty_005fnobody.get(cn.com.sinosoft.frame.taglib.html.TimeCtlTag.class);
    _jspx_th_frameHtml_005ftimeCtl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005ftimeCtl_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(202,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftimeCtl_005f1.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(APPLY_END_TIME)");
    int _jspx_eval_frameHtml_005ftimeCtl_005f1 = _jspx_th_frameHtml_005ftimeCtl_005f1.doStartTag();
    if (_jspx_th_frameHtml_005ftimeCtl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005ftimeCtl_0026_005fproperty_005fnobody.reuse(_jspx_th_frameHtml_005ftimeCtl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005ftimeCtl_0026_005fproperty_005fnobody.reuse(_jspx_th_frameHtml_005ftimeCtl_005f1);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005ftext_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:text
    cn.com.sinosoft.frame.taglib.html.FrameTextTag _jspx_th_frameHtml_005ftext_005f3 = (cn.com.sinosoft.frame.taglib.html.FrameTextTag) _005fjspx_005ftagPool_005fframeHtml_005ftext_0026_005fproperty_005fnobody.get(cn.com.sinosoft.frame.taglib.html.FrameTextTag.class);
    _jspx_th_frameHtml_005ftext_005f3.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(208,13) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftext_005f3.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(RELEASE_NAME)");
    int _jspx_eval_frameHtml_005ftext_005f3 = _jspx_th_frameHtml_005ftext_005f3.doStartTag();
    if (_jspx_th_frameHtml_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_frameHtml_005ftext_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_frameHtml_005ftext_005f3);
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
    // /aids/birth/customer/edtcustomerrelease.jsp(212,2) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fdateCtl_005f0.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(INQUIRY_DATE)");
    // /aids/birth/customer/edtcustomerrelease.jsp(212,2) name = init type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fdateCtl_005f0.setInit(true);
    int _jspx_eval_frameHtml_005fdateCtl_005f0 = _jspx_th_frameHtml_005fdateCtl_005f0.doStartTag();
    if (_jspx_th_frameHtml_005fdateCtl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.reuse(_jspx_th_frameHtml_005fdateCtl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.reuse(_jspx_th_frameHtml_005fdateCtl_005f0);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005fdlgData_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:dlgData
    cn.com.sinosoft.frame.taglib.html.FrameDlgDataTag _jspx_th_frameHtml_005fdlgData_005f0 = (cn.com.sinosoft.frame.taglib.html.FrameDlgDataTag) _005fjspx_005ftagPool_005fframeHtml_005fdlgData_0026_005fjsVarName_005fcode_005fnobody.get(cn.com.sinosoft.frame.taglib.html.FrameDlgDataTag.class);
    _jspx_th_frameHtml_005fdlgData_005f0.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fdlgData_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(221,14) name = code type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fdlgData_005f0.setCode("SYSTEM");
    // /aids/birth/customer/edtcustomerrelease.jsp(221,14) name = jsVarName type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fdlgData_005f0.setJsVarName("dlgDataControl");
    int _jspx_eval_frameHtml_005fdlgData_005f0 = _jspx_th_frameHtml_005fdlgData_005f0.doStartTag();
    if (_jspx_th_frameHtml_005fdlgData_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fdlgData_0026_005fjsVarName_005fcode_005fnobody.reuse(_jspx_th_frameHtml_005fdlgData_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fdlgData_0026_005fjsVarName_005fcode_005fnobody.reuse(_jspx_th_frameHtml_005fdlgData_005f0);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005fmultiSelDlg_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:multiSelDlg
    cn.com.sinosoft.frame.taglib.html.MultiSelDlgTag _jspx_th_frameHtml_005fmultiSelDlg_005f0 = (cn.com.sinosoft.frame.taglib.html.MultiSelDlgTag) _005fjspx_005ftagPool_005fframeHtml_005fmultiSelDlg_0026_005ftitle_005fproperty_005fjsVarName_005fnobody.get(cn.com.sinosoft.frame.taglib.html.MultiSelDlgTag.class);
    _jspx_th_frameHtml_005fmultiSelDlg_005f0.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fmultiSelDlg_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(222,5) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fmultiSelDlg_005f0.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(SYSTEM1)");
    // /aids/birth/customer/edtcustomerrelease.jsp(222,5) name = jsVarName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fmultiSelDlg_005f0.setJsVarName("dlgDataControl");
    // /aids/birth/customer/edtcustomerrelease.jsp(222,5) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fmultiSelDlg_005f0.setTitle("系统");
    int _jspx_eval_frameHtml_005fmultiSelDlg_005f0 = _jspx_th_frameHtml_005fmultiSelDlg_005f0.doStartTag();
    if (_jspx_th_frameHtml_005fmultiSelDlg_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fmultiSelDlg_0026_005ftitle_005fproperty_005fjsVarName_005fnobody.reuse(_jspx_th_frameHtml_005fmultiSelDlg_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fmultiSelDlg_0026_005ftitle_005fproperty_005fjsVarName_005fnobody.reuse(_jspx_th_frameHtml_005fmultiSelDlg_005f0);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:textarea
    cn.com.sinosoft.frame.taglib.html.FrameTextareaTag _jspx_th_frameHtml_005ftextarea_005f0 = (cn.com.sinosoft.frame.taglib.html.FrameTextareaTag) _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005frows_005freadonly_005fproperty_005fcols_005fnobody.get(cn.com.sinosoft.frame.taglib.html.FrameTextareaTag.class);
    _jspx_th_frameHtml_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(229,13) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f0.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(RELEASE_CONTENT)");
    // /aids/birth/customer/edtcustomerrelease.jsp(229,13) name = rows type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f0.setRows("5");
    // /aids/birth/customer/edtcustomerrelease.jsp(229,13) name = cols type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f0.setCols("40");
    // /aids/birth/customer/edtcustomerrelease.jsp(229,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f0.setValue("");
    // /aids/birth/customer/edtcustomerrelease.jsp(229,13) name = readonly type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f0.setReadonly(false);
    int _jspx_eval_frameHtml_005ftextarea_005f0 = _jspx_th_frameHtml_005ftextarea_005f0.doStartTag();
    if (_jspx_th_frameHtml_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005frows_005freadonly_005fproperty_005fcols_005fnobody.reuse(_jspx_th_frameHtml_005ftextarea_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005frows_005freadonly_005fproperty_005fcols_005fnobody.reuse(_jspx_th_frameHtml_005ftextarea_005f0);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005ftextarea_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:textarea
    cn.com.sinosoft.frame.taglib.html.FrameTextareaTag _jspx_th_frameHtml_005ftextarea_005f1 = (cn.com.sinosoft.frame.taglib.html.FrameTextareaTag) _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005frows_005freadonly_005fproperty_005fcols_005fnobody.get(cn.com.sinosoft.frame.taglib.html.FrameTextareaTag.class);
    _jspx_th_frameHtml_005ftextarea_005f1.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005ftextarea_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(234,13) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f1.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(SCOPE)");
    // /aids/birth/customer/edtcustomerrelease.jsp(234,13) name = rows type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f1.setRows("5");
    // /aids/birth/customer/edtcustomerrelease.jsp(234,13) name = cols type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f1.setCols("40");
    // /aids/birth/customer/edtcustomerrelease.jsp(234,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f1.setValue("");
    // /aids/birth/customer/edtcustomerrelease.jsp(234,13) name = readonly type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f1.setReadonly(false);
    int _jspx_eval_frameHtml_005ftextarea_005f1 = _jspx_th_frameHtml_005ftextarea_005f1.doStartTag();
    if (_jspx_th_frameHtml_005ftextarea_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005frows_005freadonly_005fproperty_005fcols_005fnobody.reuse(_jspx_th_frameHtml_005ftextarea_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005frows_005freadonly_005fproperty_005fcols_005fnobody.reuse(_jspx_th_frameHtml_005ftextarea_005f1);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005fradio_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:radio
    cn.com.sinosoft.frame.taglib.html.FrameRadioTag _jspx_th_frameHtml_005fradio_005f0 = (cn.com.sinosoft.frame.taglib.html.FrameRadioTag) _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fproperty_005fcode_005fnobody.get(cn.com.sinosoft.frame.taglib.html.FrameRadioTag.class);
    _jspx_th_frameHtml_005fradio_005f0.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fradio_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(241,13) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fradio_005f0.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(BREAK)");
    // /aids/birth/customer/edtcustomerrelease.jsp(241,13) name = code type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fradio_005f0.setCode("CUSAGRE");
    int _jspx_eval_frameHtml_005fradio_005f0 = _jspx_th_frameHtml_005fradio_005f0.doStartTag();
    if (_jspx_th_frameHtml_005fradio_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fproperty_005fcode_005fnobody.reuse(_jspx_th_frameHtml_005fradio_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fproperty_005fcode_005fnobody.reuse(_jspx_th_frameHtml_005fradio_005f0);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005fradio_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:radio
    cn.com.sinosoft.frame.taglib.html.FrameRadioTag _jspx_th_frameHtml_005fradio_005f1 = (cn.com.sinosoft.frame.taglib.html.FrameRadioTag) _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fproperty_005fcode_005fnobody.get(cn.com.sinosoft.frame.taglib.html.FrameRadioTag.class);
    _jspx_th_frameHtml_005fradio_005f1.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fradio_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(257,13) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fradio_005f1.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(ADJUS)");
    // /aids/birth/customer/edtcustomerrelease.jsp(257,13) name = code type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fradio_005f1.setCode("CUSAGRE");
    int _jspx_eval_frameHtml_005fradio_005f1 = _jspx_th_frameHtml_005fradio_005f1.doStartTag();
    if (_jspx_th_frameHtml_005fradio_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fproperty_005fcode_005fnobody.reuse(_jspx_th_frameHtml_005fradio_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fproperty_005fcode_005fnobody.reuse(_jspx_th_frameHtml_005fradio_005f1);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005fradio_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:radio
    cn.com.sinosoft.frame.taglib.html.FrameRadioTag _jspx_th_frameHtml_005fradio_005f2 = (cn.com.sinosoft.frame.taglib.html.FrameRadioTag) _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fvalue_005fproperty_005fcode_005fnobody.get(cn.com.sinosoft.frame.taglib.html.FrameRadioTag.class);
    _jspx_th_frameHtml_005fradio_005f2.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fradio_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(268,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fradio_005f2.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(NET)");
    // /aids/birth/customer/edtcustomerrelease.jsp(268,3) name = code type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fradio_005f2.setCode("CUSAGRE");
    // /aids/birth/customer/edtcustomerrelease.jsp(268,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fradio_005f2.setValue("70");
    int _jspx_eval_frameHtml_005fradio_005f2 = _jspx_th_frameHtml_005fradio_005f2.doStartTag();
    if (_jspx_th_frameHtml_005fradio_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fvalue_005fproperty_005fcode_005fnobody.reuse(_jspx_th_frameHtml_005fradio_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fvalue_005fproperty_005fcode_005fnobody.reuse(_jspx_th_frameHtml_005fradio_005f2);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005ftextarea_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:textarea
    cn.com.sinosoft.frame.taglib.html.FrameTextareaTag _jspx_th_frameHtml_005ftextarea_005f2 = (cn.com.sinosoft.frame.taglib.html.FrameTextareaTag) _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005freadonly_005fproperty_005fcols_005fnobody.get(cn.com.sinosoft.frame.taglib.html.FrameTextareaTag.class);
    _jspx_th_frameHtml_005ftextarea_005f2.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005ftextarea_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(269,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f2.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(NET_REASON)");
    // /aids/birth/customer/edtcustomerrelease.jsp(269,3) name = cols type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f2.setCols("60");
    // /aids/birth/customer/edtcustomerrelease.jsp(269,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f2.setValue("");
    // /aids/birth/customer/edtcustomerrelease.jsp(269,3) name = readonly type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f2.setReadonly(false);
    int _jspx_eval_frameHtml_005ftextarea_005f2 = _jspx_th_frameHtml_005ftextarea_005f2.doStartTag();
    if (_jspx_th_frameHtml_005ftextarea_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005freadonly_005fproperty_005fcols_005fnobody.reuse(_jspx_th_frameHtml_005ftextarea_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005freadonly_005fproperty_005fcols_005fnobody.reuse(_jspx_th_frameHtml_005ftextarea_005f2);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005fcodeSelect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:codeSelect
    cn.com.sinosoft.frame.taglib.html.CodeSelectTag _jspx_th_frameHtml_005fcodeSelect_005f0 = (cn.com.sinosoft.frame.taglib.html.CodeSelectTag) _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fvalue_005fproperty_005fcode.get(cn.com.sinosoft.frame.taglib.html.CodeSelectTag.class);
    _jspx_th_frameHtml_005fcodeSelect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fcodeSelect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(274,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fcodeSelect_005f0.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(NET_SIGN)");
    // /aids/birth/customer/edtcustomerrelease.jsp(274,4) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fcodeSelect_005f0.setCode("CUSTOMER_NET");
    // /aids/birth/customer/edtcustomerrelease.jsp(274,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fcodeSelect_005f0.setValue("8");
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
      _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fvalue_005fproperty_005fcode.reuse(_jspx_th_frameHtml_005fcodeSelect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fvalue_005fproperty_005fcode.reuse(_jspx_th_frameHtml_005fcodeSelect_005f0);
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
    // /aids/birth/customer/edtcustomerrelease.jsp(281,13) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fdateCtl_005f1.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(NET_SIGN_DATE)");
    // /aids/birth/customer/edtcustomerrelease.jsp(281,13) name = init type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fdateCtl_005f1.setInit(false);
    int _jspx_eval_frameHtml_005fdateCtl_005f1 = _jspx_th_frameHtml_005fdateCtl_005f1.doStartTag();
    if (_jspx_th_frameHtml_005fdateCtl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.reuse(_jspx_th_frameHtml_005fdateCtl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.reuse(_jspx_th_frameHtml_005fdateCtl_005f1);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005fradio_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:radio
    cn.com.sinosoft.frame.taglib.html.FrameRadioTag _jspx_th_frameHtml_005fradio_005f3 = (cn.com.sinosoft.frame.taglib.html.FrameRadioTag) _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fvalue_005fproperty_005fcode_005fnobody.get(cn.com.sinosoft.frame.taglib.html.FrameRadioTag.class);
    _jspx_th_frameHtml_005fradio_005f3.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fradio_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(293,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fradio_005f3.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(SYS)");
    // /aids/birth/customer/edtcustomerrelease.jsp(293,3) name = code type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fradio_005f3.setCode("CUSAGRE");
    // /aids/birth/customer/edtcustomerrelease.jsp(293,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fradio_005f3.setValue("70");
    int _jspx_eval_frameHtml_005fradio_005f3 = _jspx_th_frameHtml_005fradio_005f3.doStartTag();
    if (_jspx_th_frameHtml_005fradio_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fvalue_005fproperty_005fcode_005fnobody.reuse(_jspx_th_frameHtml_005fradio_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fvalue_005fproperty_005fcode_005fnobody.reuse(_jspx_th_frameHtml_005fradio_005f3);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005ftextarea_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:textarea
    cn.com.sinosoft.frame.taglib.html.FrameTextareaTag _jspx_th_frameHtml_005ftextarea_005f3 = (cn.com.sinosoft.frame.taglib.html.FrameTextareaTag) _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005freadonly_005fproperty_005fcols_005fnobody.get(cn.com.sinosoft.frame.taglib.html.FrameTextareaTag.class);
    _jspx_th_frameHtml_005ftextarea_005f3.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005ftextarea_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(295,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f3.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(SYS_REASON)");
    // /aids/birth/customer/edtcustomerrelease.jsp(295,3) name = cols type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f3.setCols("60");
    // /aids/birth/customer/edtcustomerrelease.jsp(295,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f3.setValue("");
    // /aids/birth/customer/edtcustomerrelease.jsp(295,3) name = readonly type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f3.setReadonly(false);
    int _jspx_eval_frameHtml_005ftextarea_005f3 = _jspx_th_frameHtml_005ftextarea_005f3.doStartTag();
    if (_jspx_th_frameHtml_005ftextarea_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005freadonly_005fproperty_005fcols_005fnobody.reuse(_jspx_th_frameHtml_005ftextarea_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005freadonly_005fproperty_005fcols_005fnobody.reuse(_jspx_th_frameHtml_005ftextarea_005f3);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005fcodeSelect_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:codeSelect
    cn.com.sinosoft.frame.taglib.html.CodeSelectTag _jspx_th_frameHtml_005fcodeSelect_005f1 = (cn.com.sinosoft.frame.taglib.html.CodeSelectTag) _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fvalue_005fproperty_005fcode.get(cn.com.sinosoft.frame.taglib.html.CodeSelectTag.class);
    _jspx_th_frameHtml_005fcodeSelect_005f1.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fcodeSelect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(301,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fcodeSelect_005f1.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(INFORMATION_SYS)");
    // /aids/birth/customer/edtcustomerrelease.jsp(301,12) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fcodeSelect_005f1.setCode("INFORMATION_SIGN_DIR");
    // /aids/birth/customer/edtcustomerrelease.jsp(301,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fcodeSelect_005f1.setValue("10");
    int _jspx_eval_frameHtml_005fcodeSelect_005f1 = _jspx_th_frameHtml_005fcodeSelect_005f1.doStartTag();
    if (_jspx_eval_frameHtml_005fcodeSelect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_frameHtml_005fcodeSelect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_frameHtml_005fcodeSelect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_frameHtml_005fcodeSelect_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<option value=\"\">---请选择---</option>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_frameHtml_005fcodeSelect_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_frameHtml_005fcodeSelect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_frameHtml_005fcodeSelect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fvalue_005fproperty_005fcode.reuse(_jspx_th_frameHtml_005fcodeSelect_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fvalue_005fproperty_005fcode.reuse(_jspx_th_frameHtml_005fcodeSelect_005f1);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005fdateCtl_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:dateCtl
    cn.com.sinosoft.frame.taglib.html.DateCtlTag _jspx_th_frameHtml_005fdateCtl_005f2 = (cn.com.sinosoft.frame.taglib.html.DateCtlTag) _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.get(cn.com.sinosoft.frame.taglib.html.DateCtlTag.class);
    _jspx_th_frameHtml_005fdateCtl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fdateCtl_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(308,13) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fdateCtl_005f2.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(INFORMATION_SYS_DATE)");
    // /aids/birth/customer/edtcustomerrelease.jsp(308,13) name = init type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fdateCtl_005f2.setInit(false);
    int _jspx_eval_frameHtml_005fdateCtl_005f2 = _jspx_th_frameHtml_005fdateCtl_005f2.doStartTag();
    if (_jspx_th_frameHtml_005fdateCtl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.reuse(_jspx_th_frameHtml_005fdateCtl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.reuse(_jspx_th_frameHtml_005fdateCtl_005f2);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005fradio_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:radio
    cn.com.sinosoft.frame.taglib.html.FrameRadioTag _jspx_th_frameHtml_005fradio_005f4 = (cn.com.sinosoft.frame.taglib.html.FrameRadioTag) _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fvalue_005fproperty_005fcode_005fnobody.get(cn.com.sinosoft.frame.taglib.html.FrameRadioTag.class);
    _jspx_th_frameHtml_005fradio_005f4.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fradio_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(318,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fradio_005f4.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(APPLICATION)");
    // /aids/birth/customer/edtcustomerrelease.jsp(318,3) name = code type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fradio_005f4.setCode("CUSAGRE");
    // /aids/birth/customer/edtcustomerrelease.jsp(318,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fradio_005f4.setValue("70");
    int _jspx_eval_frameHtml_005fradio_005f4 = _jspx_th_frameHtml_005fradio_005f4.doStartTag();
    if (_jspx_th_frameHtml_005fradio_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fvalue_005fproperty_005fcode_005fnobody.reuse(_jspx_th_frameHtml_005fradio_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fvalue_005fproperty_005fcode_005fnobody.reuse(_jspx_th_frameHtml_005fradio_005f4);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005ftextarea_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:textarea
    cn.com.sinosoft.frame.taglib.html.FrameTextareaTag _jspx_th_frameHtml_005ftextarea_005f4 = (cn.com.sinosoft.frame.taglib.html.FrameTextareaTag) _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005freadonly_005fproperty_005fcols_005fnobody.get(cn.com.sinosoft.frame.taglib.html.FrameTextareaTag.class);
    _jspx_th_frameHtml_005ftextarea_005f4.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005ftextarea_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(320,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f4.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(APPLICATION_REASON)");
    // /aids/birth/customer/edtcustomerrelease.jsp(320,3) name = cols type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f4.setCols("60");
    // /aids/birth/customer/edtcustomerrelease.jsp(320,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f4.setValue("");
    // /aids/birth/customer/edtcustomerrelease.jsp(320,3) name = readonly type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f4.setReadonly(false);
    int _jspx_eval_frameHtml_005ftextarea_005f4 = _jspx_th_frameHtml_005ftextarea_005f4.doStartTag();
    if (_jspx_th_frameHtml_005ftextarea_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005freadonly_005fproperty_005fcols_005fnobody.reuse(_jspx_th_frameHtml_005ftextarea_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005freadonly_005fproperty_005fcols_005fnobody.reuse(_jspx_th_frameHtml_005ftextarea_005f4);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005fcodeSelect_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:codeSelect
    cn.com.sinosoft.frame.taglib.html.CodeSelectTag _jspx_th_frameHtml_005fcodeSelect_005f2 = (cn.com.sinosoft.frame.taglib.html.CodeSelectTag) _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fvalue_005fproperty_005fcode.get(cn.com.sinosoft.frame.taglib.html.CodeSelectTag.class);
    _jspx_th_frameHtml_005fcodeSelect_005f2.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fcodeSelect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(326,13) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fcodeSelect_005f2.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(APPLICATION_SIGN)");
    // /aids/birth/customer/edtcustomerrelease.jsp(326,13) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fcodeSelect_005f2.setCode("INFORMATION_SIGN_DIR");
    // /aids/birth/customer/edtcustomerrelease.jsp(326,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fcodeSelect_005f2.setValue("10");
    int _jspx_eval_frameHtml_005fcodeSelect_005f2 = _jspx_th_frameHtml_005fcodeSelect_005f2.doStartTag();
    if (_jspx_eval_frameHtml_005fcodeSelect_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_frameHtml_005fcodeSelect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_frameHtml_005fcodeSelect_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_frameHtml_005fcodeSelect_005f2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<option value=\"\">---请选择---</option>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_frameHtml_005fcodeSelect_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_frameHtml_005fcodeSelect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_frameHtml_005fcodeSelect_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fvalue_005fproperty_005fcode.reuse(_jspx_th_frameHtml_005fcodeSelect_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fvalue_005fproperty_005fcode.reuse(_jspx_th_frameHtml_005fcodeSelect_005f2);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005fdateCtl_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:dateCtl
    cn.com.sinosoft.frame.taglib.html.DateCtlTag _jspx_th_frameHtml_005fdateCtl_005f3 = (cn.com.sinosoft.frame.taglib.html.DateCtlTag) _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.get(cn.com.sinosoft.frame.taglib.html.DateCtlTag.class);
    _jspx_th_frameHtml_005fdateCtl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fdateCtl_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(333,13) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fdateCtl_005f3.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(APPLICATION_SIGN_DATE)");
    // /aids/birth/customer/edtcustomerrelease.jsp(333,13) name = init type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fdateCtl_005f3.setInit(false);
    int _jspx_eval_frameHtml_005fdateCtl_005f3 = _jspx_th_frameHtml_005fdateCtl_005f3.doStartTag();
    if (_jspx_th_frameHtml_005fdateCtl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.reuse(_jspx_th_frameHtml_005fdateCtl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.reuse(_jspx_th_frameHtml_005fdateCtl_005f3);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005fradio_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:radio
    cn.com.sinosoft.frame.taglib.html.FrameRadioTag _jspx_th_frameHtml_005fradio_005f5 = (cn.com.sinosoft.frame.taglib.html.FrameRadioTag) _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fvalue_005fproperty_005fcode_005fnobody.get(cn.com.sinosoft.frame.taglib.html.FrameRadioTag.class);
    _jspx_th_frameHtml_005fradio_005f5.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fradio_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(343,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fradio_005f5.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(CENTER)");
    // /aids/birth/customer/edtcustomerrelease.jsp(343,3) name = code type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fradio_005f5.setCode("CUSAGRE");
    // /aids/birth/customer/edtcustomerrelease.jsp(343,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fradio_005f5.setValue("70");
    int _jspx_eval_frameHtml_005fradio_005f5 = _jspx_th_frameHtml_005fradio_005f5.doStartTag();
    if (_jspx_th_frameHtml_005fradio_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fvalue_005fproperty_005fcode_005fnobody.reuse(_jspx_th_frameHtml_005fradio_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fvalue_005fproperty_005fcode_005fnobody.reuse(_jspx_th_frameHtml_005fradio_005f5);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005ftextarea_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:textarea
    cn.com.sinosoft.frame.taglib.html.FrameTextareaTag _jspx_th_frameHtml_005ftextarea_005f5 = (cn.com.sinosoft.frame.taglib.html.FrameTextareaTag) _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005freadonly_005fproperty_005fcols_005fnobody.get(cn.com.sinosoft.frame.taglib.html.FrameTextareaTag.class);
    _jspx_th_frameHtml_005ftextarea_005f5.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005ftextarea_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(345,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f5.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(CENTER_REASON)");
    // /aids/birth/customer/edtcustomerrelease.jsp(345,3) name = cols type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f5.setCols("60");
    // /aids/birth/customer/edtcustomerrelease.jsp(345,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f5.setValue("");
    // /aids/birth/customer/edtcustomerrelease.jsp(345,3) name = readonly type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f5.setReadonly(false);
    int _jspx_eval_frameHtml_005ftextarea_005f5 = _jspx_th_frameHtml_005ftextarea_005f5.doStartTag();
    if (_jspx_th_frameHtml_005ftextarea_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005freadonly_005fproperty_005fcols_005fnobody.reuse(_jspx_th_frameHtml_005ftextarea_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005freadonly_005fproperty_005fcols_005fnobody.reuse(_jspx_th_frameHtml_005ftextarea_005f5);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005fcodeSelect_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:codeSelect
    cn.com.sinosoft.frame.taglib.html.CodeSelectTag _jspx_th_frameHtml_005fcodeSelect_005f3 = (cn.com.sinosoft.frame.taglib.html.CodeSelectTag) _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fvalue_005fproperty_005fcode.get(cn.com.sinosoft.frame.taglib.html.CodeSelectTag.class);
    _jspx_th_frameHtml_005fcodeSelect_005f3.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fcodeSelect_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(351,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fcodeSelect_005f3.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(CENTER_SIGN)");
    // /aids/birth/customer/edtcustomerrelease.jsp(351,12) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fcodeSelect_005f3.setCode("INFORMATION");
    // /aids/birth/customer/edtcustomerrelease.jsp(351,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fcodeSelect_005f3.setValue("11");
    int _jspx_eval_frameHtml_005fcodeSelect_005f3 = _jspx_th_frameHtml_005fcodeSelect_005f3.doStartTag();
    if (_jspx_eval_frameHtml_005fcodeSelect_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_frameHtml_005fcodeSelect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_frameHtml_005fcodeSelect_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_frameHtml_005fcodeSelect_005f3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<option value=\"\">---请选择---</option>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_frameHtml_005fcodeSelect_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_frameHtml_005fcodeSelect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_frameHtml_005fcodeSelect_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fvalue_005fproperty_005fcode.reuse(_jspx_th_frameHtml_005fcodeSelect_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fvalue_005fproperty_005fcode.reuse(_jspx_th_frameHtml_005fcodeSelect_005f3);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005fdateCtl_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:dateCtl
    cn.com.sinosoft.frame.taglib.html.DateCtlTag _jspx_th_frameHtml_005fdateCtl_005f4 = (cn.com.sinosoft.frame.taglib.html.DateCtlTag) _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.get(cn.com.sinosoft.frame.taglib.html.DateCtlTag.class);
    _jspx_th_frameHtml_005fdateCtl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fdateCtl_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(358,13) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fdateCtl_005f4.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(CENTER_SIGN_DATE)");
    // /aids/birth/customer/edtcustomerrelease.jsp(358,13) name = init type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fdateCtl_005f4.setInit(false);
    int _jspx_eval_frameHtml_005fdateCtl_005f4 = _jspx_th_frameHtml_005fdateCtl_005f4.doStartTag();
    if (_jspx_th_frameHtml_005fdateCtl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.reuse(_jspx_th_frameHtml_005fdateCtl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.reuse(_jspx_th_frameHtml_005fdateCtl_005f4);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005fradio_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:radio
    cn.com.sinosoft.frame.taglib.html.FrameRadioTag _jspx_th_frameHtml_005fradio_005f6 = (cn.com.sinosoft.frame.taglib.html.FrameRadioTag) _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fvalue_005fproperty_005fcode_005fnobody.get(cn.com.sinosoft.frame.taglib.html.FrameRadioTag.class);
    _jspx_th_frameHtml_005fradio_005f6.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fradio_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(368,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fradio_005f6.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(DIR)");
    // /aids/birth/customer/edtcustomerrelease.jsp(368,3) name = code type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fradio_005f6.setCode("CUSAGRE");
    // /aids/birth/customer/edtcustomerrelease.jsp(368,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fradio_005f6.setValue("70");
    int _jspx_eval_frameHtml_005fradio_005f6 = _jspx_th_frameHtml_005fradio_005f6.doStartTag();
    if (_jspx_th_frameHtml_005fradio_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fvalue_005fproperty_005fcode_005fnobody.reuse(_jspx_th_frameHtml_005fradio_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fradio_0026_005fvalue_005fproperty_005fcode_005fnobody.reuse(_jspx_th_frameHtml_005fradio_005f6);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005ftextarea_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:textarea
    cn.com.sinosoft.frame.taglib.html.FrameTextareaTag _jspx_th_frameHtml_005ftextarea_005f6 = (cn.com.sinosoft.frame.taglib.html.FrameTextareaTag) _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005freadonly_005fproperty_005fcols_005fnobody.get(cn.com.sinosoft.frame.taglib.html.FrameTextareaTag.class);
    _jspx_th_frameHtml_005ftextarea_005f6.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005ftextarea_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(370,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f6.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(DIR_REASON)");
    // /aids/birth/customer/edtcustomerrelease.jsp(370,3) name = cols type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f6.setCols("60");
    // /aids/birth/customer/edtcustomerrelease.jsp(370,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f6.setValue("");
    // /aids/birth/customer/edtcustomerrelease.jsp(370,3) name = readonly type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005ftextarea_005f6.setReadonly(false);
    int _jspx_eval_frameHtml_005ftextarea_005f6 = _jspx_th_frameHtml_005ftextarea_005f6.doStartTag();
    if (_jspx_th_frameHtml_005ftextarea_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005freadonly_005fproperty_005fcols_005fnobody.reuse(_jspx_th_frameHtml_005ftextarea_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005ftextarea_0026_005fvalue_005freadonly_005fproperty_005fcols_005fnobody.reuse(_jspx_th_frameHtml_005ftextarea_005f6);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005fcodeSelect_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:codeSelect
    cn.com.sinosoft.frame.taglib.html.CodeSelectTag _jspx_th_frameHtml_005fcodeSelect_005f4 = (cn.com.sinosoft.frame.taglib.html.CodeSelectTag) _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fvalue_005fproperty_005fcode.get(cn.com.sinosoft.frame.taglib.html.CodeSelectTag.class);
    _jspx_th_frameHtml_005fcodeSelect_005f4.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fcodeSelect_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(376,11) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fcodeSelect_005f4.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(DIR_SIGN)");
    // /aids/birth/customer/edtcustomerrelease.jsp(376,11) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fcodeSelect_005f4.setCode("INFORMATION");
    // /aids/birth/customer/edtcustomerrelease.jsp(376,11) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fcodeSelect_005f4.setValue("11");
    int _jspx_eval_frameHtml_005fcodeSelect_005f4 = _jspx_th_frameHtml_005fcodeSelect_005f4.doStartTag();
    if (_jspx_eval_frameHtml_005fcodeSelect_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_frameHtml_005fcodeSelect_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_frameHtml_005fcodeSelect_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_frameHtml_005fcodeSelect_005f4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<option value=\"\">---请选择---</option>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_frameHtml_005fcodeSelect_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_frameHtml_005fcodeSelect_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_frameHtml_005fcodeSelect_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fvalue_005fproperty_005fcode.reuse(_jspx_th_frameHtml_005fcodeSelect_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fcodeSelect_0026_005fvalue_005fproperty_005fcode.reuse(_jspx_th_frameHtml_005fcodeSelect_005f4);
    return false;
  }

  private boolean _jspx_meth_frameHtml_005fdateCtl_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:dateCtl
    cn.com.sinosoft.frame.taglib.html.DateCtlTag _jspx_th_frameHtml_005fdateCtl_005f5 = (cn.com.sinosoft.frame.taglib.html.DateCtlTag) _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.get(cn.com.sinosoft.frame.taglib.html.DateCtlTag.class);
    _jspx_th_frameHtml_005fdateCtl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005fdateCtl_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(384,13) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fdateCtl_005f5.setProperty("MODEL(CUSTOMER_SUPPORT_RELEASE).STRING(DIR_SIGN_DATE)");
    // /aids/birth/customer/edtcustomerrelease.jsp(384,13) name = init type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_frameHtml_005fdateCtl_005f5.setInit(false);
    int _jspx_eval_frameHtml_005fdateCtl_005f5 = _jspx_th_frameHtml_005fdateCtl_005f5.doStartTag();
    if (_jspx_th_frameHtml_005fdateCtl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.reuse(_jspx_th_frameHtml_005fdateCtl_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005fdateCtl_0026_005fproperty_005finit_005fnobody.reuse(_jspx_th_frameHtml_005fdateCtl_005f5);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(393,14) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f7.setName("edtcustomerreleaseForm");
    // /aids/birth/customer/edtcustomerrelease.jsp(393,14) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f7.setProperty("act");
    // /aids/birth/customer/edtcustomerrelease.jsp(393,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f7.setValue("editParentInput");
    int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
    if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t              \t");
        if (_jspx_meth_html_005fsubmit_005f0(_jspx_th_logic_005fequal_005f7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t             ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f7);
    return false;
  }

  private boolean _jspx_meth_html_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f0 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fonclick.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
    // /aids/birth/customer/edtcustomerrelease.jsp(394,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f0.setOnclick("this.form.act.value='editParentSubmit'");
    int _jspx_eval_html_005fsubmit_005f0 = _jspx_th_html_005fsubmit_005f0.doStartTag();
    if (_jspx_eval_html_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fsubmit_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fsubmit_005f0.doInitBody();
      }
      do {
        out.write('更');
        out.write('新');
        int evalDoAfterBody = _jspx_th_html_005fsubmit_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fonclick.reuse(_jspx_th_html_005fsubmit_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fonclick.reuse(_jspx_th_html_005fsubmit_005f0);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f8 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f8.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /aids/birth/customer/edtcustomerrelease.jsp(396,14) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f8.setName("edtcustomerreleaseForm");
    // /aids/birth/customer/edtcustomerrelease.jsp(396,14) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f8.setProperty("act");
    // /aids/birth/customer/edtcustomerrelease.jsp(396,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fequal_005f8.setValue("addParentInput");
    int _jspx_eval_logic_005fequal_005f8 = _jspx_th_logic_005fequal_005f8.doStartTag();
    if (_jspx_eval_logic_005fequal_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t \t");
        if (_jspx_meth_html_005fsubmit_005f1(_jspx_th_logic_005fequal_005f8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t     \t ");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
    return false;
  }

  private boolean _jspx_meth_html_005fsubmit_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f1 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fonclick.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_005fsubmit_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fsubmit_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
    // /aids/birth/customer/edtcustomerrelease.jsp(397,6) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f1.setOnclick("this.form.act.value='addParentSubmit'");
    int _jspx_eval_html_005fsubmit_005f1 = _jspx_th_html_005fsubmit_005f1.doStartTag();
    if (_jspx_eval_html_005fsubmit_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fsubmit_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fsubmit_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fsubmit_005f1.doInitBody();
      }
      do {
        out.write('添');
        out.write('加');
        int evalDoAfterBody = _jspx_th_html_005fsubmit_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fsubmit_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fsubmit_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fonclick.reuse(_jspx_th_html_005fsubmit_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fonclick.reuse(_jspx_th_html_005fsubmit_005f1);
    return false;
  }
}
