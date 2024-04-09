package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"https://kit.fontawesome.com/64d58efce2.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>Document</title>\n");
      out.write("        <link href=\"../css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"forms-container\">\n");
      out.write("            <div class=\"signin-signup\">\n");
      out.write("                <form action=\"\" class=\"sign-in-form\">\n");
      out.write("                    <h2 class=\"title\">Sign in</h2>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        <i class=\"fas fa-user\"></i>\n");
      out.write("                        <input type=\"text\" placeholder=\"Username\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        <i class=\"fas fa-lock\"></i>\n");
      out.write("                        <input type=\"password\" placeholder=\"Password\">\n");
      out.write("                    </div>\n");
      out.write("                    <!-- <input type=\"submit\" value=\"Login\" class=\"btn solid\"> -->\n");
      out.write("                    <a href=\"tpro.html\" class=\"btn solid\" id=\"login\">Login</a>\n");
      out.write("                    <!-- <p class=\"social-text\">Or sign in with social platforms</p>\n");
      out.write("                    <div class=\"social-media\">\n");
      out.write("                        <a href=\"facebook.com\" class=\"social-icon\">\n");
      out.write("                            <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"twitter.com\" class=\"social-icon\">\n");
      out.write("                            <i class=\"fab fa-twitter\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"google.com\" class=\"social-icon\">\n");
      out.write("                            <i class=\"fab fa-google\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"linkedin.com\" class=\"social-icon\">\n");
      out.write("                            <i class=\"fab fa-linkedin\"></i>\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                    </div> -->\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <form action=\"tlogincon.jsp\" class=\"sign-up-form\">\n");
      out.write("                    <h2 class=\"title\">Sign up</h2>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        <i class=\"fas fa-user\"></i>\n");
      out.write("                        <input type=\"text\" placeholder=\"Username\" name=\"uname\" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        <i class=\"fas fa-envelope\"></i>\n");
      out.write("                        <input type=\"text\" placeholder=\"Email-ID\" name=\"email\" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        <i class=\"fas fa-lock\"></i>\n");
      out.write("                        <input type=\"password\" placeholder=\"Set Password\" name=\"pass\" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        <i class=\"fas fa-lock\"></i>\n");
      out.write("                        <input type=\"text\" placeholder=\"Mobile No.\" name=\"mob\" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        <i class=\"fas fa-lock\"></i>\n");
      out.write("                        <input type=\"text\" placeholder=\"Date of birth\" name=\"dob\" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        <i class=\"fas fa-lock\"></i>\n");
      out.write("                        <input type=\"text\" placeholder=\"Qualification\" name=\"quali\" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" value=\"Sign-up\" class=\"btn solid\">\n");
      out.write("\n");
      out.write("                    <!-- <p class=\"social-text\">Or sign up with social platforms</p>\n");
      out.write("                    <div class=\"social-media\">\n");
      out.write("                        <a href=\"#\" class=\"social-icon\">\n");
      out.write("                            <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"#\" class=\"social-icon\">\n");
      out.write("                            <i class=\"fab fa-twitter\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"#\" class=\"social-icon\">\n");
      out.write("                            <i class=\"fab fa-google\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"#\" class=\"social-icon\">\n");
      out.write("                            <i class=\"fab fa-linkedin\"></i> \n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                    </div>-->\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panels-container\">\n");
      out.write("            <div class=\"panel left-panel\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <h3>Not registered ?</h3>\n");
      out.write("                    <p>Sign up to create an account on Online Quiz System.</p>\n");
      out.write("                    <button class=\"btn transparent\" id=\"sign-up-btn\">Sign up</button>\n");
      out.write("                    <!-- <a href=\"main.html\" class=\"home\">Home</a> -->\n");
      out.write("                    <a href=\"index.html\" class=\"home\">Home </a>\n");
      out.write("                </div>\n");
      out.write("                <img src=\"images/undraw_welcome_cats_thqn.svg\" class=\"image\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"panel right-panel\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <h3>One of us?</h3>\n");
      out.write("                    <p>Sign In now to play quiz</p>\n");
      out.write("                    <button class=\"btn transparent\" id=\"sign-in-btn\">Sign in</button>\n");
      out.write("                    <!-- <a href=\"main.html\" class=\"home\">Home</a> -->\n");
      out.write("                    <a href=\"index.html\" class=\"home\">Home</a>\n");
      out.write("                </div>\n");
      out.write("                <img src=\"images/undraw_digital_currency_qpak.svg\" class=\"image\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"..//javascript//app.js\"></script>\n");
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
