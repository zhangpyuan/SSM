package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cn.com.sinosoft.frame.taglib.html.MultiSelDlgTag;
import org.apache.struts.util.RequestUtils;

public final class multiSelDlg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
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
          out.write("<LINK href=\"");
          out.print(request.getContextPath());
          out.write("/css/default_style.css\" type=text/css rel=stylesheet>\r\n");
          out.write("<LINK href=\"");
          out.print(request.getContextPath());
          out.write("/css/style.css\" type=text/css rel=stylesheet>\r\n");
          out.write("<script language=\"javascript\" src=\"");
          out.print(request.getContextPath());
          out.write("/js/frameTag.js\"></script>\r\n");
          out.write("<script language=\"javascript\" src=\"");
          out.print(request.getContextPath());
          out.write("/js/popupDlg.js\"></script>\r\n");
          out.write("</head>\r\n");

	String dlgVarName=request.getParameter("dlgVarName");
	if (dlgVarName==null || dlgVarName.length()==0)
		return;

          out.write("\r\n");
          out.write("<script language=\"javascript\">\r\n");
          out.write("    \r\n");
          out.write("\tvar dlgData = window.dialogArguments.");
          out.print(dlgVarName);
          out.write(";\r\n");
          out.write("\tfunction copyToList(from,to){\r\n");
          out.write("\t  fromList = eval('document.forms[0].' + from);\r\n");
          out.write("\t  toList = eval('document.forms[0].' + to);\r\n");
          out.write("\t \r\n");
          out.write("\t  var sel = false;\r\n");
          out.write("\t  for (i=0;i<fromList.options.length;i++){\r\n");
          out.write("\t    var current = fromList.options[i];\r\n");
          out.write("\t    if (current.selected){\r\n");
          out.write("\t      sel = true;\r\n");
          out.write("\t      txt = current.text;\r\n");
          out.write("\t      val = current.value;\r\n");
          out.write("\t      toList.options[toList.length] = new Option(txt,val);\r\n");
          out.write("\t      fromList.options[i] = null;\r\n");
          out.write("\t      i--;\r\n");
          out.write("\t    }\r\n");
          out.write("\t  }\r\n");
          out.write("\t}\r\n");
          out.write("\t\r\n");
          out.write("\tfunction upMoveClick(objName){\r\n");
          out.write("\t\tvar obj = eval('document.forms[0].' + objName);\r\n");
          out.write("\t  \tvar iLen = obj.options.length;\r\n");
          out.write("\t  \tvar backOptions = new Array();\r\n");
          out.write("\t\tvar iLen = obj.options.length;\r\n");
          out.write("\t  \t\r\n");
          out.write("\t  \tfor (i=0;i<iLen ;i++){\r\n");
          out.write("\t  \t\tvar optElement = new Array();\r\n");
          out.write("\t  \t\toptElement [0]  = new Option(obj.options[i].text,obj.options[i].value);\r\n");
          out.write("\t  \t\toptElement [1]  = obj.options[i].selected; \r\n");
          out.write("\t  \t\tbackOptions [i] = optElement;  \r\n");
          out.write("\t  \t\tif (obj.options[i].selected){\r\n");
          out.write("\t  \t\t\tif (obj.options[i].index==0)\r\n");
          out.write("\t  \t\t\t\treturn;\r\n");
          out.write("\t  \t\t\tbackOptions [i]=backOptions [i-1];\r\n");
          out.write("\t  \t\t\tbackOptions [i-1]= optElement;  \t\t\t\r\n");
          out.write("\t\r\n");
          out.write("\t\t\t}\r\n");
          out.write("\t  \t}\r\n");
          out.write("\t  \tobj.options.length = 0;\r\n");
          out.write("\t  \tfor (i=0;i<backOptions .length;i++){\r\n");
          out.write("\t  \t\tobj.options[i]=backOptions [i][0];\r\n");
          out.write("\t  \t\tobj.options[i].selected = backOptions [i][1];\r\n");
          out.write("\t\r\n");
          out.write("\t  \t}\r\n");
          out.write("\t}\r\n");
          out.write("\t\r\n");
          out.write("\tfunction downMoveClick(objName){\r\n");
          out.write("\t\tvar obj = eval('document.forms[0].' + objName);\r\n");
          out.write("\t  \tvar iLen = obj.options.length;\r\n");
          out.write("\t  \tvar backOptions = new Array();\r\n");
          out.write("\t\tvar iLen = obj.options.length;\r\n");
          out.write("\t  \t\r\n");
          out.write("\t  \tfor (i=iLen-1;i>=0;i--){\r\n");
          out.write("\t  \t\tvar optElement = new Array();\r\n");
          out.write("\t  \t\toptElement [0]  = new Option(obj.options[i].text,obj.options[i].value);\r\n");
          out.write("\t  \t\toptElement [1]  = obj.options[i].selected; \r\n");
          out.write("\t  \t\tbackOptions [i] = optElement;  \r\n");
          out.write("\t  \t\tif (obj.options[i].selected){\r\n");
          out.write("\t  \t\t\tif (obj.options[i].index==iLen-1)\r\n");
          out.write("\t  \t\t\t\treturn;\r\n");
          out.write("\t  \t\t\tbackOptions [i]=backOptions [i+1];\r\n");
          out.write("\t  \t\t\tbackOptions [i+1]= optElement;  \t\t\t\r\n");
          out.write("\t\r\n");
          out.write("\t\t\t}\r\n");
          out.write("\t  \t}\r\n");
          out.write("\t  \tobj.options.length = 0;\r\n");
          out.write("\t  \tfor (i=0;i<backOptions .length;i++){\r\n");
          out.write("\t  \t\tobj.options[i]=backOptions [i][0];\r\n");
          out.write("\t  \t\tobj.options[i].selected = backOptions [i][1];\r\n");
          out.write("\t\r\n");
          out.write("\t  \t}\r\n");
          out.write("\t}\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\tfunction okClick(formObj){\r\n");
          out.write("\r\n");
          out.write("\t\tvar selValue = \"\";\r\n");
          out.write("\t\tvar captionVal = \"\";\r\n");
          out.write("\t\t\r\n");
          out.write("\t  \tfor (i=0;i<formObj.chosen_sel.options.length;i++){\r\n");
          out.write("\t  \t\tif (selValue!=\"\"){\r\n");
          out.write("\t  \t\t\t\r\n");
          out.write("\t  \t\t\tselValue = selValue + \"||\";\r\n");
          out.write("\t  \t\t\tcaptionVal = captionVal + \", \";\r\n");
          out.write("\t  \t\t}\r\n");
          out.write("\t  \t\t\r\n");
          out.write("\t  \t\tselValue = selValue + formObj.chosen_sel.options[i].value;\r\n");
          out.write("\t  \t\tcaptionVal = captionVal + (i+1) +\".\"+formObj.chosen_sel.options[i].text;\r\n");
          out.write("\t\r\n");
          out.write("\t  \t}\r\n");
          out.write("\t  \t\r\n");
          out.write("\t  \twindow.dialogArguments.");
          out.print(dlgVarName);
          out.write(".selValue = selValue;\r\n");
          out.write("\r\n");
          out.write("  \t\t  \t\r\n");
          out.write("\t  \tvar descFormObj = eval('window.dialogArguments.document.' + dlgData.form);\r\n");
          out.write("\t  \tvar inputObj = descFormObj.item(dlgData.property);\r\n");
          out.write("\t  \tif (dlgData.captionProperty!=\"\"){\r\n");
          out.write("\t  \t\tvar captionObj = descFormObj.item(dlgData.captionProperty);\r\n");
          out.write("\t  \t\tcaptionObj.value = captionVal;\r\n");
          out.write("\t  \t}\r\n");
          out.write("\t  \tinputObj.value = selValue;\r\n");
          out.write("\t  \twindow.returnValue=inputObj;\r\n");
          out.write("\t  \tvar div = eval('window.dialogArguments.' + dlgData.divName);\r\n");
          out.write("\t\tdiv.innerHTML = captionVal;\r\n");
          out.write("\t\twindow.close();\r\n");
          out.write("\t\t\r\n");
          out.write("\t}\r\n");
          out.write("\t\r\n");
          out.write("\tfunction init(){\r\n");
          out.write("\t\r\n");
          out.write("\t    var disabled = false;\r\n");
          out.write("\t    \r\n");
          out.write("\t\tthis.document.forms[0].possible_sel.options.length=0;\r\n");
          out.write("\t\tthis.document.forms[0].chosen_sel.options.length=0;\r\n");
          out.write("\t\tvar selValArray = dlgData.selValue.split(\"||\");\r\n");
          out.write("\t\t\r\n");
          out.write("\t\tvar optionsObj = eval('window.dialogArguments.' + dlgData.jsVarName);\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\r\n");
          out.write("\t\tfor (j = 0; j<optionsObj.options.length;j++){\r\n");
          out.write("\t\t\tvar bExist = false;\r\n");
          out.write("\t\t\tvar chosenLen = this.document.forms[0].chosen_sel.options.length;\r\n");
          out.write("\t\t\tvar possibleLen = this.document.forms[0].possible_sel.options.length;\r\n");
          out.write("\t\t\tfor (i = 0; i<selValArray.length; i++){\r\n");
          out.write("\t\t\t\tif (selValArray[i]==optionsObj.options[j].value){\r\n");
          out.write("\t\t\t\t\tbExist = true;\r\n");
          out.write("\t\t\t\t\tbreak;\r\n");
          out.write("\t\t\t\t}\r\n");
          out.write("\t\t\t}\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\tif (bExist){\r\n");
          out.write("\t\t\t\tthis.document.forms[0].chosen_sel.options[chosenLen] = new Option(optionsObj.options[j].text,optionsObj.options[j].value);\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t}else{\r\n");
          out.write("\t\t\t\tthis.document.forms[0].possible_sel.options[possibleLen] =  new Option(optionsObj.options[j].text,optionsObj.options[j].value);\r\n");
          out.write("\t\t\t}\r\n");
          out.write("\t\t}\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\tif (dlgData.pageState==\"add\" || dlgData.pageState==\"ADD\"){\r\n");
          out.write("\t\t\tif (dlgData.addState==\"view\")\r\n");
          out.write("\t\t\t\tdisabled = true;\r\n");
          out.write("\t\t}else if (dlgData.pageState==\"EDIT\" || dlgData.pageState==\"edit\"){\r\n");
          out.write("\t\t\tif (dlgData.editState==\"view\")\r\n");
          out.write("\t\t\t\tdisabled = true;\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t}else if (dlgData.pageState==\"VIEW\" || dlgData.pageState==\"view\"){\r\n");
          out.write("\t\t\tdisabled = true;\r\n");
          out.write("\t\t}\r\n");
          out.write("\t\tthis.document.forms[0].leftMove.disabled = disabled;\r\n");
          out.write("\t\tthis.document.forms[0].rightMove.disabled = disabled;\r\n");
          out.write("\t\tthis.document.forms[0].upMove.disabled = disabled;\r\n");
          out.write("\t\tthis.document.forms[0].downMove.disabled = disabled;\r\n");
          out.write("\t\tthis.document.forms[0].btnOK.disabled = disabled;\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\r\n");
          out.write("\t}\r\n");
          out.write("\r\n");
          out.write("</script>\r\n");
          out.write("<body  bgcolor=\"#F5F1F5\">\r\n");
          out.write("<form name=\"multiseldlg\">\r\n");
          out.write("  <table id=multiselectdialog name=multiselectdialog class=\"WorkPage_NormalTable_Head\" cellpadding=\"0\"  cellspacing=\"0\" style=\"width:100%;height:100%\">\r\n");
          out.write("\t<tr >\r\n");
          out.write("\t\t<td class=\"WorkPage_PageTitle_Left\"></td>\r\n");
          out.write("\t\t<td class=\"WorkPage_PageTitle\">\r\n");
          out.write("\t\t\t<SPAN id=\"spnPageTitle\" class=\"fontColor_PageTitle\">\r\n");
          out.write("\t\t\t<script language=\"javascript\">\r\n");
          out.write("\t\t\t\t\tdocument.write(dlgData.title);\r\n");
          out.write("\t\t\t</script>\r\n");
          out.write("\t\t\t<SPAN>\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t\t<td class=\"WorkPage_PageTitle_Right\"></td>\r\n");
          out.write("\t\t<td class=\"WorkPage_BasicCtrl_Button\">\r\n");
          out.write("\t\t\t  <input type=\"button\" value=\"确定\" name=\"btnOK\" class=\"BUTTON_01\" MouseType=\"2\" onclick=\"okClick(this.form)\">\r\n");
          out.write("\t\t\t  <input type=\"button\" value=\"取消\" name=\"btnCal\" class=\"BUTTON_01\" MouseType=\"2\" onclick=\"window.close()\">\r\n");
          out.write("   \t\t</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t<td colspan=4>\r\n");
          out.write("    \t<table cellSpacing=4 cellPadding=4 class=\"WorkPage_NormalTable_Body\" style=\"width:100%;height:100%\">\r\n");
          out.write("\t\t\t<colgroup>\r\n");
          out.write("\t\t\t\t<col width=\"46%\">\r\n");
          out.write("\t\t\t\t<col width=\"4%\">\r\n");
          out.write("\t\t\t\t<col width=\"46%\">\r\n");
          out.write("\t\t\t\t<col width=\"4%\">\r\n");
          out.write("\t\t\t</colgroup>\r\n");
          out.write("\t\t\t<tbody>\r\n");
          out.write("             <tr>\r\n");
          out.write("               <td width=\"46%\" valign=\"top\">\r\n");
          out.write("\t\t\t\t<select name=\"possible_sel\" multiple=\"multiple\" size=\"20\" style=\"width:100%;\" ondblclick=\"copyToList('possible_sel','chosen_sel')\">\r\n");
          out.write("\t\t\t\t</select>\r\n");
          out.write("               </td>\r\n");
          out.write("\t\t\t  <td id=\"toolbar\" width=\"4%\">\r\n");
          out.write("\t\t\t     <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
          out.write("\t\t\t\t    <tr>\r\n");
          out.write("\t\t\t\t       <td><input name = \"rightMove\" type=\"button\" value= \"→\" onclick=\"copyToList('possible_sel','chosen_sel')\"></td>\r\n");
          out.write("\t\t\t\t    </tr>\r\n");
          out.write("\t\t\t\t    <tr>\r\n");
          out.write("\t\t\t\t       <td><input name = \"leftMove\"  type=\"button\" value= \"←\" onclick=\"copyToList('chosen_sel','possible_sel')\"></td>\r\n");
          out.write("\t\t\t\t    </tr>\r\n");
          out.write("\t\t\t     </table>\r\n");
          out.write("\t\t\t  </td>\r\n");
          out.write("              <td width=\"46%\" valign=\"top\">\r\n");
          out.write("\t\t\t\t <select name=\"chosen_sel\" multiple=\"multiple\" size=\"20\" style=\"width:100%;\" ondblclick=\"copyToList('chosen_sel','possible_sel')\">\r\n");
          out.write("\t\t\t\t </select>\r\n");
          out.write("              </td> \r\n");
          out.write("             <td id=\"toolbar\" width=\"4%\">\r\n");
          out.write("\t\t\t     <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
          out.write("\t\t\t\t    <tr>\r\n");
          out.write("\t\t\t\t       <td><input name = \"upMove\" type=\"button\" value=\"↑\" onclick=\"upMoveClick('chosen_sel')\"></td>\r\n");
          out.write("\t\t\t\t    </tr>\r\n");
          out.write("\t\t\t\t    <tr>\r\n");
          out.write("\t\t\t\t       <td><input name = \"downMove\"  type=\"button\" value=\"↓\" onclick=\"downMoveClick('chosen_sel')\"></td>\r\n");
          out.write("\t\t\t\t    </tr>\r\n");
          out.write("\t\t\t     </table>\r\n");
          out.write("\t\t\t </td>\r\n");
          out.write("           </tr> \r\n");
          out.write("         </tbody>\r\n");
          out.write("\r\n");
          out.write("   </table>\r\n");
          out.write("   </td></tr></table>\r\n");
          out.write("</form>\r\n");
          out.write("</body>\r\n");
          out.write("\r\n");
          out.write("<script language=\"javascript\">\r\n");
          out.write("\r\n");
          out.write("\tinit();\r\n");
          out.write("</script>\r\n");
          out.write("\r\n");
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
}
