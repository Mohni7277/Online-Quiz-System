<%-- 
    Document   : tpro
    Created on : Aug 19, 2021, 3:14:48 PM
    Author     : Kommal Kaushal
--%>


<%@page import="tpackage.facentities" %>

<%

facentities fac=(facentities)session.getAttribute("currentUser");
if(fac==null){
    response.sendRedirect("tlogin.jsp");
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
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <div class="tpro-outer">
            <div class="menu-bar">
                <ul>
                    <li class="active"><a href="#"><i class="fa fa-home"></i>Home</a></li>
                    <li><a href="#"><i class="fa fa-list-alt"></i>Categories</a>
                        <div class="sub-menu-1">
                            <ul>
                                <li><a href="quizface.jsp">Java</a></li>
                                <li><a href="quizface.jsp">Oracle</a></li>
                                <li><a href="quizface.jsp">C++</a></li>
                                <li><a href="quizface.jsp">Python</a></li>
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
                                        <b><%= fac.getTuname() %></b><br>
<!--                                        <b style="color: gray;">@ayushi93340</b><br>-->
                                    </p>
                                </div>
                            </div>
                            <hr>
                            <div class="spro-edu-contact">
                                <div class="spro-education">
                                    <div class="spro-education-header">
                                        <p class="spro-edu-header-text">QUALIFICATION</p>
                                    </div>
                                    <div class="spro-edu-value">
                                        <p><label for="spro-edu-value"><%= fac.getTedu() %></label></p>
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
                                            <p class="spro-email-value"><label for="spro-email"><%= fac.getTemail() %></label></p> 
                                        </div>
                                        <div class="spro-mob">
                                            <p class="spro-mob-txt">Mob. no.:</p>
                                            <p class="spro-mob-value"><label for="spro-mob"><%= fac.getTmob() %></label></p> 
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="tpro-addq-qpub">
                            <div class="tpro-add-ques-box">
                                <div class="tpro-add-ques-box-header">
                                    <p class="tpro-add-ques-header-txt">ADD QUESTIONS</p>
                                </div>
                                <div class="tpro-add-ques-box-txt">
                                    <p>The questions you publish will be added to the question bank of Online Quiz System.</p>
                                </div>
                                <div class="tpro-add-ques-buttton">
                                    <a href="addques.jsp"><button>ADD QUESTIONS</button></a>
                                </div>
                            </div>
                            <div class="tpro-q-pub-box">
                                <div class="tpro-qpub-box-header">
                                    <p class="tpro-qpub-header-txt">QUESTIONS PUBLISHED</p>
                                </div>
                                <div class="tpro-add-ques-box-txt">
                                    <p><b class="tpro-add-ques-no">1</b> What does HTML stands for?</p>
                                </div>
                            </div>
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
