package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_p_textfield_name_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_p_form_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_p_submit_value;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_p_textfield_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_p_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_p_submit_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_p_textfield_name_label_nobody.release();
    _jspx_tagPool_p_form_method_action.release();
    _jspx_tagPool_p_submit_value.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<!-- DW6 -->\n");
      out.write("<head>\n");
      out.write("<!-- Copyright 2005 Macromedia, Inc. All rights reserved. -->\n");
      out.write("<title>Home Page</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"mm_lodging1.css\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#999966\">\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("\t<tr>\n");
      out.write("\t<td width=\"15\" nowrap=\"nowrap\"><img src=\"mm_spacer.gif\" alt=\"\" width=\"15\" height=\"1\" border=\"0\" /></td>\n");
      out.write("\t<td height=\"60\" colspan=\"3\" class=\"logo\" nowrap=\"nowrap\"><br />\n");
      out.write("\t  BHEL_EMAIL SYSTEM </td>\n");
      out.write("\t<td width=\"40\">&nbsp;</td>\n");
      out.write("\t<td width=\"100%\">&nbsp;</td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr bgcolor=\"#ffffff\">\n");
      out.write("\t<td colspan=\"6\"><img src=\"mm_spacer.gif\" alt=\"\" width=\"1\" height=\"1\" border=\"0\" /></td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr bgcolor=\"#a4c2c2\">\n");
      out.write("\t<td width=\"15\" nowrap=\"nowrap\">&nbsp;</td>\n");
      out.write("\t<td height=\"36\" colspan=\"3\" id=\"navigation\" class=\"navText\"><a href=\"javascript:;\"></a>&nbsp;\n");
      out.write("      <a href=\"javascript:;\">ABOUT US</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href=\"javascript:;\">VISION, MISSION AND VALUES</a>&nbsp;\n");
      out.write("      &nbsp;&nbsp;&nbsp; <a href=\"javascript:;\">PRODUCTS AND SERVICES</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("      <a href=\"javascript:;\">CONTACT US</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>\n");
      out.write("\t<td width=\"40\">&nbsp;</td>\n");
      out.write("\t<td width=\"100%\">&nbsp;</td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr bgcolor=\"#ffffff\">\n");
      out.write("\t<td colspan=\"6\"><img src=\"mm_spacer.gif\" alt=\"\" width=\"1\" height=\"1\" border=\"0\" /></td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr bgcolor=\"#ffffff\">\n");
      out.write("\t<td width=\"230\" colspan=\"2\" valign=\"top\" bgcolor=\"#a4c2c2\"><img src=\"BHEL-Haridwar.jpg\" alt=\"Home Page Image\" width=\"300\" height=\"250\" border=\"0\" />\n");
      out.write("\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"230\">\n");
      out.write("\t  <!--DWLayoutTable-->\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td height=\"58\" colspan=\"3\" valign=\"top\"><img src=\"email.jpg\" alt=\"Home Page Image\" width=\"300\" height=\"200\" border=\"0\" /></td>\n");
      out.write("\t\t<td width=\"22\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t  <td width=\"230\" height=\"1\"></td>\n");
      out.write("\t\t  <td></td>\n");
      out.write("\t\t  <td width=\"230\"></td>\n");
      out.write("\t      <td></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\t</td>\n");
      out.write("\t<td width=\"50\" valign=\"top\"><img src=\"mm_spacer.gif\" alt=\"\" width=\"50\" height=\"1\" border=\"0\" /></td>\n");
      out.write("\t<td width=\"440\" valign=\"top\"><br />\n");
      out.write("\t<br />\n");
      out.write("\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"440\">\n");
      out.write("\t  <!--DWLayoutTable-->\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td class=\"pageName\"><div align=\"center\">Welcome to BHEL_EMAIL </div></td>\n");
      out.write("\t\t</tr><tr>\n");
      out.write("\t\t<td class=\"bodyText\">\n");
      out.write("\t\t  <h6 align=\"center\">kindly enter your account details to login.</h6>\n");
      out.write("\t\t  <br />\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t");
      if (_jspx_meth_p_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t   <td align=\"center\"> \n");
      out.write("\t\t    new user? <a href=\" \">click here</a>\n");
      out.write("\t\t    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;forget password?<a href=\"\">click here</a>\n");
      out.write("\t\t   </td>\n");
      out.write("\t\t     <td height=\"130\"></td>\n");
      out.write("\t    </tr>\n");
      out.write("\t</table>\n");
      out.write("        <table>\n");
      out.write("        <tr>\n");
      out.write("\t <td width=\"40\">&nbsp;</td>\n");
      out.write("\t <td width=\"100%\">&nbsp;</td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr bgcolor=\"#ffffff\">\n");
      out.write("\t <td colspan=\"6\"><img src=\"mm_spacer.gif\" alt=\"\" width=\"1\" height=\"1\" border=\"0\" /></td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr>\n");
      out.write("\t<td width=\"15\">&nbsp;</td>\n");
      out.write("\t<td width=\"215\">&nbsp;</td>\n");
      out.write("\t<td width=\"50\">&nbsp;</td>\n");
      out.write("\t<td width=\"440\">&nbsp;</td>\n");
      out.write("\t<td width=\"40\">&nbsp;</td>\n");
      out.write("\t<td width=\"100%\">&nbsp;</td>\n");
      out.write("\t</tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_p_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_p_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_p_form_method_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_p_form_0.setPageContext(_jspx_page_context);
    _jspx_th_p_form_0.setParent(null);
    _jspx_th_p_form_0.setAction("log");
    _jspx_th_p_form_0.setMethod("post");
    int _jspx_eval_p_form_0 = _jspx_th_p_form_0.doStartTag();
    if (_jspx_eval_p_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t<tr>\n");
        out.write("                    <th>");
        if (_jspx_meth_p_textfield_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_p_form_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("\t\t</tr>\n");
        out.write("                <tr>\n");
        out.write("                    <th>");
        if (_jspx_meth_p_textfield_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_p_form_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("\t\t</tr>\n");
        out.write("                <tr>\n");
        out.write("                    <th>");
        if (_jspx_meth_p_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_p_form_0, _jspx_page_context))
          return true;
        out.write("</th>        \n");
        out.write("                </tr>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_p_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_form_method_action.reuse(_jspx_th_p_form_0);
      return true;
    }
    _jspx_tagPool_p_form_method_action.reuse(_jspx_th_p_form_0);
    return false;
  }

  private boolean _jspx_meth_p_textfield_0(javax.servlet.jsp.tagext.JspTag _jspx_th_p_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_p_textfield_0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_p_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_p_textfield_0.setPageContext(_jspx_page_context);
    _jspx_th_p_textfield_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_p_form_0);
    _jspx_th_p_textfield_0.setName("id");
    _jspx_th_p_textfield_0.setLabel("EMAIL ID");
    int _jspx_eval_p_textfield_0 = _jspx_th_p_textfield_0.doStartTag();
    if (_jspx_th_p_textfield_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_textfield_name_label_nobody.reuse(_jspx_th_p_textfield_0);
      return true;
    }
    _jspx_tagPool_p_textfield_name_label_nobody.reuse(_jspx_th_p_textfield_0);
    return false;
  }

  private boolean _jspx_meth_p_textfield_1(javax.servlet.jsp.tagext.JspTag _jspx_th_p_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_p_textfield_1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_p_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_p_textfield_1.setPageContext(_jspx_page_context);
    _jspx_th_p_textfield_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_p_form_0);
    _jspx_th_p_textfield_1.setName("pass");
    _jspx_th_p_textfield_1.setLabel("PASSWORD");
    int _jspx_eval_p_textfield_1 = _jspx_th_p_textfield_1.doStartTag();
    if (_jspx_th_p_textfield_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_textfield_name_label_nobody.reuse(_jspx_th_p_textfield_1);
      return true;
    }
    _jspx_tagPool_p_textfield_name_label_nobody.reuse(_jspx_th_p_textfield_1);
    return false;
  }

  private boolean _jspx_meth_p_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_p_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_p_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_p_submit_value.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_p_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_p_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_p_form_0);
    _jspx_th_p_submit_0.setValue("LOGIN");
    int _jspx_eval_p_submit_0 = _jspx_th_p_submit_0.doStartTag();
    if (_jspx_eval_p_submit_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_submit_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_submit_0.doInitBody();
      }
      do {
        out.write(' ');
        int evalDoAfterBody = _jspx_th_p_submit_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_submit_value.reuse(_jspx_th_p_submit_0);
      return true;
    }
    _jspx_tagPool_p_submit_value.reuse(_jspx_th_p_submit_0);
    return false;
  }
}
