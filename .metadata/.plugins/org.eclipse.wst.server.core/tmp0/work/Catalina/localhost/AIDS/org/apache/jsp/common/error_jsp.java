package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.struts.config.ModuleConfig;
import org.apache.struts.util.RequestUtils;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/frame-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhtml_0026_005flocale;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fframeHtml_005ferrors_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml_0026_005flocale = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fframeHtml_005ferrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml_0026_005flocale.release();
    _005fjspx_005ftagPool_005fframeHtml_005ferrors_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_005fhtml_005f0 = (org.apache.struts.taglib.html.HtmlTag) _005fjspx_005ftagPool_005fhtml_005fhtml_0026_005flocale.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_005fhtml_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhtml_005f0.setParent(null);
      // /common/error.jsp(8,0) name = locale type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fhtml_005f0.setLocale(true);
      int _jspx_eval_html_005fhtml_005f0 = _jspx_th_html_005fhtml_005f0.doStartTag();
      if (_jspx_eval_html_005fhtml_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("<head>\r\n");
          out.write("<style type=\"text/css\">\r\n");
          out.write("<!--\r\n");
          out.write(".unnamed1 {  font-family: \"宋体\"; font-size: 12px}\r\n");
          out.write("-->\r\n");
          out.write("</style>\r\n");
          out.write("<LINK href=\"");
          out.print(request.getContextPath());
          out.write("/css/default_style.css\" type=text/css rel=stylesheet>\r\n");
          out.write("<LINK href=\"");
          out.print(request.getContextPath());
          out.write("/css/style.css\" type=text/css rel=stylesheet>\r\n");
          out.write("<head>\r\n");

	String errorMsg = (String)request.getSession(true).getAttribute(org.apache.struts.Globals.ERROR_KEY);
	request.getSession(true).removeAttribute(org.apache.struts.Globals.ERROR_KEY);
	if (errorMsg==null)
		errorMsg = "";

 //ModuleConfig moduleConfig = RequestUtils.getModuleConfig(pageContext);
 
 //out.print("module:"+moduleConfig.getPrefix());

          out.write("\r\n");
          out.write("\r\n");
          out.write("<body bgcolor=\"#F3F3F3\" text=\"#000000\">\r\n");
          out.write("<p>&nbsp;</p>\r\n");
          out.write("<table border=\"1\" cellspacing=\"3\" cellpadding=\"3\" bordercolor=\"#CCCCFF\" align=\"center\">\r\n");
          out.write("  <tr>\r\n");
          out.write("  \r\n");
          out.write("    <td width=\"60\" height=\"60\" bgcolor=\"#FFFFFF\"class=\"unnamed1\" align=\"center\">\r\n");
          out.write("    \t<img src=\"");
          out.print(request.getContextPath().trim());
          out.write("/images/fail.gif\" width=\"48\" height=\"48\">\r\n");
          out.write("    </td>\r\n");
          out.write("   \r\n");
          out.write("\r\n");
          out.write("    <td width=\"250\" bgcolor=\"#FFFFFF\" align=\"center\" class=\"unnamed1\">\r\n");
          out.write("       <font color=\"red\">\r\n");
          out.write("\t\t");
          if (_jspx_meth_frameHtml_005ferrors_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.print(errorMsg);
          out.write("\r\n");
          out.write("       </font>\r\n");
          out.write("    </td>\r\n");
          out.write("  </tr>\r\n");
          out.write("  <tr><td colspan='2' bgcolor=\"#FFFFFF\" align=\"center\" class=\"unnamed1\">\r\n");
          out.write("  ");

  	String backUrl = request.getContextPath();
  	String backUrl1= (String)session.getAttribute("backUrl");
  	if (backUrl1!=null && backUrl1.length()!=0){
  		if (!backUrl1.startsWith("/"))
  			backUrl = backUrl + "/";
  		backUrl = backUrl + backUrl;
  
          out.write("\r\n");
          out.write("  <input type=\"button\" value=\"返 回\" class=\"BUTTON_01\" MouseType=\"2\" onclick=\"window.location='");
          out.print(backUrl);
          out.write("'\">\r\n");
          out.write("  ");
	}else{
  		backUrl = null;
  
          out.write("\r\n");
          out.write("  \t<input type=\"button\" value=\"返 回\" class=\"BUTTON_01\" MouseType=\"2\" onclick=\"history.back(-1)\">\r\n");
          out.write("  ");

  	}
  	session.removeAttribute("backUrl");
  
          out.write("\r\n");
          out.write("  \r\n");
          out.write("  </td></tr>\r\n");
          out.write("</table>\r\n");
          out.write("</body>\r\n");
          int evalDoAfterBody = _jspx_th_html_005fhtml_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fhtml_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhtml_0026_005flocale.reuse(_jspx_th_html_005fhtml_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhtml_0026_005flocale.reuse(_jspx_th_html_005fhtml_005f0);
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

  private boolean _jspx_meth_frameHtml_005ferrors_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  frameHtml:errors
    cn.com.sinosoft.frame.taglib.html.FrameErrorsTag _jspx_th_frameHtml_005ferrors_005f0 = (cn.com.sinosoft.frame.taglib.html.FrameErrorsTag) _005fjspx_005ftagPool_005fframeHtml_005ferrors_005fnobody.get(cn.com.sinosoft.frame.taglib.html.FrameErrorsTag.class);
    _jspx_th_frameHtml_005ferrors_005f0.setPageContext(_jspx_page_context);
    _jspx_th_frameHtml_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    int _jspx_eval_frameHtml_005ferrors_005f0 = _jspx_th_frameHtml_005ferrors_005f0.doStartTag();
    if (_jspx_th_frameHtml_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fframeHtml_005ferrors_005fnobody.reuse(_jspx_th_frameHtml_005ferrors_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fframeHtml_005ferrors_005fnobody.reuse(_jspx_th_frameHtml_005ferrors_005f0);
    return false;
  }
}
