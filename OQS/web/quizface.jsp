<%-- 
    Document   : quizface
    Created on : Aug 19, 2021, 3:06:55 PM
    Author     : Kommal Kaushal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
    <div class="qface-main-body">
        <div class="qface-outer-box">
            <div class="qface-inner-box1">
                <div class="qface-quiz-logo-title">
                    <!-- <img src="images/pfp1.jfif" alt="quiz logo"> -->
                    <i class="fa fa-question-circle fa-2x"></i>
                    <div class="qface-quiz-title">
                        Quiz Name
                    </div>
                </div>
            </div>
            <div class="qface-inner-box2">
                <div class="qface-inner-box2-1">
                    <img class="qfaceSlides" src="images/qfaceSlide1.png" alt="question here" width="828 px" height="475.2 px">
                    <img class="qfaceSlides" src="images/qfaceSlide2.png" alt="question here" width="828 px" height="475.2 px">
                    <img class="qfaceSlides" src="images/qfaceSlide3.png" alt="question here" width="828 px" height="475.2 px">
                    <img class="qfaceSlides" src="images/qfaceSlide4.png" alt="question here" width="828 px" height="475.2 px">
                    <img class="qfaceSlides" src="images/qfaceSlide5.png" alt="question here" width="828 px" height="475.2 px">
                </div>
                <div class="qface-quizface-details">
                    <div class="qface-quizface-tot-sqt">
                        <div class="qface-total-score-ques-time">
                            <div class="qface-total-score">
                                <b>10</b><br>
                                Score
                            </div>
                            <div class="qface-total-ques">
                                <b>10</b><br>
                                Questions
                            </div>
                            <div class="qface-total-time">
                                <b>600</b><br>
                                Seconds
                            </div>
                        </div>
                        <div class="qface-quizface-tot-sqt-text">
                            Read the following instructions carefully:
                        </div>
                    </div>
                    <div class="qface-quiz-instructions">
                        <ul>
                            <li>This is a timed quiz with 10 questions to be answered in 600 seconds.</li>
                            <li>The questions will be randomly picked from question bank.</li>
                            <li>You can skip through a question and come back to it later.</li>
                            <li>Do not refresh the page after starting the quiz.</li>
                            <li>The quiz will start as soon as you click on <b style="color: rgb(138, 28, 138);">Start Quiz</b> button.</li>
                        </ul>
                    </div>
                    <div class="qface-start-quiz-btn">
                        <button><a href="question.jsp">Start Quiz</a></button>
                    </div>
                </div>
            </div>
            <div class="qface-inner-box3">
                <div class="qface-abt-info-header">
                    <i class="fa fa-info-circle fa-2x"></i>
                    <div class="qface-abt-quiz-header-h4">
                        <h4>About Quiz</h4>
                    </div>
                </div>
                <p>Any individual who desires to participate in the quiz will be required to register first.</p>
                <p>One individual can participate in the quiz only once. Multiple entries from the same user will not be considered and will be discarded.</p>
                <p>There will be no negative marking for the incorrect answer.</p><br>
                <p>
                    <p class="qface-abt-quiz-rewards"><b>Rewards: </b></p>
                    <p>E-Certificate</p>
                </p>
            </div>
            
        </div>
    </div>
    </body>
<!-- <script src="js/jquery-3.5.1.min.js"></script> -->
<!-- <script src="js/tilt.min.js"></script> -->
<!-- <script>
    $(".tilt").tilt({
        scale: 1.2,
    });
</script> -->
<script>
    var qfaceIndex = 0;
    carousel();

    function carousel()
    {
        var i;
        var x = document.getElementsByClassName("qfaceSlides");
        for (i = 0; i < x.length; i++)
        {
            x[i].style.display = "none";
        }
        qfaceIndex++;
        if (qfaceIndex > x.length) {qfaceIndex = 1}

        x[qfaceIndex-1].style.display = "block";
        setTimeout(carousel, 2000);   //change image every 2 seconds
    }
</script>
</html>
