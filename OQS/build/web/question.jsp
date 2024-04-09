<%-- 
    Document   : question
    Created on : Aug 19, 2021, 2:47:36 PM
    Author     : Kommal Kaushal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Document</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
    <div class="q-start-main-body">
        <div class="q-start-outer-box">
            <div class="q-start-inner-box1">
                <div class="q-start-quiz-logo-title">
                    <!-- <img src="images/pfp1.jfif" alt="quiz logo"> -->
                    <i class="fa fa-question-circle fa-2x"></i>
                    <div class="q-start-quiz-title">
                        Quiz Name
                    </div>
                </div>
            </div>
            <div class="q-start-inner-box2">
                <div class="q-start-ques-status">
                    <div class="q-start-total-questions">
                        Total questions : 10
                    </div>
                    <div class="q-start-ques-nav-btns">
                        <button>1</button>
                        <button>2</button>
                        <button>3</button>
                        <button>4</button>
                        <button>5</button>
                        <button>6</button>
                        <button>7</button>
                        <button>8</button>
                        <button>9</button>
                        <button>10</button>
                    </div>
                    <div class="q-start-legend">
                        <div class="q-start-legend1">
                            <div class="q-start-attempted"></div>
                             Attempted
                        </div>
                        <div class="q-start-legend2">
                            <div class="q-start-skipped"></div>
                             Skipped
                        </div> 
                        <div class="q-start-legend3">
                            <div class="q-start-notvisited"></div>
                             Not Visited
                        </div>
                    </div>
                </div>
                <div class="q-start-attempt-box" id="quesscr" >
                    <div class="q-start-ques-no-timer">
                        <div class="q-start-ques-no">1</div>
                        <div class="q-start-timer-box">
                            <i class="fa fa-clock-o fa-2x"></i>
                            <div class="q-start-timer" id="clock">00:00</div>
                        </div>
                    </div>
                    <div class="q-start-questionbox">
                        What does HTML stands for?
                    </div>
                    <div class="q-start-optionbox">
                        <ul>
                            <li>
                                <input type="radio" name="q1-answers" id="q1-answers-A" value="A">
                                <label for="q1-answers-A">A) Hyper Tag Markup Language </label>
                            </li>
                            <li>
                                <input type="radio" name="q1-answers" id="q1-answers-B" value="B">
                                <label for="q1-answers-B">B) Hyper Text Markup Language</label>
                            </li>
                            <li>
                                <input type="radio" name="q1-answers" id="q1-answers-C" value="C">
                                <label for="q1-answers-C">C) Hyperlink Tag Markup Language</label>
                            </li>
                            <li>
                                <input type="radio" name="q1-answers" id="q1-answers-D" value="D">
                                <label for="q1-answers-D">D) Hypertext Tag Markup Language</label>
                            </li>
                        </ul>
                    </div>
                    <div class="q-start-footer">
                        <div>
                            <button>Previous</button>
                            <button>Next</button>
                        </div>
                        <button>Submit</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    

    
</body>
<!-- <script src="js/jquery-3.5.1.min.js"></script> -->
<!-- <script src="js/quiz.js"></script> -->
<!-- <script src="js/script.js"></script> -->

<script type="text/javascript"> 
    /*setInterval(displayclock, 500)
     function displayclock(){
        var time = new Date();
        var hrs = time.getHours();
        var min = time.getMinutes();
        var sec = time.getSeconds();
        if(hrs > 12){
            hrs = hrs-12;
        }
        if(hrs==0){
            hrs=12;
        }
        if (hrs < 10){
            hrs = '0' + hrs;
        }
        if (min < 10){
            min = '0' + min;
        }
        if (sec < 10){
            sec = '0' + sec;
        }
        document.getElementById('clock').innerHTML = 'Timer ' + ': ' + hrs + ':' + min + ':' + sec;
    } */


    const startinghour = 60;
    let time = startinghour * 60;
    const countdown = document.getElementById('clock');
    setInterval(updateClock, 1000);
    function updateClock(){
        const minutes = Math.floor(time / 60);
        let seconds = time % 60;
        seconds = seconds < 10 ? '0' + seconds : seconds;
        document.getElementById('clock').innerHTML = minutes + ':' + seconds;
        time--;
    }

</script>
</html>
