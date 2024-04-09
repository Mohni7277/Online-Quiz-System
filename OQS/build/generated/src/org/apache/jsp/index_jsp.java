package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Online Quiz System</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <br><br>\n");
      out.write("            <div class=\"menu-bar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"active\"><a href=\"#\"><i class=\"fa fa-home\"></i>Home</a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-list-alt\"></i>Categories</a>\n");
      out.write("                        <div class=\"sub-menu-1\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"quizface.jsp\">Java</a></li>\n");
      out.write("                                <li><a href=\"quizface.jsp\">Oracle</a></li>\n");
      out.write("                                <li><a href=\"quizface.jsp\">C++</a></li>\n");
      out.write("                                <li><a href=\"quizface.jsp\">Python</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-sign-in\"></i>Login</a>\n");
      out.write("                        <div class=\"sub-menu-2\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"slogin.jsp\">User Login</a></li>\n");
      out.write("                                <li><a href=\"tlogin.jsp\">Faculty Login</a></li>\n");
      out.write("                                <!-- <li><a href=\"#\">Administrator Login</a></li> -->\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"spro.jsp\"><i class=\"fa fa-user\"></i>Profile</a></li>\n");
      out.write("                    <!-- <li>\n");
      out.write("                        <div class=\"search-bar\">\n");
      out.write("                            <div class=\"search-bar-txt-box\">\n");
      out.write("                                <input type=\"text\" placeholder=\"Search...\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"search-button\">\n");
      out.write("                                <button><i class=\"fa fa-search\"></i></button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li> -->\n");
      out.write("                    <!-- <li class=\"search-bar\"><input type=\"text\" placeholder=\"Search...\"></li>\n");
      out.write("                    <li class=\"search-button\"><button><i class=\"fa fa-search\"></i></button></li> -->\n");
      out.write("                </ul> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"slider-holder\">\n");
      out.write("                <div class=\"image-holder\">\n");
      out.write("                    <a href=\"quizface.jsp\"><img src=\"images/java_cover.png\" alt=\"1st slide\" class=\"slider-image\"></a>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"image-holder\">\n");
      out.write("                    <a href=\"quizface.jsp\"><img src=\"images/python_cover.png\" alt=\"2nd slide\" class=\"slider-image\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"image-holder\">\n");
      out.write("                    <a href=\"quizface.jsp\"><img src=\"images/c++_cover.png\" alt=\"3rd slide\" class=\"slider-image\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"image-holder\">\n");
      out.write("                    <a href=\"quizface.jsp\"><img src=\"images/oracle_cover.png\" alt=\"4th slide\" class=\"slider-image\"></a>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"prev\" onclick=\"plusSlides(-1)\">&#10094;</a>\n");
      out.write("                <a class=\"next\" onclick=\"plusSlides(1)\">&#10095;</a>\n");
      out.write("            </div> \n");
      out.write("            <br>\n");
      out.write("            <div class=\"slider-dots\">\n");
      out.write("                <span class=\"dot\" onclick=\"currentSlide(1)\"></span>\n");
      out.write("                <span class=\"dot\" onclick=\"currentSlide(2)\"></span>\n");
      out.write("                <span class=\"dot\" onclick=\"currentSlide(3)\"></span>\n");
      out.write("                <span class=\"dot\" onclick=\"currentSlide(4)\"></span>\n");
      out.write("            </div>\n");
      out.write("            <script>\n");
      out.write("                var slideIndex = 1;\n");
      out.write("                showSlides(slideIndex);\n");
      out.write("                    \n");
      out.write("                function plusSlides(n) {\n");
      out.write("                    showSlides(slideIndex += n);\n");
      out.write("                }\n");
      out.write("                    \n");
      out.write("                function currentSlide(n) {\n");
      out.write("                    showSlides(slideIndex = n);\n");
      out.write("                }\n");
      out.write("                    \n");
      out.write("                function showSlides(n) {\n");
      out.write("                    var i;\n");
      out.write("                    var slides = document.getElementsByClassName(\"slider-image\");\n");
      out.write("                    var dots = document.getElementsByClassName(\"dot\");\n");
      out.write("                    if (n > slides.length) {slideIndex = 1}    \n");
      out.write("                    if (n < 1) {slideIndex = slides.length}\n");
      out.write("                    for (i = 0; i < slides.length; i++) {\n");
      out.write("                        slides[i].style.display = \"none\";  \n");
      out.write("                    }\n");
      out.write("                    for (i = 0; i < dots.length; i++) {\n");
      out.write("                        dots[i].className = dots[i].className.replace(\" active\", \"\");\n");
      out.write("                    }\n");
      out.write("                    slides[slideIndex-1].style.display = \"block\";  \n");
      out.write("                    dots[slideIndex-1].className += \" active\";\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("\n");
      out.write("            <section><hr></section>\n");
      out.write("            <div class=\"latestq\">\n");
      out.write("                <div class=\"d1\">\n");
      out.write("                    <b>Latest Quizez</b>\n");
      out.write("                    <!-- <button class=\"latestq-see-all-btn\">See All</button> -->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"latestq1\">\n");
      out.write("                    <a href=\"quizface.jsp\"><img src=\"images/java_thumbnail.png\" alt=\"Quiz 1\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"latestq2\">\n");
      out.write("                    <a href=\"quizface.jsp\"><img src=\"images/python_thumbnail.png\" alt=\"Quiz 2\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"latestq3\">\n");
      out.write("                    <a href=\"quizface.jsp\"><img src=\"images/c++_thumbnail.png\" alt=\"Quiz 3\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"latestq4\">\n");
      out.write("                    <a href=\"quizface.jsp\"><img src=\"images/oracle_thumbnail.png\" alt=\"Quiz 4\"></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <section><hr></section>\n");
      out.write("            <div class=\"bottom\">\n");
      out.write("                <div class=\"about\">\n");
      out.write("                    <b><p class=\"text-big\">About Us</p></b>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><i class=\"fa fa-chevron-circle-right\"></i><div class=\"popup\" onclick=\"myFunction()\">About Quiz System\n");
      out.write("                            <span class=\"popuptext\" id=\"myPopup\">Online Quiz System is designed with the purpose of allowing the students to take quiz/test. It is a Multiple Choice Questions(MCQ) based system. Students are provided thr flexibility to choose among different types of programming language quizzes according to their interest. The main purpose of the system is to efficiently evaluate the students thoroughly through a fully automated system that not only saves a lot of time but also gives fast results.</span></div>\n");
      out.write("                            <script>\n");
      out.write("                                // When the user clicks on div, open the popup\n");
      out.write("                                function myFunction() {\n");
      out.write("                                var popup = document.getElementById(\"myPopup\");\n");
      out.write("                                popup.classList.toggle(\"show\");\n");
      out.write("                                }\n");
      out.write("                            </script>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li><i class=\"fa fa-chevron-circle-right\"></i><div class=\"our-team-popup\" onclick=\"ourteamFunction()\">Our Team\n");
      out.write("                            <span class=\"our-team-popuptext\" id=\"our-team-Popup\"><p>We are a group of students from Magadh Mahila College, with technical backgrounds.</p><p>Ayushi Kumari <a href=\"mailto: ayushikumari93340@gmail.com\"><i class=\"fa fa-envelope\"></i></a></p> <p>Kaajal Kaushal <a href=\"mailto: kaajal.29.dd@gmail.com\"><i class=\"fa fa-envelope\"></i></a></p><p>Mahi <a href=\"mailto: kumarimahi557@gmail.com\"><i class=\"fa fa-envelope\"></i></a></p><p>Shaista Naz <a href=\"mailto: nazshaista00@gmail.com\"><i class=\"fa fa-envelope\"></i></a></p></span></div>\n");
      out.write("                            <script>\n");
      out.write("                                // When the user clicks on div, open the popup\n");
      out.write("                                function ourteamFunction() {\n");
      out.write("                                var otpopup = document.getElementById(\"our-team-Popup\");\n");
      out.write("                                otpopup.classList.toggle(\"show\");\n");
      out.write("                                }\n");
      out.write("                            </script>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                        <li><i class=\"fa fa-chevron-circle-right\"></i><a href=\"https://magadhmahilacollege.org/\">College</a></li>\n");
      out.write("                        <li><i class=\"fa fa-chevron-circle-right\"></i><a href=\"https://www.patnauniversity.ac.in/\">University</a></li>\n");
      out.write("                    </ul> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"contactus\">\n");
      out.write("                    <b><p class=\"text-big\">Contact Us</p></b>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><i class=\"fa fa-map-marker\"></i>Address: Magadh Mahila College, North Gandhi Maidan, Patna-800001</li>\n");
      out.write("                        <li><i class=\"fa fa-envelope\"></i><a href=\"mailto: kumarimahi557@gmail.com\">Email: kumarimahi557@gmail.com</a></li>\n");
      out.write("                        <li><div class=\"contact-us-sns\"><a href=\"https://www.linkedin.com/in/mahi-kumari-421211201\"><i class=\"fa fa-linkedin-square fa-2x\"></i></a> <a href=\"https://www.facebook.com/itszzz.mahi\"><i class=\"fa fa-facebook-square fa-2x\"></i></a> <a href=\"https://instagram.com/itszzz_mahi?utm_medium=copy_link\"><i class=\"fa fa-instagram fa-2x\"></i></a></div></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            <section><hr></section>\n");
      out.write("            <footer class=\"text-footer\">\n");
      out.write("                <p>\n");
      out.write("                    Copyright &copy; 2027 - www.quizbuzz.com - All rights reserved\n");
      out.write("                </p>\n");
      out.write("            </footer-->\n");
      out.write("        </div>\n");
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
