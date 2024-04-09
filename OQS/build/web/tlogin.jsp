<%-- 
    Document   : tlogin
    Created on : Aug 19, 2021, 3:13:19 PM
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
                <form action="TLoginServlet" class="sign-in-form" method="post">
                    <h2 class="title">Sign in</h2>
                    <div class="input-field">
                        <i class="fas fa-user"></i>
                        <input type="text" placeholder="Username" name="user-tname" required="">
                    </div>
                    <div class="input-field">
                        <i class="fas fa-lock"></i>
                        <input type="password" placeholder="Password" name="pass-tword" required="">
                    </div>
                    <input type="submit" value="Login" class="btn solid" id="tlogin">
<!--                    <a href="tpro.html" class="btn solid" id="login">Login</a>-->
                    <!-- <p class="social-text">Or sign in with social platforms</p>
                    <div class="social-media">
                        <a href="facebook.com" class="social-icon">
                            <i class="fab fa-facebook-f"></i>
                        </a>
                        <a href="twitter.com" class="social-icon">
                            <i class="fab fa-twitter"></i>
                        </a>
                        <a href="google.com" class="social-icon">
                            <i class="fab fa-google"></i>
                        </a>
                        <a href="linkedin.com" class="social-icon">
                            <i class="fab fa-linkedin"></i>
                        </a>

                    </div> -->
                </form>

                <form action="TRegisterServlet" method="POST" class="sign-up-form">
                    <h2 class="title">Sign up</h2>
                    <div class="input-field">
                        <i class="fas fa-user"></i>
                        <input type="text" placeholder="Username" name="tuname" required="">
                    </div>
                    <div class="input-field">
                        <i class="fas fa-envelope"></i>
                        <input type="text" placeholder="Email-ID" name="temail" required="">
                    </div>
                    <div class="input-field">
                        <i class="fas fa-lock"></i>
                        <input type="password" placeholder="Set Password" name="tpass" required="">
                    </div>
                    <div class="input-field">
                        <i class="fas fa-lock"></i>
                        <input type="text" placeholder="Mobile No." name="tmob" required="">
                    </div>
                    <div class="input-field">
                        <i class="fas fa-lock"></i>
                        <input type="text" placeholder="Date of birth" name="tdob" required="">
                    </div>
                    <div class="input-field">
                        <i class="fas fa-lock"></i>
                        <input type="text" placeholder="Qualification" name="tedu" required="">
                    </div>

                    <input type="submit" value="Sign-up" class="btn solid">

                    <!-- <p class="social-text">Or sign up with social platforms</p>
                    <div class="social-media">
                        <a href="#" class="social-icon">
                            <i class="fab fa-facebook-f"></i>
                        </a>
                        <a href="#" class="social-icon">
                            <i class="fab fa-twitter"></i>
                        </a>
                        <a href="#" class="social-icon">
                            <i class="fab fa-google"></i>
                        </a>
                        <a href="#" class="social-icon">
                            <i class="fab fa-linkedin"></i> 
                        </a>

                    </div>-->
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
