package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class spro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compalible\" content=\"ie-edge\">\n");
      out.write("        <title>Profile</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"spro-outer\">\n");
      out.write("            <div class=\"menu-bar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"active\"><a href=\"index.html\"><i class=\"fa fa-home\"></i>Home</a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-list-alt\"></i>Categories</a>\n");
      out.write("                        <div class=\"sub-menu-1\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"quizface.html\">Java</a></li>\n");
      out.write("                                <li><a href=\"quizface.html\">C</a></li>\n");
      out.write("                                <li><a href=\"quizface.html\">C++</a></li>\n");
      out.write("                                <li><a href=\"quizface.html\">Python</a></li>\n");
      out.write("                                <li><a href=\"quizface.html\">Visual Basic</a></li>\n");
      out.write("                                <li><a href=\"quizface.html\">FoxPro</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <!-- <li><a href=\"#\"><i class=\"fa fa-question-circle\"></i>Q/A</a></li> -->\n");
      out.write("                    <!-- <li><a href=\"#\"><i class=\"fa fa-sign-in\"></i>Login</a>\n");
      out.write("                        <div class=\"sub-menu-2\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"login2.html\">User Login</a></li>\n");
      out.write("                                <li><a href=\"#\">Faculty Login</a></li>\n");
      out.write("                                <li><a href=\"#\">Administrator Login</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </li> -->\n");
      out.write("                    <li><a href=\"spro.html\"><i class=\"fa fa-user\"></i>Profile</a></li>\n");
      out.write("                    <!-- <li class=\"search-bar\"><input type=\"text\" placeholder=\"Search...\"></li>\n");
      out.write("                    <li class=\"search-button\"><button><i class=\"fa fa-search\"></i></button></li> -->\n");
      out.write("                </ul> \n");
      out.write("            </div>\n");
      out.write("            <div class=\"spro-main-body\">\n");
      out.write("                <div class=\"spro-profile-outer\">\n");
      out.write("                    <div class=\"spro-profile-inner\">\n");
      out.write("                        <div class=\"spro-my-profile\">\n");
      out.write("                            <div class=\"spro-profile-header\">\n");
      out.write("                                <h4 class=\"spro-my-profile-text\">MY PROFILE</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"spro-pfp-name-userid\">\n");
      out.write("                                <div class=\"spro-pfp-logo\">\n");
      out.write("                                    <img src=\"Images/2_circle_pfp.PNG\" alt=\"logo\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"spro-name-userid\">\n");
      out.write("                                    <p> \n");
      out.write("                                        <b>Kaajal Kaushal</b><br>\n");
      out.write("                                        <b style=\"color: gray;\">@kaajal.29</b><br>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <hr>\n");
      out.write("                            <div class=\"spro-edu-contact\">\n");
      out.write("                                <div class=\"spro-education\">\n");
      out.write("                                    <div class=\"spro-education-header\">\n");
      out.write("                                        <p class=\"spro-edu-header-text\">EDUCATION</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"spro-edu-value\">\n");
      out.write("                                        <p><label for=\"spro-edu-value\">Pursuing BCA at Magadh Mahila College</label></p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <hr>\n");
      out.write("                                <div class=\"spro-contact\">\n");
      out.write("                                    <div class=\"spro-contact-header\">\n");
      out.write("                                        <p class=\"spro-contact-header-text\">CONTACT INFO</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"spro-email-mob\">\n");
      out.write("                                        <div class=\"spro-email\">\n");
      out.write("                                            <p class=\"spro-email-txt\">Email: </p>\n");
      out.write("                                            <p class=\"spro-email-value\"><label for=\"spro-email\">kaajal.29.dd@gmail.com</label></p> \n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"spro-mob\">\n");
      out.write("                                            <p class=\"spro-mob-txt\">Mob. no.:</p>\n");
      out.write("                                            <p class=\"spro-mob-value\"><label for=\"spro-mob\">98765432100</label></p> \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"spro-recent-quiz\">\n");
      out.write("                            <div class=\"spro-recent-quiz-header\">\n");
      out.write("                                <p class=\"spro-recent-quiz-text\">RECENT QUIZZES</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"spro-recent-quiz-names\">\n");
      out.write("                                <p><b class=\"spro-recent-quiz-no\">1</b> JAVA Quiz</p><a href=\"cop.html\"><i class=\"fa fa-download\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
}
