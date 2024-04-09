<%-- 
    Document   : slogin
    Created on : Aug 19, 2021, 3:09:41 PM
    Author     : Kommal Kaushal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://kit.fontawesome.com/64d58efce2.js" crossorigin="anonymous"></script>
        <title>Document</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
    <div class="container">
        <div class="forms-container">
            <div class="signin-signup">
                <form action="LoginServlet" class="sign-in-form" method="Post">
                    <h2 class="title">Sign in</h2>
                    <div class="input-field">
                        <i class="fas fa-user"></i>
                        <input type="text" placeholder="Username" name="user-name" required="">
                    </div>
                    <div class="input-field">
                        <i class="fas fa-lock"></i>
                        <input type="password" placeholder="Password" name="pass-word" required="">
                    </div>
                    <input type="submit" value="Login" class="btn solid" id="login"> 
<!--                    <a href="spro.jsp" class="btn solid" id="login">Login</a>-->
                </form>

                <form id="reg-form" action="RegisterServlet" method="POST" class="sign-up-form">
                    <h2 class="title">Sign up</h2>
                    <div class="input-field">
                        <i class="fas fa-user"></i>
                        <input type="text" placeholder="Username" name="uname" required="">
                    </div>
                    <div class="input-field">
                        <i class="fas fa-envelope"></i>
                        <input type="text" placeholder="Email-ID" name="email" required="">
                    </div>
                    <div class="input-field">
                        <i class="fas fa-lock"></i>
                        <input type="password" placeholder="Set Password" name="pass" required="">
                    </div>
                    <div class="input-field">
                        <i class="fas fa-lock"></i>
                        <input type="text" placeholder="Mobile No." name="mob" required="">
                    </div>
                    <div class="input-field">
                        <i class="fas fa-lock"></i>
                        <input type="text" placeholder="Date of birth" name="dob" required="">
                    </div>
                    <div class="input-field">
                        <i class="fas fa-lock"></i>
                        <input type="text" placeholder="Education" name="edu" required="">
                    </div>

                    <input type="submit" value="Sign-up" class="btn solid">
                </form>
            </div>
        </div>
        <div class="panels-container">
            <div class="panel left-panel">
                <div class="content">
                    <h3>Not registered ?</h3>
                    <p>Sign up to create an account on Online Quiz System.</p>
                    <button class="btn transparent" id="sign-up-btn">Sign up</button>
                    <!-- <a href="main.html" class="home">Home</a> -->
                    <a href="index.jsp" class="home">Home </a>
                </div>
                <img src="images/undraw_welcome_cats_thqn.svg" class="image" alt="">
            </div>
            <div class="panel right-panel">
                <div class="content">
                    <h3>One of us?</h3>
                    <p>Sign In now to play quiz</p>
                    <button class="btn transparent" id="sign-in-btn">Sign in</button>
                    <!-- <a href="main.html" class="home">Home</a> -->
                    <a href="index.jsp" class="home">Home</a>
                </div>
                <img src="images/undraw_digital_currency_qpak.svg" class="image" alt="">
            </div>

        </div>
    </div>
    <script src="javascript//app.js"></script>
       
    </body>
</html>
