package org.apache.jsp.aids.functree;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.uncnet.framework.utils.permission;
import cn.com.sinosoft.frame.constant.FrameConstant;
import cn.com.sinosoft.frame.utility.DateTimeUtils;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/frame-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhtml;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml.release();
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
      response.setContentType("text/html; charset=GB2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
          out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=GBK\">\r\n");
          out.write("<meta name=\"GENERATOR\" content=\"IBM WebSphere Studio\">\r\n");
          out.write("<meta http-equiv=\"Pragma\" content=\"no-cache\">\r\n");
          out.write("<meta http-equiv=\"Cache-Control\" content=\"no-cache\">\r\n");
          out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");

	permission user = (permission)session.getAttribute(FrameConstant.SESSION_USER_VIEW);
	String userZone = user.getUserzonecode();
	int userID      = user.getUserid();
	int  userType   = user.getUserType();
	String days = (String)request.getAttribute(logon.LogonUtility.MESSAGE_KEY);

          out.write("\r\n");
          out.write("<TITLE>客户支持日志</TITLE>\r\n");
          out.write("<SCRIPT type=\"text/javascript\">\r\n");
          out.write("<!--\r\n");
          out.write("var _csjtmrID = null;\r\n");
          out.write("\r\n");
          out.write("var _csjtmrON = false;\r\n");
          out.write("\r\n");
          out.write("function _DaysJpl()\r\n");
          out.write("{\r\n");
          out.write("  this[0] = \"星期日\"; this[1] = \"星期一\"; this[2] = \"星期二\";\r\n");
          out.write("  this[3] = \"星期三\"; this[4] = \"星期四\"; this[5] = \"星期五\";\r\n");
          out.write("  this[6] = \"星期六\";\r\n");
          out.write("}\r\n");
          out.write("\r\n");
          out.write("function _ClockStatusJpl()\r\n");
          out.write("{\r\n");
          out.write("  if (_csjtmrON)\r\n");
          out.write("  {\r\n");
          out.write("    window.clearTimeout(_csjtmrID);\r\n");
          out.write("    _csjtmrON = false;\r\n");
          out.write("  }\r\n");
          out.write("\r\n");
          out.write("  var now = new Date();\r\n");
          out.write("  var yr  = now.getYear();\r\n");
          out.write("  var mn  = now.getMonth() + 1;\r\n");
          out.write("  var dt  = now.getDate();\r\n");
          out.write("  var dy  = now.getDay();\r\n");
          out.write("  var hh  = now.getHours();\r\n");
          out.write("  var mm  = now.getMinutes();\r\n");
          out.write("  var ss  = now.getSeconds();\r\n");
          out.write("\r\n");
          out.write("  var fyr = (yr < 1900) ? 1900 + yr : yr;\r\n");
          out.write("\r\n");
          out.write("  var dys = new _DaysJpl();\r\n");
          out.write("  var dyj = dys[dy];\r\n");
          out.write("\r\n");
          out.write("  var msg  = fyr + \"/\" + mn + \"/\" + dt + \" (\" + dyj + \") \";\r\n");
          out.write("      msg +=  hh + \":\" + mm + \":\" + ss;\r\n");
          out.write("\r\n");
          out.write("  window.status = msg;\r\n");
          out.write("\r\n");
          out.write("  _csjtmrID = window.setTimeout(\"_ClockStatusJpl()\", 1000);\r\n");
          out.write("  _csjtmrON = true;\r\n");
          out.write("}\r\n");
          out.write("//-->\r\n");
          out.write("</SCRIPT>\r\n");
          out.write("<SCRIPT type=\"text/javascript\">\r\n");
          out.write("\r\n");
          out.write("</SCRIPT>\r\n");
          out.write("</head>\r\n");
          out.write("<frameset rows=\"17%,*\" frameborder=\"NO\" border=\"1\" framespacing=\"1\" name=\"mainFrame\" >\r\n");
          out.write("\r\n");
          out.write(" <frame name=\"top\" frameborder=\"yes\" border=\"1\" scrolling=\"NO\"  src=\"./functree/toolbar.jsp\">\r\n");
          out.write("\r\n");
          out.write("\t<frameset cols=\"25%,1.0%,*\" frameborder=\"NO\" border=\"1\" framespacing=\"1\" name=\"main\">\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<frame name=\"left\"  frameborder=\"yes\" border=\"1\" scrolling=\"yes\"  src=\"./functree/functionTreePage.jsp\">\t\t\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<frame name=\"changeButton\" src=\"./functree/changeSizePage.htm\" width=\"100%\" height=\"100%\" frameBorder=1 marginHeight=0 marginWidth=0 scrolling=no noresize >\r\n");
          out.write("\r\n");
          out.write("\t\t<frame name=\"right\" noresize  src=\"./functree/home.html\">\r\n");
          out.write("\r\n");
          out.write("\t</frameset>\r\n");
          out.write("\r\n");
          out.write("\t<noframes>你的浏览器不支持Frame，请安装Ie8.0以上版本的浏览器。</noframes>\r\n");
          out.write("\t\r\n");
          out.write("</frameset>\r\n");
          out.write("<body bgcolor=\"#FFFFFF\" text=\"#000000\">\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
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
}
