<%-- 
    Document   : index
    Created on : Aug 19, 2021, 2:45:55 PM
    Author     : Kommal Kaushal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Quiz System</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="main">
            <br><br>
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
                    <li><a href="#"><i class="fa fa-sign-in"></i>Login</a>
                        <div class="sub-menu-2">
                            <ul>
                                <li><a href="slogin.jsp">User Login</a></li>
                                <li><a href="tlogin.jsp">Faculty Login</a></li>
                                <!-- <li><a href="#">Administrator Login</a></li> -->
                            </ul>
                        </div>
                    </li>
                    <li><a href="spro.jsp"><i class="fa fa-user"></i>Profile</a></li>
                    <!-- <li>
                        <div class="search-bar">
                            <div class="search-bar-txt-box">
                                <input type="text" placeholder="Search...">
                            </div>
                            <div class="search-button">
                                <button><i class="fa fa-search"></i></button>
                            </div>
                        </div>
                    </li> -->
                    <!-- <li class="search-bar"><input type="text" placeholder="Search..."></li>
                    <li class="search-button"><button><i class="fa fa-search"></i></button></li> -->
                </ul> 
            </div>
            
            <div class="slider-holder">
                <div class="image-holder">
                    <a href="quizface.jsp"><img src="images/java_cover.png" alt="1st slide" class="slider-image"></a>
                </div> 
                <div class="image-holder">
                    <a href="quizface.jsp"><img src="images/python_cover.png" alt="2nd slide" class="slider-image"></a>
                </div>
                <div class="image-holder">
                    <a href="quizface.jsp"><img src="images/c++_cover.png" alt="3rd slide" class="slider-image"></a>
                </div>
                <div class="image-holder">
                    <a href="quizface.jsp"><img src="images/oracle_cover.png" alt="4th slide" class="slider-image"></a>
                </div>
                <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
                <a class="next" onclick="plusSlides(1)">&#10095;</a>
            </div> 
            <br>
            <div class="slider-dots">
                <span class="dot" onclick="currentSlide(1)"></span>
                <span class="dot" onclick="currentSlide(2)"></span>
                <span class="dot" onclick="currentSlide(3)"></span>
                <span class="dot" onclick="currentSlide(4)"></span>
            </div>
            <script>
                var slideIndex = 1;
                showSlides(slideIndex);
                    
                function plusSlides(n) {
                    showSlides(slideIndex += n);
                }
                    
                function currentSlide(n) {
                    showSlides(slideIndex = n);
                }
                    
                function showSlides(n) {
                    var i;
                    var slides = document.getElementsByClassName("slider-image");
                    var dots = document.getElementsByClassName("dot");
                    if (n > slides.length) {slideIndex = 1}    
                    if (n < 1) {slideIndex = slides.length}
                    for (i = 0; i < slides.length; i++) {
                        slides[i].style.display = "none";  
                    }
                    for (i = 0; i < dots.length; i++) {
                        dots[i].className = dots[i].className.replace(" active", "");
                    }
                    slides[slideIndex-1].style.display = "block";  
                    dots[slideIndex-1].className += " active";
                }
            </script>
            
           

            <section><hr></section>
            <div class="latestq">
                <div class="d1">
                    <b>Latest Quizez</b>
                    <!-- <button class="latestq-see-all-btn">See All</button> -->
                </div>
                <div class="latestq1">
                    <a href="quizface.jsp"><img src="images/java_thumbnail.png" alt="Quiz 1"></a>
                </div>
                <div class="latestq2">
                    <a href="quizface.jsp"><img src="images/python_thumbnail.png" alt="Quiz 2"></a>
                </div>
                <div class="latestq3">
                    <a href="quizface.jsp"><img src="images/c++_thumbnail.png" alt="Quiz 3"></a>
                </div>
                <div class="latestq4">
                    <a href="quizface.jsp"><img src="images/oracle_thumbnail.png" alt="Quiz 4"></a>
                </div>
            </div>
            <section><hr></section>
            <div class="bottom">
                <div class="about">
                    <b><p class="text-big">About Us</p></b>
                    <ul>
                        <li><i class="fa fa-chevron-circle-right"></i><div class="popup" onclick="myFunction()">About Quiz System
                            <span class="popuptext" id="myPopup">Online Quiz System is designed with the purpose of allowing the students to take quiz/test. It is a Multiple Choice Questions(MCQ) based system. Students are provided thr flexibility to choose among different types of programming language quizzes according to their interest. The main purpose of the system is to efficiently evaluate the students thoroughly through a fully automated system that not only saves a lot of time but also gives fast results.</span></div>
                            <script>
                                // When the user clicks on div, open the popup
                                function myFunction() {
                                var popup = document.getElementById("myPopup");
                                popup.classList.toggle("show");
                                }
                            </script>
                        </li>

                        <li><i class="fa fa-chevron-circle-right"></i><div class="our-team-popup" onclick="ourteamFunction()">Our Team
                            <span class="our-team-popuptext" id="our-team-Popup"><p>We are a group of students from Magadh Mahila College, with technical backgrounds.</p><p>Ayushi Kumari <a href="mailto: ayushikumari93340@gmail.com"><i class="fa fa-envelope"></i></a></p> <p>Kaajal Kaushal <a href="mailto: kaajal.29.dd@gmail.com"><i class="fa fa-envelope"></i></a></p><p>Mahi <a href="mailto: kumarimahi557@gmail.com"><i class="fa fa-envelope"></i></a></p><p>Shaista Naz <a href="mailto: nazshaista00@gmail.com"><i class="fa fa-envelope"></i></a></p></span></div>
                            <script>
                                // When the user clicks on div, open the popup
                                function ourteamFunction() {
                                var otpopup = document.getElementById("our-team-Popup");
                                otpopup.classList.toggle("show");
                                }
                            </script>
                        
                        
                        </li>

                        
                        <li><i class="fa fa-chevron-circle-right"></i><a href="https://magadhmahilacollege.org/">College</a></li>
                        <li><i class="fa fa-chevron-circle-right"></i><a href="https://www.patnauniversity.ac.in/">University</a></li>
                    </ul> 
                </div>
                <div class="contactus">
                    <b><p class="text-big">Contact Us</p></b>
                    <ul>
                        <li><i class="fa fa-map-marker"></i>Address: Magadh Mahila College, North Gandhi Maidan, Patna-800001</li>
                        <li><i class="fa fa-envelope"></i><a href="mailto: kumarimahi557@gmail.com">Email: kumarimahi557@gmail.com</a></li>
                        <li><div class="contact-us-sns"><a href="https://www.linkedin.com/in/mahi-kumari-421211201"><i class="fa fa-linkedin-square fa-2x"></i></a> <a href="https://www.facebook.com/itszzz.mahi"><i class="fa fa-facebook-square fa-2x"></i></a> <a href="https://instagram.com/itszzz_mahi?utm_medium=copy_link"><i class="fa fa-instagram fa-2x"></i></a></div></li>
                    </ul>
                </div>
               
            </div>
            <section><hr></section>
            <footer class="text-footer">
                <p>
                    Copyright &copy; 2027 - www.quizbuzz.com - All rights reserved
                </p>
            </footer-->
        </div>
    </body>
</html>
