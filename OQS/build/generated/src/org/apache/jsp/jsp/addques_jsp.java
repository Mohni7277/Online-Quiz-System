package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addques_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Document</title>\n");
      out.write("        <link href=\"../css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"addquescon.jsp\">\n");
      out.write("        <div class=\"add-q-main-body\">\n");
      out.write("            <div class=\"add-q-outer\">\n");
      out.write("                <div class=\"add-q-inner\">\n");
      out.write("                    <div class=\"add-q-inner1\">\n");
      out.write("                        <div class=\"ques-no-tick\">\n");
      out.write("                            <div class=\"add-q-ques-no\">\n");
      out.write("                                1\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"add-q-tick\">\n");
      out.write("                                <button type=\"submit\"><i class=\"fa fa-check fa-3x\"></i></button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"ques-option\">\n");
      out.write("                            <div class=\"enter-ques\">\n");
      out.write("                                <input type=\"text\" class=\"enter-ques-text-box\" value=\"Enter question\" name=\"quest\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"enter-options\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <input type=\"radio\" id=\"q1-answers-A\" value=\"A\">\n");
      out.write("                                        <label for=\"q1-answers-A\"><input type=\"text\" name=\"opn1\" value=\"Option 1\"></label>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <input type=\"radio\" id=\"q1-answers-B\" value=\"B\">\n");
      out.write("                                        <label for=\"q1-answers-B\"><input type=\"text\" name=\"opn2\" value=\"Option 2\"></label>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <input type=\"radio\" id=\"q1-answers-C\" value=\"C\">\n");
      out.write("                                        <label for=\"q1-answers-C\"><input type=\"text\" name=\"opn3\" value=\"Option 3\"></label>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <input type=\"radio\" id=\"q1-answers-D\" value=\"D\">\n");
      out.write("                                        <label for=\"q1-answers-D\"><input type=\"text\" name=\"opn4\" value=\"Option 4\"></label>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"add-q-inner2\">\n");
      out.write("                        <div class=\"ans-box\">\n");
      out.write("                            <div class=\"ans-box-header\">\n");
      out.write("                                <div class=\"ans-box-header-text\">Answer</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"ans-txtbox-label\">\n");
      out.write("                                <label for=\"ans-of-ques\">Enter the correct option number</label>\n");
      out.write("                                <input type=\"text\" class=\"ans-of-ques\" value=\"Correct Answer\" name=\"ans\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
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
}
