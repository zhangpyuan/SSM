package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery-1.7.2.min.js\">\r\n");
      out.write("</script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/js/themes/icon.css\"/>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery.easyui.min.js\">\r\n");
      out.write("</script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/js/themes/default/easyui.css\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/locale/easyui-lang-zh_CN.js\">\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function(){\r\n");
      out.write("        //按钮单击时执行\r\n");
      out.write("        $(\"#testAjax\").click(function(){\r\n");
      out.write("              //取Ajax返回结果\r\n");
      out.write("              //为了简单，这里简单地从文件中读取内容作为返回数据\r\n");
      out.write("              htmlobj=$.ajax({url:\"/Readme.txt\",async:false});\r\n");
      out.write("               //显示Ajax返回结果\r\n");
      out.write("               $(\"#myDiv\").html(htmlobj.responseText);\r\n");
      out.write("         });\r\n");
      out.write("    });\r\n");
      out.write("</script>    \r\n");
      out.write("</head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"myDiv\"><h2>通过 AJAX 改变文本</h2></div>\r\n");
      out.write("        <button id=\"testAjax\" type=\"button\">Ajax改变内容</button>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
