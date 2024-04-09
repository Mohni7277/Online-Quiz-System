<%-- 
    Document   : spro
    Created on : Aug 22, 2021, 12:53:20 AM
    Author     : Kommal Kaushal
--%>

<%@page import="studpackage.studentities" %>

<%

studentities stud=(studentities)session.getAttribute("currentUser");
if(stud==null){
    response.sendRedirect("slogin.jsp");
}

%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compalible" content="ie-edge">
        <title>Profile</title>
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        
        <div class="spro-outer">
            <div class="menu-bar">
                <ul>
                    <li class="active"><a href="index.jsp"><i class="fa fa-home"></i>Home</a></li>
                    <li><a href="#"><i class="fa fa-list-alt"></i>Categories</a>
                        <div class="sub-menu-1">
                            <ul>
                                <li><a href="quizface.jsp">Java</a></li>
                                <li><a href="quizface.jsp">C</a></li>
                                <li><a href="quizface.jsp">C++</a></li>
                                <li><a href="quizface.jsp">Python</a></li>
                                <li><a href="quizface.jsp">Visual Basic</a></li>
                                <li><a href="quizface.jsp">FoxPro</a></li>
                            </ul>
                        </div>
                    </li>
                    <!-- <li><a href="#"><i class="fa fa-question-circle"></i>Q/A</a></li> -->
                    <!-- <li><a href="#"><i class="fa fa-sign-in"></i>Login</a>
                        <div class="sub-menu-2">
                            <ul>
                                <li><a href="login2.html">User Login</a></li>
                                <li><a href="#">Faculty Login</a></li>
                                <li><a href="#">Administrator Login</a></li>
                            </ul>
                        </div>
                    </li> -->
                    <li><a href="spro.jsp"><i class="fa fa-user"></i>Profile</a></li>
                    <!-- <li class="search-bar"><input type="text" placeholder="Search..."></li>
                    <li class="search-button"><button><i class="fa fa-search"></i></button></li> -->
                </ul> 
            </div>
            <div class="spro-main-body">
                <div class="spro-profile-outer">
                    <div class="spro-profile-inner">
                        <div class="spro-my-profile">
                            <div class="spro-profile-header">
                                <h4 class="spro-my-profile-text">MY PROFILE</h4>
                            </div>
                            <div class="spro-pfp-name-userid">
                                <div class="spro-pfp-logo">
                                    <img src="images/2_circle_pfp.PNG" alt="logo">
                                </div>
                                <div class="spro-name-userid">
                                    <p> 
                                        <b><%= stud.getUname() %></b><br>
<!--                                        <b style="color: gray;">@kaajal.29</b><br>-->
                                    </p>
                                </div>
                            </div>
                            <hr>
                            <div class="spro-edu-contact">
                                <div class="spro-education">
                                    <div class="spro-education-header">
                                        <p class="spro-edu-header-text">EDUCATION</p>
                                    </div>
                                    <div class="spro-edu-value">
                                        <p><label for="spro-edu-value"><%= stud.getEdu() %></label></p>
                                    </div>
                                </div>
                                <hr>
                                <div class="spro-contact">
                                    <div class="spro-contact-header">
                                        <p class="spro-contact-header-text">CONTACT INFO</p>
                                    </div>
                                    <div class="spro-email-mob">
                                        <div class="spro-email">
                                            <p class="spro-email-txt">Email: </p>
                                            <p class="spro-email-value"><label for="spro-email"><%= stud.getEmail() %></label></p> 
                                        </div>
                                        <div class="spro-mob">
                                            <p class="spro-mob-txt">Mob. no.:</p>
                                            <p class="spro-mob-value"><label for="spro-mob"><%= stud.getMob() %></label></p> 
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="spro-recent-quiz">
                            <div class="spro-recent-quiz-header">
                                <p class="spro-recent-quiz-text">RECENT QUIZZES</p>
                            </div>
                            <div class="spro-recent-quiz-names">
                                <p><b class="spro-recent-quiz-no">1</b> JAVA Quiz</p><a href="cop.jsp"><i class="fa fa-download"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
