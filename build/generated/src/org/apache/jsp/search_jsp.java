package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import common.Fetch;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_filter_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_write_property_name_filter_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_write_property_name_filter_nobody.release();
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_text_property_nobody.release();
    _jspx_tagPool_html_submit_value_nobody.release();
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet.css\">\n");
      out.write("        <title>Dynamic Flight Fare Tracker</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"bg.jpg\">\n");
      out.write("        <center style=\"font-family:bold garamond; font-size: 400%;color:#FFBF00 \">Dynamic Flight Fare Tracker</center>\n");
      out.write("        <p3color:#0404BF>.      </p3>\n");
      out.write("        ");

            Fetch f = new Fetch();
            f.TestFunction();
            
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_html_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_html_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent(null);
    _jspx_th_html_form_0.setAction("/search");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <table border=\"0\";>\n");
        out.write("\n");
        out.write("                <tbody>\n");
        out.write("\n");
        out.write("                    <tr>\n");
        out.write("                        <td colspan=\"2\">\n");
        out.write("                            ");
        if (_jspx_meth_bean_write_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            &nbsp;</td>\n");
        out.write("                    </tr>\n");
        out.write("\n");
        out.write("\n");
        out.write("                    <tr>\n");
        out.write("                        <td>Enter Source:</td>\n");
        out.write("\n");
        out.write("                        <td>");
        if (_jspx_meth_html_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("\n");
        out.write("                    </tr>\n");
        out.write("                    <tr>\n");
        out.write("                        <td>Enter Destination:</td>\n");
        out.write("\n");
        out.write("                        <td>");
        if (_jspx_meth_html_text_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                    </tr>\n");
        out.write("                    <tr>\n");
        out.write("                        <td>Enter Date in (yyyy-mm-dd):</td>\n");
        out.write("                        <td>");
        if (_jspx_meth_html_text_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                    </tr>\n");
        out.write("                    <tr>\n");
        out.write("                        <td></td>\n");
        out.write("                        <td>");
        if (_jspx_meth_html_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                    </tr>\n");
        out.write("                    \n");
        out.write("                </tbody>\n");
        out.write("            </table>\n");
        out.write("\n");
        out.write("           \n");
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
      return true;
    }
    _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
    return false;
  }

  private boolean _jspx_meth_bean_write_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_write_0.setName("SearchForm");
    _jspx_th_bean_write_0.setProperty("error");
    _jspx_th_bean_write_0.setFilter(false);
    int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
    if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_0);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_filter_nobody.reuse(_jspx_th_bean_write_0);
    return false;
  }

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setProperty("source1");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_0);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(_jspx_page_context);
    _jspx_th_html_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_1.setProperty("destination1");
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_1);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_html_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_2 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_2.setPageContext(_jspx_page_context);
    _jspx_th_html_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_2.setProperty("date1");
    int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
    if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_2);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_2);
    return false;
  }

  private boolean _jspx_meth_html_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_value_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_submit_0.setValue("Search");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_value_nobody.reuse(_jspx_th_html_submit_0);
      return true;
    }
    _jspx_tagPool_html_submit_value_nobody.reuse(_jspx_th_html_submit_0);
    return false;
  }
}
