package org.apache.jsp.aids.functree;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.uncnet.framework.utils.permission;

public final class toolbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(5);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/frame-html.tld");
    _jspx_dependants.add("/WEB-INF/frame-app.tld");
    _jspx_dependants.add("/WEB-INF/frameaids-html.tld");
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
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_html_005fhtml_005f0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_html_005fhtml_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:html
    org.apache.struts.taglib.html.HtmlTag _jspx_th_html_005fhtml_005f0 = (org.apache.struts.taglib.html.HtmlTag) _005fjspx_005ftagPool_005fhtml_005fhtml.get(org.apache.struts.taglib.html.HtmlTag.class);
    _jspx_th_html_005fhtml_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhtml_005f0.setParent(null);
    int _jspx_eval_html_005fhtml_005f0 = _jspx_th_html_005fhtml_005f0.doStartTag();
    if (_jspx_eval_html_005fhtml_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("<title>top</title>\r\n");
        out.write("<meta http-equiv=\"Pragma\" content=\"no-cache\">\r\n");
        out.write("<meta http-equiv=\"Cache-Control\" content=\"no-cache\">\r\n");
        out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
        out.write("\r\n");
        out.write("<script language=\"javaScript\" src=\"/cdc/scripts/mes.js\"></script>\r\n");
        out.write("</head>\r\n");
        out.write("<script>\r\n");
        out.write("  var zone=\"\";\r\n");
        out.write("  var userid=\"\";\r\n");
        out.write("</script>\r\n");
        out.write("<body bgcolor=\"#FFFFFF\" leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
        out.write("<table width=\"100%\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
        out.write("   <tr> \r\n");
        out.write("    <td width=\"44\" rowspan=\"2\"><img src=\"../images/top_01.gif\" width=\"44\" height=\"78\"></td>\r\n");
        out.write("    <td width=\"97\" rowspan=\"2\"><img src=\"../images/top_02.gif\" width=\"97\" height=\"78\"></td>\r\n");
        out.write("    <td width=\"371\"><img src=\"../images/a22.gif\" width=\"371\" height=\"31\"></td>\r\n");
        out.write("    <td width=\"268\" background=\"../images/top_04.gif\"><TABLE BORDER=0 align=\"right\" CELLPADDING=0 CELLSPACING=0>\r\n");
        out.write("      <TR>\r\n");
        out.write("        <!-- <TD> <IMG SRC=\"../images/session_01.gif\" WIDTH=11 HEIGHT=23 ALT=\"\"></TD> -->\r\n");
        out.write("        <TD background=\"../images/session_02.gif\" class=\"blue12\"> &nbsp;&nbsp;&nbsp;&nbsp; </TD>\r\n");
        out.write("        <!-- <TD> <IMG SRC=\"../images/session_03.gif\" WIDTH=13 HEIGHT=23 ALT=\"\"></TD>-->\r\n");
        out.write("      </TR>\r\n");
        out.write("    </TABLE></td>\r\n");
        out.write("    <td width=\"\" rowspan=\"2\" background=\"../images/top.gif\"><img src=\"../images/spacer.gif\" width=\"100%\" height=\"1\"></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr> \r\n");
        out.write("    <td><img src=\"../images/a22.gif\" width=\"371\" height=\"47\"></td>\r\n");
        out.write("    <td><img src=\"../images/top_06.gif\" width=\"268\" height=\"47\"></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("</table>\r\n");
        out.write("<table width=\"100%\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
        out.write("  <tr> \r\n");
        out.write("    <td width=\"141\" class=\"nv\" ><img src=\"../images/top_07.gif\" width=\"141\" height=\"15\"> </td>\r\n");
        out.write("    <td width=\"600\" height=\"15\" class=\"nv\">\r\n");
        out.write("    ");
        out.write("\r\n");
        out.write("     </td>\r\n");
        out.write("    <td align=\"center\" nowrap class=\"nv\">\r\n");
        out.write("\t   <b>\t     \r\n");
        out.write("\t   </b>\r\n");
        out.write("    </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("</table>\r\n");
        out.write("\r\n");
        out.write("</body>\r\n");
        int evalDoAfterBody = _jspx_th_html_005fhtml_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_005fhtml_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
    return false;
  }
}
