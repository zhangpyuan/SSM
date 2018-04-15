package org.apache.jsp.aids.functree;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.uncnet.framework.utils.permission;
import java.io.IOException;
import java.util.Enumeration;
import cn.com.sinosoft.frame.constant.FrameConstant;
import cn.com.sinosoft.frame.utility.GetFieldValue;
import org.apache.struts.util.RequestUtils;
import cn.com.sinosoft.frame.pagination.PaginationMgr;
import cn.com.sinosoft.cdc.aids.aidsutil.AidsUtil;
import java.util.ArrayList;
import cn.com.sinosoft.cdc.busicustom.business.TaskTreeBean;
import cn.com.sinosoft.cdc.busicustom.business.GenTaskTree;
import cn.com.sinosoft.frame.utility.DateTimeUtils;

public final class functionTreePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(5);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/frame-html.tld");
    _jspx_dependants.add("/WEB-INF/frame-app.tld");
    _jspx_dependants.add("/WEB-INF/permission-func.tld");
  }

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
      response.setContentType("text/html; charset=GBK");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE> 功能列表 </TITLE>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("<meta http-equiv=\"Pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<script language=\"javascript\" src=\"/cdcWeb/js/frameTag.js\"></script>\r\n");
      out.write("<script language=\"javascript\" src=\"/cdcWeb/js/funcTree.js\"></script>\r\n");
      out.write("<link rel=\"STYLESHEET\" type=\"text/css\" href=\"/cdcWeb/css/tree.css\">\r\n");
      out.write("\r\n");
      out.write("<STYLE>\r\n");
      out.write("\tBODY {\tFONT-FAMILY: ms shell dlg; FONT-SIZE: 12px }\r\n");
      out.write("\tDIV  {\tFONT-FAMILY: ms shell dlg; FONT-SIZE: 12px }\r\n");
      out.write("\tFONT {\tFONT-FAMILY: ms shell dlg; FONT-SIZE: 12px }\r\n");
      out.write("\t.off {\tDISPLAY: inline }\r\n");
      out.write("\t.on  {\tDISPLAY: none }\r\n");
      out.write("\t.menus {\tBACKGROUND-COLOR: buttonface; BORDER-BOTTOM: black 1px solid; BORDER-LEFT: white 1px solid; BORDER-RIGHT: black 1px solid; BORDER-TOP: white 1px solid; CURSOR: hand; FONT-SIZE: 9pt; MARGIN: 0px; OVERFLOW: hidden; PADDING-BOTTOM: 1px; PADDING-LEFT: 6px; PADDING-RIGHT: 6px; PADDING-TOP: 1px; TEXT-ALIGN: left; WIDTH: 90px }\r\n");
      out.write("\t#menutool {\tLEFT: 6px; POSITION: absolute; WIDTH: 90px; Z-INDEX: 10 }\r\n");
      out.write("\tA \t {\tCOLOR: black; FONT-SIZE: 9pt; TEXT-DECORATION: none; TEXT-TRANSFORM: none;cursor:hand }\r\n");
      out.write("\tA:hover {\tCOLOR: red; TEXT-DECORATION: underline;cursor:hand }\r\n");
      out.write("\tA:visited {\tcursor:hand }\r\n");
      out.write("\t.tab_border {\tborder: 1px solid #000000 }\r\n");
      out.write("</STYLE>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function swapimg(myimgNum,secNum,folderimg){\r\n");
      out.write("\tvar contextPath = '/AIDS';\r\n");
      out.write("    if (secNum.className==\"off\"){\r\n");
      out.write("\t\tsecNum.className=\"on\";\r\n");
      out.write("     \tmyimgNum.src=contextPath+\"/images/icon/tplus.gif\";\r\n");
      out.write("     \tfolderimg.src=contextPath+\"/images/icon/icon_folder[2].gif\"\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tsecNum.className=\"off\";\r\n");
      out.write("     \tmyimgNum.src=contextPath+\"/images/icon/tminus.gif\";\r\n");
      out.write("     \tfolderimg.src=contextPath+\"/images/icon/icon_folderopen.gif\"\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\tvar selectedIndex=0;\r\n");
      out.write("\t//dodo\r\n");
      out.write("\tself.onError=null;\r\n");
      out.write("\t\r\n");
      out.write("\tfunction go_Href(url){\r\n");
      out.write("\t\t\tif(!document.all)    return;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\tif ((event.srcElement.className==\"item\")){\r\n");
      out.write("\t\t\t      var srcIndex = event.srcElement.sourceIndex;\r\n");
      out.write("\t\t\t      var nested = document.all[srcIndex+3];\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif (event.srcElement.style.backgroundColor != \"darkblue\"){\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\tevent.srcElement.style.backgroundColor=\"darkblue\";\r\n");
      out.write("\t\t\t\t\tevent.srcElement.style.color=\"white\";\r\n");
      out.write("\t\t\t\t\tvar srcIndex = event.srcElement.sourceIndex;\r\n");
      out.write("\t\t\t\t\tvar previous = document.all[selectedIndex];\r\n");
      out.write("\t\t\t\t\tprevious.style.backgroundColor=\"\";\r\n");
      out.write("\t\t\t\t\tprevious.style.color=\"\";\r\n");
      out.write("\t\t\t\t\tselectedIndex=srcIndex;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\tif(url==null || url==\"\") {\r\n");
      out.write("\t\t    alert(\"该功能还在完善中！\");\r\n");
      out.write("\t\t    return;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tparent.right.location.href=url;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</HEAD>\r\n");
      out.write("\r\n");
      out.write("<body class=lbody leftMargin=4 oncontextmenu=self.event.returnValue=false;showmenu() style=\"font-size:12.6px\"\r\n");
      out.write("\t  ondragstart=self.event.returnValue=false onselectstart=self.event.returnValue=false onload=AllClose()>\r\n");
      out.write("\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<img align=absMiddle src=\"");
      out.print(request.getContextPath());
      out.write("/images/icon/icon_unctitle.gif\"><b>功能菜单</b>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t \r\n");
      out.write("\t\r\n");
      out.write("\t<div>\r\n");
      out.write("  \t\t<IMG align=absMiddle alt=\"\" border=0 id=folderimg1 onclick=swapimg(folderimg1,fold1,openimg1) src=\"");
      out.print(request.getContextPath());
      out.write("/images/tminus.gif\" style=\"CURSOR: hand\">\r\n");
      out.write("  \t\t<IMG align=absMiddle alt=\"\" border=0 class=havechild id=openimg1 src=\"");
      out.print(request.getContextPath());
      out.write("/images/icon/icon_inbox.gif\">   \r\n");
      out.write("   \t\t<A class=item onclick=\"\">\r\n");
      out.write("   \t客户支持日志 \r\n");
      out.write("   \t\t</A>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<DIV class=off     id=fold1>\r\n");
      out.write("<div>\r\n");
      out.write("\t<IMG align=absMiddle alt=\"\" border=0 src=\"");
      out.print(request.getContextPath());
      out.write("/images/t.gif\">\r\n");
      out.write("\t<IMG align=absMiddle alt=Folder src=\"");
      out.print(request.getContextPath());
      out.write("/images/icon/icon_folder[2].gif\">\r\n");
      out.write("\t\t\t<a class=item onclick=\"javascript:go_Href('");
      out.print(request.getContextPath());
      out.write("/aids/customerlogAction.do?busiId=CUSTOMER_SUPPORT_LOG_GROUP&act=queryParent')\">\r\n");
      out.write("\t\t\t中国疾病预防控制中心维护组</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t<IMG align=absMiddle alt=\"\" border=0 src=\"");
      out.print(request.getContextPath());
      out.write("/images/t.gif\">\r\n");
      out.write("\t<IMG align=absMiddle alt=Folder src=\"");
      out.print(request.getContextPath());
      out.write("/images/icon/icon_folder[2].gif\">\r\n");
      out.write("\t\t\t<a class=item onclick=\"javascript:go_Href('");
      out.print(request.getContextPath());
      out.write("/aids/customerlogoaAction.do?busiId=CUSTOMER_SUPPORT_LOG_GROUP_OA&act=queryParent')\">\r\n");
      out.write("\t\t\tOA</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</DIV>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div>\r\n");
      out.write("  \t\t<IMG align=absMiddle alt=\"\" border=0 id=folderimg1 onclick=swapimg(folderimg1,fold1,openimg1) src=\"");
      out.print(request.getContextPath());
      out.write("/images/tminus.gif\" style=\"CURSOR: hand\">\r\n");
      out.write("  \t\t<IMG align=absMiddle alt=\"\" border=0 class=havechild id=openimg1 src=\"");
      out.print(request.getContextPath());
      out.write("/images/icon/icon_inbox.gif\">   \r\n");
      out.write("   \t\t<a class=item onclick=\"javascript:go_Href('");
      out.print(request.getContextPath());
      out.write("/aids/checkDetectOrgAction.do?busiId=AIDS_ONTIME_CHECK_DETECT_ORG&act=queryParent')\">\r\n");
      out.write("   \t統計\r\n");
      out.write("   \t\t</A>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("<img  alt=folder src=\"");
      out.print(request.getContextPath());
      out.write("/images/icon/icon_inbox.gif\">\r\n");
      out.write("\t\t\t<a class=item onclick=\"javascript:go_Href('");
      out.print(request.getContextPath());
      out.write("/aids/customerchangeAction.do?busiId=CUSTOMER_SUPPORT_CHANGE_LOG&act=queryParent')\">\r\n");
      out.write("\t\t\t变更单</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t<img  alt=folder src=\"");
      out.print(request.getContextPath());
      out.write("/images/icon/icon_inbox.gif\">\r\n");
      out.write("\t\t\t<a class=item onclick=\"javascript:go_Href('");
      out.print(request.getContextPath());
      out.write("/aids/customerreleaseAction.do?busiId=CUSTOMER_SUPPORT_RELEASE_LOG&act=queryParent')\">\r\n");
      out.write("\t\t\t发布单</a>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t<!-- --><div>\t\r\n");
      out.write("\t<img  alt=folder src=\"");
      out.print(request.getContextPath());
      out.write("/images/icon/icon_inbox.gif\">\r\n");
      out.write("\t\t\t<a class=item onclick=\"javascript:go_Href('");
      out.print(request.getContextPath());
      out.write("/aids/customersystemAction.do?busiId=CUSTOMER_SUPPORT_SYSTEM_LOG&act=queryParent')\">\r\n");
      out.write("\t\t\t系统故障</a>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t<img  alt=folder src=\"");
      out.print(request.getContextPath());
      out.write("/images/icon/icon_inbox.gif\">\r\n");
      out.write("\t\t\t<a class=item onclick=\"javascript:go_Href('");
      out.print(request.getContextPath());
      out.write("/aids/customerdataAction.do?busiId=CUSTOMER_SUPPORT_DATA_LOG&act=queryParent')\">\r\n");
      out.write("\t\t\t数据申请</a>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t<img  alt=folder src=\"");
      out.print(request.getContextPath());
      out.write("/images/icon/icon_inbox.gif\">\r\n");
      out.write("\t\t\t<a class=item onclick=\"javascript:go_Href('");
      out.print(request.getContextPath());
      out.write("/aids/downtimeAction.do?busiId=CUSTOMER_SUPPORT_DOWNTIME_LOG&act=queryParent')\">\r\n");
      out.write("\t\t\t停机申请</a>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t<!-- \r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<img  alt=folder src=\"");
      out.write("/images/icon/icon_inbox.gif\">\r\n");
      out.write("\t\t\t<a class=item onclick=\"javascript:go_Href('");
      out.write("/aids/customeranaAction.do?busiId=CUSTOMER_SUPPORT_SUB_LOG&act=queryParent')\">\r\n");
      out.write("\t\t\t日志分析</a>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("  -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
